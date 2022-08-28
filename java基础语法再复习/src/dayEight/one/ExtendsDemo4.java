package dayEight.one;

/*
	继承间的成员方法关系：
		不同名称：非常简单，一看就知道调用谁
		相同名称：
			先在子类找
			再在父类找
			...
			找不到就报错。


     简单注意一下就行！


*/


class F{
    public void show(){System.out.println("show fu");}
}

class Z extends F{
    public void show(){System.out.println("show zi");}
}



public class ExtendsDemo4 {


    public static void main(String[] args){
        Z z=new Z();
        z.show();



    }


}
