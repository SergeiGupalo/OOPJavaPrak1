/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pract_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zero
 */
public class Controller {
    static Manager man = null;
    static ArrayList<Employee> emplist = new ArrayList<Employee>();
    static ArrayList<Manager> managlist = new ArrayList<Manager>();
    public static String init(File file) throws IOException{
        

        //---------  Зчитування Manager
        BufferedReader reader = null;
        try {
                reader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            String s;
            ArrayList<String> input = new ArrayList<String>();
            while ((s = reader.readLine()) != null) {
                input.add(s);
            }
            for (int i = 0; i < input.size(); i++) {
                String name = input.get(i);
                i++;
                String surname = input.get(i);
                i++;
                double sal = Double.parseDouble(input.get(i));
                i++;
                double bonus = Double.parseDouble(input.get(i));
                i++;
                man = new Manager(name, surname, sal, null, bonus);
                boolean add = managlist.add(man);
            }
        }
        catch(Exception e){}
            String out = "";
            for (Manager m : managlist) {
                System.out.println(m.toString());
                out += m.toString();
            }
            return out;
            
            
        //---------  Зчитування Employee
        
    }
    public static String inits(File file) throws IOException{
        BufferedReader reader = null;
        try {
                reader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            String s;
            ArrayList<String> input = new ArrayList<String>();
            while ((s = reader.readLine()) != null) {
                input.add(s);
            }
            for (int i = 0; i < input.size(); i++) {
                String name = input.get(i);
                i++;
                String surname = input.get(i);
                i++;
                double sal = Double.parseDouble(input.get(i));
                i++;
                String mas = input.get(i);
                Manager m = null;
                if (mas != null) {
                    m = managlist.get(Integer.parseInt(mas));
                }
                i++;
                double bonus = Double.parseDouble(input.get(i));
                i++;
                man = new Manager(name, surname, sal, m, bonus);
                boolean add = emplist.add(man);
            }
        }
        catch(Exception e){}
            String outs = "";
            for (Employee m : emplist) {
                System.out.println(m.toString());
                outs += m.toString();
            }
            return outs;
            
    }
    
    // Serialization Manager List
    public static void serialization(String fileNameSerialization, ArrayList<Employee> emplist, ArrayList<Manager> managlist) throws IOException {
        FileOutputStream mana = new FileOutputStream(fileNameSerialization);
        ObjectOutputStream out = new ObjectOutputStream(mana);

        for (Manager manag : managlist) {
            out.writeObject(manag);
            System.out.println(manag.toString());
            out.flush();
        }
        out.close();
    }
    
    //Deserialization Manager List
    public static void deserialization(String fileNameDeserialization, ArrayList<Employee> emplist, ArrayList<Manager> managlist) throws IOException, ClassNotFoundException {
        FileInputStream intro = new FileInputStream(fileNameDeserialization);
        ObjectInputStream ort = new ObjectInputStream(intro);
        for (int i = 0; i < managlist.size(); i++) {
            Manager m1 = (Manager) ort.readObject();
            System.out.println(m1.toString());
        }
    }
    
    // Serialization Employee List
    public static void serializationEmployee(String fileNameSerialization, ArrayList<Employee> emplist, ArrayList<Manager> managlist) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileNameSerialization);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Employee emplo : emplist) {
            oos.writeObject(emplo);
            System.out.println(emplo.toString());
            oos.flush();
        }
        oos.close();
    }
    
    //Deserialization Employee List
    public static void deserializationEmployee(String fileNameDeserialization, ArrayList<Employee> emplist, ArrayList<Manager> managlist) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileNameDeserialization);
        ObjectInputStream ois = new ObjectInputStream(fis);
        for (int i = 0; i < emplist.size(); i++) {
            Employee m1 = (Employee) ois.readObject();
            System.out.println(m1.toString());
        }
    }
}
