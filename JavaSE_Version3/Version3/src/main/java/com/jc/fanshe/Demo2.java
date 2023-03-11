package com.jc.fanshe;

/*
��̬������1��


*/


//�ܽӿ�
interface ClothFactory{
    void produceCloth();
}


//��������
class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("Nike��������һ���·���");
    }
}



//������
class ProxyClothFactory implements ClothFactory{

    private ClothFactory clothFactory;

    public ProxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("��������׼��������");
        clothFactory.produceCloth();
        System.out.println("����������β������");
    }


}


public class Demo2 {

    public static void main(String[] DD){
//        ���������
        NikeClothFactory nikeClothFactory=new NikeClothFactory();

//        ����������Ž������࣡
        ProxyClothFactory proxyClothFactory=new ProxyClothFactory(nikeClothFactory);

        proxyClothFactory.produceCloth();

        System.out.println("______________");


    }
}