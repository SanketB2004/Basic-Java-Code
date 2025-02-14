

    
class A{
void show(){
    System.out.println("A");
}
}
// runtime > method over riding Not Same Variable But Method Same
class B extends A{
    @Override
    void show(){
        System.out.println("B");
}
}

// runtime > method over riding Not Same Variable But Method Same

public class Plymorphism {

    // Compile time > Method overloading
    // runtime > method over riding
    int add(int a,int b){
        return a+b;
    }// Compile time > Method overloading Same Name But Differnt 
    int add(float a  , float b){
        return(int)(a+b);
    }// Compile time > Method overloading Same Name But Differnt
    public static void main(String[] args) {
        
    }
}