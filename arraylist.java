import java.util.*;
class arraylist{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        //adding values into arrayyindex
        a.add(10);
        a.add(20);
        a.add(2);
        a.add(4);
        a.add(1);
        System.out.println(a);
        // adding value at particular index 
        a.add(0,90);
        a.add(3,100);
        System.out.println(a);
        // modifier
        a.set(2,45);
        a.set(5,65);
        System.out.println(a);


    }
}  /*       [10, 20, 2, 4, 1]
            [90, 10, 20, 100, 2, 4, 1] 
            [90, 10, 45, 100, 2, 65, 1]*/