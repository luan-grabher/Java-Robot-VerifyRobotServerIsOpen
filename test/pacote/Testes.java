package pacote;

import java.util.Calendar;
import VerifyRobotServerIsOpen.VerifyRobotServerIsOpen;

public class Testes {

    public static void main(String[] args) {
        Calendar cal = VerifyRobotServerIsOpen.getCalendarLastModified();
        System.out.println("Diferença de: " + VerifyRobotServerIsOpen.diferencaHorario(cal));
    }
    
}
