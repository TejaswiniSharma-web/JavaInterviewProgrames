package day1;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i = sc.nextInt();
        if (i%2==0){
            System.out.println("number is even number");
        }else {
            System.out.println("number is odd number");
        }
    }
}
