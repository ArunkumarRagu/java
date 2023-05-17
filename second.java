class Main{
  public static void main(String[] args) {
    Car obj = new Car("TATA","nano",2010,"Mumbai");
     System.out.println(obj.brand +" "+ obj.modelname + " is manufactured at " +obj.mfgplace+" in "+obj.modelyear);
  }
}

class Car{
    String brand;
    String modelname;
    int modelyear;
    String mfgplace;

    Car(String brand,String carname,int mdl,String mfg){
          this.brand=brand;
          this.modelname=carname;
          this.modelyear=mdl;
          this.mfgplace=mfg;
    }
}



