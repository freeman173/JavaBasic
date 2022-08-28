package day24.code.day24_Thread.src.cn.itcast_03;

/*
 * �������ѧ����������ѧ�������ԣ�Ҳ���Ի�ȡѧ�������ԡ��������ǾͰ����ÿ�������������ȡ���������ѾͿ����ˡ�
 * �������ࣺ
 * 		ѧ����
 * 		�������Ե��߳�
 * 		��ȡ���Ե��߳�
 * 		������
 * 
 * ����1��д��һЩ�򵥵Ĵ�������Ƿ������������⣬��null---0
 * ԭ��:
 * 		�������õĶ���ͻ�ȡ�Ķ�����ͬһ�������ԣ��ò���ֵ
 * �����
 * 		�����úͻ�ȡ�Ķ�����ͬһ��
 */
public class StudentDemo {
	public static void main(String[] args) {
		// ����һ��ѧ����Դ
		Student s = new Student();

		// �����̶߳���
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		t1.start();
		t2.start();
	}
}
