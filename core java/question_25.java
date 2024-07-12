//Create a class named 'Member' having the following members:

//1. Data members
//2. Name
//3. Age
//4. Phone number
//5. Address
//6. Salary
//It also has a method named 'printSalary' which prints the salary of the members.

package assignment;

class member {
	String name;
	int age;
	String num;
	String address;
	int salary;

//	member(String name, int age, String num, String address, int salary) {
//		this.name = name;
//		this.age = age;
//		this.num = num;
//		this.address = address;
//		this.salary = salary;
//	}

//	public member() {
//
//	}

	// getter setter used to perform the operation//
	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public int getage() {
		return age;
	}

	public void setnum(String num) {
		this.num=num;
	}

	public String getnum() {
		return num;
	}

	public void setaddress(String address) {
		this.address=address;
	}

	public String getaddress() {
		return address;
	}

	public void setsalary(int salary) {
		this.salary = salary;
	}

	public int getsalary() {
		return salary;
	}

	public void printSalary() {
		System.out.println("salary : " + salary);
	}
}

public class question_25 {

	public static void main(String[] args) {
		member m = new member();
		m.setname("vrunda");
		m.setage(27);
		m.setnum("7698245785");
		m.setaddress("panch hatdi");
		m.setsalary(15000);
		System.out.println(m.getname());
		System.out.println(m.getage());
		System.out.println(m.getnum());
		System.out.println(m.getaddress());
		System.out.println(m.getsalary());
		m.printSalary();
	}

}
