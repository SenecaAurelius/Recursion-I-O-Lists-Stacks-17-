module com.example.javafx_ui_controls_and_multimedia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_ui_controls_and_multimedia to javafx.fxml;
    exports com.example.javafx_ui_controls_and_multimedia;
    exports com.example.javafx_ui_controls_and_multimedia.ch18;
    exports com.example.javafx_ui_controls_and_multimedia.ch19;
    exports com.example.javafx_ui_controls_and_multimedia.ch20;
}