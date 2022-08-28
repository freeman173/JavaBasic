package day24.code.day24_Thread.src.cn.itcast_10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * ��Ͱ���
 */
public class ThreadPoolDemo {
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		// �����̳߳ض���
		ExecutorService pool = Executors.newFixedThreadPool(3);

		// �ύ����
		Future<Integer> f1 = pool.submit(new MyCallable(10));
		Future<Integer> f2 = pool.submit(new MyCallable(50));
		Future<Integer> f3 = pool.submit(new MyCallable(100));

		Integer i1 = f1.get();
		Integer i2 = f2.get();
		Integer i3 = f3.get();

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

		pool.shutdown();
	}
}
