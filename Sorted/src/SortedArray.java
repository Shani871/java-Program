import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] ={5,7,1,6,3,8,2,9};
        int n = arr.length;
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        System.out.println( );
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }

    }
}
