
//Para practicar la encapsulación:
//
//Crear clase Persona.
//
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//
//Crear gets y sets de cada propiedad.
//
//Crear un objeto persona en el main.
//
//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.


public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setNombre("Alex");
        persona.setTelefono(123456789);

        System.out.println("El nombre de la persona es: " + persona.getNombre());
        System.out.println("La edad de la persona es: " + persona.getEdad());
        System.out.println("El telefono de la persona es: " + persona.getTelefono());
    }


}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;


    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getTelefono(){
        return telefono;
    }

}