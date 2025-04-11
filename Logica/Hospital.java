import java.util.Collection;
import java.util.List;

public class Hospital {
    public List<Paciente> paciente; 
    public Hospital(){}
    public Enfermera enfermera; 

    public List<Paciente> getPacientes(){
        return paciente; 
        
    }
    public Turno getTurno(String fecha){}

    public void getEnfermerasEnTurno(String fecha){
            enfermera.agregarTurno(new Turno(fecha));
        }
    

    public void agregarTurno(Turno p){}


}
