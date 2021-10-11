/* 
Name- Ramandeep kaur
Student number- A00244354
Program Discription- Representing numeric data in different units oof measurements


*/
import java.util.scanner;
public void lab2{
	public static void main(String args[]){
		double num1;
		string U0M2;
		Scanner scan= new scanner(system.in);
		// taking a numeric value from user
		String.out.print("Enter a numeric value = ");
		num1 = scan.nextDouble();
		
		scanner UOM= new scanner(system.in);
		// taking a type of measurement in which user want to convert data
		system.out.print("Enter a unit of measurement = ");
		UOM2= U0M.next();
		
		if (UOM2.equals("km")){
			double answer = num1/1.6093;
			system.out.println( num1 + "" + UOM2 + "is" + answer + "mi" );
		}
		else if (UOM2.equals("mi")){
			double answer = num1/1.6093;
			system.out.println(num1 + "" + UOM2 + "is" + answer + "km" );
		}
		else {
			system.out.println("error");
		}
		
	}