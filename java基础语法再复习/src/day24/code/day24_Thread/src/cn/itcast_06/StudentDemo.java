package day24.code.day24_Thread.src.cn.itcast_06;

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
 * 
 * Ϊ����Ч������һЩ�����Ǹ������鲻ͬ��ֵ������ѭ��ģ�⡣
 * ��Σ�Ч���õ��ˣ������ֳ������µ�����
 * ����2:
 * 		A:��ͬ�����ݳ����˶��
 * 			CPU��һ���ʱ����㹻����ִ�кܶ��
 * 		B:���ݶ�Ӧ����������
 * 			����ϼ 31
 * 			����	28
 * 
 * 			�̵߳������
 * 
 * ����һ�����⣺�̰߳�ȫ����
 * 		A:���̻߳���	��
 * 		B:��������		s����
 * 		C:������������������		��
 * 
 * ����̰߳�ȫ����,��ô�����?
 * 		������ͬ������顣
 * 		ע�⣺
 * 			A:��ͬ������̲߳�����ʱ��Ҫ������ͬʱ��Ҫ�ӡ�
 * 			B:����ͬʱ��������Ҫ������ͬһ��
 * 
 * ���ڵ����ݣ�һ�γ���һ��Ƭ�������������γ��֡�
 * ���ʱ��java���ṩ�˵ȴ����ѻ��ơ�
 * wait() ���̴߳��ڵȴ�
 * notify()	���ѵ����߳�
 * notifyAll() ���������߳�
 * 
 * Ϊʲô��Щ�������嵽��Object������?
 * 		��Ϊ������Щ����������ͨ����������ã���ͬ��������������������������Զ�������Object�ࡣ
 * 
 * ������θ���������?
 * 		Ϊ���ܹ�ʵ�ֵȴ����ѣ��Ҽ���һ���µı�����
 * 
 * ��ͬ��������ʵ�ָĽ�Ϊ��ͬ��������
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
