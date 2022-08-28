package day14.one;


/*
 * 类 Date 表示特定的瞬间，精确到毫秒。


 * SimpleDateForamt：
 * 格式化（日期 -> 文本）
 * 		Date	--	String
 * 				public final String format(Date date)
 * 				模式对象你想要什么就写什么。
 * 解析（文本 -> 日期）
 * 		String 	-- 	Date
 * 				public Date parse(String source)
 * 				模式对象必须和给定的字符串匹配。


 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {

//        获取当前日期
//        Date d=new Date();
//        System.out.println("d:"+d);

//        将当前日期转换为指定格式
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String result = sdf.format(d);
//        System.out.println(result);
//        System.out.println("-------------------------------------------------");

//将指定日期字符串转化为Date类型
        String s = "2008-08-08 12:23:34";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // public Date parse(String source)
        Date dd = sdf2.parse(s);
        System.out.println(dd);






    }



}
