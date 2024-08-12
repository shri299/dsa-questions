package mypackage.stacksandqueues;

public class CustomCircularQueue {
    protected int[] data;
    private static final int DEFAUlT_SIZE=10;

    int end=0;
    int front=0;
    int size=0;

    public CustomCircularQueue (){
        this(DEFAUlT_SIZE);
    }

    public CustomCircularQueue (int size){
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()){
            throw new Exception("empty queue");
        }
        int remove=data[front++];
        front = front%data.length;
        size--;
        front++;
        return remove;
    }
}
