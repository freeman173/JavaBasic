package com.jc.eightday.CustomerInformation;

/*

CustomerView:
    ��ģ�飬

Customerlist:
    �������ģ�飺

customer:
    ʵ���࣬��װ�û���Ϣ


��Ϣ��Ŀ�Ŀ�����
    �����ͱȽϼ򵥣���д�ˡ�







 */


import com.jc.FourDay.ProjectOne.Utility;

public class CustomerView {

    private CustomerList customerList=new CustomerList(10);

    public CustomerList getCustomerList() {
        return customerList;
    }

    public static void main(String[] jc){

        enterMainMenu();
//        addCustomer();


    }
    /*
        ����˵�ҳ��
     */
    public static void enterMainMenu(){

        CustomerView customerView =new CustomerView();
        boolean isFlag=true;
        while(isFlag){
//            �˵�ҳ��
            System.out.println("-------------�ͻ���Ϣ����ģ��-------------");
            System.out.println("-----1 ����û�------");
            System.out.println("-----2 �޸��û�------");
            System.out.println("-----3 ɾ���û�---");
            System.out.println("-----4 ��ѯ�ͻ��б�------");
            System.out.println("-----5 �˳�------");
            System.out.println("-------------��ѡ��1-5����-------------");

//            ��ȡ�û�ѡ��
            char selection= CMUtility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("------------�û����ģ��----------------");

                    customerView.addCustomer();
                    System.out.println("----------------------------");
                    break;
                case '2':
                    System.out.println("------------�û��޸�ģ��----------------");

                    System.out.println("------------�Ǽ����----------------");
                    break;
                case '3':
                    System.out.println("------------�û�ɾ��ģ��----------------");

                    System.out.println("------------�Ǽ����----------------");
                    break;

                case '4':
                    System.out.println("------------�û���ѯģ��----------------");
                    customerView.listAllCustomer();
                    System.out.println("----------------------------");
                    break;


                case '5':
                    System.out.println("ȷ���Ƿ��˳���Y/N��:");

                    char isExit=CMUtility.confirmSelection();

                    if (isExit=='Y')isFlag=false;
            }

        }

        System.out.println("�´��ټ�");




    }

    /*
        �������û�
     */
    public  void addCustomer(){

        /*
            ���������û�����Ϣ
         */
        System.out.print("����:");
        String name=CMUtility.readStr(10);

        System.out.print("�Ա�:");
        char gender=CMUtility.readChar('��');

        System.out.print("����:");
        int age=CMUtility.readInt(25);

        System.out.print("�ֻ���:");
        String phone=CMUtility.readStr(11);

        System.out.print("����:");
        String email=CMUtility.readStr(20);

//        ����û�
        Customer customer=new Customer(name,gender,age,phone,email);
        if(customerList.addCustomer(customer)){
            System.out.println("��ӳɹ���");

        }else System.out.println("���ʧ��");

        return;

    }

    /*
       �޸��û�
    */
    public void modifyCustomer(){

    }

    /*
           ɾ���û�
        */
    public void deleteCustomer(){

    }



    /*
           ���������û�
    */
    public void listAllCustomer(){
        Customer[] customers=customerList.getAllCustomers();


        System.out.println("");

    }

    /*
           ����ָ���û�
        */
    public void listCustomer(){

    }

}
