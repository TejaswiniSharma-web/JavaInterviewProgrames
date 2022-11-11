package day2;

public class DuplicateString
{
    public static void main(String[] args) {


        String str =new String("Tejaswini Sharma");
        int count =0;
        char[]ch=str.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.println("Duplicatec charcter  in string are :"+ch[j]);
                    count++;
                    System.out.println("duplicate charcters count"+count);
                }
            }
        }

    }
}
