/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp04ex4;

/**
 *
 * @author User
 * @param <T>
 */
public class LinkedStack<T> implements StackADT<T>{
    
    private LinearNode<T> first;
    private int size;

    public LinkedStack() {
        this.first = null;
        this.size = 0;
    }
    
    
    
    @Override
    public void push(T element) {
        LinearNode <T> newNode = new LinearNode<>(element);
        if(first==null){
            first = newNode;
        size ++;
        }else {
           newNode.setNext(first);
           first=newNode;
           size++;
        }
        
    }

    @Override
    public T pop() {
        if(isEmpty())
            return null;
        T element=first.getElement();
        first=first.getNext();
        size--;
        
        return element;
    }

    @Override
    public T peek() {
        if(this.isEmpty())
            return null;
        return first.getElement();
    }

    @Override
    public boolean isEmpty() {
        return (size==0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String str="[";
        LinearNode<T> c=first;
        for(int i=0;i<size;i++){
            str=str+c.getElement()+" ";
            c=c.getNext();
        }
        
        return str+"]";
        
    }
    
    
}
