import java.util.*;

class Niveau {
    String mur="#";
    String but=".";
    String caisse= "$";
    String pousseur="@";
    String joueurSurBut="+";
    String murSurBut="*";
    private int [][] tab;
    private String nom;
    
public Niveau(){
    tab= new int [40][40];
}
void fixeNom(String s){
    nom=s;
}
void videCase(int i, int j){
    tab[i][j]=0;
}
void ajouteMur(int i, int j){
    tab[i][j]=mur;
}
void ajoutePousseur(int i, int j){
    if(tab[i][j]==but){
        tab[i][j]=tab[i][j]+pousseur;
    }
}
void ajouteCaisse(int i, int j){
    if(tab[i][j]==but){
        tab[i][j]=tab[i][j]+caisse;
    }
}
void ajouteBut(int i, int j){
    tab[i][j]=but;
}
int lignes(){
    int i=0;
    while( tab[i] != null){
        i++;
    }

return i;    
}
int colonnes(){
    int i=0;
    while( tab[0][i] != 0){
        i++; 
    }  
    return i;
}
String nom(){
     return nom;
}
boolean estVide(int l, int c){
    if(tab[l][c]=0){
        return true;
    }
 return false;
}
boolean aMur(int l, int c){
    if(tab[l][c]== mur){
        return true;
    }
 return false;
   }

   boolean aBut(int l, int c){
    if(tab[l][c]== but){
        return true;
    }
 return false;
   }

   boolean aPousseur(int l, int c){
    if(joueursurBut){
        String s = tab[l][c] ;
        if(s.charAt(0) == but.charAt(0) && s.charAt(1) == pousseur.charAt(0)){
            return true;
        }
        return false;
    }
    if(tab[l][c]== pousseur ){
        return true;
    }
    return false;
   }
   boolean aCaisse(int l, int c){
    if(murSurBut){
        String s = tab[l][c] ;
        if(s.charAt(0) == but.charAt(0) && s.charAt(1) == caisse.charAt(0)){
            return true;
        }
        return false;
    }
    if(tab[l][c]== caisse ){
        return true;
    }
    return false;
   }
 public static void main(String[] args) {
       LecteurNiveaux lecteurNiveaux = new LecteurNiveaux("Original.txt");
       lecteurNiveaux.lisProchNiveau();
       lecteurNiveaux.lisProchNiveau();

   }
}
