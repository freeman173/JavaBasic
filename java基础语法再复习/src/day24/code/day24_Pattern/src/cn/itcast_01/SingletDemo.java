package day24.code.day24_Pattern.src.cn.itcast_01;

/*
 * ���ģʽ��������ܽᡣ��һ��ģ�͡�
 * 
 * ���ࣺ
 *		������ģʽ
 *		��Ϊ��ģʽ
 *		�ṹ��ģʽ
 *
 * ����ģʽ����֤�����ڴ���ֻ��һ������
 * ������
 * 		windows��ӡ������վ������
 * 
 * ����ܹ���֤�����ڴ���ֻ��һ��������?
 * 		A:����粻�ܴ�������
 * 			����˽��
 * 		B:�����ṩһ������
 * 			�ڳ�Աλ�ô�������
 * 		C:�����ṩ�����ķ��ʷ�ʽ
 * 			дһ��������������
 */
public class SingletDemo {
	public static void main(String[] args) {
		// Student s1 = new Student();
		// Student s2 = new Student();
		// System.out.println(s1 == s2);

		// Student.s = null;

		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2);
	}
}
