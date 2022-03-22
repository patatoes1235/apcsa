public class Student extends Person {
	private String school, grade;
	public Student() {
		school = "Belmont High";
		grade = "Freshman";
	}
	public Student(String name, String street, String csz, String school, String grade) {
		super(name, street, csz);
		this.school = school;
		this.grade = grade;
	}
	public String getSchool() {
		return school;
	}
	public String getGrade() {
		return grade;
	}
	public void setSchool(String s) {
		school = s;
	}
	public void setGrade(String g) {
		grade = g;
	}

	public String toString() {
		return super.toString() + "\n" + super.getName() + "is a " + grade + " at " + school;

	}
}
