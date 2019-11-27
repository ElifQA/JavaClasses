package TaskConstructor;

public class HWStudent {
	/*Write program as a Student class   that has instance variables name and address.
	 *  Create a constructor that will initialize those variables. 
	 *  Print name & address of given  student by the displayInfo method.
	 */
	
	String name;
	String address;
	
	public HWStudent(String name, String address){
		this.name=name;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println(name+" "+address);
	}
	public static void main(String[] args) {
		HWStudent student=new HWStudent("Asim Demir", "1046 Cedar creek village rd TN");
		student.displayInfo();
	}
}
