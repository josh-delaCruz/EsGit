
import java.util.GregorianCalendar;


public class Prenotazione {
    private String nomeCliente;
    private String cognomeCliente;
    private int cameraPrenotata;
    private GregorianCalendar dataPrenotazione;
    private GregorianCalendar finePrenotazione;
    
    public Prenotazione(){
        nomeCliente="";
        cognomeCliente="";
        cameraPrenotata=1;
        
    }

    public Prenotazione(String nomeCliente, String cognomeCliente, int cameraPrenotata,GregorianCalendar dataPrenotazione, GregorianCalendar finePrenotazione) {
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
        this.cameraPrenotata = cameraPrenotata;
        this.dataPrenotazione= dataPrenotazione;
        this.finePrenotazione= finePrenotazione;
        
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCognomeCliente() {
        return cognomeCliente;
    }

    public int getCameraPrenotata() {
        return cameraPrenotata;
    }

    public GregorianCalendar getDataPrenotazione() {
        return dataPrenotazione;
    }

    public GregorianCalendar getFinePrenotazione() {
        return finePrenotazione;
    }
    
    
}
