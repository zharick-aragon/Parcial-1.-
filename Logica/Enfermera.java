import java.util.List;

public abstract class Enfermera {
    private String documento; 
    private String nombre; 
    //Constructor 
    public Enfermera(String documento, String nombre){
        documento = this.documento; 
        nombre = this.nombre; 
    }
    public Enfermera(String documento2, String nombre2, int experiencia) {
        //TODO Auto-generated constructor stub
    }
    public String getDocumento(){
        return documento;
    }
    public String getNombre(){
        return nombre;
    }


    public List<String> getProcedimientosHabilitados(){
        return null;}




    

}
