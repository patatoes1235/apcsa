public class PersonTest {
	public static void showInheritance(Person c)
	{
		Class class1 = c.getClass();
		while(class1.getSuperclass() != null)
		{
			String child = class1.getName();
			String parent = class1.getSuperclass().getName(); System.out.println("\t"+child+" class is a child class of "+ parent);
			class1 = class1.getSuperclass();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Person[] people = {
				new Person(),
				new Student(),
				new IntlStudent(),
				new Teacher(),
				new Person("Jane Doe", "321 sesame st", "Blemont MA, 24780"),
				new Student("Johnny Doe", "123 emases st", "Belmont NH, 010101", "NHHS", "Senior"),
				new Teacher("Mr. Dough", "1 School st", "Scholartown TN, 11235", "Math"),
				new IntlStudent("Janine Doherty", "50 Embassy Way", "Washington DC, 00000", "School School", "Freshman", "Mongolia")
		};

		for (int i =0; i<people.length; i++) {
			Person person = people[i];
			System.out.println(person);
			if (person instanceof IntlStudent) {
				IntlStudent student = (IntlStudent)person;
				System.out.println("Casting success! Intl student from " + student.getCountry());
			}
			else {
				System.out.println("obj not of Intl student class, cannot be cast");
			}
			showInheritance(person);
			System.out.println();
		}


	}
}
