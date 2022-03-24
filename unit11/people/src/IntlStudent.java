public class IntlStudent extends Student {
	private String country;

	public IntlStudent() {
		System.out.println("Intl Student: Default constructor");
		country = "USA";
	}
	public IntlStudent(String name, String st, String csz, String school, String grade, String country) {
		super(name, st, csz, school, grade);
		System.out.println("Intl student: Args constructor");
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String c) {
		this.country = c;
	}
	public String toString() {
		return super.toString() + " from " + country;
	}


}
