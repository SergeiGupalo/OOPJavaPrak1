package sumdu.edu.ua;

public class Subject {
    private String[] nameSubjects = {"Math", "Art", "History", "Music", "IT"};
    private String nameSubject;
    private float mark;
    private boolean passed;

    public Subject(int i){
        this.nameSubject = nameSubjects[i];
    }

    public Subject(String nameSubject, float mark, boolean passed) {
        this.nameSubject = nameSubject;
        this.mark = mark;
        this.passed = passed;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
