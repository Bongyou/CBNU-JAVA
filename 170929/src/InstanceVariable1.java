class Student{
	int m_kor;
	int m_eng;
	int m_mat;
}

public class InstanceVariable1 {
	public static void main(String[] args) {
		Student obj=new Student();
		obj.m_eng=40;
		obj.m_mat=50;
		System.out.println("obj�� �������� = "+obj.m_kor);
		System.out.println("obj�� �������� = "+obj.m_mat);
		System.out.println("obj�� �������� = "+obj.m_eng);
	}
}
