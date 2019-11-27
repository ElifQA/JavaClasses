package TaskConstructor;

public class MultilevelA {
	public String eyeColor="black";
	String language="Turkish";
	String hairColor="brown";
	
	public void run() {
		System.out.println("they can run fast");
	}
	/*
	 * Write program to inherit class A that has method printF which is static and
	 * call or reuse that method into class B
	 */
		public static void printF() {
			System.out.println("This is static method");
			
		}
	public static void main(String[] args) {
		MultilevelB parent=new MultilevelB();
		System.out.println(parent.eyeColor);
		System.out.println(parent.hairColor);
		System.out.println(parent.language);
		parent.run();
		parent.canCook();
		
		MultilevelA g=new MultilevelA();
		g.run();
		System.out.println(g.language);
		//g.bilingual();
		MultilevelC child=new MultilevelC();
		System.out.println(child.hairColor);
		child.bilingual();
		
		
		
		
		
		
		
	}

}
