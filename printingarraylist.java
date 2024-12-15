import java.util.*;
class printingarraylist {
    public static void main(String [] args){
        ArrayList<Integer> a=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int b=s.nextInt();
            a.add(b);
        }
        for(int i=0;i<a.size();i++){

            System.out.print(a.get(i)+" ");
        }
    }
}/*     5
2 5 8 0 1 
2 5 8 0 1   */