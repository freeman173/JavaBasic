package com.jc.FourDay.ProjectOne;

public class FamilyAccount {

    private static String details="��֧\t\t�˻����\t\t��֧���\t\t˵��\n";
    private static int balance=10000;

    public static void main(String[] jc){

        boolean isFlag=true;

        while(isFlag){

//            �˵�ҳ��
            System.out.println("-------------��ͥ��֧�������-------------");
            System.out.println("-----1 ��֧��ϸ------");
            System.out.println("-----2 �Ǽ�����------");
            System.out.println("-----3 �Ǽ�֧��---");
            System.out.println("-----4 �˳�------");
            System.out.println("-------------��ѡ��1-4����-------------");

//            ��ȡ�û�ѡ��
            char selection=Utility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("1 ��֧��ϸ");
                    System.out.println("---------��ǰ��֧��ϸ��¼-------");
                    System.out.println(details);

                    System.out.println("----------------------------");
                    break;
                case '2':
                    System.out.println("2 �Ǽ�����");
                    System.out.println("����������:");
                    int money=Utility.readInt();
                    System.out.println("����������˵��:");
                    String info=Utility.readKeyBoard();

//                    ���䶯
                    balance+=money;
//                    ��ӽ�ȥ
                    details+="����"+"\t\t"+balance+"\t\t"+money+"\t\t"+info+"\n";
                    System.out.println("------------�Ǽ����----------------");
                    break;
                case '3':
                    System.out.println("3 �Ǽ�֧��");
                    System.out.println("����֧�����:");
                    int moneyTwo=Utility.readInt();
                    System.out.println("����֧�����˵��:");
                    String infoTwo=Utility.readKeyBoard();
                    //                    ���䶯
                    balance-=moneyTwo;
//                    ��ӽ�ȥ
                    details+="֧��"+"\t\t"+balance+"\t\t"+moneyTwo+"\t\t"+infoTwo+"\n";
                    System.out.println("------------�Ǽ����----------------");

                    break;
                case '4':
                    System.out.println("ȷ���Ƿ��˳���Y/N��:");
                    char isExit=Utility.confirmSelection();

                    if (isExit=='Y')isFlag=false;


            }



        }
        System.out.println("�´��ټ�");




    }

}
