package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    E elements[];

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    public void ensureCap() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void decreaseCap() {
        int newSize = elements.length - 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e, int index) {
        if (size == elements.length) {
            this.ensureCap();
        }
        if (index >= 0 || index <= elements.length) {
            size++;
            elements[index] = e;
        }
    }

    public void addLast(E e) {
        if (size == elements.length) {
            this.ensureCap();
        }
        elements[size++] = e;
        public void remove(int index){
            if (index >= 0 && index < size) {
                for (int i = index; i < size - 1; i++) {
                    elements[i] = elements[i + 1];
                }
                size--;
                decreaseCap();
            }
        }
    }
    public void display(){
        for (Object element:elements){
            System.out.println(element);
        }
    }
    public MyList Clone(){
        MyList<E> newList = new MyList<>(size);
        for (int i = 0; i < size; i++) {
            newList.elements[i] = this.elements[i];
        }
        return newList;
    }
    public boolean contains(E e){
        if(isEmpty()){
            for(int i=0; i<size;i++){
                E temp = elements[i];
                if(temp.equals(e)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int indexOf(E e){
        for (int i = 0; i < elements.length; i++) {
            if(elements[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        elements = null;
    }
    public int getSize(){
        return size;
    }
    public void MENU(){
        int select;
        Scanner scanner=new Scanner(System.in);


    }
}


