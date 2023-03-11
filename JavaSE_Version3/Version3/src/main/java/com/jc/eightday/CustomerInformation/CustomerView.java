package com.jc.eightday.CustomerInformation;

/*

CustomerView:
    主模块，

Customerlist:
    对象管理模块：

customer:
    实体类，封装用户信息


信息项目的开发：
    本来就比较简单，不写了。







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
        进入菜单页面
     */
    public static void enterMainMenu(){

        CustomerView customerView =new CustomerView();
        boolean isFlag=true;
        while(isFlag){
//            菜单页面
            System.out.println("-------------客户信息管理模块-------------");
            System.out.println("-----1 添加用户------");
            System.out.println("-----2 修改用户------");
            System.out.println("-----3 删除用户---");
            System.out.println("-----4 查询客户列表------");
            System.out.println("-----5 退出------");
            System.out.println("-------------请选择（1-5）：-------------");

//            获取用户选择
            char selection= CMUtility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("------------用户添加模块----------------");

                    customerView.addCustomer();
                    System.out.println("----------------------------");
                    break;
                case '2':
                    System.out.println("------------用户修改模块----------------");

                    System.out.println("------------登记完成----------------");
                    break;
                case '3':
                    System.out.println("------------用户删除模块----------------");

                    System.out.println("------------登记完成----------------");
                    break;

                case '4':
                    System.out.println("------------用户查询模块----------------");
                    customerView.listAllCustomer();
                    System.out.println("----------------------------");
                    break;


                case '5':
                    System.out.println("确认是否退出（Y/N）:");

                    char isExit=CMUtility.confirmSelection();

                    if (isExit=='Y')isFlag=false;
            }

        }

        System.out.println("下次再见");




    }

    /*
        增加新用户
     */
    public  void addCustomer(){

        /*
            依次输入用户的信息
         */
        System.out.print("姓名:");
        String name=CMUtility.readStr(10);

        System.out.print("性别:");
        char gender=CMUtility.readChar('男');

        System.out.print("年龄:");
        int age=CMUtility.readInt(25);

        System.out.print("手机号:");
        String phone=CMUtility.readStr(11);

        System.out.print("邮箱:");
        String email=CMUtility.readStr(20);

//        添加用户
        Customer customer=new Customer(name,gender,age,phone,email);
        if(customerList.addCustomer(customer)){
            System.out.println("添加成功！");

        }else System.out.println("添加失败");

        return;

    }

    /*
       修改用户
    */
    public void modifyCustomer(){

    }

    /*
           删除用户
        */
    public void deleteCustomer(){

    }



    /*
           查找所有用户
    */
    public void listAllCustomer(){
        Customer[] customers=customerList.getAllCustomers();


        System.out.println("");

    }

    /*
           查找指定用户
        */
    public void listCustomer(){

    }

}
