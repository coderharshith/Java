# Java Tutorial
 ## Topic 1:- Output/input Statement
 ### Output
    System.out.println("coderharshith");
    System.out.print("coderharshith"); it won't give new line after printing 'coderharshith'
 ### Input Statement 
   ***
    The Scanner class is used to get user input, and it is found in the java.util package.
    To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.
    Syntax:-
    `
        import java.util.*;
        public class _3input {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int n = input.nextInt();
                System.out.println(n);
            }
        }
    `
   ***

 ## Topic 2:- Datatypes and Variables

  ### Variables in java
        ***
        *variables in Java language are the names used to refer to data stored in the memory
        *One Java variable can hold only a single type of data.
        *Before using a variable while programming, it is necessary to declare a variable.
        *It means to assign data to a particular memory and use a name for that memory.
        ***


  ### Datatypes in Java
    ***
    *8-Primitive:-
        Primitive data types specify the size and type of variable values. They are the building blocks of data manipulation and cannot be further divided into simpler data types.

        1.byte :- 
            The byte is the smallest data type among all the integer data types  It is an 8-bit signed two’s complement integer. It stores whole numbers ranging from -128 to 127.
            Syntax: byte var_byte = 6 ;

        2.short:- 
            Short is a 16-bit signed two’s complement integer. It stores whole numbers with values ranging from -32768 to 32767. Its default value is 0.
            Syntax: var_short = 8;

        3.char
            The char data type stores a single character. It stores lowercase and uppercase characters, which must be enclosed in single quotes. The char data type in Java supports Unicode characters and provides provision to multiple languages like English, French, German, etc. It takes memory space of 16 bits or 2 bytes. The values stored range between 0 to 65536.
            Syntax:- char var_char = 'a';

        4.boolean:- 
            A boolean data type can store either True or False. They can be used to check whether two values are equal or not (basically in conditional statements to return True or False). Typically, programmers use it as a flag variable to track true or false conditions.
            Syntax:- boolean boolen_var = true

        5.int :-
            Int is a 32-bit signed two’s complement integer that stores integral values ranging from 2147483648 (-2^31) to 2147483647 (2^31 -1). Its default value is 0.
            Syntax:- int var_int = 10;

        6.long :- 
            long is a 64-bit signed two’s complement integer It is used when we need a range of values more than those provided by int. Its default value is 0L. This data type ends with ‘L’ or ‘l’.
            Syntax:- long var_long = 100000000l;


        7.float :- 
            It is a floating-point data type that stores the values, including their decimal precision. It is not used for precise data such as currency or research data. ends with an ‘f’ or ‘F’.
            Syntax:- float var_float = 12.5f;

        8.double:- 
            The double data type is similar to float. The difference between the two is that is double twice the float in the case of decimal precision. It is used for decimal values just like float and should not be used for precise values.
            Syntax:- double var_double = 20.20d;


    *5-Non-Primitive:-
        Non-primitive data types or reference data types refer to instances or objects. They cannot store the value of a variable directly in memory. They store a memory address of the variable. Unlike primitive data types we define by Java, non-primitive data types are user-defined. Programmers create them and can be assigned with null. All non-primitive data types are of equal size.

        1.string:- 
            The String data type stores a sequence or array of characters. A string is a non-primitive data type, but it is predefined in Java. String literals are enclosed in double quotes.
            Syntax:- String name = "Coderharshith";

        2.array:- 
            An array holds elements of the same type. It is an object in Java, and the array name (used for declaration) is a reference value that carries the base address of the continuous location of elements of an array.
        Syntax:- 
            - int[] array_name  = {10,20,40,50}
            - String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        3.class:-
            A class is a user-defined data type from which objects are created. It describes the set of properties or methods common to all objects of the same type. It contains fields and methods that represent the behaviour of an object. A class gets invoked by the creation of the respective object.
            public class className{

            }

        4.object:-
            An entity that has state and behavior is known as an object, It can be physical or logical. 
            Syntax:-
            book_library book1 = new book_library();

        5.interface:- 
            An interface is declared like a class. The key difference is that the interface contains abstract methods by default; they have nobody.
            Syntax:-
                interface printable {  
                    void print();  
                } 
    ***

   
 ## Topic 3:- Conditional Statements 
   ***
    The four conditional statements in Java are: if, if-else, else-if ladder, and switch. The 'if-else' statement executes different code based on whether the condition is true or false. The 'switch' statement evaluates an expression and executes the code corresponding to the matching case
    
  ### if, if-else, else-if ladder
    *if statement
        if (10 >= 10) {
            System.out.println("matching");
        }
    *if-else statement
        if (10%2 == 0) {
            System.out.println("even");
        }
        else{
             System.out.println("odd");
        }

    *else-if ladder
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
   
   ### Switch Statement
    *
        Instead of writing many if..else statements, you can use the switch statement.
        The switch statement selects one of many code blocks to be executed.
    *
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
   ***

  ## Topic 4:- Loop 
    ***
        Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true.
    ***
   ### for Loop
   ***
        for loop provides a concise way of writing the loop structure.
        Syntax:-
            for (initialization condition; testing condition;increment/decrement)
            {
                statement(s)
            }
   *** 
   ### while Loop
   ***
        A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
        The while loop can be thought of as a repeating if statement. 
        Syntax:-
            while (boolean condition)
            {
                loop statements...
            }
   *** 
   ### do-while Loop
   ***
         do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop.  
        Syntax:-
            do
            {
                statements..
            }
            while (condition);
   *** 
   ###  for-each Loop
   ***
         for-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5.  
         **
           - It starts with the keyword for like a normal for-loop.
           - Instead of declaring and initializing a loop counter variable, you declare a variable that is the same type as the base type of the array, followed by a colon, which is then followed by the array name.
           - In the loop body, you can use the loop variable you created rather than using an indexed array element. 
           - It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)
         ** 
        Syntax:-
            for (type var : array) 
            { 
                statements using var;
            }
   *** 

   ## Let we create simple Project:-
   ### Guessing Game:-
    ***
    Create a number guessing game where the computer generates a random number and the user has to guess it within a certain number of tries. Use loops to allow multiple guesses until the correct number is guessed or the maximum number of attempts is reached.
    project file 
   [GitHub Page](https://github.com/coderharshith/Java/blob/main/_5p1_project.java)
    ***
