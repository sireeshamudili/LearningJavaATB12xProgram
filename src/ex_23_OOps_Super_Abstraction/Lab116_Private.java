package ex_23_OOps_Super_Abstraction;

public class Lab116_Private {

}
     class XYZ {
       XYZ() {
       }
       protected int my_gold = 10;
     }

     class CAB extends XYZ{
     void display(){
        System.out.println(super.my_gold);
    }
}