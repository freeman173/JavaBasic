package com.jc.jihe;

/*
lamda���ʽ:
�����﷨: (parameters) -> expression �� (parameters) ->{ statements; }

->�������Ϊ�������ڡ�����˼��


����ʽ�ӿڣ�
    һ���ӿ�����ֻ��һ�����󷽷�





*/

//�޷���ֵ�޲���
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}

//�޷���ֵ��������
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}

//�з���ֵ����������
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a,int b);
}

public class Demo {


    public static void One(){

       NoParameterNoReturn noReturn=()->{
           System.out.println("���ǳ��ˣ�");
       };
        noReturn.test();

       MoreParameterNoReturn moreParameterNoReturn=(int a,int b)->{
            System.out.println("jc:"+(a+b));
        };

        moreParameterNoReturn.test(12,20);


        MoreParameterReturn moreParameterReturn=(int a,int b)->{
            return a+b;
        };

        moreParameterReturn.test(12,20);

        System.out.println("______________");



    }

    public static void main(String[] DD){
        One();

    }



}