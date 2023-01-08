package sumdu.edu;

import sumdu.Student;
import sumdu.edu.ua.Subject;

public class Utils {
    public static String getTheBestSubject(Student[] student){
        float maxscore = 0;
        String subname = "";
        float temp[] = new float[5];
        for(Student st:student){
            Subject[] sub = st.getSubjects();
            for(int i = 0; i < sub.length; i++){
                temp[i] += (sub[i].getMark() / student.length);
                if(maxscore < temp[i]){
                    maxscore = temp[i];
                    subname = sub[i].getNameSubject();
                }
            }
        }

        return subname;
    }

    public static Student getTheBestStudent(Student[] student){
        float midleMarks[] = new float[5];
        float maxscoreMark = 0;
        Student bestStudent = new Student();

        for(Student studs:student){
            Subject[] subjects = studs.getSubjects();
            for(int i = 0; i < student.length; i++){
                midleMarks[i] += (subjects[i].getMark() / subjects.length);
                if(maxscoreMark < midleMarks[i]){
                    maxscoreMark = midleMarks[i];
                    bestStudent = studs;
                }
            }
        }
        return bestStudent;
    }
}
