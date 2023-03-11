package com.jc.Project03.view;

import com.jc.Project03.domain.employee.Employee;
import com.jc.Project03.domain.employee.Programmer;
import com.jc.Project03.service.NameListService;
import com.jc.Project03.service.TeamException;
import com.jc.Project03.service.TeamService;
import lombok.Getter;

/*
@author ����
@since version-1.0
@date 2023/2/8 20:56
@description ��������

*/
@Getter
public class TeamView {
    private NameListService nameListService=new NameListService();
    private TeamService[] teamService=new TeamService[3];//��˾һ���������Ŷ�

        /*
        ��ʼ���Ŷ���Ϣ
        */
    public TeamView(){
        for(int i=0;i<teamService.length;i++){
            teamService[i]=new TeamService();
        }
    }

    public void listAllEmployees(){
        System.out.println("��ʾ����Ա������Ϣ");
        System.out.println("���������������������������������������������������������Ŷӵ��������������������������������������������������������������������������");
        Employee[] employees=getNameListService().getAllEmployees();
        System.out.println("ID\t����\t����\t����\tְλ\t״̬\t����\t��Ʊ\tӵ���豸");

        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
        System.out.println("����������������������������������������������������������������������������������������������������������������������������������������������������");

    }

    /*
    @author ����
    @since version-1.0
    @date 2023/2/8 21:57
    @param
    @return
    @description :չʾ�����Ŷ���Ϣ
    */
    public void getTeam(){
        System.out.println("�����������������������������������������Ŷӳ�Ա�б�������������������������������������������");
        for(int teami=0;teami<teamService.length;teami++) {
            Programmer[] team = teamService[teami].getTeam();
            System.out.println("������������������������������"+teamService[teami].getTeamName()+"������������������������������������������������������");
            if (team == null || team.length == 0) {
                System.out.println("��ǰ�Ŷ��޳�Ա��");
                System.out.println("��������������������������������������������������������������������������������������������������������������������");
            }
            System.out.println("ID\t����\t����\t����\tְλ\t״̬\t����\t��Ʊ\tӵ���豸\t\t\t\t�Ŷ�ID");

            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i] + "\t\t\t\t" + team[i].getMemberId());
            }
            System.out.println("��������������������������������������������������������������������������������������������������������������������");
        }
        System.out.println("��������������������������������������������������������������������������������������������������������������������");

    }

    public void addMember(){
        System.out.println("����������������������������������������������ӳ�Ա��������������������������������������������������������");
        System.out.println("����������Ŷ���:");
        int team_id=TSUtility.readInt();
        for (TeamService team:teamService){
            if (team_id==team.getTeam_id()){
                System.out.println("��������ӳ�Ա��id:");
                int id=TSUtility.readInt();
                try {
                    Employee employee=nameListService.getEmployeebyId(id);
                    team.addMember(employee);
                    System.out.println("��ӳɹ���");
                    TSUtility.readReturn();
                } catch (TeamException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

    }

    public void removeMember() {
        System.out.println("��������������������������������������������ɾ����Ա��������������������������������������������������������");
        System.out.println("����������Ŷ���:");
        int team_id = TSUtility.readInt();
        for (TeamService team : teamService) {
            if (team_id == team.getTeam_id()) {
                System.out.println("������ɾ��Ա�����Ŷ�ID");
                int teamId = TSUtility.readInt();
                System.out.println("ȷ��Ҫɾ���");
                char idDelete = TSUtility.confirmSelection();
                if (idDelete == 'N') return;
                if (team.removeMember(teamId)) System.out.println("ɾ���ɹ�");
                else System.out.println("ɾ��ʧ��");
                TSUtility.readReturn();
            }

        }
    }

    public void enterMainMenu(){
        boolean flag=true;
        char menu='0';
        while(flag){
            if(menu!='1') listAllEmployees();//�Ż�һ�²���
            System.out.println("1:�Ŷ��б�\t2:����Ŷӳ�Ա\t3:ɾ���Ŷӳ�Ա\t4:�˳�");
            System.out.println("��ѡ��1-4��:");
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
                    System.out.println("ȷ���˳��(Y/N)");
                    if(TSUtility.confirmSelection()=='Y'){
                        flag=false;
                    }
                    break;
            }
        }

    }







}