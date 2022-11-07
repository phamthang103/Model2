package thuc_hanh;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final  int DEFAULT_CAPACITY=10;
    private Object element[];
    public MyList(){
        element=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize=element.length*2;
        element= Arrays.copyOf(element,newSize);
    }
    public void add(E e){
        if(size== element.length){
            ensureCapa();
        }
        element[size++]=e;
    }
    // cai dat phuong thuc get
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }

    public static void main(String[] args) {
        MyList<Integer> myList= new MyList<>();
        myList.add(2);
        myList.add(3);
        myList.add(3);
        myList.add(4);
        System.out.println(myList.get(2));
    }

}
