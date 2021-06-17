package nivell3;

public class Nivell3 {
    private static int hour = 0, minutes = 0, seconds = 0;
    public static void main(String[] args)  {
        try {
            while (true){
                System.out.println(Nivell3.escriureTemps(hour,minutes,seconds));
                seconds++;
                Nivell3.controlarTemps();
                Thread.sleep(1000);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String escriureTemps(int hora, int minuts, int segons){
        String horaText, minutsText, segonsText;
        horaText = Nivell3.escriureDigit(hora);
        minutsText = Nivell3.escriureDigit(minuts);
        segonsText = Nivell3.escriureDigit(segons);
        return horaText + ":" + minutsText + ":" + segonsText;
    }

    public static String escriureDigit(int digit){
        String digitText;
        if (digit < 10) digitText = String.format("%02d", digit);
        else digitText = String.valueOf(digit);
        return digitText;

    }

    public static void controlarTemps(){
        if (seconds > 59){
            minutes++;
            seconds = 0;
        }
        if (minutes > 59){
            hour++;
            minutes = 0;
        }
        if (hour > 23){
            hour = 0;
        }
    }
}