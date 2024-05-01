public class _3conditional_statement {
    public static void main(String[] args) {
        // if statement 
        if (10 >= 10) {
            System.out.println("matching");
        }

        // if=else statement
        if (10%2 == 0) {
            System.out.println("even");
        }
        else{
             System.out.println("odd");
        }

        // else-if ladder 
        int cgpa = 8;
        if (cgpa >= 8 || cgpa <= 10) {
            System.out.println("Excellent");
        }
        else if (cgpa >= 6 || cgpa <= 7) {
            System.out.println("Good");
        }
        else if (cgpa >= 4 || cgpa <= 5) {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        // switch statement
        int ch = 1;
        switch (ch) {
            case 1:
                System.out.println("hi");
                break;
            case 2:
                System.out.println("hello");
                break;        
            default: System.out.println("wrong choice");
                break;
        }

    }
}
