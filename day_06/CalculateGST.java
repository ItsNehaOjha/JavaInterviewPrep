package day_06;

public class CalculateGST {
    public static void main(String[] args) {
        int[] price = {100, 200, 300};
        int newPrice[] = getPrice(price, 0);
        for(int p: newPrice){
            System.out.println(p);
        }
    }
    static int[] getPrice(int[] price, int index){
        // gst == 18%
        // newPrice = price + gst
        if(index==price.length-1){
            int gst[] = new int[price.length];
            return gst;
        }


        int gst[] = getPrice(price, index+1);
        gst[index] = price[index] +(int)(price[index] *(.18));
        return gst;

    }

    // original array me change krna ho to void pe kam kro 
    
}
