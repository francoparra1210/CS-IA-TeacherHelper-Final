package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.time.Year;
import java.util.Optional;

public class Controller {
    public AnchorPane mainPane;
    public AnchorPane createClassPane;
    public AnchorPane studentHistoryPane;
    public AnchorPane enterClassPane;

    public TextField NewClassSectionTxtField;
    public TableView NewClassTableView;
    public TableColumn NewClassNameColumn;
    public TableColumn NewClassStudentID;
    public ObservableList<Student> Form1A = FXCollections.observableArrayList();
    public ComboBox ClassComboBox;
    public ChoiceBox YearChoiceBox;
    public ChoiceBox SectionChoiceBox;

    public void initialize(){
        NewClassTableView.setEditable(true);

        YearChoiceBox.getItems().addAll("Form",1,2,3,4,5,6);
        YearChoiceBox.getSelectionModel().select(0);
        SectionChoiceBox.getItems().addAll("Section","A","B","C","D");
        SectionChoiceBox.getSelectionModel().select(0);
        Form1A.add(new Student("20091283", "Tom", 5, "B"));
        Form1A.add(new Student("43589437", "Matt", 5, "B"));

        NewClassNameColumn.setCellValueFactory(
                new PropertyValueFactory<Student,String>("studentName")
        );
        NewClassStudentID.setCellValueFactory(
                new PropertyValueFactory<Student,String>("studentID")
        );
        NewClassTableView.setItems(Form1A);

        NewClassNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        NewClassNameColumn.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Student, String>>() {
                    @Override //this overrides the default method "handle" to do what we want it to do.
                    public void handle(TableColumn.CellEditEvent<Student, String> t) {
                        ((Student) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setStudentName(t.getNewValue());
                    }
                }
        );
        NewClassStudentID.setCellFactory(TextFieldTableCell.forTableColumn());
        NewClassStudentID.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Student, String>>() {
                    @Override //this overrides the default method "handle" to do what we want it to do.
                    public void handle(TableColumn.CellEditEvent<Student, String> t) {
                        ((Student) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setStudentID(t.getNewValue());
                    }
                }
        );

    }
    //Main Screen Code
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
        if(!YearChoiceBox.getSelectionModel().isEmpty() && !SectionChoiceBox.getSelectionModel().isEmpty()) {
            Dialog<Student> dialog = new Dialog<>();
            dialog.setTitle("Add new student");
            DialogPane dialogPane = dialog.getDialogPane();
            dialogPane.getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
            Label nameLabel = new Label("Student name:");
            TextField nameTextField = new TextField("");
            Label IDLabel = new Label("Student ID:");
            TextField idTextField = new TextField("");

            dialogPane.setContent(new VBox(8, nameLabel, nameTextField, IDLabel, idTextField));
            Platform.runLater(nameTextField::requestFocus);
            final Button btOk = (Button) dialog.getDialogPane().lookupButton(ButtonType.OK);
            btOk.addEventFilter(
                    ActionEvent.ACTION,
                    event -> {
                        if (!nameTextField.getText().equals("") && !idTextField.getText().equals("")) {
                            Form1A.add(new Student(idTextField.getText(), nameTextField.getText(),
                                    Integer.parseInt(YearChoiceBox.getSelectionModel().getSelectedItem().toString()),
                                    SectionChoiceBox.getSelectionModel().getSelectedItem().toString()));
                        } else {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Incorrect input");
                            alert.setHeaderText(null);
                            alert.setContentText("Please enter the student name and ID");
                            alert.showAndWait();
                            event.consume();
                        }

                    });
            Optional<Student> optionalResult = dialog.showAndWait();
        }
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
    public void StudentHistory(ActionEvent actionEvent) {
        mainPane.setVisible(false);
        studentHistoryPane.setVisible(true);
    }

        
    }










