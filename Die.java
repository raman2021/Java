/* Name- Ramandeep kaur
Student id- A00244354
program description- Representing classes and objects in dicegame program

*/

import java.util.Random;

class Die {
    int add_1 = 1; // creating integar value
    private Random random = new Random(); 
    String  d20_dice_type; // store dice type that user enters
    private int current_value //store current value of default d6 dice
            ,dice_sides; // default dice d6 sides
    
    //0 argument constructor for default dice d6
   Die(){
        // increasing the random number by 1, because nextInt(bound) includes values 0 to (bound-1)
        // that means if we have taken 6 as bound than it includes values from 0-5
        // by increasing the value by 1, we get values from 1-6.
        dice_sides = 6;
        current_value = random.nextInt(dice_sides)+add_1;   
    }
    
    // 1 argument constructor for percentile dice
   Die(int sides){
        // increasing the random number by 1, because nextInt(bound) includes values 0 to (bound-1)
        // that means if we have taken 10 as bound than it includes values from 0-9
        // increasing the value by 1, we get values from 1-10.
       dice_sides = sides;
       current_value = random.nextInt(sides)+add_1;
    }
    
    //2 argument constructor for user defined dice
   Die(String type,int sides){
        // increasing the random number by 1, because nextInt(bound) includes values 0 to (bound-1)
        // that means if we have taken 20 as bound than it includes values from 0-19
        // increasing the value by 1, we get values from 1-20.
       d20_dice_type = type;
       dice_sides = sides;
       current_value = random.nextInt(sides)+add_1;
    }
    
    // ******** Code for current Side-up of die *********
    
    // printing the current values of all the dice
    
    public String current_side_up(){
        return ("\nThe Current Side up for Percentile is: "+current_value);
    }
    // ********* Code for new side up of die *********
    
  
    // rolling and printing the new values of dice
    public String roll_method(){
        return ("\nThe new value is: "+(random.nextInt(dice_sides)+add_1));
    }
    
    public String d20_roll_method(){
        String new_value;
        int random_value = random.nextInt(dice_sides)+add_1;
        // using loop statement to met with conditions
        if(random_value == dice_sides){ //if else loop statement
        new_value = "\nYAY! It's a: "+random_value;    
        }else{
        new_value = "\nThe new value is: "+random_value;
        }
        return new_value;
    }
    
    
    // ****** Code for Maximum value ******
    public String max_value(){
        int max_value=0;
            
        while(max_value != dice_sides){ // while statement
            max_value = (random.nextInt(dice_sides)+add_1);
        }

        return ("\nThe side is now "+max_value+". Finally.");
    }
    
    
    // ******* Code for Bonus method *******
    public String bonus(){
        int die1_value, die2_value, die3_value,die4_value,die5_value;
        int count=0;
        
        // creating and rolling 5 d6 die, till we get 5 of a kind. Counting number of rolls it takes and printing count value.
        do{
            die1_value = (random.nextInt(dice_sides)+add_1);
            die2_value = (random.nextInt(dice_sides)+add_1);
            die3_value = (random.nextInt(dice_sides)+add_1);
            die4_value = (random.nextInt(dice_sides)+add_1);
            die5_value = (random.nextInt(dice_sides)+add_1);
            count = count+1;
        }
        while(die1_value != die2_value || die1_value != die3_value || die1_value != die4_value || die1_value != die5_value);
       
        return ("\nYAHTZEE! It took "+ count +" rolls");
    }
   
}
