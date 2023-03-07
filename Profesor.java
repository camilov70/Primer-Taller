public class Profesor extends Estudiante{
    
    private String Materia;
    private String Horario;

    public Profesor() {
    }

    public Profesor(String Materia, String Horario, int id, String Nombre, String Apellido) {
        super(id, Nombre, Apellido);
        this.Materia = Materia;
        this.Horario = Horario;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
}

