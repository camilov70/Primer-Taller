public class Registro {
    
    public static void main (String args[]){
   
        Estudiante estu1 = new Estudiante();
        Estudiante estu2 = new Estudiante (1000380171, "Cristian Camilo","Velandia");
        
        estu1.setId(80176626);
        estu1.setNombre("Alejandro");
        estu1.setApellido("Avila Velandia");
        
        System.out.println(estu1.getNombre()+" es el primer estudiante en la lista");
        System.out.println("La id de " + estu1.getNombre() + " es: "+ estu1.getId());         
        System.out.println("El Apellido de  " + estu1.getNombre() + " es: "+ estu1.getApellido());
        
        
        System.out.println(estu2.getNombre()+" es el segundo estudiante en la lista");
        System.out.println("La id de " + estu2.getNombre() + " es: "+ estu2.getId());         
        System.out.println("El apellido de " + estu2.getNombre() + " es: "+ estu2.getApellido());
        
        estu2.setId(51826315);
        
        System.out.println(estu2.getNombre()+" Ha cambiado su id , el nuevo numero es: "+estu2.getId());
        
        //Herencia//
        Profesor profe1 = new Profesor();
        Profesor profe2 = new Profesor("Sociales","Tarde",79839932, "Andres", "Escobar Gaviria");
       
        profe1.setId(1001299182);
        profe1.setHorario("Matematicas");
        
        System.out.println("El id del profesor es : "+ profe1.getId()+ " y el asunto omitido es: "+profe1.getMateria());
        
        profe2.setNombre("Oscar Pardo");
        
        //Polimorfismo//
        estu2=profe1;     
    }
    
}
