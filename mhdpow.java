// import java.util.*;
// import java.math.*;
// class Main{
//     public static void main(String args[]){
//         int a=3,b=3;
//         power(a,b);
//     }

//     static void power(int a,int b){
//         // double pow;
//         int pow;
//         pow=(int)Math.pow(a,b);
//         System.out.println(pow);
//     }
// }


import java.util.*;
import java.math.*;

class powcl{
        int a,b;
        void ans(){
        int pow=(int)Math.pow(a,b);
        System.out.println(pow);
    }
}

 class arun{
    static void main(String args[]){
        powcl powername = new powcl();
        int a,b;
        powername.a=3;  
        powername.b=3;  
        powername.ans();
    }
}

