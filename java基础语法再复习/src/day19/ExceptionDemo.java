package day19;



/*


 * 分类：
 * 		错误	Error	合理的应用程序不应该试图捕获的严重问题。说明我们不需要处理这种问题，比如说内存溢出。
 * 		异常	Exception	合理的应用程序想要捕获的条件，说明是需要我们进行处理的。
 * 			编译时期异常	非RuntimeException	这是我们必须要处理的异常。
 * 			运行时期异常	RuntimeException	这种异常，一般我们也是不需要处理的。一般出现这样的问题，应该是我们写的代码出问题了。

 * JVM的默认处理方案:
 * 		程序出现了异常，如果我们没有做任何处理，jvm做出了默认的处理。
 * 		把异常的类名，产生的原因以及出现的位置等信息显示在了控制台。
 * 		并让程序从这里结束了。

 * java中我们如何处理异常呢?
 * A:try…catch…finally
 * B:throws
 *
 * try…catch…finally格式
 * try {
 * 		可能出现问题的代码
 * }catch(异常类名 变量) {
 * 		针对问题的处理
 * }finally {
 * 		释放资源的代码
 * }
 *
 * finally等会在讲，所以，这个时候，我们先使用简单的格式：
 * try {
 * 		可能出现问题的代码
 * }catch(异常类名 变量) {
 * 		针对问题的处理
 * }
 *
 * 尽可能的把可能出现问题的代码用try包含，如果你判断不了哪些有问题，可以多包含一些。


 * 多个异常的情况：
 * A:针对每个异常，给出一个处理
 * B:try...catch...catch...catch...
 * 		注意：
 * 			a:一旦try里面的代码有问题，就不在执行try里面的内容，和catch里面的内容依次的匹配，一旦有一个匹配，其他的不执行。
 * 			b:如果异常是平级关系，谁先谁后无所谓。
 *            如果异常不是平级关系，子先父后。


 * throws：它就是在方法上声明异常，告诉你，我这个方法有问题。你使用的时候要注意了；throws:用在方法上，抛出异常，让调用者去处理。


 * finally:被finally控制的语句体一定会执行。
 * 应用：数据库的连接，IO操作的时候。

 * 面试题：
 * final,finally和finalize的区别?
 * final:修饰类，修饰成员变量，修饰成员方法
 * 		修饰类,类不能被继承
 * 		修饰成员变量，变量是常量
 * 		修饰成员方法，方法不能被重写
 * finally:被finally控制的代码永远会执行，用于释放资源。
 * 		注意事项：就是在执行到finally之前jvm退出了。
 * finalize:是Object类的方法，启动垃圾回收器，用于回收垃圾。
 *
 * 如果catch里面有return语句，请问finally的代码还会执行吗?如果会，请问是在return前还是return后。
 * 会执行。
 * 前。
 * 准确的说法：中间。
 * 整个这个过程有三步：
 * 		1：执行到return 40;的时候，就在内存中形成了一个返回路径。
 * 		2:由于它发现还有一个finally，所以，继续执行了finally，n=50
 * 		3:finally结束后，再次回到以前的返回路径，继续。所以返回的是40







 */


public class ExceptionDemo {

    public static void main(String[] args) {
//        System.out.println("hello");
//
//        int a = 10;
//        // int b = 4;
//        int b = 0; // java.lang.ArithmeticException: / by zero
//
//        try {
//            System.out.println(a / b);
//        }catch (ArithmeticException exception){
//            System.out.println(exception);
//        }finally {
//            System.out.println("执行到final语句了！");
//        }
//
//        System.out.println("world");
//
//        method();


    }

    public static void method() throws ArithmeticException {
        System.out.println("hello");

        int a = 10;
        int b = 0;
        System.out.println(a / b);

        System.out.println("world");
    }



}
