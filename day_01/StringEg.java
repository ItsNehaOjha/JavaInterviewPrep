package day_01;
public class StringEg{
    public static void main(String[] args) {
       //string literal
         String str1 = "Hello, World!"; // 1 or 0 object created in string pool
         String str2 = "Hello, World!"; // yha aata h string pool ka concept  ,
         // jab bhi hum string literal create krte h to wo string pool me jata h    
            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);
            System.out.println("Are str1 and str2 the same object? " + (str1 == str2)); // true, same reference from string pool
        //string object using new keyword
         String str3 = new String("Hello, World!");  // 2 or 1 object created : 1 in heap memory and 1 in string pool , pool waleko check krta h pehle agar chate h to waha se reference de deta h use intern() to avoid duplicate
         System.out.println("String 3: " + str3);
         System.out.println("Are str1 and str3 the same object? " + (str1 == str3)); // false, different references

         //.intern() method
         String str4 = str3.intern(); // returns reference from string pool if exists
         System.out.println("String 4: " + str4);

         // intern kya krta h : ye method string pool se reference return karta h agar waha pe string already exist karta h

         // string immutable h: jab hum string ka content change karte h to actually ek naya string object create hota h
            str4 = str4 + " Welcome!"; // creates a new string object
            System.out.println("Modified String 4: " + str4);
            System.out.println("Are str1 and modified str4 the same object? " + (str1 == str4)); // false, different references

            // thats why we use StringBuilder or StringBuffer for mutable strings in Java
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(", World!");
            System.out.println("StringBuilder: " + sb.toString());
            // pehle stringbuffer use hota tha but ab stringbuilder use krte h kyuki ye faster hota h single threaded environment me
            // stringbuffer thread safe hota h lekin stringbuilder nahi hota h
            StringBuffer sbf = new StringBuffer("Hello");
            sbf.append(", World!");
            System.out.println("StringBuffer: " + sbf.toString());  
            // example mujhe string ko  reverse krna h to me stringbuilder ka use krungi
            StringBuilder rev = new StringBuilder("abcdef");        
            rev.reverse();
            System.out.println("Reversed StringBuilder: " + rev.toString());

            // concept of capacity and length , and also about if capacity > length
            StringBuilder capLen = new StringBuilder();     
            System.out.println("Initial Capacity: " + capLen.capacity()); // default capacity is 16
            capLen.append("Hello");
            System.out.println("Capacity after adding 'Hello': " + capLen.capacity());
            capLen.append(" World!");
            System.out.println("Capacity after adding ' World!': " + capLen.capacity());
            System.out.println("Length after adding ' World!': " + capLen.length());  
            // if capacity > length to bhi koi problem nahi hoga , ye extra space future me use ke liye hota h
            capLen.append(" How are you?");
            System.out.println("Capacity after adding ' How are you?': " + capLen.capacity());
            System.out.println("Length after adding ' How are you?': " + capLen.length());

            // BingInteger ka use krke bhi hum large numbers ko string ki tarah handle kr skte h
            java.math.BigInteger bigInt1 = new java.math.BigInteger("123456789012345678901234567890");
            java.math.BigInteger bigInt2 = new java.math.BigInteger("987654321098765432109876543210");
            java.math.BigInteger bigSum = bigInt1.add(bigInt2);
            // lekin BigInteger me calculations krne ke liye hum methods ka use krte h jaise add(), subtract() etc.
            System.out.println("Sum of BigIntegers: " + bigSum.toString());
            /// isme + operator kaam nahi krta h
            /// 
    }
}
