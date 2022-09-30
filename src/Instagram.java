/**
 *
 * @author USRVI-LC2
 */
public class Instagram  extends RedSocial{
    
    private int id;
    private String historia;
    private boolean estado;

    public Instagram() {
    }

    public Instagram(int id, String historia, boolean estado, String usuario, String pass) {
        super(usuario, pass);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() + "Instagram{" + "id=" + id + ", historia=" + historia + ", estado=" + estado + '}';
    }

    @Override
    public void datos() {
        
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Historia : " + this.getHistoria());
        
    }
    
    
    
}
