/*Name- Ramandeep kaur
Student number- A00244354
Program discription- Representing data into units of measurements


*/

import java.util.Scanner;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       public class Lab2{
	
	public static void main(String args[]){
		// taking a value from user
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		// printing value in double data type which user give
		
		System.out.println("the number you entered is: " + num1);
		
		// creating two variables for converting data into different measurements
	    double num2;
		String UOM2;
		
		// again taking input from user
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a numeric value = ");
		num2 = scan.nextDouble();
		
		// taking type of measure eg; kilometer or miles
		Scanner UOM = new Scanner(System.in);
		System.out.print("Enter a unit of measure km or mi =  ");
		UOM2 = UOM.next();
		
		//appling if esle statement to meet up with user's expectations
		// if user want to convert km to mi
		if(UOM2.equals("km")){
		
			double result = num2/1.609;
		
			System.out.println(num2 + " "+ UOM2 + " is " + result + " mi");
		}
		// if user want to convert mi into km
		else if(UOM2.equals("mi")){
			double result = num2/0.6213;
			System.out.println(num2 + " "+ UOM2 + " is " + result + " km");
		} 
		// if both the conditions are not meet with user's expectations then it will print error as result
		else {
			System.out.println(" error ");
		}
		
		// again creating two variables with different names in double and string data type
		 double num3;
		String UOM4;
		
		// taking a numeric data from user
		Scanner scan1 = new Scanner(System.in);
		
		System.out.print("Enter a numeric value = ");
		num3 = scan1.nextDouble();
		// printing given data
		
		Scanner UOM3 = new Scanner(System.in);
		System.out.print("Enter a unit of measure cm or in =  ");
		UOM4 = UOM3.next();
		// type of measure which user want to use and appling if else statement which works same as previous code with different type of measurements
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

		// again creating different variables with same data types
		 double num4;
		String UOM6;
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.print("Enter a numeric value = ");
		num4 = scan2.nextDouble();
		
		Scanner UOM5 = new Scanner(System.in);
		System.out.print("Enter a unit of measure kg or lb =  ");
		UOM6 = UOM5.next();
		// if else statement- if user's need meet with first code then it will shown in result, else if second code will start work on it, but else bith the conditions are wrong then it will give error as a result
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
 