/*
 * Realisation of Caesar's cipher with a 3 letter push encryption
 * using a class MyCipher and the result is writen to an outputfile
 *
 */

package encryptionWithStreams;

/**
 * @author Ivan
 */
public class Main 
{
    //Testing class
    public static void main(String[] args) 
    {
        //Creating an object of type MyCipher and we tell it we want to read from 'input.dec'
        //and write to 'output.enc'
        MyCipher c = new MyCipher ("input.dec" , "output.enc");
        
        //ideas how to fool around with the Cipher
        //it is quite flexible
      //c.write(c.encrypt("SOME RANDOM MESSAGE"));
        
      //c.setInput ("output.enc");
      //c.setOutput("input.dec");
      //c.write (c.decrypt(c.read()));
        
        System.out.println(c.read());
    
    }
}
