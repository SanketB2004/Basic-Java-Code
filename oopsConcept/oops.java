// package oopsConcept;

class Animal {  // THis Is A 1St Class
    int legs;

    void eat() {
        System.out.println("Eating.......");
    }

}
class Employ{ // This Is Example For Encapsulation
  private  int empId;
   

   int getempId(){
    return empId;

   }
   void setempId(int id){
    empId=id;
   }
}
public class oops {
    public static void main(String[] args) {
      Animal cat = new Animal();  // THis Is A 2nd Object 
        cat.legs = 4;
        System.out.println(cat.legs);
        cat.eat();


        





    }
}
