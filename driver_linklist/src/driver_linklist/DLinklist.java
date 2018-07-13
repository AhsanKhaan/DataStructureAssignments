/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_linklist;

/**
 *
 * @author M.Ahsan
 */
public class DLinklist {

    private Dnode root;
    private int size;

    //null constructor
    public DLinklist() {
        this.root = new Dnode();
        this.size = 0;
    }

    //parametrized constructor
    public DLinklist(Dnode head, int size) {
        this.root = head;
        this.size = size;
    }

    //getter and setter
    public Dnode getroot() {
        return this.root;
    }

    public int getsize() {
        return this.size;
    }

    public void setsize(int length) {
        this.size = length;
    }

    public void setroot(Dnode head) {
        this.root = head;
    }

    public Dnode add(int data) {

        Dnode newnode = new Dnode(null, data, root);
        this.root.setprevnode(newnode.getnextnode());
        this.root = newnode;
        this.size++;
        return newnode;
    }

    public boolean remove(int data) {
        Dnode currentnode = this.root;
        Dnode prevnode = null;
        while (currentnode.getnextnode() != null) {
            if (currentnode.getdata() == data) {

                try {
                    prevnode.setnextnode(currentnode.getnextnode());
                } catch (NullPointerException e) {
                }
            }
            this.setsize(this.getsize() - 1);
            return true;
        }
        prevnode = currentnode;
        currentnode.setprevnode(prevnode.getnextnode());
        currentnode = currentnode.getnextnode();

        return false;
    }

    public Dnode find(int data) {
        Dnode currentnode = this.root;
        Dnode prevnode = null;
        while (currentnode.getnextnode() != null) {
            if (currentnode.getdata() == data) {
                return currentnode;
            }
        }
        prevnode = currentnode;
        currentnode = currentnode.getnextnode();
        return null;
    }

};
