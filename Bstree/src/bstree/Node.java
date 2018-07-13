/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstree;

/**
 *
 * @author M.Ahsan
 */
public class Node {

    private Node leftchild;
    private Node rightchild;
    private int idata;
    private double ddata;
//null constructor

    public Node() {
    }
//parameterized constructor

    public Node(int ikey) {
        this.idata = ikey;
    }
//parameterized constructor

    public Node(int ikey, int dkey) {
        this.idata = ikey;
        this.ddata = dkey;
    }

//getter and setter
    public void setidata(int ikey) {
        this.idata = ikey;
    }

    public void setddata(int dkey) {
        this.ddata = dkey;
    }

    public int getidata() {
        return this.idata;
    }

    public double getddata() {
        return this.ddata;
    }

    public void show() {

        String node = " ";
        node += "Node is\t(" + this.idata + ")";
        System.out.println(node);
    }

    public boolean insert(int val) {
        boolean added = false;
        if (this == null) {
            this.idata = val;
            return true;
        } else if (val < this.idata) {
            if (this.leftchild == null) {
                this.leftchild = new Node(val);
                return true;
            } else {
                added = this.leftchild.insert(val);
            }
        } else if (val >= this.idata) {
            if (this.rightchild == null) {
                this.rightchild = new Node(val);
                return true;
            } else {
                added = this.rightchild.insert(val);
            }
        }
        return added;
    }

    public boolean find(int val) {
        boolean found = false;
        if (this == null) {
            return false;
        } else if (val < this.idata && this.leftchild != null) {
            found = this.leftchild.find(val);
        } else if (val > this.idata && this.rightchild != null) {
            found = this.rightchild.find(val);
        } else if (val == this.idata) {
            return true;
        }
        return found;
    }

    boolean delete(int val) {
        boolean del = false;
        if (this == null) {
            return false;
        } else if (val == this.idata) {
            try {
                this.idata = this.leftchild.getidata();
            } catch (NullPointerException e) {
            }
            return true;
        } else if (val > this.idata) {
            try {
                del = this.rightchild.delete(val);
            } catch (NullPointerException e) {
            }
        } else if (val < this.idata) {
            try {
                del = this.leftchild.delete(val);
            } catch (NullPointerException e) {
            }
        }
        return del;
    }

    public void preorder() {
        if (this != null) {
            System.out.println(this.idata);
            if (this.leftchild != null) {
                this.leftchild.preorder();
            }
            if (this.rightchild != null) {
                this.rightchild.preorder();
            }
        }
    }

    public void inorder() {
        if (this != null)//if this(current NOde)(i_e:initially root) is not null then follow inorder() 
        {
            if (leftchild != null) {
                this.leftchild.inorder();
            }
            System.out.println(this.idata);

            if (rightchild != null) {
                this.rightchild.inorder();
            }

        }
    }

    void postorder() {
        if (this != null) {
            if (leftchild != null) {
                this.leftchild.postorder();
            }
            if (rightchild != null) {
                this.rightchild.postorder();
            }
            System.out.println(this.idata);

        }
    }

    void levelordert() {
        if (this != null) {

            // System.out.println(this.idata);
            if (this.leftchild != null) {
                System.out.println(this.leftchild.idata);
            }

            if (this.rightchild != null) {
                System.out.println(this.rightchild.idata);
            }
            try {
                this.leftchild.levelordert();
            } catch (NullPointerException e) {
            }

        }
    }
};
