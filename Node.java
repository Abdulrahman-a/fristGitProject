/*
 * Node.java
 *
 * Created on October 15, 2006, 11:15 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package cs.me.ADTLibrary;

/**
 *
 * @author Administrator
 */
public class Node<T> {
    public T data;
    public Node<T> next;
    /** Creates a new instance of Node */
    public Node() {
        data = null;
        next = null;
    }
    public Node(T val) {
        data = val;
        next = null;
    }
}
