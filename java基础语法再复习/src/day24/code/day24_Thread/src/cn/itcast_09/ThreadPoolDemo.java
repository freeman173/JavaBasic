package day24.code.day24_Thread.src.cn.itcast_09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * �̳߳أ��̳߳����ÿһ���̴߳�������󣬲����������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á�
 * 
 * ���裺
 * 		A:������MyCallableʵ��Callable�ӿ�
 * 		B:����MyCallable����
 * 		C:�����̳߳ض���
 * 		D:�ύ
 * 		E:�ͷ�
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		// ����ʵ����Runnable�ӿڵĶ���
		MyCallable my = new MyCallable();

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
