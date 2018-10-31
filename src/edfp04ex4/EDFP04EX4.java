/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp04ex4;

/**
 *
 * @author User
 */
public class EDFP04EX4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       QueueStacks<Integer> a=new QueueStacks<>();
      
       a.enqueue(1);
       a.enqueue(2);
       a.enqueue(3);
       a.enqueue(4);
       a.enqueue(5);
       a.enqueue(6);
       
       System.out.println(a.dequeue());
       System.out.println(a.dequeue());
       
       a.enqueue(7);
       a.enqueue(8);
       System.out.println(a.dequeue());
        System.out.println(a.first());
      System.out.println(a.toString());
    }
    
}
