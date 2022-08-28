package day19;

import java.util.Scanner;

class Teacher {
    public void check(int score) throws MyException {
        if (score < 0 || score > 100) {
            throw new MyException("分数不在0-100之间");
        } else {
            System.out.println("分数正常");
        }
    }
}



public class MyExceptionDemo {

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入考试成绩： ");
            int score = sc.nextInt();

            Teacher t = new Teacher();
            try {
                t.check(score);
            } catch (MyException e) {
                // System.out.println(e.toString()); // cn.itcast_07.MyException:
                // 分数不在0-100之间
                e.printStackTrace();
            }
        }
    }
}