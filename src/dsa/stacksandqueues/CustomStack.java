package dsa.stacksandqueues;

public class CustomStack {

    protected int[] data;
    private static final int DEFAUlT_SIZE=10;

    int ptr = -1;

    public CustomStack (){
        this(DEFAUlT_SIZE);
    }



    public CustomStack (int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr = ptr + 1;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("cannot pop from an empty stack");
        }else {
            int removed = data[ptr];
            ptr--;
            return removed;
        }
    }

    public int peek() throws StackException {
        if (isEmpty()){
            throw new StackException("cannot peek from an empty stack");
        }else {
            return data[ptr];
        }
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
