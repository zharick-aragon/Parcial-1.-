import java.util.List;

public class Jefe extends Enfermera{

    private static int experiencia;
    private String documento; 
    private String nombre; 

    public Jefe(String documento, String nombre, int experiencia) {
        super(documento, nombre, experiencia);
    }

   

    public int getExperiencia(){
        experiencia = this.experiencia; 
        return experiencia; 

    }

    public List<String> getProcedimientosHabilitados(){
        return null;}

    }







