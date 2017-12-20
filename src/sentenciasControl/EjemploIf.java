package sentenciasControl;

public class EjemploIf {

    public static void main(String[] args){

        int x = 10;

        if(x < 20){
            System.out.println("X es menor que 20\n");
        }


        x = 30;

        if(x < 20 ){
            System.out.println("X es menor que 20\n");
        }else{
            System.out.println("X es mayor que 20\n");
        }


        x = 21;

        if (x == 10) {
            System.out.print("X igual a 10\n");
        } else if (x == 20) {
            System.out.print("X igual a 20\n");
        } else if (x == 30) {
            System.out.print("X igual a 30\n");
        } else {
            System.out.print("X no es igual ni a 10, ni 20 ni 30\n");
        }


    }


}
