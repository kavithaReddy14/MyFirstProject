package myfirstproject;
//*This program just prints the name and using the scanner class and method*/-documentation comment

//import java.util.Scanner;Single line comment

public class Project {
	int a = 10;
	int b=20; //global variables

	public static void main(String[] args) {
		//local variables
		int a=2;
		int b=5;
		
		System.out.println(a+b);
		//Printing both local and global variables.
		Project p=new Project();
		
		System.out.println(p.a+p.b);
		
		//data types and values

		/*int num=5;
		float floatNum=3.99f;
		double doubleFloat=15.54d;
		char letter= 'K';
		Boolean bool=true;
		String name = "Kavitha";*/
		
		//Scanner input= new Scanner(System.in);Single line comment

	/*System.out.println("Enter the name:");Multi-line comment
	name= input.nextLine();
	System.out.println("Your name is:"+name);Printing the name using the method*/
		
		//System.out.println(name); Printing name 
		
		/*System.out.println(num);
		System.out.println(floatNum);
		System.out.println(doubleFloat);
		System.out.println(letter);
		System.out.println(bool);
		System.out.println(name); Printing the data types and values*/

	}

}
