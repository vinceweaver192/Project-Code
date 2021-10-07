

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MyController implements Initializable {
	
	@FXML
	private VBox vbox1;

	@FXML
    private MenuBar menubar1;

	@FXML
    private Menu file;

	@FXML
    private Menu edit;

	@FXML
    private Menu help;

	@FXML
    private SplitPane splitpane1;

	@FXML
    private Label userInfoText;

	@FXML
    private Label userFirstLastName;

	@FXML
    private Label userIdDisplay;

	@FXML
    private Label userVanIdDisplay;

	@FXML
    private ImageView divvyLogoImageView;

	@FXML
    private Label tempTextBoxDivvyLogo;

	@FXML
    private ListView taskListTable;

	@FXML
    private Label tempTextTaskTable;

	@FXML
    private AnchorPane Content;

	@FXML
    private Label tempTextMapView;

	@FXML
    private Label jobInfoTextLabel;

	@FXML
    private Label nextStopText;

	@FXML
    private Label currentBoxText;

	@FXML
    private Label currentScootersText;

	@FXML
    private Label stopsCompletedText;

	@FXML
    private Label stopsLeftText;

	@FXML
    private Label jobFunctionsLabel;

	@FXML
    private Button skipStopButton;

	@FXML
    private Button altRouteButton;

	@FXML
    private Button addBikeButton;

	@FXML
    private Button addScooterButton;

	@FXML
    private Button removeBikeButton;

	@FXML
    private Button removeScooterButton;

	@FXML
    private Button takeBreakButton;

	@FXML
    private Button resumeWorkButton;

	@FXML
    private Button markStopCompletedButton;

	@FXML
    private HBox HBox;

	@FXML
    private Label notificationsLabel;

	@FXML
    private Label topAlertNotification;

	@FXML
    private Label bottomAlertNotification;
    
    //static so each instance of controller can access to update 
    private static String textEntered = "";


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
        
	}
    //method so that the controller created for second view can update the text
    //field with the text from the first view
//    public void setMap(){
//        //content.setText(textEntered);
//        //content.getChildren()
//        System.out.println("hello from setText");
//    }
    
//    public void setText2(){
//        textField.setText(textEntered);
//        System.out.println("hello from setText");
//    }
	
	public void helloMethod(ActionEvent e) throws IOException {

        //textEntered = textField.getText(); //get text entered by user
        //System.out.println(textEntered);

        //get instance of the loader class
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/FXMLv2.fxml"));
        Parent root2 = loader.load(); //load view into parent
        MyController myctr = loader.getController();//get controller created by FXMLLoader
        //myctr.setText();//use MyLoader class method for setText()

        root2.getStylesheets().add("/styles/style2.css");//set style

        //root.getScene().setRoot(root2);//update scene graph


       	/* original way to load views...nothing shared across FXML files

         Parent root2 = FXMLLoader.load(getClass()
                 .getResource("/FXML/Myfxml2.fxml"));
        root2.getStylesheets().add("/styles/style2.css");

		 root.getScene().setRoot(root2);
       */


	}
	
//	public void b1Method(ActionEvent e) throws IOException{
//
//        textEntered = putText.getText();
//        System.out.println(textEntered);
//
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/FXMLv2.fxml"));
//        Parent root = loader.load();
//        MyController myctr = loader.getController();
//        myctr.setText2();
//        root2.getScene().setRoot(root);
//
//	}
	
	

}
