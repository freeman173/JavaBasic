package daySeven.eight;

/*
	需求：猜数字小游戏

	分析：
		A:系统产生一个1-100之间的随机数。
			int number = (int)(Math.random()*100)+1;
		B:键盘录入数据,用Scanner实现
		C:用这两个数据进行比较
			大	提示大了
			小	提示小了
			等	恭喜你，猜中了
		D:为了保证我们能够猜中，我们就加入循环，实现多次猜。直到猜中。



    java int与Integer
        Integer是int的包装类，int则是java的一种基本数据类型
        Integer变量必须实例化后才能使用，而int变量不需要
        Integer实际是对象的引用，当new一个Integer时，实际上是生成一个指针指向此对象；而int则是直接存储数据值
        Integer的默认值是null，int的默认值是0




*/


import java.util.Scanner;

public class GuessNumberDemo {

    public static void main(String[] args){

//        系统产生一个100以内的随机数
        int number=(int) (Math.random()*100)+1;

        while (true){
//键盘输入一个竞猜数据
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入一个数据（1-100）:");
            int guessnumber=sc.nextInt();

//            作比较
            if(guessnumber>number){
                System.out.println("大了");
            }else if(guessnumber<number){
                System.out.println("小了");
            }else{
                System.out.println("ok");
                break;
            }






        }











    }





}
