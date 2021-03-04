
package writtingtofile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author user2
 */
public class WrittingToFile 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try {
        File myObj = new File("myFile.txt"); //creating file instance
        FileWriter filee = new FileWriter("Anelisiwe.txt"); //creating filewritter instance
        filee.write("hello world");// populating the text file
        filee.close();
        if (myObj.createNewFile())
        {
            System.out.println("File created: "+ myObj.getName());
            
        } 
        else 
        {
            System.out.println("File already exists.");
        }
        
        
        
        }
    catch (IOException e)
    {
        System.out.println("An error occured");
        e.printStackTrace();
    }
            {
            
            
        }
    }
    
}
