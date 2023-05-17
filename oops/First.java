import java.util.*;
class Second{
    int id;
    String name;
}
class Third{
        int id;
    String name;
    int exp;

    Third(int i, String n){  //constructor
        id=i;
        name=n;
    }
       Third(int i, String n, int e){  //constructor overloading
        id=i;
        name=n;
        exp=e;
    }
}
class First{
    int id=1;
    String name="Varun";
    public static void main(String args[]){
        First obj = new First();
        Second obj1 = new Second();
        Third obj2 = new Third(3,"Sabaree");
        Third obj3 = new Third(4,"Hari",3);
        obj1.id=2;
        obj1.name="Vasu";
        System.out.println(obj.id+" "+obj.name);
        System.out.println(obj1.id+" "+obj1.name);
        System.out.println(obj2.id+" "+obj2.name);
        System.out.println(obj3.id+" "+obj3.name+" "+obj3.exp);
    }
}

