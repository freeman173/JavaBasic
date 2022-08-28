package daySeven.one;
/*

构造方法：给对象数据初始化

    特点：
        方法名与类名相同；
        无返回值类型(无具体的返回值)；


    构造方法注意事项：
        如果你不提供构造方法，系统会给出默认的无参构造方法；
        如果你提供构造方法，系统不会给出默认的无参构造方法：
            这时，如果你还想使用无参数构造，只能自己给出；
            建议：永远自己给出无参构造。

        构造方法可以重载；
 */

class Student{
//    成员变量
    private String name;
    private Integer age;


//    无参构造
    public Student(){

        System.out.println("我是无参构造方法！！");
    }

//    有参构造
    public Student(String name){
        this.name=name;
    }
    public Student(Integer age){
        this.age=age;
    }

    public Student(String name,Integer age){
        this.name=name;
        this.age=age;
    }


}






public class StudentDemo {





}
