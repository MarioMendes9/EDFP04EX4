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
public class QueueStacks<T> implements QueueADT<T>{
    private StackADT<T> a1;//para adicionar
    private StackADT<T> a2;//para remover
    
    public QueueStacks() {
        this.a1 = new ArrayStack<>();
        this.a2 = new ArrayStack<>();
        
//        this.a1=new LinkedStack<>();
//        this.a2=new LinkedStack<T>();
            
    }

    @Override
    public void enqueue(T element) {
        while(!a2.isEmpty()){
            a1.push(a2.pop());
        }
        a1.push(element);
    }

    @Override
    public T dequeue() {
        while(!a1.isEmpty()){
            a2.push(a1.pop());
        }
        return a2.pop();
    }

    @Override
    public T first() {
        while(!a1.isEmpty()){
            a2.push(a1.pop());
        }
        return a2.peek();
    }

    @Override
    public boolean isEmpty() {
       return (a1.isEmpty() && a2.isEmpty());
    }

    @Override
    public int size() {
        return a1.size()+a2.size();
    }

    @Override
    public String toString() {
        while(!a1.isEmpty()){
            a2.push(a1.pop());
        }
        
        return "Ordem de saida"+a2.toString();
    }
    
    
    
    
}
