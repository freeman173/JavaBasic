package com.jc.Project03.service;

import com.jc.Project03.domain.employee.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
@author ����
@since version-1.0
@date 2023/2/6 22:05
@description �������Ŷ���Ա�Ĺ���

*/

@Setter
@Getter
public class TeamService {
    private static int teamId=1;
    private static int counter=1;//�����Ŷ���Աid�ĸ�ֵʹ��
    private final int MAX_MEMBER=5;//�����Ŷӵ��������
    private Programmer[] team=new Programmer[MAX_MEMBER];
    private int total;//�Ŷ�ʵ������
    private String teamName;
    private int team_id;


    public TeamService(){//ȡһ��С����
        team_id=teamId;
        teamName="��"+(teamId++)+"��";
        System.out.println("__________________");
    }

    /*
    @author ����
    @since version-1.0
    @date 2023/2/6 22:15
    @param
    @return
    @description:����һ���Ŷ�
    */
    public Programmer[] getTeam(){
        Programmer[] team=new Programmer[total];
        for(int i=0;i<getTotal();i++){
            team[i]=this.team[i];
        }
        return team;
    }


    /*
    @author ����
    @since version-1.0
    @date 2023/2/6 22:22
    @param
    @return
    @description :������Ա
    */
    public void addMember(Employee e) throws TeamException {
//        ��Ա�������޷����
        if(total==MAX_MEMBER){
            throw new TeamException("��Ա����");
        }
//      �����ǿ�����Ա�����޷����
        if(!(e instanceof Programmer)){
            throw new TeamException("�㲻�ǳ���Գ����������");
        }
//        ��������һ������ת�ͺ����������ж�
        Programmer p= (Programmer) e;
//        ͨ������Գ��״̬��������һ���ж�
        if(p.getStatus().getNAME().equals("BUSY")){
            throw new TeamException("��Ա���Ѿ���ĳ�Ŷӳ�Ա");
        }
        if(p.getStatus().getNAME().equals("VOCATION")){
            throw new TeamException("��Ա�������ݼ�");
        }
       /*
           �Ŷӳ�Ա���ƣ�
               ��ࣺ һ���ܹ�ʦ���������ʦ����������Գ
       */
        int numOfArch=0,numOfDes=0,numOfPro=0;
        for(int i=0;i<total;i++){//ͳ���Ŷӳ�Ա�еĸ���ְλ����
            if(team[i] instanceof Architect){
                numOfArch++;
            }else if(team[i] instanceof Designer){
                numOfDes++;
            }else if(team[i] instanceof Programmer){
                numOfPro++;
            }
        }
        //������������Ա���������ж�
        if(p instanceof Architect){
            if(numOfArch==1) throw new TeamException("�ܹ�ʦ�����ѹ���");
        }else if(p instanceof Designer){
            if(numOfDes==2) throw new TeamException("���ʦ�����ѹ���");
        }else if (p instanceof Programmer){
            if(numOfPro==3) throw new TeamException("����Գ�����ѹ���");
        }
        //�ߵ�����Ϳ��Լ��뵽�Ŷ���
        team[total++]=p;
        p.setStatus(Status.BUSY);//�����ŶӺ�״̬��Ϊ��æ״̬
        p.setMemberId(counter++);//�Ŷ�id����1
    }


    /*
    @author ����
    @since version-1.0
    @date 2023/2/7 15:31
    @param
    @return
    @description :�жϴ����Ƿ��ڱ��Ŷ�
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
    @author ����
    @since version-1.0
    @date 2023/2/8 20:32
    @param
    @return
    @description :
        �Ƴ���Ա��
    */
    public boolean removeMember(int memberId){
        boolean result=false;//ɾ�������ɹ����ı�ʶ��
        int i=0;
        for(;i<total;i++){
            if (team[i].getMemberId()==memberId){//�ó�Ա���Ŷ��У��������²�����
                result=true;
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if(result==true) {//������ȱϯλ�����������ǰ��һ��λ�á�
            for (int j = i + 1; j < total; j++) {
                team[j - 1] = team[j];
            }
            team[--total] = null;
        }
        return result;

    }




}