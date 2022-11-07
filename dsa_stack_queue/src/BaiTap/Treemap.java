package BaiTap;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer>treeMap=new TreeMap<>();
        String str="mot hai ba bon nam sau bay tam chin";
        String []arrayString=str.split("") ;
//        for (int i=0;i<arrayString.length;i++){
//            if (treeMap.containsKey(arrayString[i])){
//                int newValue=treeMap.get(arrayString[i]);
//                treeMap.put(arrayString[i],++newValue);
//            }else {
//                treeMap.put(arrayString[i],1);
//            }
//        }
//        System.out.println(treeMap);
        for (String s:arrayString){
            if (treeMap.containsKey(s)){
                Integer value=treeMap.get(s);
                value++;
                treeMap.replace(s,value);
            }else {
                treeMap.put(s,1);
            }
        }
        System.out.println(treeMap.toString());

    }
}

