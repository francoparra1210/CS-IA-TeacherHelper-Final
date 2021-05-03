package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Section {
    ObservableList<Student> students = FXCollections.observableArrayList();

    //sections is the same aclass. hereI have called it sections so it doesn't mess with the class keyword.

    String name;

    public Section(String name, ObservableList<Student> students){
        this.name = name;
        this.students = students;
    }


    public ObservableList<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }



}
