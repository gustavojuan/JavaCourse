package sentenciasControl;

public class calculaMes {

    public static void main(String[] args)
    {
        int month = 1;
        String station;

        if(month == 1 || month ==2 || month==3) {
            station = "Winter";
        }else if (month==4 | month == 5 || month == 6){
            station = "Spring";
        }else if (month==7 | month == 8 || month == 9){
            station = "Summer";
        }else if (month==10 | month == 11 || month == 12){
            station = "Autumm";
        }else{
            station = "Unvalid month!";
        }


        System.out.println("La estación para el mes "+ month + " es: " + station);

    }
}
