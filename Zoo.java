import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Animal> animales=new ArrayList<>();

    public void agregar(){
        int opcion=0;
        do{
            System.out.println("Opciones:");

            System.out.println("1- Perro");
            System.out.println("2- Gato");
            System.out.println("3- Aguila");
            System.out.println("4- Oso");
            System.out.println("Que opcion deseas?");
            opcion = sc.nextInt();
            Animal animal=null;
            switch(opcion){
                case 1:{
                    animal=new Perros(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarCadena("Raza"), CapturaEntrada.capturarEntero("Edad"));
                    animales.add(animal);
                    break;

                }
                case 2:{
                    animal=new Gatos(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarCadena("Raza"), CapturaEntrada.capturarEntero("Edad"));
                    animales.add(animal);
                    break;
                }
                case 3:{
                    animal=new Aguila(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarCadena("Raza"), CapturaEntrada.capturarEntero("Edad"));
                    animales.add(animal);
                    break;
                }
                case 4:{
                    animal=new Oso(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarCadena("Raza"), CapturaEntrada.capturarEntero("Edad"));
                    animales.add(animal);
                    break;
                }

            }
        }while(opcion!=5);
    }

    public void mostrar(){
        for(Animal animal: animales){
            animal.comer();
            animal.dormir();
            if(animal instanceof Perros ){
                ((Perros) animal).sonido();
            }
            else if(animal instanceof Gatos ){
                ((Gatos) animal).sonido();
            }
            else if(animal instanceof Oso ){
                ((Oso) animal).sonido();
            }
            else if(animal instanceof Aguila ){
                ((Aguila) animal).sonido();
            }
        }
    }
    public void eliminar(){
        int i = 0;
        int numEliminar;

        for(Animal a: animales){

            System.out.println("Numero del animal: " + i);
            System.out.print(a.nombre+ "\n");
            i++;
        }
        numEliminar= CapturaEntrada.capturarEntero("Cual numero de animal desea eliminar?  (a partir del 0)");
        animales.remove((numEliminar));
        System.out.println("Animal borrado");
    }
}