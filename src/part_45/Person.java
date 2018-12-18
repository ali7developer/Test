/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_45;

import java.io.Serializable;

/**
 *
 * @author ali.wahaybi
 */
public class Person implements Serializable {
    private String name; 
    private int id ; 

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "The PErson name is : " + name + " and his id: " + id;
    }
    
    
}
