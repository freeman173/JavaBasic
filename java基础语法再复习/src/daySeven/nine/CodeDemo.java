package daySeven.nine;


/*
   代码块：在Java中，使用{}括起来的代码被称为代码块。

        根据其位置和声明的不同，可以分为
            局部代码块：在方法中出现；限定变量生命周期，及早释放，提高内存利用率

            构造代码块：在类中方法外出现;在构造方法前执行。

            静态代码块：在类中方法外出现，加了static修饰。
            用于给类进行初始化，在加载的时候就执行（最先被执行，在构造代码块之前），并且只执行一次。


        */




class Code{

    public Code(){

        System.out.println("我是构造函数");
    }

    {
        System.out.println("我是构造代码块");
    }



    static {
        System.out.println("我是静态代码块");
    }






}





public class CodeDemo {


    public static void main(String[] args){


        Code a=new Code();
        Code b=new Code();
        {

            System.out.println("我是局部代码块");
        }






    }







}
