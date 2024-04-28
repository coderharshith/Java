public class _2variables{
    public static void main(String[] args) {
        System.out.println("variables");
        // DataTypes
        // Primitive Datatypes
        // 1.int
        int a = 10, b = 20;
        System.out.println(a+b);

        //2.float
        float price = 200.2f;
        System.out.println(price);
        
        //3.char
        char letter = 'a';
        System.out.println(letter);

        //4.boolean
        boolean check = a == b;
        System.out.println(check);
        
        //5.long
        long numbers = 12345678910l;
        System.out.println(numbers);

        //6.short
        short num = 45;
        System.out.println(num);

        //7.double
        double balance = 100.3045d;
        System.out.println(balance);

        //8.byte
        byte n = 6;
        System.out.println(n);
        
        // Non-Primitive Datatypes
        //1.String
        String name  = "harshith";
        System.out.println(name);

        //2.Array 
        int[] Array = {10,20,30};
        System.out.println(Array[1]);
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[3]);


        //3.Interface & 4.Obaject 
        // creating the object 
        text t1 = new text();
        // t1 is the object
        t1.print();
    }
}

// 3. Interface
interface Inner_2variables {
    void print();
}
//5.class 
class text implements Inner_2variables{
    public void print() {
        System.out.println("Interface & Implements");
    }
}

