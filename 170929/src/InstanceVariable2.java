class Student2{
	int m_kor;
	int m_eng;
	int m_mat;
	static String teacher = "정약용";
}

public class InstanceVariable2 {
	public static void main(String[] args) {
		Student2 byj = new Student2();
		byj.m_kor=93;
		byj.m_mat=88;
		byj.m_eng=60;
		System.out.println("byj의 국어점수 = "+byj.m_kor);
		System.out.println("byj의 수학점수 = "+byj.m_mat);
		System.out.println("byj의 영어점수 = "+byj.m_eng);
		System.out.println("Student의 선생님 = "+Student2.teacher);
		System.out.println("byj의 선생님 = "+Student2.teacher);
		Student2.teacher="장영실";
		System.out.println("byj의 선생님 = "+Student2.teacher);
	}
}
