package day24.code.day24_Thread.src.cn.itcast_06;

public class GetThread implements Runnable {

	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			s.get();
		}
	}

}
