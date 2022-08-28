package dayFive.one;

/*
	方法重载：
		在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
		和返回值类型无关。
*/


public class MethodDemo {
    public static void main(String[] args) {

        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));

    }


    public static Integer sum(Integer a,Integer b){return a+b;}


    public static Integer sum(Integer a,Integer b,Integer c){return a+b+c;}



}
