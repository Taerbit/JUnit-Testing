/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dundee;

/**
 *
 * @author finntorbet
 */
public class Node {
    Object data;
    Node next;
    
    public Node(Object x) {
        data = x;
        next = null;
    }
    
    public void setNext(Node n) {
        next = n;
    }
}
