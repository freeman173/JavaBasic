package day24.code.day24_Thread.src.cn.itcast_05;

public class GetThread implements Runnable {

	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (!s.flag) {
					// ���û�����ݣ��͵ȴ�
					try {
						s.wait(); // t2�͵ȴ���,�ͷ���������,�������������������
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(s.name + "---" + s.age);
				// ����ϼ---28
				// ���� ---31

				// ������ʾ
				s.flag = false;
				s.notify();
			}

			// t1,t2��
		}
	}

}
