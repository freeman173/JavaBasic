package day24.code.day24_Thread.src.cn.itcast_02;

/*
 * ��������ָ���������������ϵ��߳���ִ�еĹ����У���������Դ������һ�ֻ���ȴ�����
 * 
 * ������
 * 		�й��˺�һ�������˳Է���
 * 			�й��ˣ���ֻ����
 * 			�����ˣ�����
 * 		��ʵ�����	
 * 			�й��ˣ�һֻ���ӣ�һ�ѵ�
 * 			�����ˣ�һֻ���ӣ�һ�Ѳ�
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock d1 = new DieLock(true);
		DieLock d2 = new DieLock(false);

		d1.start();
		d2.start();
	}
}
