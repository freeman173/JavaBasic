package dayEight.one;


/*

继承之后：
    使用成员变量：用this；使用父类变量，用super
 */

class Father{
    public Integer age=100;

}
class Son extends Father {
    public Integer age = 80;

    public void show() {

        System.out.println("这是我的成员："+this.age); //本类成员
        System.out.println("这是我父亲的成员："+super.age); //父类成员

    }
}




public class ExtendsDemo2 {
    public static void main(String[] args){

        Son son=new Son();
        son.show();





    }
}





