class Monkey{
     void jump(){
        System.out.println("Monkey is jumping");
    }
    void bite(){
        System.out.println("Monkey will bite you");
    }
}

interface Basic_animal{
    void eat();
    void sleep();
}

class Human extends Monkey implements Basic_animal{
    void think(){
        System.out.println("Human can only think");
    }
    public void eat(){
        System.out.println("Human and Monkey can Eat");
    }
    public void sleep(){
        System.out.println("Human and Monkey can Sleep");
    }
}

class animal{
    public static void main(String args[]){
        Human Elon = new Human();
        Elon.bite();
        Elon.think();
        Elon.jump();
    }
}


