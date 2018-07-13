/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author M.Ahsan
 */
public class Mergesort {

    private int low;
    private int mid;
    private int high;
    private int[] list;
    private int maxsize;
    private int[] sortedlist;

    public Mergesort(int size) {

        this.maxsize = size;
        this.list = new int[size];

        this.sortedlist = new int[size];
        this.low = 0;
        this.high = this.maxsize - 1;
        this.mid = (this.low + this.high) / 2;
    }

    public int[] gettsortedlist() {
        return this.sortedlist;
    }

    public int[] getlist() {
        return this.list;
    }

    public void setlistindex(int index) {
        this.list[this.list[index]] = this.list[index];
    }

    public int getmaxsize() {
        return this.maxsize;
    }

    public int getlow() {
        return this.low;
    }

    public int gethigh() {
        return this.high;
    }

    public int getmid() {
        return this.mid;
    }



    public void setlow(int low) {
        this.low = low;
    }

    public void setmid(int mid) {
        this.mid = mid;
    }

    public void sethigh(int high) {
        this.high = high;
    }

  

     void mergesort(int[] list, int low, int high) {
        if (low == high) {
        } else if(high>low) {
            this.mergesort(this.getlist(), this.getlow(), this.getmid());
            this.mergesort(this.getlist(), this.getmid() + 1, this.gethigh());
            this.merge(this.getlist(), this.getlow(), this.getmid() + 1, this.gethigh());
        
        }
        displaylist();

    }

    public void merge(int[] list, int lowindex, int midindex, int highindex) {
       int n1=midindex-lowindex+1;
       int n2=highindex-midindex;
       int L[]=new int[n1];
       int R[]=new int[n2];
        
        for (int i = 0; i < n1; i++) {
            L[i]=list[lowindex+i];
        }
        for (int j = 0; j < n2; j++) {
            R[j]=list[midindex+1+j];
        }
        int i=0;
        int j=0;
        int k=lowindex;
        while(i<n1&&j<n2){

        if(L[i]<=R[j]){
        list[k]=L[i];
        i++;
        }else{
        list[k]=R[j];
        j++;
        }
        k++;
    }while(i<n1){
        list[k]=L[i];
        i++;
        k++;
    }while(j<n2){
    list[k]=R[j];
    j++;
    k++;
    }
   
}

    public void displaylist() {
    for (int l = 0; l < this.list.length; l++) {
            System.out.println(this.getlist()[l] + "");
        }     
    }

    public void ms() {
        mergesort( this.getlist(), this.getlow() , this.gethigh());
    }
};
