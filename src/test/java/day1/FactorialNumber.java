package day1;

import java.util.Scanner;

/*@Author:Tejaswini
* Find the FactorialNumber
* */
public class FactorialNumber {
    public static void main(String[] args) {
     /*   int i,fact =1;
        int Number=5; //it is the number to caluculate factorial
        for (i=1;i<=Number;i++){
            fact=fact*i;
            //5!=5*4*3*2*1*1
            //

        }
        System.out.println("Factorial:"+Number+"is"+fact);
    }*/
        int n,fact=1;

        System.out.println("Enter any number");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
           fact= fact*i;

        }System.out.println("Factorial :"+fact);
    }
}