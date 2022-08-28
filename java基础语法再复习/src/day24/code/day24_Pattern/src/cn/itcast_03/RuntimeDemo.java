package day24.code.day24_Pattern.src.cn.itcast_03;

import java.io.IOException;

/*
 * Runtime��
 * 		public static Runtime getRuntime()
 * 
 * û�й��죬������ȫ�Ǿ�̬�ġ�
 * ������϶���ͨ����̬�ķ��������˸���Ķ���
 */
public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();

		// r.exec("calc");
		r.exec("notepad");
	}
}
