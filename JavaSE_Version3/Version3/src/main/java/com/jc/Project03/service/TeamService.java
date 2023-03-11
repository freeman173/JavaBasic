package com.jc.Project03.service;

import com.jc.Project03.domain.employee.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
@author 蒋超
@since version-1.0
@date 2023/2/6 22:05
@description ：开发团队人员的管理

*/

@Setter
@Getter
public class TeamService {
    private static int teamId=1;
    private static int counter=1;//开发团队人员id的赋值使用
    private final int MAX_MEMBER=5;//开发团队的最大人数
    private Programmer[] team=new Programmer[MAX_MEMBER];
    private int total;//团队实际人数
    private String teamName;
    private int team_id;


    public TeamService(){//取一下小组名
        team_id=teamId;
        teamName="第"+(teamId++)+"队";
        System.out.println("__________________");
    }

    /*
    @author 蒋超
    @since version-1.0
    @date 2023/2/6 22:15
    @param
    @return
    @description:返回一个团队
    */
    public Programmer[] getTeam(){
        Programmer[] team=new Programmer[total];
        for(int i=0;i<getTotal();i++){
            team[i]=this.team[i];
        }
        return team;
    }


    /*
    @author 蒋超
    @since version-1.0
    @date 2023/2/6 22:22
    @param
    @return
    @description :添加类成员
    */
    public void addMember(Employee e) throws TeamException {
//        成员已满，无法添加
        if(total==MAX_MEMBER){
            throw new TeamException("成员已满");
        }
//      若不是开发人员，则无法添加
        if(!(e instanceof Programmer)){
            throw new TeamException("你不是程序猿或者其后代！");
        }
//        将对象做一个向下转型后再做以下判断
        Programmer p= (Programmer) e;
//        通过程序猿的状态属性来进一步判断
        if(p.getStatus().getNAME().equals("BUSY")){
            throw new TeamException("该员工已经是某团队成员");
        }
        if(p.getStatus().getNAME().equals("VOCATION")){
            throw new TeamException("该员工正在休假");
        }
       /*
           团队成员限制：
               最多： 一名架构师、两名设计师、三名程序猿
       */
        int numOfArch=0,numOfDes=0,numOfPro=0;
        for(int i=0;i<total;i++){//统计团队成员中的各个职位人数
            if(team[i] instanceof Architect){
                numOfArch++;
            }else if(team[i] instanceof Designer){
                numOfDes++;
            }else if(team[i] instanceof Programmer){
                numOfPro++;
            }
        }
        //根据新来的人员类型来做判断
        if(p instanceof Architect){
            if(numOfArch==1) throw new TeamException("架构师人数已够！");
        }else if(p instanceof Designer){
            if(numOfDes==2) throw new TeamException("设计师人数已够！");
        }else if (p instanceof Programmer){
            if(numOfPro==3) throw new TeamException("程序猿人数已够！");
        }
        //走到这里就可以加入到团队了
        team[total++]=p;
        p.setStatus(Status.BUSY);//加入团队后，状态变为繁忙状态
        p.setMemberId(counter++);//团队id随便加1
    }


    /*
    @author 蒋超
    @since version-1.0
    @date 2023/2/7 15:31
    @param
    @return
    @description :判断此人是否在本团队
    */
    private boolean isExist(Employee e){
        for(int i=0;i<total;i++){
            if(team[i].getId()==e.getId()){
                return true;
            }
        }
        return false;
    }

    /*
    @author 蒋超
    @since version-1.0
    @date 2023/2/8 20:32
    @param
    @return
    @description :
        移除成员：
    */
    public boolean removeMember(int memberId){
        boolean result=false;//删除操作成功与否的标识符
        int i=0;
        for(;i<total;i++){
            if (team[i].getMemberId()==memberId){//该成员在团队中，就做以下操作。
                result=true;
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if(result==true) {//队列在缺席位置这里：依次往前补一个位置。
            for (int j = i + 1; j < total; j++) {
                team[j - 1] = team[j];
            }
            team[--total] = null;
        }
        return result;

    }




}