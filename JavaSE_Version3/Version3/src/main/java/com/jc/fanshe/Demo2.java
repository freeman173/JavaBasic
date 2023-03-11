package com.jc.fanshe;

/*
静态代理案例1：


*/


//总接口
interface ClothFactory{
    void produceCloth();
}


//被代理类
class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产一批衣服！");
    }
}



//代理类
class ProxyClothFactory implements ClothFactory{

    private ClothFactory clothFactory;

    public ProxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂的准备工作！");
        clothFactory.produceCloth();
        System.out.println("代理工厂的收尾工作！");
    }


}


public class Demo2 {

    public static void main(String[] DD){
//        被代理对象
        NikeClothFactory nikeClothFactory=new NikeClothFactory();

//        将被代理类放进代理类！
        ProxyClothFactory proxyClothFactory=new ProxyClothFactory(nikeClothFactory);

        proxyClothFactory.produceCloth();

        System.out.println("______________");


    }
}