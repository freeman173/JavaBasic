package day24.code.day24_Thread.src.cn.itcast_12;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ������������������һ����ɣ�
 * Timer,TimerTask
 * 
 * Timer:
 * 		public Timer()����һ���¼�ʱ����
 */
public class TimerDemo {
	public static void main(String[] args) {
		// ����������
		final Timer t = new Timer();

		// public void schedule(TimerTask task,long delay):��delay��������task������
		// t.schedule(new MyTask(t), 3000);

		// �����ڲ���ʵ��
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("ը����ը��,duang duang duang");
				t.cancel();
			}

		}, 3000);
	}
}

class MyTask extends TimerTask {
	private Timer t;

	public MyTask(Timer t) {
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println("ը����ը��,duang duang duang");
		t.cancel();
	}
}