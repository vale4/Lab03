package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblChooseTheLanguage;

    @FXML
    private ComboBox<String> boxLanguages;

    @FXML
    private TextArea txtWords;

    @FXML
    private Button btnSpellCheck;

    @FXML
    private Label lblWrongWords;

    @FXML
    private TextArea txtWrongWords;

    @FXML
    private Label lblErrors;

    @FXML
    private Button btnClearText;

    @FXML
    private Label lblTime;

    @FXML
    void doClearText(ActionEvent event) {
    	txtWords.clear();
    	txtWrongWords.clear();
    	lblErrors.setText("Numero di Errori: ");
    	lblTime.setText("Tempo di elaborazione: ");

    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert lblChooseTheLanguage != null : "fx:id=\"lblChooseTheLanguage\" was not injected: check your FXML file 'Scene.fxml'.";
        assert boxLanguages != null : "fx:id=\"boxLanguages\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtWords != null : "fx:id=\"txtWords\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnSpellCheck != null : "fx:id=\"btnSpellCheck\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblWrongWords != null : "fx:id=\"lblWrongWords\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtWrongWords != null : "fx:id=\"txtWrongWords\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblErrors != null : "fx:id=\"lblErrors\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClearText != null : "fx:id=\"btnClearText\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblTime != null : "fx:id=\"lblTime\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
