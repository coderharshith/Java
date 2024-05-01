public class _4loops {
    public static void main(String[] args) {
        // Loops in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true.

        // for loop
        for(int i =1 ;i <=10;i++){
            System.out.println(2+" * "+i+" = "+i*2);
        }
        System.out.println();


        // while loop
        int i = 1;
        while (i <= 10) {
            System.out.println(5+" * "+i+" = "+i*5);
            i++;
        }

        System.out.println();


        // do-while loop
        // this still give the output once
        i =11;
        do{
            System.out.println(8+" * "+i+" = "+i*8);
            i++;
        }
        while(i <= 10);

        // for-each loop
        int ar[] = { 10, 50, 60, 80, 90 }; 
        for (int element : ar) 
            System.out.print(element + " "); 

    }
}
