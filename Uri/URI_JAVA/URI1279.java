package URI_JAVA;
import java.io.IOException;
import java.util.*;
import java.math.BigInteger;

public class URI1279 {
 
    public static void main(String[] args) throws IOException {
 Scanner sc = new Scanner(System.in);
        boolean l=true;
    while(sc.hasNext())
    {
        if(!l)
            System.out.println();
        String str;
        str = sc.next();
        BigInteger year =new BigInteger(str);
        BigInteger x = new BigInteger("100");
        BigInteger y =BigInteger.ZERO;
         x=year.mod( x );
         boolean flag = false;
         boolean hul=false;
         boolean bul=false;
        if( x.equals(y))
        {
            x=year.mod( new BigInteger("400") );
            if( x.equals(y))
                flag=true;
        }
        else
        {
             x=year.mod( new BigInteger("4") );
            if( x.equals(y))
                flag=true;
        }
        x=year.mod(new BigInteger("15"));
        if(x.equals(y))
            hul=true;
        if(flag)
        {
            x=year.mod(new BigInteger("55"));
            if(x.equals(y))
                bul=true;
        }
        if(flag)
            System.out.println("This is leap year.");
        if(hul)
            System.out.println("This is huluculu festival year.");
        if(bul)
            System.out.println("This is bulukulu festival year.");
        if(!flag&&!hul&&!bul)
        System.out.println("This is an ordinary year.");
        //System.out.println();
        l=false;
    }
}
}
