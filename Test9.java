
import java.util.GregorianCalendar;

public class Test9 {

    
    
    public static void main(String[] args) {
        
       boolean cameraRimossa;
       boolean cambiaStato; //cambia lo stato 
       String cameraPrenotata; 
       
       //crezione stanza
       Camera room1= new Camera(1, "singola");
       Camera room2= new Camera(2, "matrimoniale con bagno");
       Camera room3= new Camera(3, "singola");
       Camera room4= new Camera(4, "matrimoniale con bagno");
       Camera room5= new Camera(5, "doppia senza bagno");
       Camera room6= new Camera(6, "singola", false);
       Camera room7= new Camera(7, "doppia senza bagno");
       Camera room8= new Camera(8, "singola");
       
       //aggiunta stanze all'albergo
       Albergo albergo1= new Albergo("Albero bello");
       albergo1.addCamera(room1);
       albergo1.addCamera(room2);
       albergo1.addCamera(room3);
       albergo1.addCamera(room4);
       albergo1.addCamera(room5);
       albergo1.addCamera(room6);
       albergo1.addCamera(room7);
       albergo1.addCamera(room8);
       
       //stampa tutte le stanza dell'albergo
       System.out.println(albergo1.stampaStanze());
      
       //rimozione camera
       cameraRimossa=albergo1.removeCamera(7);
        
       if(cameraRimossa){ //controllo rimozione avvenuta
           System.out.println("\nStanza rimossa");
       }else{
           System.out.println("\nStanza non presente"); 
       }
       
       
       System.out.println(albergo1.stampaStanze());
       
       
       //date prenotazione 1
       GregorianCalendar dataPrenotazione1= new GregorianCalendar(2020, 12, 6);
       GregorianCalendar finePrenotazione1= new GregorianCalendar(2021, 1, 3);
       
       //prenotazione 1
       Prenotazione prenotazione1= new Prenotazione("Franco", "Debole", 8, dataPrenotazione1, finePrenotazione1);
       albergo1.addPrenotazione(prenotazione1);
       
       
       
       //date prenotazione 2
       GregorianCalendar dataPrenotazione2= new GregorianCalendar(2021, 3, 8);
       GregorianCalendar finePrenotazione2= new GregorianCalendar(2021, 5, 7);
       
       //prenotazione2
       Prenotazione prenotazione2= new Prenotazione("Eriberta", "Berta", 3, dataPrenotazione2, finePrenotazione2);
       albergo1.addPrenotazione(prenotazione2);
       
       cambiaStato=albergo1.setCameraOccupata(8);
       if(cambiaStato){
           System.out.println("\nOra la camera è occupata");
       }
        System.out.println(albergo1.stampaStanze());
   
        
        //data da confrontare
        GregorianCalendar data= new GregorianCalendar(2021, 3, 8);
        cameraPrenotata=albergo1.camerePrenotateGiorno(data);
        System.out.println(cameraPrenotata);
        
        //lista camere libere
        System.out.println("\n\n"+albergo1.camereLibere());
    }
    
    
    
}
