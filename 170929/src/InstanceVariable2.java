class Student2{
	int m_kor;
	int m_eng;
	int m_mat;
	static String teacher = "�����";
}

public class InstanceVariable2 {
	public static void main(String[] args) {
		Student2 byj = new Student2();
		byj.m_kor=93;
		byj.m_mat=88;
		byj.m_eng=60;
		System.out.println("byj�� �������� = "+byj.m_kor);
		System.out.println("byj�� �������� = "+byj.m_mat);
		System.out.println("byj�� �������� = "+byj.m_eng);
		System.out.println("Student�� ������ = "+Student2.teacher);
		System.out.println("byj�� ������ = "+Student2.teacher);
		Student2.teacher="�念��";
		System.out.println("byj�� ������ = "+Student2.teacher);
	}
}
