package dsa.heaps;

import java.util.ArrayList;

public class Implementation<T extends Comparable<T>> {

    private ArrayList<T> list;

    public Implementation (){
        list = new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second,temp);
    }

    private int parent(int childIndex){
        return (childIndex-1)/2;
    }

    private int leftChild(int parentIndex){
        return 2*parentIndex+1;
    }

    private int rightChile(int parentIndex){
        return 2*parentIndex+2;
    }

    public void insert(T val){
        list.add(val);
        upheap(list.size()-1);
    }

    private void upheap(int index){
        if(index==0){
            return;
        }
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p))<0){
            swap(index,p);
            upheap(p);
        }
    }

    public T remove(){
        if (list.isEmpty()){
            System.out.println("removing from an empty heap");
        }

        T temp = list.get(0);
        T last = list.remove(list.size()-1);

        if (!list.isEmpty()){
            list.set(0,last);
        }

        return temp;
    }
}
