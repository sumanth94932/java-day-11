import java.util.*;
class acceptingarraylist {
    public static void main(String [] args){
        ArrayList<Integer> a=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int b=s.nextInt();
            a.add(b);
        }
        System.out.println(a);
        a.add(10);
        a.add(23);
        System.out.println(a);
    }
}/* 7
3 6 9 1 2 5 0
[3, 6, 9, 1, 2, 5, 0]        
[3, 6, 9, 1, 2, 5, 0, 10, 23]   */ 