import java.util.ArrayList;
import java.util.Collection;
import java.util.List; 

public class Paciente {
    public int Verde = 1; 
    public int Amarillo = 2; 
    public int Naranja = 3; 
    public int Rojo = 4; 
    private String documento; 
    private String nombre ; 
    private int NivelTriage;
    public static final String getDescripcion = ""; 
    private List<Procedimiento> procedimientos = new ArrayList<>();

    public Paciente(int NivelTriage, String documento, String nombre){
        NivelTriage = this.NivelTriage; 
        documento = this.documento; 
        nombre = this.nombre; 
        
    }
    public String getDocumento(){
        return this.documento; 
    }
    public String getNombre(){
        return this.nombre; 
    }
    public int getNivelTriage(){
        return this.NivelTriage; 
    }
    
    

    public void agregarProcedimiento(Procedimiento procedimiento){
        procedimientos.add(procedimiento); 
    }




    

}
