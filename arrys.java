/*
    Ashish Surti 
    Student id - A00244471
    partner:- 
    Ramandeep kaur 
    Student id A00244354  
    Program - MAPD - JAV1001, Lab - 01


*/

import java.util.Scanner;
import java.util.Arrays;

public class ArrayTools{

    //initializing a string of alphabets 
    static String alphabets = "abcdefghijklmnopqrstuvwxyz";
    //initializing an array of numbers 
    static int[] arrayNumbers = {20,45,9,93,29,76,59,38,56};
    

    public static void main(String args[]){

        // initializing a scanner class 
        Scanner scan = new Scanner(System.in);

        // asking the user to enter a word 
        System.out.print("Enter a string to encrypt: ");
        String userValue = scan.next().toLowerCase();

        //asking the user to enter the shift value 
        System.out.print("Enter a value to encrypt with: ");
        int shiftValue = scan.nextInt();

        //storing the returned encrypted value in a variable 
        String returnedEncryptedValue = encryption(userValue , shiftValue);

        //displaying the encrypted value
        System.out.println("The encrypted string is: " + returnedEncryptedValue);

        //storing the returned decrypted value in a variable 
        String returneddecryptedValue = decryption(returnedEncryptedValue , shiftValue);

        //displaying the decrypted value 
        System.out.println("Decrypting "+ returnedEncryptedValue +" with -" + shiftValue +"...");
        System.out.println(returneddecryptedValue);

        System.out.println("-------------------------------------------------------------------------");

        //storing the returned average of the array 
        int avgArray = arrayAverage(arrayNumbers);

        //displaying the array 
        System.out.println("Testing methods with " + Arrays.toString(arrayNumbers));

        //displaying the average 
        System.out.println("The average is " + avgArray);

        System.out.println("-------------------------------------------------------------------------");

        
        //asking the user to enter a value to check for in an array 
        System.out.println("Enter a value to search for in the array: ");
        int keyValue = scan.nextInt();

        //checking if the value is present in the array or no 
        boolean checks = checkArrayValue(arrayNumbers , keyValue);

        if(checks == true){
            System.out.println("The array contains: "+ keyValue);
        }
        else{
            System.out.println("The array does not contain: "+ keyValue);
        }

        System.out.println("-------------------------------------------------------------------------");

        //calling the reverse array method  
        arrayReverse(arrayNumbers);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("********************Thank you for using the program********************");


        scan.close();

    }

    //encryption method 
    public static String encryption(String value , int num){

        int x = 0;
        String encryptedText = "";


        while(x<value.length()){

            //taking the index of the current character and storing in cIndex
            int cIndex = alphabets.indexOf(value.charAt(x));

            //shifting the index with shift value for each character 
            int newIndex = (cIndex + num) % 26;

            //storing the shifted index value in the variable 
            char encryptedChar = alphabets.charAt(newIndex); 

            //adding the shifted character to a string variable
            encryptedText = encryptedText + encryptedChar;

            x++;
        }

        //returning the shifted value 
        return encryptedText;

       
    }

    //decryption method 
    public static String decryption(String value , int num){

        int x = 0;
        String decryptedValue = "";

        while(x<value.length()){

            //finding the index of the encrypted character and storing in cIndex
            int cIndex = alphabets.indexOf(value.charAt(x));

            //subtracting the index value with the original shift value 
            int newIndex = (cIndex - num) % 26;

            //checking if the value goes to negative index 
            if(newIndex < 0){

                //if yes then take the lenght of the alphabets and add it to a new index and then subtract it 
                newIndex = alphabets.length() + newIndex;
            }

            // finding the character of the decrypted index value
            char decryptedChar = alphabets.charAt(newIndex);

            //storing the decrypted character to a variable 
            decryptedValue = decryptedValue + decryptedChar;

            x++;

        }
        
        //returning the decrypted value 
        return decryptedValue;
    }

    //method for finding the average of the array 
    public static int arrayAverage(int array[]){

        int total = 0;

        //running the loop for every value in the array 
        for(int i = 0; i < array.length ;i++){

            //adding the values of the loop 
            total = total + array[i];

        }


        //dividing the sum of the arrays with the number of values in the array 
        int average = total / array.length;

        return average;

    }

    //method for reversing the array 
    public static void arrayReverse(int array[]){

        int temp;

        int arrayStart = 0;
        int arrayEnd = array.length - 1;

        //checking if the start fo the array is less than the end of the array 
        while(arrayStart < arrayEnd){

            //storing the value of the array index in temp variable 
            temp = array[arrayStart];

            //assigning the value of array end index to array start index 
            array[arrayStart] = array[arrayEnd];

            //storing the value of temp variable in array end index 
            array[arrayEnd] = temp;

            //incrementing the start array index
            arrayStart++;

            //decrementing the end array index
            arrayEnd--;

        }

        System.out.println("The array reversed is: "+ Arrays.toString(array));

    }

    //method to check if the array contains the value
    public static boolean checkArrayValue(int array[] , int num){

        //checking each element in the array 
        for(int i =0; i<=array.length-1;i++){
            //if the element does not match with the provided value then continue till we find the element 
            if(array[i] != num){
                continue;    
            }

            //return true once the element is found 
            return true;

        }

        //return false if the element is not found 
        return false;

        
    }




}