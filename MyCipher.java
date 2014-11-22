/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encryptionWithStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Ivan
 */
public class MyCipher 
{
    private String input;       //The name of the file from which we are going to read.
    private String output;      //The name of the file in which we are going to write.
                                //The reason we are using strings varuables is because in the future
                                //we might want to read/write in different files.
    
    public MyCipher (String input , String output) 
    {                           //Basic constructor. Here initialize the object.
        this.input  = input;
        this.output = output;
    }
    
    public void setInput (String input)
    {
        if (input != null) this.input = input;
    }
    public void setOutput (String output)
    {
        if (output != null) this.output = output;
    }
    
    //This is the method with which we are going to write a given string (text) in the file whose name is in output.
    public void write (String text)
    {
        FileOutputStream out = null;
        System.out.println("Writing to file...");  //We print this line for conviniece. To make sure 
                                                   //that the program is running
        try{
            out = new FileOutputStream (output);   //We create an object of type FileOutputStream 
            BufferedWriter writer = new BufferedWriter (new OutputStreamWriter (out));
          
            writer.write(text);
            writer.newLine();
          //System.lineSeparator();              for Java 1.7 and up
          //System.getProperty("line_separator") for Jave 1.6 and below
          //Sidenote : Currently we are using Java 1.8      
          
          // !!! writer.write(text[i] + "\r\n"); -> Bad practice. DOES NOT ENSURE PLATFORM INDEPENDANCE
            
            writer.flush();                         //Clear buffer.
            writer.close();                         //We close the writer in order to ensure that all the writen infromation
                                                    //is saved properly on the file.
            out.close();                            //Close the stream. The order in which we close the objects is of importance.
            
        }catch (java.io.IOException ex)
        {
            ex.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (java.io.IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Done.");
    }
    
    //reads from input file
    public String read ()
    {
        String result = "";
        FileInputStream myFile = null;
        try {
            myFile = new FileInputStream(input);
            BufferedReader in = new BufferedReader (new InputStreamReader(myFile));
            String tmp;
            
            while ((tmp = in.readLine()) != null)    //We read line by line. We request the following line and store it
                                                     //on the string tmp where we can do what ever we want
            {
                result += tmp;                       //SIDENOTE : += appends the tmp string to result
                result += "\n";                      //Example : "I am" += " awesome" => "I am awesome"
            }
            
            in.close();                              //IMPORTANT : Always close the stream to ensure no errors occure.
            myFile.close();
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }
        
        return result;                              //We return the text for the file
    }
    public String encrypt (String inputTxt)         //Basic encryption function (Caesar's cypher)
    {                                               //Shifts the letter by 3
                                                    //Ex : 'A' -> 'D'
                                                    //     'B' -> 'E'
                                                    //     'C' -> 'F'
        
        String outputTxt = "";                      //We create the resulting string and set it to an empty string                      
        char[] inputTxtArr = null;                  //In order to manipulate more easy the separate letters more easily
                
        inputTxtArr = inputTxt.toCharArray();       //we convert the string to an array of chars (see ASCII table)
              
        for (char l : inputTxtArr)                  //We go through each letter of the array
        {
                if (l == ' ')                       //if the letter is ' ' (space) we want it to stay the same in the resulting string
                {
                    outputTxt += l;                 //so we just add it as it is
                }
                else
                {                                   //otherwise we convert the letter using this formula
                    outputTxt += (char)((l + 3 - 'A') % 26 + 'A');
                }
        }
        return outputTxt;                           //we return the resulting string
    }
    public String decrypt (String inputTxt)
    {
        String outputTxt = "";                      //same technique
        char[] inputTxtArr = null;
        
        inputTxtArr = inputTxt.toCharArray();
              
        for (char l : inputTxtArr)
        {
            if (l == ' ')
            {
                outputTxt += ' ';
            }
            else
            {                                       //We only modify the formula abit so it knows decrypts 
                outputTxt += (char)((l - 3 - 'A' + 26) % 26 + 'A');
            }
        }
        return outputTxt;
    }
}
