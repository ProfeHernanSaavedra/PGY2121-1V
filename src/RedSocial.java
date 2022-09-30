/**
 *
 * @author USRVI-LC2
 */
public class RedSocial {
    
    protected String usuario, pass;

    public RedSocial() {
    }

    public RedSocial(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "usuario=" + usuario + ", pass=" + pass + '}';
    }
    
    public void datos()
    {
        System.out.println("Usuario: " + this.getUsuario());
        System.out.println("");
    }
    
}
