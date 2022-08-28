package day24.code.day24_Thread.src.cn.itcast_06;

public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				s.set("����ϼ", 28);
			} else {
				s.set("����", 31);
			}
			x++;
		}
	}

}
