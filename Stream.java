
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class Stream {
    
    public static void read() {
        FileInputStream myFile = null;
        try
        {
            myFile = new FileInputStream("files\\input.txt");
            BufferedReader reader = new BufferedReader( new InputStreamReader(myFile));
            
            String tmp;
            while ((tmp = reader.readLine()) != null)
            {
                System.out.println(tmp);
            }
            
            
            reader.close();
            myFile.close();
            
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            try {
                myFile.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static void write(){
        
        FileOutputStream myFile = null;
        String[] dataOutput = {"I like milk" , "Genadi" , "Spi mi se"};
        try{
            myFile = new FileOutputStream ("files\\output.gencho");
            
            BufferedWriter writer = new BufferedWriter (new OutputStreamWriter (myFile));
            
            for (int i = 0 ; i < dataOutput.length ; i++)
            {
                writer.write(dataOutput[i] );
                writer.newLine();
            }
            
            writer.flush();
            writer.close();
            myFile.close();
            
        }catch (Exception ex){
              ex.printStackTrace();
            
        }
    }
    
    public static void counter()
    {
        try {
            FileInputStream myFile = new FileInputStream("files\\counter.cnt");
            BufferedReader reader = new BufferedReader (new InputStreamReader (myFile));
            
            String tmp = reader.readLine();
            int count = reader.read();
            
            System.out.printf("We have used this application %d times.\n",count);
            count++;
            
            reader.close();
            myFile.close();
            
            FileOutputStream outFile = new FileOutputStream ("file\\counter.cnt");
            BufferedWriter writer = new BufferedWriter (new OutputStreamWriter (outFile));
            
            writer.write(String.format("%d" , ));
            
            writer.write (count);
            writer.close();
            outFile.close();
            
        } catch (Exception ex){
            ex.printStackTrace();
        
        }
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("On");
        counter();
        System.out.println("Done");
    }
    
}
