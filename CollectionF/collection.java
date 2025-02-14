 package CollectionF;

import java.util.ArrayList;

class collection {

    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        System.out.println(al);
        try {
            System.out.println(1/0);  // handle error not stop direct next program
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        al.add(4);
        System.out.println(al);

    }
}