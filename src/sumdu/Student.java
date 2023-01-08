package sumdu;

import sumdu.edu.ua.Subject;

public class Student {
    int id;
    static int nextId = 1;
    String name;
    String surname;
    String group;
    Subject[] subjects;

    public Student(){
        this.id = nextId++;
    }

    public Student(String name, String surname, String group) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.subjects = new Subject[5];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

//    public Subject[] getSubject() {
//        return subjects;
//    }
}
