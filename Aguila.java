public class Aguila extends Animal {

    public Aguila(String name, String raza, int age) {
        super(name,age);
    }
    @Override
    public void comer(){
        System.out.println(nombre+" come carne de un conejo");
    }
    public void sonido(){
        System.out.println(nombre+" Chillido");
    }
}