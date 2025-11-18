package day_06;

public class ecursionWithArray {
    // all syntax of initialization of array in java
    // int arr1[] = new int[5]; // declaration and instantiation
    // int arr[] = {1,2,3,4,5};
    // int[] arr3 = new int[]{1,2,3,4,5};
    // int[] arr4;
    // arr4 = new int[]{1,2,3,4,5};
    // int[] arr5 = new int[5]; // default values 0
    // int[] arr6 = new int[5];

    public static void main(String[] args) {
        // jab code run hota h to Jre - JVM - then further in two -> stack and heap 
        // heap in further two-> young generation and old generation
        // young generation me further 3-> eden space, survivor space 1, survivor space 2
        // jab garbage collector run hota h to sabse pehle young generation me jata h
        // agar waha space nhi milta to old generation me jata h

        // jab bhi array bna to stack me reference bnta h aur heap me object bnta h
        // aur stack me reference ka size fix hota h lekin heap me object ka size dynamic hota h
        //wo tab tak  rhega jb tak uska reference stack me rhega
        // jab bhi main khatam hoga to stack me jo bhi reference bna h wo khatam ho jata h
        // lekin heap me object tab tak rhega jb tak garbage collector use free na kar de
        // garbage collector automatic nhi h yeh JVM ke upar depend krta h
        // jese hi elligibility khatam hota h wo free ho jata h
        // object kese garbage collector ke liye eligible hota h ->1) jab uska koi reference stack me nhi btata
        // 2) make it null then that will be eligible for garbage collection
        // arr6 = null; // now the object which was referenced by arr6 is eligible for garbage collection
        // 3) jese mene ek obj bnaya fir obj2 bhi bnaya aur uske bad obj ko obj2 ko reference krne laga to obj jo tha wo eligible ho gya garbage collection ke liye



        //2D array - 1D ke ander 1D
        
    }
}
