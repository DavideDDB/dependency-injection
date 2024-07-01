package net.dav.dependency.injection.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Veicolo {

    private String targa;

    //_1_ FIELD INJECTION (@Autowired in corrispondenza del punto di injection)
    //@Autowired 
    //stiamo dicendo a spring che in corrispondenza del field privato Motore, mi devi iniettare un istanza di motore 
    //è spring ad affidare a motore (field privato di Veicolo) l'istanza di Motore (lato negativo non possiamo metterlo final)
    private Motore motore; // = new Motore("1234A");


    /*il problema è che abbiamo creato una forte dipendenza
     *della classe veicolo con la classe Motore, quindi se 
     *vorrò utilizzare la classe veicolo da un altra parte
     *avro anche sempre il Motore, ma potrei non volerlo, motivo
     *motivo per cui entra in gioco la DEPENDENCY INJECTION che ci
     *permette di disaccoppiare le altre classi
     */

    //_2_ CONSTRUCTOR INJECTION (@Autowired in corrispondenza del costruttore)
    //@Autowired        //lo mettiamo nel costurttore, se però andiamo a toglierlo, noteremo che funziona ugualmente per il fatto che questa classe ha UN SOLO costruttore parametrico
    //public Veicolo(Motore m) {
    //  this.motore = m;    
    //}

    public String getTarga(){
        return targa;
    }

    public void setTarga(String targa){
        this.targa = targa;
    }

    public Motore getMotore(){
        return motore;
    }

    //_3_SETTER INJECTION
    @Autowired
    //l'utilizzo dell'injection by setter è riservato alle situazioni in cui
    //abbiamo delle dipendenze OPZIONALI ovvero che possono essere spcificate
    //o meno (in questo esempio il motore è una dipendenza obbligatoria quindi 
    //dovrebbe essere gestito tramite costruttore) 
    public void setMotore(Motore motore){
        this.motore = motore;
    }

    
}
