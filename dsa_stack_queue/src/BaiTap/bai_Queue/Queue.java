package BaiTap.bai_Queue;

public class Queue {
    private Node rear;
    private Node front;

    public Queue() {
        this.rear = null;
        this.front = null;
    }
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
    }

    public Node dequeue() {
        if (this.front == null)
            return null;
        Node temp = this.front;
        this.front = this.front.link;
        if (this.front == null)
            this.rear = null;
        return temp;
    }
}
