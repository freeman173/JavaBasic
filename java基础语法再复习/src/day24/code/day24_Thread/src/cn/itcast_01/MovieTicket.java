package day24.code.day24_Thread.src.cn.itcast_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MovieTicket implements Runnable {

	private int tickets = 100;
	private Object obj = new Object();

	// ����
	// private ReentrantLock lock = new ReentrantLock();
	private Lock lock = new ReentrantLock();

	// @Override
	// public void run() {
	// while (true) {
	// synchronized (obj) {
	// if (tickets > 0) {
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	//
	// System.out.println(Thread.currentThread().getName()
	// + "���ڳ��۵�" + (tickets--) + "��Ʊ");
	// }
	// }
	// }
	// }

	@Override
	public void run() {
		while (true) {
			try {
				// ����
				lock.lock();

				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName()
							+ "���ڳ��۵�" + (tickets--) + "��Ʊ");
				}
			} finally {
				// �ͷ���
				lock.unlock();
			}
		}
	}
}
