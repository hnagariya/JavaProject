package personComposition;

public class PersonDetail {
	private int age;
	private String name;
	private String eyeColor;
	private int height;
	private String gender;

	PersonDetail[] person = new PersonDetail[5];

	public PersonDetail() {
		super();
	}

	public PersonDetail(int age, String name, String eyeColor, int height, String gender) {
		super();
		this.age = age;
		this.name = name;
		this.eyeColor = eyeColor;
		this.height = height;
		this.gender = gender;
	}

	public String getContactNumber() {
		return eyeColor;
	}

	public int getHeight() {
		return height;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getEmailID() {
		return gender;
	}

	public void personDetail(PersonDetail[] person) {
		for (int i = 0; i < person.length; i++) {
			this.person[i] = person[i];
		}
	}

	public int getAgeforPersonNameRequested(String personNameRequested) {
		int ageOfPerson = 0;
		for (int i = 0; i < person.length; i++) {
			if (personNameRequested.equals(person[i].getName())) {
				ageOfPerson = person[i].getAge();
				break;
			}
		}
		return ageOfPerson;
	}
}
