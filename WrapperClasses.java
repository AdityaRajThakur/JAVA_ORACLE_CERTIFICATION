public class WrapperClasses {
    public static void main(String[] args) {
        Boolean bo = false ; 
        boolean boo = Boolean.valueOf("false");
        Float f = 23.23f; 
        Long l = 324324l; 
        Byte by = 23 ; 
        byte b = 'a' ; 
        Integer in = 23 ; 
        Character ch = 't' ; 
        int a  = Integer.parseInt("23") ; 
        int ab = Integer.valueOf(23) ; 
        float fl = Float.valueOf("23.23"); 

        short shor = 7 * 8 ;
        int u = 10 ; 
        int g =  10  ; 
       // shor = u * g ; //error variable will throws error  
       shor = (int)1L ;
       shor = (int)6534L; 
       shor = (int)23.3f; 
       ch  = (int)3; //no error but 
    //    ch = (int)in //error 
        System.out.println(shor);
        String name1 = "ad"  ; 
        String name2 = "ad" ; 
        String name3  = "adf" ; 
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        boolean h = true ; 
        boolean d = true ==h ; 
        System.out.println(d) ;
        
        System.out.println(boo +" " +  bo );
    }
}
