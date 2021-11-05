public class Oso extends Animal {

    public Oso(String name, String raza, int age) {
        super(name,age);
    }
    @Override
    public void comer(){
        System.out.println(nombre+" come carne de un venado");
    }
    public void sonido(){
        System.out.println(nombre+" gruñido");
    }
}