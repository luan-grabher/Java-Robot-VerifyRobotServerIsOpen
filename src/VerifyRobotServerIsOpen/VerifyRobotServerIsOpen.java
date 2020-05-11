package VerifyRobotServerIsOpen;

import java.io.File;
import java.util.Calendar;

public class VerifyRobotServerIsOpen {
    
    private static String pathLastUpDate = "\\\\zac\\robos\\Servidor\\ultima_att.txt";

    public static void main(String[] args) {
        Calendar lastModified = getCalendarLastModified();
        
        //Se diferença aior que 10 minutos
        if(diferencaHorario(lastModified) > 600000){
            fecharServidor();
        }
    }
    
    public static Calendar getCalendarLastModified(){
        Calendar cal = Calendar.getInstance();
        File arquivo = new File(pathLastUpDate);
        if(arquivo.exists()){
            cal.setTimeInMillis(arquivo.lastModified());
        }
        
        return cal;
    }
    
    public static long diferencaHorario(Calendar cal){
        Calendar now = Calendar.getInstance();
        
        return now.getTimeInMillis() - cal.getTimeInMillis();
    }
    
    public static void fecharServidor() {
        cmd.cmd.execute_script("taskkill /IM javaServer.exe");
    }

}
