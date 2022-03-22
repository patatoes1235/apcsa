public class Person {
	private String name, st, cityStateZip;

	public Person() {
		name = "John Doe";
		st = "55 Main Street";
		cityStateZip = "Anywhere, MA, 00001";
	}
	public Person(String n, String street, String csz) {
		name = n;
		st = street;
		cityStateZip = csz;
	}
	public String getName() {
		return name;
	}
	public String getStreet() {
		return st;
	}
	public String getCityStateZip() {
		return cityStateZip;
	}
	public void setName(String n) {
		name = n;
	}
	public void setStreet(String s) {
		st = s;
	}
	public void setCityStateZip(String c) {
		cityStateZip = c;
	}
	public String toString() {
		return getName() + "\n" + getStreet() + "\n" + getCityStateZip();
	}
}
