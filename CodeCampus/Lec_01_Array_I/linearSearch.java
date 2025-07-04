package CodeCampus.Lec_01_Array_I;

public class linearSearch {
    public static int lSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5};
        int key = 3;
        int result = lSearch(number, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}