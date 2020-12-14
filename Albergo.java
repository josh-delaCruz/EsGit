
import java.util.ArrayList;
import java.util.GregorianCalendar;



public class Albergo {
    private String nomeAlbergo;
    private ArrayList<Camera>camere;
    private ArrayList<Prenotazione>listaPrenotazioni;
    
    public Albergo(){
        nomeAlbergo="";
        camere= new ArrayList<>();
        listaPrenotazioni= new ArrayList<>();
    }
    
    public Albergo(String nomeAlbergo){
        this.nomeAlbergo=nomeAlbergo;
        camere= new ArrayList<>();
        listaPrenotazioni= new ArrayList<>();
    }
    
    //aggiungi camera
    public void addCamera(Camera nuova){
      camere.add(nuova);
    }
    
    //aggiungi prenotazione
    public void addPrenotazione (Prenotazione nuova){
        listaPrenotazioni.add(nuova);
    }
    
    //rimuovi camera usando il numero
    public boolean removeCamera(int numCamera){
        for(int i=0; i<camere.size(); i++){
            if(numCamera == camere.get(i+1).getNumCamera()){
                camere.remove(i+1);
                return true;
            }
        }
     return false;
    }
    
    //rimuovi prenotazione usando il numero
    public boolean removePrenotazione(int numCamera){
        return true;
    }
    
    //cambia lo stato della camera da libera a occupata
    public boolean setCameraOccupata(int numCamera){
        for(int i=0; i<camere.size(); i++){
            if(numCamera == camere.get(i).getNumCamera()){
                camere.get(i).setOccupata();
                return true;
            }
        }
      return false;
    }
    
    //stampa tutte le stanze dell'albergo
    public String stampaStanze(){
      String stanze="";
        for(int i=0; i<camere.size(); i++){
            stanze+="\n\nStanza n°: "+camere.get(i).getNumCamera();
            stanze+="\n"+camere.get(i).getTipologia();
            if(camere.get(i).getOccupata()== false){
                stanze+="\n Libera";
            }else{
                stanze+="\n Occupata";
            }
        }
        
      return stanze;
    }
    
    //cerca camere prenotate per quel giorno
    public String camerePrenotateGiorno(GregorianCalendar data){
       String cameraPren="";
        for(int i=0; i<listaPrenotazioni.size(); i++){
            if(data.equals(listaPrenotazioni.get(i).getDataPrenotazione())){
                cameraPren+="\n\nprenotato da: "+listaPrenotazioni.get(i).getNomeCliente();
                cameraPren+=" "+listaPrenotazioni.get(i).getCognomeCliente();
                cameraPren+="\nNumero camera: "+listaPrenotazioni.get(i).getCameraPrenotata();     
            }
        }
       return cameraPren;
    }
    
    //cerca camere libere
    public String camereLibere(){
      String libere="\nCamere Libere";
        for(int i=0; i<camere.size(); i++){
          if(camere.get(i).getOccupata()==false){  
            libere+="\n"+camere.get(i).getNumCamera();
          }  
        }
      return libere;  
      
      
    }
    
   
    
}
