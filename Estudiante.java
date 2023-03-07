public class Estudiante {
    int id;
    String Nombre;
    String Apellido;
    
    public Estudiante() {
    }

    public Estudiante(int id, String Nombre, String Apellido) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }   
    
}