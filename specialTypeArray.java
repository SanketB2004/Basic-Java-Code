public class specialTypeArray {

    public static void main(String[] args) {

        // Make A First Type Create The String // Charcter Array
        char[] charArry = { 'A','B','C'};
        System.out.println(charArry);
        // Make A Second Type Create The String // Charcter Array
        String str = "ABC";
        System.out.println(str.charAt(0) ); //method hai charat

          
              // Make A Thaird Type Create The String // Charcter Array
               String str1 = "ABC";
               String str3 = new String("ABC");
               //System.out.println(str1==str3);
               System.out.println(str1.equals(str3));

               // String Buffer & String Builde 
                 
                StringBuffer str4 = new StringBuffer("Shiv");   
                StringBuilder str5 = new StringBuilder("Shiv");   

                System.out.println(str4);
                System.out.println(str5);
                // update method 

                str4.append("Am");
                System.out.println(str4);
                // str5.deleteCharAt(0);
                // str5.delete(0, 3);
                str5.insert(0,'A');
                System.out.println(str5);

















    }
}