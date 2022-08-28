package day24.code.day24_Thread.src.cn.itcast_12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * ը��Ҫ����ը
 */
public class TimerDemo2 {
	public static void main(String[] args) throws ParseException {
		// ����������
		Timer t = new Timer();

		// ��������
		// t.schedule(new TimerTask() {
		// @Override
		// public void run() {
		// System.out.println("Ҫը�ˣ�����");
		// }
		// }, 2000);

		// public void schedule(TimerTask task,long delay,long
		// period):��һ����delay���������Ժ�ÿ����period����
		// t.schedule(new TimerTask() {
		// @Override
		// public void run() {
		// System.out.println("ը����");
		// }
		// }, 3000, 1000);

		// public void schedule(TimerTask task,Date time)
		String s = "2015-04-12 15:48:20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);

		t.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("ը����");
			}
		}, d, 3000);
	}
}
