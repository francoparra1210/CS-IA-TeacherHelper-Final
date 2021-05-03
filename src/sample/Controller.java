package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public AnchorPane mainPane;
    public AnchorPane createClassPane;
    public AnchorPane studentHistoryPane;
    public AnchorPane enterClassPane;

    public TextField NewClassSectionTxtField;
    public TableView NewClassTableView;
    public TableColumn NewClassNameColumn;
    public TableColumn NewClassStudentID;


    //Main Screeen Code
    public void homeBtnAction(ActionEvent actionEvent) {
        mainPane.setVisible(true);
        createClassPane.setVisible(false);
        studentHistoryPane.setVisible(false);
        enterClassPane.setVisible(false);
    }
    public void CreateNewClassBtn(ActionEvent actionEvent) {
        mainPane.setVisible(false);
        createClassPane.setVisible(true);
    }
    public void EnterClassBtn(ActionEvent actionEvent) {
        mainPane.setVisible(false);
        enterClassPane.setVisible(true);
    }
    public void StudentHistoryBtn(ActionEvent actionEvent) {
        mainPane.setVisible(false);
        studentHistoryPane.setVisible(true);

    }

    //Create new Class code
    public void CreateNewClass(ActionEvent actionEvent) {
        mainPane.setVisible(false);
        createClassPane.setVisible(true);
    }
    public void AddNewStudentBtn(ActionEvent actionEvent) {
        //when clicked add a new item to the table which can be edited.
    }
    public void SaveClassBtn(ActionEvent actionEvent) {
        ////create a new object in the clases list. for each item in the list, add the students.
        //and with the name of the class...

        //remove all the contents from the current window. So it looks fresh ready to make a new class.
        //return to homepage.

    }

    //Enter Class Code
    public void IntranetBtn(ActionEvent actionEvent) {

        //send all the details to the internet
    }


    //Student History Code







}
