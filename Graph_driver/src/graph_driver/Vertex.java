/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph_driver;

/**
 *
 * @author M.Ahsan
 */
public class Vertex {

    private char label;
    public boolean wasvisited;
public Vertex(){
this.label=' ';

}
    
    public Vertex(char lab) {
        this.label = lab;
        this.wasvisited = false;
    }

    public char getlabel() {
        return this.label;
    }
};
