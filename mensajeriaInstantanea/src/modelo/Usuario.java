package modelo;
/**
 *
 * @author Erik Tirado
 */
public class Usuario {
    private String nombre;
    private boolean logeado;
    
    public Usuario(){
        logeado = false;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void logear(){
        this.logeado = true;
    }
    public void deslogear(){
        this.logeado = false;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean isLog(){
        return logeado;
    }
}
