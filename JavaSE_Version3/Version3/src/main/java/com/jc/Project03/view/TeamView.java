package com.jc.Project03.view;

import com.jc.Project03.domain.employee.Employee;
import com.jc.Project03.domain.employee.Programmer;
import com.jc.Project03.service.NameListService;
import com.jc.Project03.service.TeamException;
import com.jc.Project03.service.TeamService;
import lombok.Getter;

/*
@author 蒋超
@since version-1.0
@date 2023/2/8 20:56
@description ：主控类

*/
@Getter
public class TeamView {
    private NameListService nameListService=new NameListService();
    private TeamService[] teamService=new TeamService[3];//公司一共有三个团队

        /*
        初始化团队信息
        */
    public TeamView(){
        for(int i=0;i<teamService.length;i++){
            teamService[i]=new TeamService();
        }
    }

    public void listAllEmployees(){
        System.out.println("显示所有员工的信息");
        System.out.println("——————————————————————————开发团队调度软件——————————————————————————————————");
        Employee[] employees=getNameListService().getAllEmployees();
        System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t拥有设备");

        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
        System.out.println("——————————————————————————————————————————————————————————————————————————");

    }

    /*
    @author 蒋超
    @since version-1.0
    @date 2023/2/8 21:57
    @param
    @return
    @description :展示开发团队信息
    */
    public void getTeam(){
        System.out.println("————————————————————团队成员列表——————————————————————");
        for(int teami=0;teami<teamService.length;teami++) {
            Programmer[] team = teamService[teami].getTeam();
            System.out.println("———————————————"+teamService[teami].getTeamName()+"———————————————————————————");
            if (team == null || team.length == 0) {
                System.out.println("当前团队无成员！");
                System.out.println("——————————————————————————————————————————————————————————");
            }
            System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t拥有设备\t\t\t\t团队ID");

            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i] + "\t\t\t\t" + team[i].getMemberId());
            }
            System.out.println("——————————————————————————————————————————————————————————");
        }
        System.out.println("——————————————————————————————————————————————————————————");

    }

    public void addMember(){
        System.out.println("——————————————————————添加成员————————————————————————————");
        System.out.println("请输入添加团队名:");
        int team_id=TSUtility.readInt();
        for (TeamService team:teamService){
            if (team_id==team.getTeam_id()){
                System.out.println("请输入添加成员的id:");
                int id=TSUtility.readInt();
                try {
                    Employee employee=nameListService.getEmployeebyId(id);
                    team.addMember(employee);
                    System.out.println("添加成功！");
                    TSUtility.readReturn();
                } catch (TeamException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

    }

    public void removeMember() {
        System.out.println("——————————————————————删除成员————————————————————————————");
        System.out.println("请输入添加团队名:");
        int team_id = TSUtility.readInt();
        for (TeamService team : teamService) {
            if (team_id == team.getTeam_id()) {
                System.out.println("请输入删除员工的团队ID");
                int teamId = TSUtility.readInt();
                System.out.println("确定要删除嘛？");
                char idDelete = TSUtility.confirmSelection();
                if (idDelete == 'N') return;
                if (team.removeMember(teamId)) System.out.println("删除成功");
                else System.out.println("删除失败");
                TSUtility.readReturn();
            }

        }
    }

    public void enterMainMenu(){
        boolean flag=true;
        char menu='0';
        while(flag){
            if(menu!='1') listAllEmployees();//优化一下布局
            System.out.println("1:团队列表\t2:添加团队成员\t3:删除团队成员\t4:退出");
            System.out.println("请选择（1-4）:");
            menu=TSUtility.readMenuSelection();
            switch (menu){
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    removeMember();
                    break;
                case '4':
                    System.out.println("确定退出嘛？(Y/N)");
                    if(TSUtility.confirmSelection()=='Y'){
                        flag=false;
                    }
                    break;
            }
        }

    }







}