import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        // 1] Sacnner
        // int a = 2;
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the user input");
        // float num = input.nextFloat();
        // System.out.println("Output : "+num);
        
        // System.out.println("Enter the String : ");
        // input.nextLine();
        // String b = input.nextLine();
        // System.out.println("Output "+ b);

        // char ch = input.next().charAt(0);
        // System.out.println("Character : "+ch);

        // char bh = input.next().charAt(3);
        // System.out.println("Character : "+bh);

        // 2] Buffer  Class

        // 1 ] print();
        //2] Println();
        // 3 ] printf();
        // 4] format();

        System.out.printf("%d",55);
// this method call a date
        System.out.println(new Date());

        // format();

        SimpleDateFormat ft = new SimpleDateFormat("22-22-2025");
        String str =ft.format(new Date());
        System.out.println("Form+at Date : "+str);



















    }
    
}
