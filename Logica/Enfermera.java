import java.util.List;
import java.util.*;

public abstract class Enfermera {
    private String documento; 
    private String nombre; 
    //Constructor 
    public Enfermera(String documento, String nombre){
        documento = this.documento; 
        nombre = this.nombre; 
    }
    public Enfermera(String documento2, String nombre2, int experiencia) {
    }
    public String getDocumento(){
        return documento;
    }
    public String getNombre(){
        return nombre;
    }
    public void agregarTurno(Turno nuevoTurno){
        nuevoTurno = new Turno(nombre); 
    }

    

    public List<String> getProcedimientosHabilitados(){
        return null;}




    

}

