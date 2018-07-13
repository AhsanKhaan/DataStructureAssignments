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
public class S_Linklist {

    private Node root;
    private int size;
//null constructor

    public S_Linklist() {
        root = new Node();
        size = 0;
    }
//setter and getter

    public int getsize() {
        return this.size;
    }

    public void setsize(int size) {
        this.size = size;
    }

    public Node getroot() {
        return this.root;
    }

    public void setroot(Node firstnode) {
        this.root = firstnode;;
    }

    public Node add(int data) {

        Node newnode = new Node(data, root);
        this.root = newnode;
        this.size++;
        return newnode;
    }

    public boolean remove(int data) {
        // Node thisnode=new Node();
        Node thisnode = this.root;
        Node prevnode = null;
        while (thisnode.getnextnode() != null) {
            if (thisnode.getdata() == data) {
               try{ prevnode.setnextnode(thisnode.getnextnode());}
               catch(NullPointerException e){
                   System.out.println("Warning:'The value ccontains null pointer'");
               }
                this.setsize(getsize() - 1);
                return true;
            }
            prevnode = thisnode;
            thisnode = thisnode.getnextnode();
        }
        return false;
    }
    public Node find(int data){
    Node thisnode=this.root;
    while(thisnode.getnextnode()!=null){
    if(thisnode.getdata()==data)
    return thisnode;
    thisnode=thisnode.getnextnode();//adding this for reading next node if we didn't do then infinite loop occur
    }
    
    return null;
    }
};
