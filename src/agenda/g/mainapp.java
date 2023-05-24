/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package agenda.g;

import agenda.model.person;
import agenda.vista.PersonOverviewController;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author lourdes
 */
		
public class mainapp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private Object e;
    
   
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("agenda.g");
        
        initRooTLayout();
        
        showPersonOverview();
        
    }
    
    public void initRootLayout(){
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(mainapp.class.getResource("view/RootLayout.fxml"));
                rootLayout = (BorderPane) loader.load();
                
                Scene scene = new Scene (rootLayout);
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
               
            }
        }
    
    /**
     *
     */
    public void showPersonOverview(){
        try {
           
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(mainapp.class.getResource("view/PersonOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            
           
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
        public Stage getPrimaryStage() {
		return primaryStage;
	}

    public static void main(String[] args) {
        launch(args);
    }

    private void initRooTLayout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private  ObservableList <person> personData = FXCollections.observableArrayList();
    
    public mainapp(){
        
        personData.add(new person("Lourdes", "Maquera"));
		personData.add(new person("Ruth", "Mueller"));
		personData.add(new person("Heinz", "Kurz"));
		personData.add(new person("Cornelia", "Meier"));
		personData.add(new person("Werner", "Meyer"));
		personData.add(new person("Lydia", "Kunz"));
		personData.add(new person("Anna", "Best"));
		personData.add(new person("Stefan", "Meier"));
		personData.add(new person("Martin", "Mueller"));
	}
    public ObservableList<person> getPersonData() {
		return personData;
    
        
    }
    public void ShowPersonOverview() {
    try {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(mainapp.class.getResource("view/PersonOverview.fxml"));
        AnchorPane personOverview = (AnchorPane) loader.load();
        
        rootLayout.setCenter(personOverview);

        PersonOverviewController controller = loader.getController();
        controller.setMainApp(this);

    } catch (IOException e) {
        e.printStackTrace();
    }
}
}    
        
        
      
        
  
    
    
    
    
    