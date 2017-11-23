import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input and Output practice
		/*
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		
		String yourName = input.nextLine();
		System.out.println("Hello " + yourName); 
		
		Scanner age = new Scanner(System.in);
		System.out.println("What is your age?");
		
		String yourAge = input.nextLine();
		 System.out.println("Oh! So, you are " + yourAge + " years old?"); */
		
		// Variables practice
		
		/*
		String name, heShe = "";
		int age = 27, retirement = 70, yearsTill = 0;
		double gpa;
		boolean isFemale;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = input.nextLine();
		
		System.out.println("What is your age?");
		age = input.nextInt();
		
		System.out.println("What is your gpa?");
		gpa = input.nextDouble();
		
		System.out.println("Are you female ? (true/false)");
		isFemale = input.nextBoolean();
		
		heShe = isFemale ? "She" : "He";
		yearsTill = retirement - age;
		
		System.out.printf("%s is %d years old. %s has a %f gpa. %s will retire in %d years", name, age, heShe, gpa, heShe, yearsTill);
		
		*/
		//gpa > 3.5 ?	System.out.println("Congratulations, you're on the Dean's List!");
		
		//printf format: System.out.printf(""), variable names
		//strings = %s
		// ints = %d
		// doubles = %f
		
		//System.out.printf(name + " is " + age + " years old and has a gpa of" + gpa);
		
		//Mathmatics operators and interger.Parse practice
		
		//int x = 1, y = 2;
		//System.out.println(x + y);
		
		/*Scanner input = new Scanner(System.in);
		int numberOne, numberTwo;
		System.out.println("Please input your first number.");
		numberOne = input.nextInt();
		
		System.out.println("Please input your second number.");
		numberTwo = input.nextInt();
		
		int addition = numberOne + numberTwo;
		
		System.out.println("The result is " + addition); */
		
		
		// You can convert a String into an Int with the Integer.parseInt() Static Method
		
		/* String x = "1", y = "2";
		System.out.println(x + y);
		
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		System.out.println(a + b); */
		
		//Explicit TypeCasting
		
		int x = 20, y = 15;
		System.out.println(x / y);
		//The above, outputs an int (1), which is inaccurate. Java can't convert the ints into
		// a double like this
		
		double z = x / (1.0 * y);
		System.out.println(z);
		
		//By multiplynig the int with a double and having z be a double, Java inplicitely converts...
		// ... answer to a double. There is a more elegant solution though
		
		double w = x/ (double) y;
		System.out.println(w);
		
		//This is an explicit type conversion.
		
		
	}

}
