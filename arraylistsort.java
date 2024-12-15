import java.util.*;
class arraylistsort {
    public static void main(String [] args){
        ArrayList<Integer> a=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int b=s.nextInt();
            a.add(b);
        }
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}/* 5
7 9 4 2 6 
[7, 9, 4, 2, 6]
[2, 4, 6, 7, 9]  */