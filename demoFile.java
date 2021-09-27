import java.util.Scanner;

public class demoFile{
	
	public static void main(String args[]){
		
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		
		System.out.println("the number you entered is: " + num1);
		
		System.out.println("my name is raman");
		
	    System.out.println("hello");
		
	    double num2;
		String UOM2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a numeric value");
		num2 = scan.nextDouble();
		
		Scanner UOM = new Scanner(System.in);
		System.out.print("Enter a unit of measure ");
		UOM2 = UOM.next();
		
		if(UOM2.equals("km")){
		
			double result = num2/1.609;
		
			System.out.println(num2 + " "+ UOM2 + " is " + result + " mi");
		}
		else if(UOM2.equals("cm")){
			System.out.println(" you want to convert to cm ");
		}
		else {
			System.out.println(" you put something else  ");
		}
		

		
		
	}
}
