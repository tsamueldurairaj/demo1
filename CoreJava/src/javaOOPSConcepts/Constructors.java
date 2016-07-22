package javaOOPSConcepts;

class Constructors{  
    int id;  
    String name;  
    int age;  
    
    Constructors(int i,String n){  
    id = i;  
    name = n;  
    }  
    
    Constructors(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Constructors s1 = new Constructors(111,"Karan");  
    Constructors s2 = new Constructors(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}  
