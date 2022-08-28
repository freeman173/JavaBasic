package day13.two;


/*
 * StringBuffer和String的区别?
    * A:StringBuffer的长度可变
    * B:String的长度固定
    *String创建每一个字符串都会在常量池开辟一个新的空间。而StringBuffer会提前给出容量，可以重新进行字符串拼接，而不会重新开辟空间。

构造方法：
		A:StringBuffer sb = new StringBuffer();
		B:StringBuffer sb = new StringBuffer(50);
		C:StringBuffer sb = new StringBuffer("hello");

*
*
*
*
 */









public class StringBufferDemo {

    public static void main(String[] args){

        StringBuffer stringBuffer=new StringBuffer();


        System.out.println("OK");

    }



}
