package com.jc.twelve.demo3;


/*
һ������������

*/

//һ���ӿ�
interface A{
//    �ӿڶ���ı���Ϊ��̬����
     String x="���ǽӿ�";
}

//һ����
class B{
//   ���ﶨ��Ϊʵ������
     String x="���Ǹ���";
}

//�̳���
class C extends B implements A{
    public void px(){
//        ����ʱ����ָ��ǰ׺����
//        System.out.println(x);
        System.out.println(A.x);
        System.out.println(super.x);
    }

}




public class InterfaceTestwo {

    public static void main(String[] jc){
        new C().px();
        System.out.println("_________________");

    }




}
