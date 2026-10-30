
public class Student {

	String name;
	int age;
	double gpa;
	String major;

	public Student (String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	public void displayInfo() {
		System.out.println("Student Information");
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("GPA: " + gpa);
	}
	public boolean isHonorStudent () {
		return gpa >= 3.5;
	}
	public static void main(String[] args) {
		Student s1 = new Student ("Riya", 22, 3.9);
		Student s2 = new Student ("Edwin", 20, 3.6);
		Student s3 = new Student ("Tom", 19, 3.2);

		s1.displayInfo();
		System.out.println("Honor Student: " + s1.isHonorStudent());
		System.out.println();

		s2.displayInfo();
		System.out.println("Honor Student: " + s2.isHonorStudent());
		System.out.println();

		s3.displayInfo();
		System.out.println("Honor Student: " + s3.isHonorStudent());
	
		}
}
