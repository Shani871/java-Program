public class BubbleSort1 {
    
    
    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2};
        int n = arr.length;
        for(int x =1;x<=3;x++) // also take this n-1
        for (int i = 0; i<n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1] =temp;

            }
        }
        
        for (int i : arr) {
                System.out.print(i+" ");
        }
    }
}
