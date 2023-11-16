package handsome.com;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LoginController {
    // public LoginController() {
    //      Image image  = new Image("https://account.asus.com/img/login_img02.png"); 
    //         imageView.setImage(image);
    // }
    @FXML
    private ImageView imageView;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;

    @FXML
    private Button signupButton;

    @FXML
    private void handleLogin() {
        // Handle login functionality here
    }

    @FXML
    private void handleSignup() {
        // Handle signup functionality here
    }

    @FXML
    private void initialize() {
        // Image image  = new Image("https://account.asus.com/img/login_img02.png"); 
        // imageView.setImage(image);
    }

}
