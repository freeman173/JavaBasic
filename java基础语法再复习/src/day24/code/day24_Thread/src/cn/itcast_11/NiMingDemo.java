package day24.code.day24_Thread.src.cn.itcast_11;

/*
 * �����ڲ���ķ�ʽ�������̳߳���
 * 
 * new ����() {
 * 		��д����
 * };
 */
public class NiMingDemo {
	public static void main(String[] args) {
		/*
		 * new Thread() {
		 * 
		 * @Override public void run() { for (int x = 0; x < 100; x++) {
		 * System.out.println("hello" + x); } } }.start();
		 * 
		 * new Thread() {
		 * 
		 * @Override public void run() { for (int x = 0; x < 100; x++) {
		 * System.out.println("world" + x); } } }.start();
		 */

		/*
		 * new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int x = 0; x < 100; x++) {
		 * System.out.println("javase" + x); } } }).start();
		 * 
		 * new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int x = 0; x < 100; x++) {
		 * System.out.println("javaee" + x); } } }).start();
		 */

		// ����
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("android" + x);
				}
			}
		}) {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("haha" + x);
				}
			}
		}.start();

	}
}
