package Queue;

public class StaticQueue<T> {
    private T[] data;
    private int start ;
    private int end;
    private int capacity = 0;

    public StaticQueue(int cap) {
        data =(T[]) new Object[cap];
        this.capacity = cap;
        this.start = this.end = 0;
    }

    public boolean isEmpty() {
        return this.capacity == 0;
    }

    public void enqueue(T item) {
       if(capacity == end) {
           throw new ArrayIndexOutOfBoundsException();
       } else {
           this.data[end] = item;
           end++;
       }
    }

    public T dequeue() {
        if(capacity == 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            T temp = this.data[end];
            for(int i = 0; i < end; i++) {
                this.data[i] = this.data[i+ 1];
            }
            end --;
            return temp;
        }
    }
}
