package day24.code.day24_Thread.src.cn.itcast_08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * �̳߳أ��̳߳����ÿһ���̴߳�������󣬲����������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á�
 * 
 * ���裺
 * 		A:������MyRunnableʵ��Runnable�ӿ�
 * 		B:����MyRunnable����
 * 		C:�����̳߳ض���
 * 		D:�ύ
 * 		E:�ͷ�
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		// ����ʵ����Runnable�ӿڵĶ���
		MyRunnable my = new MyRunnable();

		// �����̳߳ض���
		// public static ExecutorService newFixedThreadPool(int nThreads)
		ExecutorService pool = Executors.newFixedThreadPool(5);

		// �ύ����
		// Future<?> submit(Runnable task)
		pool.submit(my);
		pool.submit(my);
		pool.submit(my);
		pool.submit(my);
		pool.submit(my);

		// �ͷ�
		pool.shutdown();
	}
}
