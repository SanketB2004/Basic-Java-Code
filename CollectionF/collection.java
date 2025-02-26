package CollectionF;  // पॅकेज डिक्लेरेशन

import java.util.ArrayList;  // ArrayList वापरण्यासाठी आवश्यक असलेला import

class collection {  // Class डिक्लेरेशन (सहसा Class नाव uppercase मध्ये ठेवावा - Collection)

    public static void main(String[] args) {  // मुख्य कार्यान्वित होणारी method
        ArrayList<Integer> al = new ArrayList<>();  // Integer type ची ArrayList तयार करतो
        al.add(1);  // ArrayList मध्ये 1 जोडतो
        al.add(2);  // ArrayList मध्ये 2 जोडतो
        System.out.println(al);  // सध्या असलेले element print करतो
        
        try {
            System.out.println(1/0);  // ही ओळ ArithmeticException (divide by zero) निर्माण करेल
        } catch (Exception e) {  // Exception पकडला जातो आणि प्रोग्राम थांबत नाही
            System.out.println(e);  // Exception चा तपशील print होतो
        }
        
        al.add(4);  // Exception नंतरही कोड पुढे चालतो आणि 4 जोडतो
        System.out.println(al);  // अपडेट झालेली ArrayList print करतो
    }
}
