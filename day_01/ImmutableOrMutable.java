package day_01;
public class ImmutableOrMutable {
    public static void main(String[] args) {
        int x = 10;
        int y = x; // y gets a copy of the value of x
        System.out.println("Before modification:" + (y + 10)); // Outputs 20
        System.out.println("Original x:" + x); // Outputs 10
        y = 20; // Modifying y does not affect x
        System.out.println("After modification:" + (y + 10)); // Outputs 30


        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // arr2 references the same array as arr1
        System.out.println("Before modification: " + arr2[0]); // Outputs 1
        // yha per arr2 me change krne se arr1 me bhi change hoga kyuki dono same array ko point kr rhe hai
        arr2[0] = 10; // Modifying arr2 affects arr1
        //lekin arr2 print krenge to 
        System.out.println(arr2); // Outputs memory address of the array 
        // array ke address show hota h kuch is type me : I@..... mtlb array ka bhi class banta h I nam ka jo array ko represent krta h

        // mutable me aesa hota h ki ek address pe kuch change kiye to affect baki jagah bhi padega

        // reference type ka example kya hoga:
        // bye -> Byte 
        // Short -> Short
        // Integer -> Integer
        // Long -> Long
        // Float -> Float
        // Double -> Double
        // Character -> Character
        // Boolean -> Boolean
        // String -> String
        // Array -> Array
        // Object -> Object
        // in sabhi ka reference type hota h
        // aesa hua kyu
        // kyuki ye sabhi classes hai aur class ka object create krne pe wo heap memory me banta h aur uska reference stack me store hota h
        // object hota h data + method but jo sirf value based hote h wo sirf data store krte h na ki method bhi store krte h

        // double dd = 32.5; // sirf data mila
        // Double dObj = new Double(32.5); // data + method mila
        // ddObj.isNaN(); // ye method use kr skte h kyuki ye object h me helper methods use kr skti hun 
        
        // ab use of method shi se samjho:
        //String intX = "100";
        // chahiye mujhe 100 lekin string h object to me print x krungi to address aayega na ki 100 to hme x ko integer me convert krna padega 
        // ab address se value nikalne ke liye hme method use krna padega
        //int intValue = Integer.parseInt(intX); // parseInt is a static method of Integer class that converts a String to an int
        //System.out.println("Converted Integer Value: " + intValue); // Outputs 100

    }
}
