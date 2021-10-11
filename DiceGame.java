/* Name- Ramandeep kaur
Student id- A00244354
program description- Representing classes and objects in dicegame program

*/


public class DiceGame {
    public static void main(String args[]) { // main method
        int total_sides = 20; // creating integar variable
        String type_of_dice= "d20",d6_current_value,d20_current_value, percentile_current_value
                ,d6_new_value,d20_new_value,percentile_new_value; // creating string type
        
        System.out.print("\n******** CREATING DICE *******\n"); // printing statements
        System.out.print("\nCreating a default d6...");
        System.out.print("\nCreating a "+type_of_dice+"...");
        System.out.print("\nCreating a percentile die (a special d10)...\n");
        
        // creating objects of Die class and calling each constructor
        Die default_d6 = new Die(); // calling 0 argument constructor
        Die  percentile = new Die(10); // calling 1 argument constructor
        Die d20_dice = new Die(type_of_dice,total_sides); // calling 2 argument constructor
        
        // calling Die class methods through its objects, to print current side up of a die
        d6_current_value = default_d6.current_side_up(); // calling Die class method for default d6 die
        d20_current_value = d20_dice.current_side_up(); // calling Die class method for user defined die
        percentile_current_value = percentile.current_side_up();//calling Die class method for percentile die
    
        //printing values
        System.out.print(d6_current_value);
        System.out.print(d20_current_value);
        System.out.print(percentile_current_value);
        
        System.out.print("\n\n******* TESTING THE ROLL METHODS *******\n");
        
        // calling Die class methods through its objects, to roll and print new side up of a die
        d6_new_value = default_d6.roll_method(); // calling Die class method for default d6 die to print new sides up
        d20_new_value = d20_dice.d20_roll_method(); // calling Die class method for user defined die to print new sides up
        percentile_new_value = percentile.roll_method();//calling Die class method for percentile die to print new sides up
        
        // printing values
        System.out.print("\nRolling the d6...");
        System.out.print(d6_new_value);
        System.out.print("\nRolling the "+ type_of_dice +"...");
        System.out.print(d20_new_value);
        System.out.print("\nRolling the Percentile...");
        System.out.print(percentile_new_value);
        
        // maximum value
        System.out.print("\n\nSetting the "+type_of_dice+" to show "+total_sides +"...");
        System.out.print(d20_dice.max_value());
        
        
        // ********* BONUS ********
        System.out.print("\n\n------------------------");
        System.out.print("\n\tBONUS");
        System.out.print("\n------------------------\n\n");
        
        System.out.print("\nCreating 5 d6 die...");
        System.out.print(default_d6.bonus());
    }
}

