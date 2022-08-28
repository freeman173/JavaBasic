package daySeven.four;


/*
	static的注意事项：
		A:在静态方法中是没有this关键字的
			因为静态是随着类的加载而加载，优先于对象而存在。而this是随着对象的创建而存在。
			先进内存的， 不能访问后进内存的；而后进内存的，可以访问先进内存的。
		B:静态只能访问静态。
			非静态的成员方法：
				可以访问静态成员变量，非静态成员变量，静态成员方法，非静态成员方法
			静态的成员方法：
				只能访问静态的成员变量，静态的成员方法




	静态的内容是被所有对象共享的，非静态的是每个对象特有的。


*/

public class StudentDemo3 {

    public static void main(String[] args){

        Student s1 = new Student("大乔",28,"sgyy001");
        Student s2 = new Student("小乔",20);
//        Student s3 = new Student("貂蝉",18);

        s1.show();
        s2.show();
//        s3.show();

        s2.name = "曹操";
        s2.classNumber = "sgyy007";

        s1.show();
        s2.show();
//        s3.show();



    }








}
