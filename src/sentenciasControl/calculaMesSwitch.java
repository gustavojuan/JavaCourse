package sentenciasControl;

public class calculaMesSwitch {

    public static void main(String[] args)
    {
        int month = 1;
        String station;


        switch (month){
            case 1: case 2: case 3:
                station = "Winter" ;
                break;
            case 4: case 5: case 6:
                station = "Spring" ;
                break;
            case 7: case 8: case 9:
                station = "Summer" ;
                break;
            case 10: case 11: case 12:
                station = "Autumm" ;
                break;
            default:
                station ="Invalid Month";

        }

        System.out.println("La estación para el mes "+month+" es: "+station);

    }
}
