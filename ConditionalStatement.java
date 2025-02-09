import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        
      
        // if - else - else if
        // int money = 1000;
        // if (money>1000) {
        //     System.out.println("Bada Restro");
        // }else if (money > 0 && money<900) {
        //     System.out.println("Tapri Wale");
        // } 
        //  else{
        //     System.out.println("Chota Restro");
        // }
        Scanner input = new Scanner(System.in);

      int choice = input.nextInt();
      switch (choice) {
        case 1:System.out.println("Chai");
        break;
        case 2:System.out.println("Cold Copy");
        break;
        case 3:System.out.println(" Copy");
        break;
        case 4:System.out.println("Hot Copy");
        break;
        case 5:System.out.println("Milk Copy");
        break;
            
      
        default:
            break;
      }



    }
}
