import java.util.Collection;
import java.util.List;

public class Hospital {
    public List<Paciente> paciente; 
    public Hospital(){}

    public List<Paciente> getPacientes(){
        return paciente; 
        
    }
    public Turno getTurno(String fecha){}
    
    public Collection<Enfermera> getEnfermerasEnTurno(String fecha){}

    public void agregarTurno(Turno p){}


}
