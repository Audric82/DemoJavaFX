module projet.demo.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens projet.demo.demojavafx to javafx.fxml;
    exports projet.demo.demojavafx;
    exports projet.demo.demojavafx.controller;
    opens projet.demo.demojavafx.controller to javafx.fxml;
}