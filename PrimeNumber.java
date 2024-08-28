
import java.util.*;
class PrimeNumber{
     public static boolean prime(int a){
        
        if (a<=1) return false;
        for(int i=2;i<a/2;i++){
            if(a%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number");
        int a = sc.nextInt();
        
        if (prime(a)){
            System.out.print("Number "+a+" is prime number");
        }else{
             System.out.print("Number "+a+" is not prime number");
        }
        
    }
}
