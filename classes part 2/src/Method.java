public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setfirstName("TRIPTI");
		p.setlastName("KUSHWAHA");
		p.setAge(110);
		System.out.println("First Name = " + p.getfirstName());
		System.out.println("Last Name = " + p.getlastName());
		System.out.println("Full name " + p.getFullName());
		System.out.println("Age = " + p.getAge());
		System.out.println("Teen = " + p.isTeen());
	}

}
