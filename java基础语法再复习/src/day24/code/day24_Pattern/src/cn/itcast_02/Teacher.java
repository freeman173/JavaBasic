package day24.code.day24_Pattern.src.cn.itcast_02;

/*
 * ����ʽ�����ص�ʱ��ʹ�������
 * ����ʽ�����õ�ʱ����ȥ��������
 * 		�̰߳�ȫ����
 * 		�ӳټ���˼��(ʲôʱ���ã�ʲôʱ�����)
 * 
 * ������:��дһ��Singleton
 * ���ԣ�����ʽ
 * ����������ʽ
 * 
 * Ϊʲô��?
 * 		����ʽ���׳����⣬������ʽ��������⡣
 * 		�̰߳�ȫ���⡣
 */
public class Teacher {
	private Teacher() {
	}

	private static Teacher t = null;

	public synchronized static Teacher getTeacher() {
		// t1,t2,t3
		if (t == null) {
			// t1,t2,t3
			t = new Teacher();
		}
		return t;
	}
}
