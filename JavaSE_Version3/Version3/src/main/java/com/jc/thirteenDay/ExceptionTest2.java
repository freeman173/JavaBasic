package com.jc.thirteenDay;


/*

�ֶ������쳣��һ��������

*/


class Student{
    private int id;

    public void regist(int id) throws Exception {//    ���쳣�׳�
        if(id>0){
            this.id=id;
        }
        else {
//            �ֶ�����һ���쳣
            throw new Exception("���ݷǷ���");
        }
    }


}





public class ExceptionTest2 {
    public static void main(String[] JC){
        Student s=new Student();
        try {//��������׳����쳣
            s.regist(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("______________");

    }

}
