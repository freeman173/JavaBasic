package daySeven.four;

/*

在Java中，可以使用static来表示类变量(所有基于此类的对象均可分享它)




 */

class Student{
     String name;
     Integer age;
//    班级编号
     static String classNumber;

    public Student(String name ,Integer age){
        this.name=name;
        this.age=age;
    }
    public Student(String name ,Integer age,String classNumber){
        this.name=name;
        this.age=age;
        Student.classNumber =classNumber;
    }

    public void show(){

        System.out.println("name:"+this.name+"\nage:"+this.age+"\n班级编号:"+classNumber);
    }

}


public class StudentDemo {
    public static void main(String[] args){

        //创建学生对象
        Student s1 = new Student("林青霞",28,"20150306");
        s1.show();

		/*
		Student s2 = new Student("马云",35,"20150306");
		s2.show();

		Student s3 = new Student("马化腾",33,"20150306");
		s3.show();
		*/
        Student s2 = new Student("马云",35);
        s2.show();

        Student s3 = new Student("马化腾",33);
        s3.show();



    }











}
