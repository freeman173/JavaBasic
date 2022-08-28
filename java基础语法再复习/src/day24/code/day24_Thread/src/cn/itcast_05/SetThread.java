package day24.code.day24_Thread.src.cn.itcast_05;

public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (s.flag) {
					// ��ͱ�ʾ������
					try {
						s.wait(); // t1�͵ȴ���
					} catch (InterruptedException e) {
						e.printStackTrace();
					}// ��������ȴ�
				}

				if (x % 2 == 0) {
					s.name = "����ϼ";
					s.age = 28;
				} else {
					s.name = "����";
					s.age = 31;
				}
				x++; // x=1,x=2

				// ������ʾ
				s.flag = true;
				s.notify(); // ���ѵȴ����̣߳�����������߳��ܹ�������ȡCPU��ִ��Ȩ
			}
			// t1,t2��
		}
	}

}
