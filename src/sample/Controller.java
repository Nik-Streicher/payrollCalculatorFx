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
    private TextField field1;

    @FXML
    private TextField field2;

    @FXML
    private TextField field3;

    @FXML
    private TextField field4;

    @FXML
    private TextField field5;

    @FXML
    private TextField field6;

    @FXML
    private TextField field7;

    @FXML
    private TextField field8;

    @FXML
    private TextField field9;


    @FXML
    private TextField set1;

    @FXML
    private TextField set2;

    @FXML
    private TextField set3;

    @FXML
    private TextField set4;

    @FXML
    private TextField set5;

    @FXML
    private TextField set6;

    @FXML
    private TextField set7;

    // Save button method.

    @FXML
    void saveData(ActionEvent event) {
        SaveFile saveFile = new SaveFile(nameField.getText(), directoryField.getText());
        Tech tech = new Tech(new Calc(new Parameters()), Integer.parseInt(enterField.getText().replaceAll("\\s+", "")), yesButton.isSelected());
        statusField.setText(saveFile.write(tech.saveText()));
    }

    // Calculation button method.

    @FXML
    void calc(ActionEvent event) {
        Calc calc = new Calc(new Parameters());
        double wage = Double.parseDouble(enterField.getText().replaceAll("\\s+", ""));
        field1.setText(calc.superGrossWage(wage) + " Kč");
        field2.setText(calc.socialInsuranceEmployer(wage) + " Kč");
        field3.setText(calc.healthInsuranceEmployer(wage) + " Kč");
        field4.setText(calc.socialInsuranceEmployee(wage) + " Kč");
        field5.setText(calc.healthInsuranceEmployee(wage) + " Kč");
        field6.setText(calc.round(wage) + " Kč");
        field7.setText(calc.tax(wage) + " Kč");
        field8.setText(calc.afterDeductionOfDiscounts(wage, yesButton.isSelected()) + " Kč");
        field9.setText(calc.netWage(wage, yesButton.isSelected()) + " Kč");
    }

    //Save parameters button method.

    @FXML
    void saveParameters(ActionEvent event) {
        Parameters parameters = new Parameters();
        parameters.setTaxDiscount(Integer.parseInt(set1.getText().replaceAll("\\s+", "")));
        parameters.setSGW(Double.parseDouble(set2.getText().replaceAll("\\s+", "")));
        parameters.setISEmployer(Double.parseDouble(set3.getText().replaceAll("\\s+", "")));
        parameters.setHSEmployer(Double.parseDouble(set4.getText().replaceAll("\\s+", "")));
        parameters.setISEmployee(Double.parseDouble(set5.getText().replaceAll("\\s+", "")));
        parameters.setHSEmployee(Double.parseDouble(set6.getText().replaceAll("\\s+", "")));
        parameters.setTax(Double.parseDouble(set7.getText().replaceAll("\\s+", "")));
    }
}