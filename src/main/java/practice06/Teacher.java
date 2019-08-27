package practice06;

public class Teacher {

	private String name;
	private int age;
	private int klass;

	public Teacher(String name, int age, int klass) {
		this.name = name;
		this.age = age;
		this.klass = klass;
	}

	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getKlass() {
		return this.klass;
	}

	public String introduce() {
		if (klass == '0') {
			return "My name is " + this.name + ". I am " + this.age + " years old." + " I am a Taecher"
					+ ". I teach No Class.";
		} else {
			return "My name is " + this.name + ". I am " + this.age + " years old." + " I am a Taecher"
					+ ". I teach Class " + this.klass + ".";
		}
	}
}