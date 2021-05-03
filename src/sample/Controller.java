package sample;

import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public AnchorPane mainPane;
    public AnchorPane createClassPane;
    public AnchorPane studentHistoryPane;
    public AnchorPane enterClassPane;



    public void SaveBtn(ActionEvent actionEvent) {
    }


    //Main Screeen Code
    public void homeBtnAction(ActionEvent actionEvent) {
        mainPane.setVisible(true);
        createClassPane.setVisible(false);
        studentHistoryPane.setVisible(false);
        enterClassPane.setVisible(false);
    }

    //Create new Class code
    public void CreateNewClass(ActionEvent actionEvent) {
        mainPane.setVisible(false);
        createClassPane.setVisible(true);
    }
    public void AddNewStudentBtn(ActionEvent actionEvent) {
    }
    //Enter Class Code
    public void IntranetBtn(ActionEvent actionEvent) {
    }
}
