/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_45;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.wahaybi
 */
public class Read {
    public static void main(String []args){
        
        try(FileInputStream fi = new FileInputStream("wahaybi.bin")){
            ObjectInputStream os = new ObjectInputStream(fi);
            Person test = (Person) os.readObject();
            
            System.out.println(test);
            os.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to locate File ");
        } catch (IOException ex) {
            System.out.println("Unable to Open it ");        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
