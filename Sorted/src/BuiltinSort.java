import java.util.Arrays;

public class BuiltinSort {
    public static void main(String[] args) {
        int arr[] ={5,7,1,6,3,8,2,9};
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
