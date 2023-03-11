package com.jc.FourDay.ProjectOne;

public class FamilyAccount {

    private static String details="收支\t\t账户金额\t\t收支金额\t\t说明\n";
    private static int balance=10000;

    public static void main(String[] jc){

        boolean isFlag=true;

        while(isFlag){

//            菜单页面
            System.out.println("-------------家庭收支记账软件-------------");
            System.out.println("-----1 收支明细------");
            System.out.println("-----2 登记收入------");
            System.out.println("-----3 登记支出---");
            System.out.println("-----4 退出------");
            System.out.println("-------------请选择（1-4）：-------------");

//            获取用户选择
            char selection=Utility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("1 收支明细");
                    System.out.println("---------当前收支明细记录-------");
                    System.out.println(details);

                    System.out.println("----------------------------");
                    break;
                case '2':
                    System.out.println("2 登记收入");
                    System.out.println("本次收入金额:");
                    int money=Utility.readInt();
                    System.out.println("本次收入金额说明:");
                    String info=Utility.readKeyBoard();

//                    金额变动
                    balance+=money;
//                    添加进去
                    details+="收入"+"\t\t"+balance+"\t\t"+money+"\t\t"+info+"\n";
                    System.out.println("------------登记完成----------------");
                    break;
                case '3':
                    System.out.println("3 登记支出");
                    System.out.println("本次支出金额:");
                    int moneyTwo=Utility.readInt();
                    System.out.println("本次支出金额说明:");
                    String infoTwo=Utility.readKeyBoard();
                    //                    金额变动
                    balance-=moneyTwo;
//                    添加进去
                    details+="支出"+"\t\t"+balance+"\t\t"+moneyTwo+"\t\t"+infoTwo+"\n";
                    System.out.println("------------登记完成----------------");

                    break;
                case '4':
                    System.out.println("确认是否退出（Y/N）:");
                    char isExit=Utility.confirmSelection();

                    if (isExit=='Y')isFlag=false;


            }



        }
        System.out.println("下次再见");




    }

}
