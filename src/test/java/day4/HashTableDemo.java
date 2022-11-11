package day4;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable table =new Hashtable(); //key value pair
        table.put("name","Tejaswini" );
        table.put("place","India");
        table.put("Tool","Appium");
        table.put("key","value");
        System.out.println(table.get("name"));

    }
}
