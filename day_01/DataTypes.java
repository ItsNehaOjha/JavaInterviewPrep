package day_01;
public class DataTypes {
    //three types  of scope: class scope, instance scope, local scope

    // what is the reason of local variable need to be initialized, because local variables are stored in stack memory which is temporary memory
    // and when the method execution is completed the stack memory is cleared so to avoid any garbage value local variables need to be initialized before use

    //static variable need not to be initialized because 
    //they are stored in heap memory which is permanent memory and they are initialized to default values at the time of class loading
    static int h; // class load time initialized to default value 0
    int l;// object(instance variable) load time initialized to default value 0
    //instance variable = object creation time initialized to default value 0 : jitni bar bhi object create hoga utni bar instance variable ke liye memory allocate hogi

    // static memory me ek bar hi use krega sab to static variabe ke liye memory ek hi bar allocate hogi

    public static void main(StringEg[] args) {

        //local variables in java must be initialized before use otherwise it will give error
        // int a;
        // System.out.println(a); // error: variable a might not have been initialized
        // int a; // not initialized
        // System.out.println(a); // error: variable a might not have been initialized
        


        //constant in java is not by const like in js it is by final keyword
        final double PI = 3.14159;
        System.out.println("Value of PI: " + PI);

        //while variable which can be changed is declared without final keyword or by var keayword
        var radius = 5.0;
        System.out.println("Radius: " + radius );
        // datatypes are of two types: primitive/primary/valueType and non-primitive/secondary/referenceType
        // primitive data types are 8 types in java which are as follows: and they are immutable in nature
        // 1. byte: capacity of 1 byte (8 bits)
        byte byteVar = 10;
        System.out.println("Byte Value: " + byteVar);
        //byte b = 220; // byte can hold values from -128 to 127 so it will give error if we try to assign value beyond this range
        
        //t print that same we need to typecaset it:
        byte b = (byte)220; // explicit typecasting
        System.out.println("Byte Value after typecasting: " + b);// it will print -36 because of overflow



        // 2. short: capacity of 2 bytes (16 bits)
        short shortVar = 1000;
        System.out.println("Short Value: " + shortVar);

        // 3. int: capacity of 4 bytes (32 bits)
        int intVar = 100000;
        System.out.println("Integer Value: " + intVar);
        // 4. long : capacity of 8 bytes (64 bits)
        long longVar = 100000L;  // 'L' suffix indicates long literal otherwise it will treat it as int
        System.out.println("Long Value: " + longVar);
        // 5. float
        // 6. double
        // 7. char

        char charVar = 'A'; // ye unicode = universal character set use krta hai jisme har character 
        //ka ek unique number hota hai koi bhi language me chal jayega 
        System.out.println("Character Value: " + charVar);
        // 8. boolean

        // Non-primitive data types
        // 1. String
        //String greeting = "Hello, World!";      
        //System.out.println(greeting);


       }
}