package redington.day2.practice;

public class Student {
	String name;
	int m1,m2,m3,m4,m5,total;
	String address;
	

	public Student(String string, int i, int j, int k, int l, int m, String string2) {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome student zone");
		name= string;
		m1=i;
	    m2=j;
	    m3=k;
	    m4=l;
	    m5=m;
	    address=string2;
	}


	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("check where Iam printed");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student1 = new Student("kumar",100,90,80,70,90,"DGL");
Student student2 = new Student("siva",100,99,98,98,97,"MDU");
Student student3 = new Student();
student1.display();
student2.display();
student3.display();
	}


	private void display() {
		// TODO Auto-generated method stub
		System.out.println("student name:"+ name);
		System.out.println("student mark1:"+ m1);
		System.out.println("student mark2:"+ m2);
		System.out.println("student mark3:"+ m3);
		System.out.println("student mark4:"+ m4);
		System.out.println("student mark5:"+ m5);
		System.out.println("student Address:"+ address);
	}
	
}
