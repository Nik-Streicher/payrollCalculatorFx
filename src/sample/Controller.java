package sample;

import Save.SaveFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import Tech.*;


public class Controller {

    @FXML
    private TextField NameLabel;

    @FXML
    private TextField DirectoryLabel;

    @FXML
    private TextField EnterLabel;

    @FXML
    private TextField OutLabel;

    @FXML
    private TextField OutLabel1;

    @FXML
    private TextField OutLabel2;

    @FXML
    private TextField OutLabel3;

    @FXML
    private RadioButton YesButton;


    @FXML
    private RadioButton NoButton;


    @FXML
    void SaveData(ActionEvent event) {
        SaveFile saveFile = new SaveFile(NameLabel.getText(), DirectoryLabel.getText());

            Tech tech = new Tech(new Calc(new Parameters()),74,YesButton.isSelected());
            OutLabel3.setText(saveFile.write(tech.saveText()));
    }

    @FXML
    void vypociteMzdu(ActionEvent event) {

    }
}