package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Id is: "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id is: "+id);
		System.out.println("Student name is: "+name);
	}
	public void getStudentinfo(String email, long phoneNumber) {
		System.out.println("Student email id is: "+email);
		System.out.println("Student Phone number is:"+phoneNumber);
	}
	public static void main(String[]args) {
		Students student = new Students();
		student.getStudentInfo(245);
		student.getStudentInfo(250, "Tharani");
		student.getStudentinfo("tharani98@gmail.com", 9786435210L);
	}

}
