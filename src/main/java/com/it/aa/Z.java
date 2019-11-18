package com.it.aa;

class X{
	
    Y y=new Y();
    public X(){
        System.out.print("X");
        
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
public class Z extends X{
    Y y=new Y();
    public int Z(){
        System.out.print("Z");
        return 1;
    }
    public static void main(String[] args) {
        new Z();
    }
    
    public static void pri(int i) {
    	System.out.println(i);
    }
}