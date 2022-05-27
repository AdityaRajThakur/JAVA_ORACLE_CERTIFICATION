/**
 * @author adityaraj 
 * @return nothing 
 * @param nothing 
 */
public class Datatypes {
    public static void main(String[] args) {
        boolean bf = false ; 
        byte by = 127 ; 
        char ch =65; 
        short sh = 'a' ; 
        sh   = by ; 
        int inta = 234324 ; 
        inta  = by ; 
        inta = sh ; 
        long l = 234L ; 
        l = by ; 
        l = ch ; 
        l = inta ; 
        l = sh ; 
        float fl = 23.23f ; 
        fl=  l ; 
        fl = by ; 
        fl = ch ;  
        fl = inta ; 
        l = sh ; 

        double db = 34.2323 ; 
        db = fl  ; 
        db = l ; 
        db  = by ; 
        db = ch ; 
        db = sh ; 
        db = inta ; 
        System.out.println(sh);
        System.out.println(ch);
        System.out.println("ocatal number 0-7 prefix is 0 , base 8 " + 017); 
        System.out.println("hexdecimal number 0-9 A-F or a-f prefix is 0x or 0X , base is 16 " + 0xf);
        System.out.println("binary number 0-1 prefix is 0b or 0B , base is 2 " + 0b10);
        int mil = 1000_000 ; // to make readable instead of 1000000
        // you cannot put _ start of the number and end of the  number , before the decimal point and after the decimal point 
        System.out.println(mil);

    }
}
