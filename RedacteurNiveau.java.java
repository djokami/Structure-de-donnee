import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.outputStream;
import java.io.OutputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class RedacteurNiveau {
    public BufferedWriter fichier;
    int mur=0x23;
    int but=0x2e ;
    int caisse=0x24;
    int pousseur=0x40;
    int joueurSurBut=0x2b;
    int murSurBut=0x2a;
    int sol=0x20;


    public RedacteurNiveau(String nomFichier){
        try{
            OutputStream flux= new FileOutputStream(nomFichier);
            OutputStreamWriter writ = new OutputStreamWriter(flux);
            this.fichier= new BufferedWriter(writ);
        }
        catch(Exception e){
            System.out.println("Erreur d'écriture de fichier.");
        }

    }    
public Niveau ecrisNiveau(){
    Niveau n = new Niveau();
    try{
        String linge = fichier.writeLine();
        int l=0;
        int c=0;
    }catch(Exception e){
        System.out.println("Erreur");

    }

    return n;
}



}
