public class Perros extends Animal{

    public Perros(String nombre, String raza,int edad){
        super(nombre,edad);
    }


    //Metodos
    @Override
    public void comer(){
        System.out.println(nombre+" esta comiendo commida para perro");
    }
    public void sonido(){
        System.out.println(nombre+" Ladrido");
    }

}
