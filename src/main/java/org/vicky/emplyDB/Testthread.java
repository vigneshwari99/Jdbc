package org.vicky.emplyDB;




public class Testthread implements Runnable 
{ 
public void run() 
{ 
System.out.println("r1 "); 
System.out.println("r2 "); 
} 

public static void main( String[] args ) throws InterruptedException 
{ 
Thread t = new Thread(new Testthread()); 
t.start(); 
System.out.println("m1 "); 
t.sleep(700);
System.out.println("m2 "); 
} 
}

 


