
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author USRVI-LC2
 */
public class TestRedSocial {
    
    
    public static void main(String[] args) {
        
        Instagram insta = new Instagram(1, "haciendo clases", true, "profehernan", "123");
        System.out.println(insta.toString());
        System.out.println("");
        insta.datos();
        System.out.println("");
        
                
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        String fechaN = formato.format(fecha);
        System.out.println("fecha Nueva:  " + fechaN);
        
        Twitter tw = new Twitter(2, "esta helado", fecha, "user","pass");
        System.out.println(tw.toString());
        System.out.println("");
        tw.datos();
        
        
        
        
    }
    
}
