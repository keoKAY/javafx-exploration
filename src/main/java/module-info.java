module handsome.com {
    requires javafx.controls;
    requires javafx.fxml;

    opens handsome.com to javafx.fxml;
    exports handsome.com;
}
