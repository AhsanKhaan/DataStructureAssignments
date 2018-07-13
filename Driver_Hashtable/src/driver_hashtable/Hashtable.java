/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_hashtable;

/**
 *
 * @author M.Ahsan
 */
public class Hashtable {

    private int[] hasharray;
    private int maxsize;
    private int key;

    public Hashtable(int size) {
        this.maxsize=0;
        this.maxsize = size;
        this.hasharray = new int[size];
    }

    public int getsize() {
        return this.maxsize;
    }

    public int getkey() {
        return this.key;
    }

    public void setkey(int data) {
        this.key = data;
    }

    public int[] getharray() {
        return this.hasharray;
    }

    public int Hashcode(int key) {
        int hashcode = 0;

        for (int i = 0; i < hasharray.length; i++) {
            if (this.hasharray[i]==this.search(key)) {
                hashcode = key % this.getsize();
                break;
            } else {
                int collision = 0;
                collision++;
                hashcode = (key + collision) % this.getsize();
                break;
            }

        }
        return hashcode;
    }

    public int search(int key) {
        int search = 0;
        for (int i = 0; i < hasharray.length; i++) {
            if (this.hasharray[i] == key) {
                search = key;
                }
              
        }
        return search;

    }

    public int Insert(int key) {
        int i = this.Hashcode(key);
        this.hasharray[i] = key;
        int value = this.hasharray[i];
        return value;
    }

    public void displayhashtable() {
        System.out.println("hash Table have values as follows");
        for (int i = 0; i < hasharray.length; i++) {
            System.out.print(hasharray[i] + " ");
        }
    }
};
