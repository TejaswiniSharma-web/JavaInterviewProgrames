package day1;

import java.util.Scanner;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("Enter any number");
        Scanner r =new Scanner(System.in);
        n=r.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Print the number is Prime Number");
        }else {
            System.out.println("Print the number is not prime number");
        }
    }
}
