package sample;


import javafx.beans.Observable;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller{

    @FXML
    private ChoiceBox numberbox;
    @FXML
    private ChoiceBox zaseki1;
    @FXML
    private ChoiceBox zaseki2;
    @FXML
    private CheckBox eye;
    @FXML
    private CheckBox seiseki;

    @FXML
    void onCreate(ActionEvent event) throws IOException{
        final Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample4.fxml"));
        stage.setTitle("Seat");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();

    }
    @SuppressWarnings("unchecked")
    @FXML
    void onExistData(ActionEvent event) throws IOException{
        final Stage stage = new Stage();
        //Parent root = FXMLLoader.load(getClass().getResource("sample3.fxml"));
        stage.setTitle("Data Existing");
        stage.setWidth(260);
        stage.setHeight(180);

        ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("髙橋","享佑","ﾀｶﾊｼｷｮｳｽｹ","21"),
                new Person("中川","稜","ﾅｶｶﾞﾜﾘｮｳ","27")
        );
        TableView<Person>table = new TableView<>();
        table.itemsProperty().setValue(data);
        TableColumn<Person, String> seiColumn = new TableColumn<>("姓");
        TableColumn<Person, String> meiColumn = new TableColumn<>("名");
        TableColumn<Person, String> phoColumn = new TableColumn<>("ﾌﾘｶﾞﾅ");
        TableColumn<Person, String> numColumn = new TableColumn<>("出席番号");
        seiColumn.setCellValueFactory(
                new PropertyValueFactory<Person, String>("sei"));
        meiColumn.setCellValueFactory(
                new PropertyValueFactory<Person, String>("mei"));
        phoColumn.setCellValueFactory(
                new PropertyValueFactory<Person, String>("pho"));
        numColumn.setCellValueFactory(
                new PropertyValueFactory<Person, String>("num"));
        table.getColumns().addAll(seiColumn, meiColumn, phoColumn, numColumn);

        VBox root2 = new VBox();
        root2.getChildren().addAll(table);

        stage.setScene(new Scene(root2));
        stage.show();
    }

    @FXML
    void onNewData(ActionEvent event) throws IOException {
        final Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        stage.setTitle("New Data Create");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }

}
