package com.jc.thirteenDay;


/*

手动生成异常的一个案例！

*/


class Student{
    private int id;

    public void regist(int id) throws Exception {//    将异常抛出
        if(id>0){
            this.id=id;
        }
        else {
//            手动生成一个异常
            throw new Exception("数据非法！");
        }
    }


}





public class ExceptionTest2 {
    public static void main(String[] JC){
        Student s=new Student();
        try {//处理掉被抛出的异常
            s.regist(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("______________");

    }

}
