
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName; 
	}
	public void setAge(int a) {
		this.age = a;
		if(a<0 || a>100) {
			a=0;
		}
		else {
			this.age = a;
		}
	}
	public boolean isTeen() {
		if(this.age>=12 || this.age<=20) {
			return true ;
		}
		else { 
			return false ;
		}
	}
	public String getFullName() {
		if(firstName.isEmpty() || lastName.isEmpty()) {
			return null;
		}
		else if(lastName.isEmpty()){
			return firstName;
		}
		else if(firstName.isEmpty()) {
			return lastName;
		}
		else {
			return firstName + " " + lastName;
		}
	}
}
