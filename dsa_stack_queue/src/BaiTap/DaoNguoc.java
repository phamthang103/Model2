package BaiTap;

import java.util.Stack;

public class DaoNguoc {
    public static void main(String[] args) {
        System.out.println("Ban dau");
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        System.out.println("Một Hai Ba Bốn Năm Sáu Bảy Tám Chín Mười");
        Stack<Integer>stackInt=new Stack<>();
        for (int i=1;i<=10;i++){
            stackInt.push(i);
        }
        System.out.println("Dao nguoc kieu so");
        while (!stackInt.empty()){
            System.out.println(stackInt.pop()+"");
        }
        Stack<String>stackString=new Stack<>();
        String str="Một Hai Ba Bốn Năm Sáu Bảy Tám Chín Mười";
        String[]arrayStr=str.split("");
        for (int i=0;i<arrayStr.length;i++){
            stackString.push(arrayStr[i]);
        }
        System.out.println("Dao nguoc mang");
        while (!stackString.empty()){
            System.out.println(stackString.pop()+"");        }
    }
}
