package day24.code.day24_Pattern.src.cn.itcast_01;

public class Student {
	// ����˽��
	private Student() {
	}

	// ������
	// ��ֻ̬�ܷ��ʾ�̬,��static
	// Ϊ�˲�����ӷ��ʣ���private
	private static Student s = new Student();

	// �ṩ��������
	// Ϊ����������ֱ�ӷ��ʣ���static
	public static Student getStudent() {
		return s;
	}
}
