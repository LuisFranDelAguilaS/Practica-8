public class Gatos extends Animal {

    public Gatos(String nombre,String raza ,int edad){
        super(nombre,edad);
    }


    //Metodos
    @Override
    public void comer(){
        System.out.println(nombre+"  esta comiendo comida para gato");
    }
    public void sonido(){
        System.out.println(nombre+" Maullido");
    }

}
