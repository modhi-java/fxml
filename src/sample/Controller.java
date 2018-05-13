package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField txt_num1;

    @FXML
    public TextField txt_num2;

    @FXML
    public TextField txt_sum;

    @FXML
    public void sum(){
        Integer x = Integer.parseInt(txt_num1.getText()) + Integer.parseInt(txt_num2.getText());
        txt_sum.setText(x.toString());
    }


}
