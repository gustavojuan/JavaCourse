package cadenas;

public class ManejoCadenasBasico {

    public static void main(String[] args){

        String name = "Gus";
        String surname = "Juan";

        System.out.println("Concatenación:"+ name + surname);
        System.out.println("Nueva linea:\n"+ name +" "+  surname);
        System.out.println("Nueva Tabulacion:\t"+ name +" "+  surname);
        System.out.println("Nuevo Retroceso:\b"+ name +" "+  surname);
        System.out.println("Retorno de Carro:\r"+ name +" "+  surname);
        System.out.println("Nueva Comilla simple: \'"+ name +" "+  surname+"\'");
        System.out.println("Nueva Comilla doble: \""+ name +" "+  surname+"\"");


    }
}
