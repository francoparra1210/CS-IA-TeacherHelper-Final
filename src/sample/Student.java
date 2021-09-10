package sample;

public class Student {
    private String studentID;
    private String studentName;
    private int formYear;
    private String section;

    //strings used to search for students in different sections, years and with their name and student ID
    public Student(String studentID, String studentName, int formYear, String section) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.formYear = formYear;
        this.section = section;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getFormYear() {
        return formYear;
    }

    public void setFormYear(int formYear) {
        this.formYear = formYear;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
