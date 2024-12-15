//hello i am inner method//
import java.util.*;
interface out{
    void outs();
    interface in{
        void ins();
    }
}
public class nestinter implements out.in {
    public void ins(){
        System.out.println("hello i am inner method");
    }
    public static void main(String args[]){
        nestinter a=new nestinter();
        a.ins();
    }

}/*   hello i am inner method  */