package day2;
/*@Author:Tejaswini
*Write a Java program to replace a specified character with another character
* */
public class StringReplace
{
    public static void main(String[] args) {
        String s1="The quick brown fox jumps over the lazy dog.";
        String s2="The quick brown fox jumps over the lazy fog.";
        System.out.println(s1.length());
        System.out.println("The new String after replacing the old string:"+s1.replace('d','f'));
    }
}
