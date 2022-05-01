package HashTable.Service;

import java.util.Arrays;

public class Hashtable {
    private int[] hashArray;

    public int[] getHashArray() {
        Arrays.stream(this.hashArray).forEach(i -> System.out.println(i));
        return hashArray;
    }

    private int size = 5;
    public Hashtable(int size) {
        if (size!=0){
            this.size = size;
        }
        this.hashArray = new int[this.size];
        initializeArray(this.size);
    }

    private void initializeArray(int size) {
        for (int i = 0; i< this.hashArray.length; i++) {
            this.hashArray[i] =-1;
        }
    }

    private int hash(int key){
        return key % this.size;
    }

    public void addValue( int key, int value){
        if (isFull()){
            System.out.println("Hash Table is full, no more room to enter new values.");
            return;
        }
        int index = hash(key);
        if (this.hashArray[index] == -1){
            this.hashArray[index] = value;
            System.out.println("Value entered successfully");
        }else {
            addValue(index+1, value);
        }
    }

    public boolean isFull() {
        return Arrays.stream(this.hashArray).filter(i -> i!=-1).count() == this.size;
    }

    public void deleteValue(int key, int value){
        if (isEmpty()){
            System.out.println("Hash table is empty.");
            return;
        }
        int index = hash(key);
        if (this.hashArray[index] == value){
            this.hashArray[index] = -1;
        }else{
            deleteValue(index+1, value);
        }
    }

    public boolean isEmpty() { return Arrays.stream(this.hashArray).filter(i -> i!=-1).count() == 0; }

    public void displayAll() {
        if (isEmpty()){
            System.out.println("Hash table is empty.");
            return;
        }
        for (int i: this.hashArray) {
            System.out.println("--->"+i);
        }
    }

    public void peek() {
        if (isEmpty()){
            System.out.println("Hash table is empty.");
            return;
        }
        System.out.println("--->"+this.hashArray[this.size-1]);
    }
}
