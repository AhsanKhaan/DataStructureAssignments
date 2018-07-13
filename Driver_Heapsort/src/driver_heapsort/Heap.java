/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_heapsort;

/**
 *
 * @author M.Ahsan
 */
public class Heap {

    private int size;
    private int[] heap;
    private int max;

    public Heap() {
        this.size = 0;

    }

    Heap(int maxsize) {
        this.max = maxsize;
        this.heap = new int[maxsize];
        this.size = 0;
    }

    public void setheap(int max) {
        try {
            this.heap[this.max] = this.heap[max];
        } catch (NullPointerException e) {
        }
    }

    public int[] getheap() {
        return this.heap;
    }

    public void setmax(int size) {
        this.max = size;
    }

    public int getparentindex(int index) {

        return (index - 1) / 2;
    }

    public int getleftchildindex(int index) {
        return 2 * index + 1;
    }

    public int getri8childindex(int index) {
        return ((2 * index) + 2);
    }

    public boolean hasparent(int index) {
        return getparentindex(index) >= 0;
    }

    public boolean hasleftchild(int index) {

        return getleftchildindex(index) < this.getsize();
    }

    public boolean hasri8child(int index) {
        return getri8childindex(index) < this.getsize();
    }

    public int parent(int index) {
        return this.heap[getparentindex(index)];
    }

    public int leftchild(int index) {
        return this.heap[getleftchildindex(index)];
    }

    public int rightchild(int index) {
        return this.heap[getri8childindex(index)];
    }

    private int getsize() {
        return this.size;
    }

    public int poll() {
        if (this.getsize() == 0) {
            System.out.println("no value in heap");
        }
        int items=this.heap[0];
        this.heap[0]=this.heap[this.getsize()-1];
        this.size--;
        heapifydown();
        return items;
    }

    public void add(int val) {
        ensureque();
        try {
            this.heap[this.getsize()] = val;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        this.size++;
        
        heapifyup();
    }

    private void heapifyup() throws ArrayIndexOutOfBoundsException {
        int index = this.getsize() - 1;
        while ((hasparent(index)) && (parent(index) > this.heap[index])) {
            swap(getparentindex(index), this.heap[index]);
            index = getparentindex(index);
        }
    }

    private void swap(int indexone, int indextwo) {
        int temp = 0;
        temp = this.heap[indexone];
        this.heap[indexone] = this.heap[indextwo];
        this.heap[indextwo] = temp;
    }

    public void heapifydown() {
        int index = 0;
        while (hasleftchild(index)) {
            int smallerchildindex = getleftchildindex(index);

            if (hasri8child(index) && rightchild(index) < leftchild(index)) {
                smallerchildindex = getri8childindex(index);
            }
            if (this.heap[index] < smallerchildindex) {
                break;
            } else {
                swap(this.heap[index], smallerchildindex);

            }
            index = smallerchildindex;
        }

    }

    public String toString() {
        String result = "";
        for (int i = 0; i < heap.length; i++) {
            result += this.heap[i] + " ";
        }
        return result;
    }

    public void ensureque() {
        Heap heap = new Heap();
        if (this.size == this.max) {
            this.setmax(this.max * 2);

            heap.setheap(this.getmax());
            System.out.println("increasing array to " + this.max);
        }
    }

    private int getmax() {
        return this.max;
    }

};
