import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your First Number: ");

        int num = input.nextInt();
        boolean isPrime = isPrime(num);

        if (isPrime){
            System.out.println("This is Prime Number");
        }else {
            System.out.println("This is not a prime Number");
        }


    }

    public static boolean isPrime( int myNum){
        // A number which is divisible by 1 or its self are called Prime Number.******
         int i = 2;
         while (i <myNum){

             if(myNum % 2 ==0){
                 return false;
             }
             i++;
         }
        return true;
    }
}
