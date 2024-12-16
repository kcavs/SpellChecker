import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpellChecker
   {
      private String[] dictionary;
      
      // WRITE Your Methods HERE!
      public void print10(){
        for(int i=0;i<10;i++){
          System.out.println(dictionary[i]);
        }
      }
      public boolean spellCheck(String s){
        for(int i=0;i<dictionary.length; i++){
          if(s.equals(dictionary[i])){
            return true;
          }
        }
        return false;
      }
      public void printStartsWith(String s){
        int len=s.length();
        for(int i=0;i<dictionary.length;i++){
          String full=dictionary[i];
          String clip=full.substring(0,len);
          if(s.equals(clip)){
            System.out.println(full);
          }
        }
      }




      public SpellChecker() {
        try
        {
            dictionary = readLines("dictionary.txt");
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to access "+e.getMessage());              
        }
        
      }

      public static String[] readLines(String filename) throws IOException 
      {
        FileReader fileReader = new FileReader(filename);
         
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
         
        while ((line = bufferedReader.readLine()) != null) 
        {
            lines.add(line);
        }
         
        bufferedReader.close();
         
        return lines.toArray(new String[lines.size()]);
      }
      
    
   }