package day24.code.day24_Thread.src.cn.itcast_04;

public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		// ..........
		while (true) {
			synchronized (s) {
				if (x % 2 == 0) {
					s.name = "����ϼ"; // û��ִ��Ȩ�ˡ�
					s.age = 28;
				} else {
					s.name = "����";
					s.age = 31;
				}
				x++;
			}

		}
		// ...........
	}

}
