package ThucHanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap{
    public static void main(String[] args) {
        Map<String,Integer>hashMap=new HashMap<>();
        hashMap.put("Pham Thang",25);
        hashMap.put("Pham Thang 1",26);
        hashMap.put("Pham Thang 2",23);
        hashMap.put("Pham Thang 3",22);
        hashMap.put("Pham Thang 4",21);
        System.out.println("Display entries hashmap");
        System.out.println(hashMap+"\n");
        Map<String,Integer>treeMap=new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String,Integer>linkedMap=new LinkedHashMap<>(16,075f,true);
        linkedMap.put("Pham Thang 1",25);
        linkedMap.put("Pham Thang 2",26);
        linkedMap.put("Pham Thang 3",27);
        linkedMap.put("Pham Thang 4",28);
        System.out.println("\nThe age for "+"Pham Thang 2 is "+linkedMap.get("Pham Thang 2"));
    }


}
