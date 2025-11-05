import java.util.*;
class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int n = sc.nextInt();
        
        if(n==1 || n==0)
            System.out.println(n + " is neither prime nor composite.");
        else if(n==2 || n==3)
        System.out.println(n + "is a prime number");
        else{
            int temp=n;
            int half=temp/2;
            for(int i=1;i<=half; i++){
                if(half%i == 0){
                    System.out.println(n + " is not a prime number");
                    break;
                }

            }
        }
    }
}