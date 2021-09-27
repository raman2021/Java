import java.util.Scanner;

public class Lab2{
	
	public static void main(String args[]){
		
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		
		System.out.println("the number you entered is: " + num1);
		
		
	    double num2;
		String UOM2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a numeric value = ");
		num2 = scan.nextDouble();
		
		Scanner UOM = new Scanner(System.in);
		System.out.print("Enter a unit of measure km or mi =  ");
		UOM2 = UOM.next();
		
		if(UOM2.equals("km")){
		
			double result = num2/1.609;
		
			System.out.println(num2 + " "+ UOM2 + " is " + result + " mi");
		}
		else if(UOM2.equals("mi")){
			double result = num2/0.6213;
			System.out.println(num2 + " "+ UOM2 + " is " + result + " km");
		}
		else {
			System.out.println(" error ");
		}
		
		
		 double num3;
		String UOM4;
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.print("Enter a numeric value = ");
		num3 = scan1.nextDouble();
		
		Scanner UOM3 = new Scanner(System.in);
		System.out.print("Enter a unit of measure cm or in =  ");
		UOM4 = UOM3.next();
		
		if(UOM4.equals("cm")){
		
			double result = num3/0.39;
		
			System.out.println(num3 + " "+ UOM4 + " is " + result + " in");
		}
		else if(UOM4.equals("in")){
			double result = num2/2.54;
			System.out.println(num3 + " "+ UOM4 + " is " + result + " cm");
		}
		else {
			System.out.println(" error ");
		}

		
		 double num4;
		String UOM6;
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.print("Enter a numeric value = ");
		num4 = scan2.nextDouble();
		
		Scanner UOM5 = new Scanner(System.in);
		System.out.print("Enter a unit of measure kg or lb =  ");
		UOM6 = UOM5.next();
		
		if(UOM6.equals("kg")){
		
			double result = num4/2.2;
			
		
			System.out.println(num4 + " "+ UOM6 + " is " + result + " lb");
		}
		else if(UOM6.equals("lb")){
			double result = num4/0.45;
			System.out.println(num4 + " "+ UOM6 + " is " + result + " kg");
		}
		else {
			System.out.println(" error ");
		}
		
	}
}
