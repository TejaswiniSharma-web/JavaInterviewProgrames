package day4;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
      //  String s[]=new String[100];
       // String s[]=new String[5];
        //no final size,dynamically growing
        List<String> l =new ArrayList<String>();
        System.out.println(l.size());
        l.add("Orange"); //0
        l.add("Mango"); //1
        l.add("Kiwi");  //2
        System.out.println(l.size());
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
