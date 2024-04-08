public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,1,2,5,4};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
               int temp = arr[i];
               arr[i]= arr[i+1];
               arr[i+1]= temp;
System.out.println();
            }

            
        }
        for (int i : arr) {
            System.out.print(i);
        }
        
    }
}
