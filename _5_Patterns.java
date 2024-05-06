/**
 * _5_Patterns
 */
public class _5_Patterns {
    public static void main(String[] args) {
        // solid rectangle pattren using nested loop
        // loop inside a loop
        System.out.println("solid rectangle pattren");
        for(int i = 0 ; i  < 4;i++){
            for(int j = 0; j< 5;j++)
                System.out.print("*");
            System.out.println();
        }
System.out.println();
        //hollow rectangle pattren
        System.out.println("hollow rectangle pattren");
        for(int i = 0; i < 4;i++){
            for(int j = 0; j < 5;j++){
                if (i == 0|| j == 0|| i == 3 || j == 4 ) { //here we are comparing with boundary values like 0,3,4
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    System.out.println();
        // pyramid pattren
        System.out.println("pyramid pattren");
        for(int i = 0; i < 5;i++){
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println();
        // inverted pyramid pattern 
        System.out.println("inverted pyramid pattern ");
        for(int i = 0; i < 5;i++){
            for(int j = i; j < 4; j++)
                System.out.print("*");
            System.out.println();
        }



        System.out.println();
        // Right pyramid pattern 
        System.out.println("Right pyramid pattern ");
        for(int i = 0; i < 5;i++){
            for(int j = 0; j < 4-i; j++)
                System.out.print(" ");
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }


        System.out.println();
        // Number pyramid pattern 
        System.out.println("number pyramid pattern ");
        for(int i = 1; i <= 5;i++){
            for(int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }


        System.out.println();
        // Number inverted pyramid pattern 
        System.out.println("number inverted pyramid pattern ");
        for(int i = 1; i <= 5;i++){
            for(int j = 1; j <= 5-i+1; j++)
                System.out.print(j);
            System.out.println();
        }


        System.out.println();
        // Floyd's triangle pattern 
        int num = 0;
        System.out.println("Floyd's inverted pyramid pattern ");
        for(int i = 1; i <= 5;i++){
            for(int j = 1; j <= i; j++)
                System.out.print(++num+" ");
            System.out.println();
        }


        System.out.println();
        // 0-1 triangle pattern 
        System.out.println("0-1 inverted pyramid pattern ");
        for(int i = 1; i <= 5;i++){
            for(int j = 1; j <= i; j++)
            if ((i+j)%2 == 0) {
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
            System.out.println();
        }


    }
}