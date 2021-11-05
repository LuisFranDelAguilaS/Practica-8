import java.util.Scanner;

public class ClaseInicial {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
      int opcion=0;
        Zoo zoologico = new Zoo();
        do{
            System.out.println("------------Opciones que se pueden realizar-------- ");
            System.out.println("1- Añadir animal");
            System.out.println("2- Eliminar animal");
            System.out.println("3- Mostrar animales");
            System.out.println("4- Salir");
            System.out.println("Que opcion deseas?");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:{
                    zoologico.agregar();
                    break;
                }
                case 2:{
                    zoologico.eliminar();
                    break;
                }
                case 3:{
                    zoologico.mostrar();
                    break;
                }
            }

        }while(opcion!=4);

    }
}
