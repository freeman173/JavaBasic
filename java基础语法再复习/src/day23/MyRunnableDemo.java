package day23;


/*

        * 实现Runnable接口的步骤：
        * A:定义类MyRunnable实现接口Runnable
        * B:重写run()方法
        * C:创建MyRunnable的对象
        * D:创建Thread类的对象，并把C步骤的对象作为构造参数传递
        * E:启动线程
        *
        * 有了继承Thread类的方式，为什么还要有实现Runnable接口的方式?
        * 原因是因为类是单继承。
*/



class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int x=1;x<=5;x++){

            System.out.println(Thread.currentThread().getName() + ":" +x);
        }

    }
}


public class MyRunnableDemo {

    public static void main(String[] args) {

        MyRunnable myRunnable=new MyRunnable();

        Thread t1 = new Thread(myRunnable, "孟非");
        Thread t2 = new Thread(myRunnable, "乐嘉");


        t1.start();
        t2.start();










    }





















}
