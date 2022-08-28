package day24.code.day24_Thread.src.cn.itcast_01;

/*
 * Ϊ�˸������������֪������μ������ͷ����ģ�JDK5�Ժ���ṩ��һ���ӿڣ�Lock����
 * Lock
 * 		public void lock():����
 * 		public void unlock():�ͷ���
 * ʵ�������
 * 		public ReentrantLock()
 */
public class MovieTicketDemo {
	public static void main(String[] args) {
		MovieTicket mt = new MovieTicket();

		Thread t1 = new Thread(mt, "����1");
		Thread t2 = new Thread(mt, "����2");
		Thread t3 = new Thread(mt, "����3");

		t1.start();
		t2.start();
		t3.start();
	}
}
