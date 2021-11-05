public class Veterinario {

    String nombre;
    double salario;

    public Veterinario(String nombre,String raza,double salario){
        setNombre(nombre);
        setSalario(salario);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Metodo
    public void vacuna(Animal animal){
        animal.setVacunado(true);
        System.out.println(animal.getNombre()+" esta vacunado");
    }
}
