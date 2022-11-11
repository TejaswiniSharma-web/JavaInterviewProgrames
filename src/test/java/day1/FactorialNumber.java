package day1;
/*@Author:Tejaswini
* Find the FactorialNumber
* */
public class FactorialNumber {
    public static void main(String[] args) {
        int i,fact =1;
        int Number=5; //it is the number to caluculate factorial
        for (i=1;i<=Number;i++){
            fact=fact*i;
            //5!=5*4*3*2*1*1
            //

        }
        System.out.println("Factorial:"+Number+"is"+fact);
    }
}
