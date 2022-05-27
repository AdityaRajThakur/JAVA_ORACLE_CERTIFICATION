import java.util.Scanner;
import java.util.ArrayList;
import java.util.List ; 
public class Var {
    private int ab = 0 ; 
    Var(){
        var asd = 123 ;
        ab = asd ; 
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in) ; 
        List<String>  lst = List.of("hello " , "adityaraj" , "aslkd" , "akdf" , "asdkf") ;
        var lstt = new ArrayList<>();  //ArrayList<object>()
        var lst1 = new ArrayList<String>();//it will be the list of the string 
        var varr = List.of("hello " , "haskld") ; 
        System.out.println(varr);
        System.out.println(lst);
        var a =  scan.nextInt() ; 
         a = scan.nextInt() ;
        int var  = 23 ; 
        System.out.println(var);
        System.out.println("value of the variable a is " + a ) ; 
    }
}
