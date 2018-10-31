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
public class ArrayStack<T> implements StackADT<T> {

    /**
     * constant to represent the default capacity of the array
     */
    private final int DEFAULT_CAPACITY = 100;
    /**
     * int that represents both the number of elements and the next available
     * position in the array
     */
    private int top;
    /**
     * array of generic elements to represent the stack
     */
    private T[] stack;

    /**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack() {
        this.top = 0;
        this.stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    /**
     * Creates an empty stack using the specified capacity.
     *
     * @param initialCapacity represents the specified capacity
     */
    public ArrayStack(int initialCapacity) {
        top = 0;
        this.stack = (T[]) (new Object[initialCapacity]);
    }

    @Override
    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }

        stack[top] = element;
        top++;
    }

    private void expandCapacity() {
        T[] stack2 = (T[]) (new Object[this.size() + 1]);

        for (int i = 0; i < this.size(); i++) {
            stack2[i] = stack[i];
        }
        stack = stack2;

    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    @Override
    public T peek() {
       if (isEmpty())
           return null;
       
          
         return stack[top-1];
    }

    @Override
    public boolean isEmpty() {
        return (top==0);
    }

    @Override
    public int size() {
        return top;
    }

//    @Override
//    public String toString() {
//        String str="[";
//        for(int i=0;i<top;i++){
//            str=str+stack[i]+" ";
//        }
//        return str+"]";
//        
//    }
    
    @Override
    public String toString() {
        String str="[";
        for(int i=top-1;i>=0;i--){
            str=str+stack[i]+" ";
        }
        return str+"]";
        
    }
    
    
}
