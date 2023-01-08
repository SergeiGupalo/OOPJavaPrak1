import sumdu.Student;
import sumdu.edu.Utils;
import sumdu.edu.ua.Subject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] studs = new Student[5];

        for(int i = 0; i < studs.length; i++){
            String name, sur, group;
            System.out.println("Enter name: ");
            name = sc.nextLine();
            System.out.println("Enter surname: ");
            sur = sc.nextLine();
            System.out.println("Enter group: ");
            group = sc.nextLine();
            studs[i] = new Student(name, sur, group);

            Subject subs[] = new Subject[5];
            for(int s = 0; s < subs.length; s++){
                subs[s] = new Subject(s);
                subs[s].setMark((float) (1 + Math.random() * (5 - 2)));
                subs[s].setPassed(subs[s].getMark() >= 2);
            }
            studs[i].setSubjects(subs);
        }
        for(Student stud:studs){
            System.out.println(stud.getId() + ": " + stud.getName() + " Scores: ");
            for(Subject sub:stud.getSubjects()){
                System.out.println(sub.getNameSubject() + " " + sub.getMark() + " - passed:" + sub.isPassed());
            }
        }
        System.out.println("The Best lesson: " + Utils.getTheBestSubject(studs));
        Student bestStudent = Utils.getTheBestStudent(studs);
        System.out.println("The Best student: " + bestStudent.getName());
    }
}