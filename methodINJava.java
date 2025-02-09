public class methodINJava {
// Non Return Type With Parameter
   static void myff(){
        System.out.println("Void Method is Calling");
    }
    static void myff1(int kiraya){
        System.out.println("Void Method is Calling");
    }
//  Return Type Without parameter
static String mtlbiFriend(){
    return "Lath , Rod...!";
}
// Return Type With parameter
static String mtalabiFriandWithMoney(int money){
    return "Ppaisa Me lath ,Rod maga ......!!";
}

// Adition Exxample ;
static int addition(int a, int b){
    return a+b;
}
    public static void main(String[] args) {
        
            myff(); // Calling Method
            myff1(50);
            String str = mtlbiFriend();
            System.out.println(str);

            String str1 = mtalabiFriandWithMoney(2000);
            System.out.println(str1);
            System.out.println(addition(50, 70));
    }
}
