package Day2;

public class Student extends College{
	public void studentName() {
		System.out.println("Student Name");

}
	public void studentDept() {
	System.out.println("Student Dept");
	}
	public void studentId() {
	System.out.println("Student Id");
				}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.deptName();
		s.HostelName();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.studentDept();
		s.studentId();
		s.studentName();
	}
}			
