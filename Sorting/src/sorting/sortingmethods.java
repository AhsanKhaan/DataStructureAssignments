/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/* 
 * @author M.Ahsan
 */
public class sortingmethods {

    private int maxsize;
    private int[] array;
    int i, j;
    private int pivot;
    private int start;
    private int last;

    public sortingmethods(int size) {
        this.pivot = start;
        this.start = i;
        this.last = j;
        this.maxsize = size;
        this.array = new int[size];
    }

    public void quicksort(int arr[]) {
        this.array[i] = start;
        this.array[j] = last;
        start = pivot;
        while (i < j) {
            if (pivot >= arr[i] && i < last) {
                i++;
            } else if (pivot < arr[j]) {
                j--;
            } else if (arr[j] > arr[i]) {
                int temp = 0;
                temp = arr[i];
                arr[j] = arr[i];
                arr[j] = temp;
            }

        }
        this.quicksort(arr);
        //quicksort(int arr[])
    }

    int getmaxsize() {
        return this.maxsize;
    }

    int[] getlist() {
        return this.array;
    }
    public void displaylist(){
        for (int k = 0; k <this.getmaxsize(); k++) {
            System.out.println(this.getlist()[k]+" ");
        }
    }
};
