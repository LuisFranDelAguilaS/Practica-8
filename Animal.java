public class Animal {
    int edad;
    String nombre;
    boolean vacunado;

    public Animal(String nombre,int edad ){
        setNombre(nombre);
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //Metodos

    public void comer(){
        System.out.println(nombre+"  esta comiendo");
    }

    public void dormir (){
        System.out.println(nombre+" esta durmiendo");
    }

    public void sonido(){
        System.out.println("SONIDOOOO");
    }

    public void setVacunado(boolean vacunado){
        this.vacunado = vacunado;
    }
}
