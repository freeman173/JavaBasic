package daySeven.four;

/*
	public static void main(String[] args):

	public:访问权限修饰符，表示最大的访问权限，被jvm调用，所有权限要够大。
	static:被jvm调用，不用创建对象，直接类名访问
	main:一个通用的名称，虽然不是关键字，但是被jvm识别

	String[] args:
		早期出现是为了接收键盘录入数据的。

		java HelloWorld aa bb cc
*/


public class HelloWorld {

    public static void main(String[] args){

        System.out.println(args[0]);


    }



}
