package ThucHanh.thuchanh3;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head=0;
    private int tail=-1;
    private int currentSize=0;
    public MyQueue(int queueSize){
        this.capacity=queueSize;
        queueArr=new int[this.capacity];
    }
    public boolean isQueuFull(){
        boolean status=false;
        if (currentSize==capacity){
            status=true;
        }
        return status;
    }
}
