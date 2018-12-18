/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_45;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.wahaybi
 */
public class Wrtie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person person1 = new Person("Test1",47);
        Person person2 = new Person("Test2",50);
        
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("wahaybi.bin"))){
            
            os.writeObject(person1);
            os.writeObject(person2);
            os.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Can not found ");
        } catch (IOException ex) {
            System.out.println("Unable to Open file ");        }
    }
    
}
