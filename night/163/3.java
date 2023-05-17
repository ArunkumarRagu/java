class Batsman{
    void bat(){
        System.out.println("I am Batsman");
    }
}
class Bowler {
    void bowl(){
        System.out.println("I am Bowler");
    }
}

class Allrounder extends Batsman,Bowler{
    void both(){
        System.out.println("I am Batsman and bowler");
    }
}

class Main{
    public static void main(String args[]){
        Allrounder obj = new Allrounder();
        obj.bat();
        obj.bowl();
        obj.both();
    }
}
