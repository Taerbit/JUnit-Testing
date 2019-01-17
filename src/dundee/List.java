/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dundee;

import java.util.Iterator;

/**
 *
 * @author finntorbet
 */
public class List {
    int size;
    Node start;
    Node end;
    
    public List() {
        size = 0;
        start = null;
        end = null;
    }
    
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(Object x) {
        Node n = new Node(x);
        if(start == null) {
            start = n;
            end = n;
        } else {
            end.setNext(n);
        }
        size++;
    }
    
    public void print() {
        //Iterator
        Node i;
        i = start;
        while(i != null) {
            System.out.println(i.data);
            i = i.next;
        }        
    }
}
