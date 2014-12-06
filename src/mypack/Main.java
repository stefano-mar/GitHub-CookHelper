package mypack;

import java.io.*;

public class Main {
	
	 public static void main(String[ ] args) throws IOException
     {
		 
           System.out.println("Hallo!\nWie heisst du?");
           
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

           try {
        	   
               System.out.println("Hallo, "+reader.readLine()+ "!");
               
           }
           catch(IOException e) {
        	   
               e.printStackTrace();
           }
           		 
           FileReader fr = new FileReader("speisen.txt");
           
           BufferedReader br = new BufferedReader(fr);

           String zeile = "";
           
           int zeilenNr = 0;
           
           while( (zeile = br.readLine()) != null )			// Bis zum Ende der Datei lesen
           {
        	   
        	   ++zeilenNr;
        	   
           }
           
           java.util.Random random = new java.util.Random();
    	   
    	   int zufallszahl = random.nextInt(zeilenNr-1);		// Zufallsfunktion
    	   
           if (zeile == null){								// Anzahl der Zeilen
        	   
        	   System.out.println("\nAnzahl Gerichte: " +zeilenNr);
        	   
        	   /*if (zufallszahl != 0){						
        		   
        		   System.out.println("\nZufällige Zahl zwischen 1 und " +zeilenNr+ ": " +zufallszahl+"\n");
        		   
        	   }*/
        		  
           }
           
           br.close();
           
           FileReader fr2 = new FileReader("speisen.txt");
           
           BufferedReader br2 = new BufferedReader(fr2);
           
           String zeile2 = "";
           
           int zeilenNr2 = 0;
           
           while( (zeile2 = br2.readLine()) != null )			// bis Zeile 6 und print
           {
        	   
             ++zeilenNr2;
             
              if((zeilenNr2) == zufallszahl+1)
            	  
			  {
				  
            	  System.out.println("\nHeute gibt es "+zeile2+"!\n");
				  
				  break;
			  }
           
             }
           
           br2.close();
           
     }
     
}