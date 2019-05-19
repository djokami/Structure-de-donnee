import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;


class LecteurNiveaux {
    private BufferedReader fichier;
    int mur=0x23;
    int but=0x2e ;
    int caisse=0x24;
    int pousseur=0x40;
    int joueurSurBut=0x2b;
    int murSurBut=0x2a;
    int sol=0x20;
    public LecteurNiveaux (String nomFichier){
        try{
        InputStream flux= new FileInputStream(nomFichier);
        InputStreamReader lecture = new InputStreamReader(flux);
        this.fichier = new BufferedReader(lecture);
        }
        catch(Exception e){
            System.out.println("Erreur 1");
        }
    }
    public Niveau lisProchNiveau(){
        Niveau n = new Niveau();
       try{
        String ligne =fichier.readLine();
        int l = 0;
        int c = 0;
        while(ligne != null){
            while(c != ligne.length()){
                if(ligne.charAt(c) == pousseur){
                    n.aPousseur(l, c);
                }
                if(ligne.charAt(c) == but){
                    n.aBut(l, c);
                }
                if(ligne.charAt(c) == caisse){
                    n.aCaisse(l, c);
                }
                if(ligne.charAt(c) == mur){
                    n.aMur(l, c);
                }
                c++;
            }
            l++;
            c =0;

            
            if(ligne.charAt(0) == ';'){
                n.fixeNom(ligne);
            }
            if(ligne.length() == 0){
                break;
            }
            System.out.println(ligne);
            ligne=fichier.readLine();

        }
        if(ligne==null){
            fichier.close();
        }
        fichier.close();

    } catch(Exception e){
	e.printStackTrace();
        System.out.println("Erreur 2");
    }
        return n;
    }
}