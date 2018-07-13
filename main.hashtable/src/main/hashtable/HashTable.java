/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.hashtable;

/**
 *
 * @author M.Ahsan
 */
public class HashTable {

    private DataItem[] hasharray;
    private int arraysize;

    public HashTable(int size) {
        this.arraysize = size;
        this.hasharray=new DataItem[size];
    }
public DataItem[] getarray(){
return this.hasharray;
}
    public void displaytable() {
        System.out.println("Table values are");
        for (int i = 0; i < arraysize; i++) {
            try {
                System.out.print(hasharray[i] + " ");
            } catch (NullPointerException e) {
            }
        }
    }

    public int hashfn(int key) {
        int hashcode = key % this.arraysize;
        int collosion = 0;
        if (hasharray!=null ) {
            return hashcode;
        } else if (this.hasharray== null) {
            collosion++;
            hashcode = (key + collosion) % this.arraysize;

        }
        return hashcode;
    }
};
