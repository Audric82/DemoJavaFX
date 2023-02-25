# Demo JavaFX
## _Appli en JavaFX en utilisant MVC_

L'appli se décompose en 3 parties (MVC)
- Model : Classes métier (du diagramme de classe par exemple)
- Controller : Controle les éléments de la vue pour interagir avec le Model
- Vue : Affiche les infos à l'utilisateur

## _Exemple (Vue/Model/Controller)_
- hello-view.fxml

```xml
<children>
    <Label fx:id="labLogin" text="Login" />
    <TextField fx:id="loginField" GridPane.columnIndex="1" />
    
    <Label fx:id="labPassword" text="Password" GridPane.rowIndex="1" />
    <PasswordField fx:id="passwordField" GridPane.columnIndex="1" GridPane.rowIndex="1" />
</children>

// Controller
<Button layoutX="119.0" layoutY="129.0" mnemonicParsing="false" onMouseClicked="#onLoginButtonClick" text="Login"/>

<Label fx:id="loginResult" layoutX="132.0" layoutY="180.0" textAlignment="CENTER" />
``` 

- HelloController.java

```java
    @FXML
    private TextField loginField;
    @FXML
    private TextField passwordField;
    @FXML
    private Label loginResult;
    
    @FXML
    protected void onLoginButtonClick() {
    
        if (!loginField.getText().isEmpty() && !passwordField.getText().isEmpty()) {
            // Model
            User loggedUser = new User(loginField.getText(), passwordField.getText());
            
            loginResult.setText("Vous êtes connecté! Bienvenue " + loggedUser.getLogin());
        }
    }
``` 
- User.java
```java
public class User {

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
``` 