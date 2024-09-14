package dsa.stacksandqueues;

public class CustomQueue {

    protected int[] data;
    private static final int DEFAUlT_SIZE=10;

    int end = 0;

    public CustomQueue (){
        this(DEFAUlT_SIZE);
    }

    public CustomQueue (int size){
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) throws Exception {
        if (isFull()){
            throw new Exception("Queue size is full");
        }else {
            data[end] = item;
            end = end+1;
            return true;
        }
    }

    public int remove() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }else {
            int item = data[0];
            for (int i=0;i<data.length-1;i++){
                data[i] = data[i+1];
            }
            end--;
            return item;
        }
    }
}
