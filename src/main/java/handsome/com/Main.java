package handsome.com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
   @Override
   public void start(Stage primaryStage) {
       try {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("loginPage.fxml"));
           Parent root = loader.load();
           Scene scene = new Scene(root, 800, 600);
           
//  getting the css to use for the page
              scene.getStylesheets().add(getClass().getResource("loginPageStyle.css").toExternalForm());
           primaryStage.setScene(scene);
        //    primaryStage.setFullScreen(true);
           primaryStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   public static void main(String[] args) {
       launch(args);
   }
}
