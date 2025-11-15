package day_03;

public class Patter3 {

// ****
// ***
// **
// *
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=0;i< n;i++){
//             for(int j=0;j<n;j++){
//                 if(i<=j){
//                     System.out.print("*");
//                 }
//             }
//             System.out.println("");
//         }
//     }
// // *
// **
// ***
// ****
    //  public static void main(String[] args) {
    //     int n=4;
    //     for(int i=0;i< n;i++){
    //         for(int j=0;j<n;j++){
    //             if(j<=i){
    //                 System.out.print("*");
    //             }
    //         }
    //         System.out.println("");
    //     }
    // }
// ------------------------------------------------------
//    *
//   **
//  ***
// ****
    // public static void main(String[] args) {
    //     int n=4;
    //     for(int r=0;r< n;r++){
    //         for(int c=0;c<n;c++){
    //             if(r< (n-1) - c){
    //                 System.out.print(" ");
    //             }else{
    //                 System.out.print("*");
    //             }
    //         }
    //         System.out.println("");
    //     }
    // }

// ****
// ***
// **
// *
//   public static void main(String[] args) {
//         int n=4;
//         for(int r=0;r< n;r++){
//             for(int c=0;c<n;c++){
//                 if(  c<=n-1-r){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//     }


// ****
// *  *
// *  *
// ****
//   public static void main(String[] args) {
//         int n=4;
//         for(int r=0;r< n;r++){
//             for(int c=0;c<n;c++){
//                 if( r ==0 || r == n-1 || c==0 || c== n-1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//     }

  public static void main(String[] args) {
        int n=5;
        for(int r=0;r< n;r++){
            for(int c=0;c<n;c++){
                if( r ==0 || r == n-1 || c==0 || c== n-1 || r==c  || c == n-r-1  ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
