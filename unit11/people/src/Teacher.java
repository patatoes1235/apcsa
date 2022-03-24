public class Teacher extends Person {
	private String subject;

	public Teacher() {
		System.out.println("Teacher: Default Constructor");
		subject = "Computer Science";
	}
	public Teacher(String name, String st, String csz, String subj) {
		super(name, st, csz);
		System.out.println("Teacher: arg constructor");
		subject = subj;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String s) {
		subject = s;
	}

	public String toString() {
		return super.toString() + "\n" + super.getName() + " teaches " + subject;
	}
}
