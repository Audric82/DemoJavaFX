package projet.demo.demojavafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import projet.demo.demojavafx.model.User;

public class UserController {

    @FXML
    private TextField loginField;

    @FXML
    private TextField passwordField;

    @FXML
    private Label loginResult;

    @FXML
    protected void onLoginButtonClick() {

        if (!loginField.getText().isEmpty() && !passwordField.getText().isEmpty()) {

            User loggedUser = new User(loginField.getText(), passwordField.getText());
            loginResult.setText("Vous êtes connecté! Bienvenue " + loggedUser.getLogin());
        }
    }
}