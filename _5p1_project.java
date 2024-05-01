import java.util.*;
import java.lang.Math; //using Maths package for random mathod
public class _5p1_project {
    public static void main(String[] args) {
        Scanner in  =  new Scanner(System.in); // create a scanner object 
        while (true) { //infinite 
            //Generate random double value from 1 to 100  
            int gs =  (int) (Math.random()*(100-1+1)+1); // 1oo is max and 1 is min value setting limitation 
            System.out.println("Guess a number :- ");
            int num =  in.nextInt(); // taking the user input
            if(num == 0){ // checking if user want exit or not
            System.out.println("Thank you for playing");
            System.exit(0); // exit statement used to terminate the loop
            }
            if (num == gs) { // checking whether user entered number is correct or not 
                System.out.println("You Gussed Correct "); // if correct it will print
            }
            else{
                System.out.println("You Gussed Wrong number is "+gs);
            }
        }
    }
}
