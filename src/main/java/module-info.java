module com.jw.jw {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jw.jw to javafx.fxml;
    exports com.jw.jw;
}