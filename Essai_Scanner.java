import java.util.*;
//import java.IOException.*;
import java.util.NoSuchElementException;

class Essai_Scanner{
     public static void main(String[] args) {
         int p = 0;
         boolean bol = false;
         Scanner my_scanner = new Scanner(System.in);
         
         while(!bol){
            System.out.println("Saissisez un Entier!!!");
            try{
                p=my_scanner.nextInt();
               bol=true;
                System.out.println("L'entier Saissis est: " + p);
               // break;..
             }
            /* catch(InputMismatchException e1){
                 System.out.println("*****Aucune Nombre Choisis******");
                 //break; 
             }*/
             catch(NoSuchElementException e2 ){
                 System.out.println("Saissir à nouveau");
                 
             }
             finally{
                System.out.println("Finally Execute!!!");
    
             }
            
         }
       
      
    }
}