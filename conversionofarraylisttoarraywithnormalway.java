import java.util.*;
class conversionofarraylisttoarraywithnormalway {
    public static void main(String [] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
         a.add(20);
          a.add(2);
           a.add(4);
            a.add(1);
         System.out.println(a);
        int b[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
            b[i]=a.get(i);
        System.out.println(a);
    }
}/*   [10, 20, 2, 4, 1]
      [10, 20, 2, 4, 1]   */