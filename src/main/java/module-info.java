module projet.demo.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens projet.demo.demojavafx to javafx.fxml;
    exports projet.demo.demojavafx;
}