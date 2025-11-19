package day_06;

public class FindOccr {
    static int[] findHelper(int arr[], int index, int search, int count) {
        if (arr.length == index) {
            int result[] = new int[count];
            return result;
        }
        int result[];
        // findHelper(arr, index+1, search, count + 1); // Count Not Update
        // Stack Build
        if (arr[index] == search) {
            result = findHelper(arr, index + 1, search, count + 1); // New count
            // System.out.println(count);
            result[count] = index;
        } else {
            result = findHelper(arr, index + 1, search, count); // Old Count
        }
        // Stack Fall
        return result;

    }

    static int[] find(int arr[], int index, int search) {
        return findHelper(arr, index, search, 0);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 90, 10, 100, 10, 88 };
        int result[] = find(arr, 0, 10);
        for (int r : result) {
            System.out.println(r);
        }
    }
}