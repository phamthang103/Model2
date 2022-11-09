package BaiTap;

import BaiTap.bai_Queue.Node;

import java.util.Scanner;
import java.util.Stack;

public class NhiPhan {
    public static void main(String[] args) {
        Stack<Integer>stackInteger=new Stack<>();

        Scanner scanner=new Scanner(System.in);
        int numberThapPhan=11;
        int number=numberThapPhan;
        while (number>0){
            stackInteger.push(number%2);
            number=number/2;
        }
        System.out.print(numberThapPhan+" có hệ nhị phân: ");
        while (!stackInteger.empty()){
            System.out.println(stackInteger.pop().toString());        }
    }

}
