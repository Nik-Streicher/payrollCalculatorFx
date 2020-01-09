package sample;

import Save.SaveFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import Tech.*;

public class Controller {

    @FXML
    private TextField nameField;

    @FXML
    private TextField directoryField;

    @FXML
    private RadioButton yesButton;

    @FXML
    private TextField enterField;

    @FXML
    private TextField statusField;


    @FXML
    void SaveData(ActionEvent event) {
        SaveFile saveFile = new SaveFile(nameField.getText(), directoryField.getText());

            Tech tech = new Tech(new Calc(new Parameters()),Integer.parseInt(enterField.getText()),yesButton.isSelected());
            statusField.setText(saveFile.write(tech.saveText()));
    }

    @FXML
    void vypociteMzdu(ActionEvent event) {

    }
}