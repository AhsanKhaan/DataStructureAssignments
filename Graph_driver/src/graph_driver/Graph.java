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
public class Graph {

    private final int max_vertices;
    private int nvertices;
    private int[][] adjancymatrix;
    private Vertex[] verticeslist;
    private StackX thestack;

    public Graph() {
        this.max_vertices = 10;
        this.verticeslist = new Vertex[max_vertices];
        this.adjancymatrix = new int[max_vertices][max_vertices];
        this.nvertices = 0;
        this.thestack = new StackX();
        for (int i = 0; i < max_vertices; i++) {
            for (int j = 0; j < max_vertices; j++) {
                this.adjancymatrix[i][j] = 0;
            }
        }
    }

    public void AddVertices(char V) {
        this.verticeslist[nvertices++] = new Vertex(V);
    }

    public void addedge(int start, int end) {
        this.adjancymatrix[start][end] = 1;
        this.adjancymatrix[end][start] = 1;
    }

    public void displayvertex(int vertex) {

        System.out.println(verticeslist[vertex].getlabel());

    }

    public int getAdjunvisitedmatrix(int v) {
        for (int i = 0; i < this.nvertices; i++) {
            if (  this.adjancymatrix[v][i] == 1 && this.verticeslist[i].wasvisited==false) {
                return i;
            }
        }

        return -1;
    }

    public void displaymatrix() {

        if (this.nvertices != 0) {

            for (int i = 0; i < nvertices; i++) {
                for (int j = 0; j < nvertices; j++) {
                    System.out.print(this.adjancymatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No vertex added");
        }
    }

    public void dfs() throws NullPointerException {
        this.verticeslist[0].wasvisited = true;//assign initail vertex as visited
        this.displayvertex(0);
        this.thestack.push(0);

        while (!thestack.isEmphty()) {
            int v = this.getAdjunvisitedmatrix(thestack.peek());//method for getting un visited vertex
            if (v == -1) {
                thestack.pop();
            } else {
                this.verticeslist[v].wasvisited = true;//mark 0(A) is true if 0
                this.displayvertex(v);
                this.thestack.push(v);
            }

        }//end while
        for (int i = 0; i < nvertices; i++) {
            this.verticeslist[i].wasvisited = false;
        }
    }
};
