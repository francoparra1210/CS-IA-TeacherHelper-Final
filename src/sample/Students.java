package sample;

public class Students {
    private String SchoolCode;
    private String StudentsNames;
    private int FormYear;




    public Students(String schoolCode, String studentName,
                    int formYear)  {
        SchoolCode = schoolCode;
        StudentsNames = studentName;
        FormYear = formYear;
    }



    public String getSchoolCode() {
        return SchoolCode;
    }

    public void getSchoolCode(String schoolCode) {
        SchoolCode = schoolCode;
    }


    public String getStudentName()  {
        return StudentsNames;
    }
    public void setStudentName(String studentName) {
        StudentsNames = studentName;
    }


    public int getFormYear() {
        return FormYear;
    }

    public void setFormYear(int formYear) {
        FormYear = formYear;
    }
}
