/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pract_6;

/**
 *
 * @author Zero
 */
import java.io.*;
import java.util.ArrayList;

public class Pract_6 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Manager man = null;
        ArrayList<Employee> emplist = new ArrayList<Employee>();
        ArrayList<Manager> managlist = new ArrayList<Manager>();

        //---------  Зчитування Manager
        BufferedReader reader = new BufferedReader(new FileReader("inputManager.txt"));
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
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        //---------  Зчитування Employee
        BufferedReader readers = new BufferedReader(new FileReader("inputEmployeers.txt"));
        try {
            String s;
            ArrayList<String> input = new ArrayList<String>();
            while ((s = readers.readLine()) != null) {
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
        } finally {
            if (readers != null) {
                readers.close();
            }
        }
        //   Serializable Employeers
        FileOutputStream fos = new FileOutputStream("Employeers.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Employee emplo : emplist) {
            oos.writeObject(emplo);
            System.out.println(emplo.toString());
            oos.flush();
        }
        oos.close();

        //  deserealisation Employeers
        FileInputStream fis = new FileInputStream("Employeers.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        for (int i = 0; i < emplist.size(); i++) {
            Employee m1 = (Employee) ois.readObject();
            System.out.println(m1.toString());
        }

        //   Serializable Manager
        FileOutputStream mana = new FileOutputStream("Manager.txt");
        ObjectOutputStream out = new ObjectOutputStream(mana);

        for (Manager manag : managlist) {
            out.writeObject(manag);
            System.out.println(manag.toString());
            out.flush();
        }
        out.close();

        //  deserealisation Manager
        FileInputStream intro = new FileInputStream("Manager.txt");
        ObjectInputStream ort = new ObjectInputStream(intro);
        for (int i = 0; i < managlist.size(); i++) {
            Manager m1 = (Manager) ort.readObject();
            System.out.println(m1.toString());
        }
    }
}
