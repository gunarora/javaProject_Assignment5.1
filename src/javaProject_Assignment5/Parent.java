/*Create an abstract class Parent and define an abstract methods in it and implement it in the child
class*/
package javaProject_Assignment5; //Package declaration is mandatory

//Abstract Class
public abstract class Parent {
//Abstract method
	abstract void child();

}

// class to inherit Abstract Class
class xyz extends Parent
{

	//Implement abstract method
	@Override
	void child() {
		System.out.println("Parent have one child");
		
	}
	//Main method started
	public static void main(String[] args) {
		//creating object and calling method
		xyz t = new xyz();
		t.child();

	} 
}