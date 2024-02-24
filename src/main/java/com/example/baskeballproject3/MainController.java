package com.example.baskeballproject3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.BasketballPlayer;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    public TableView allTable;
    public TableColumn allJerseyCol;
    public TableColumn allNameCol;
    public TableColumn allPointsCol;
    public TableColumn allTeamCol;

    public Label resultsLBL;
    public TextField queryTF;
    public Button getResults;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        allJerseyCol.setCellValueFactory(new PropertyValueFactory<>("jersey"));
        allNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        allPointsCol.setCellValueFactory(new PropertyValueFactory<>("points"));
        allTeamCol.setCellValueFactory(new PropertyValueFactory<>("team"));


        ObservableList<BasketballPlayer> players = BasketballPlayer.getAllPlayers();
        allTable.setItems(players);
        resultsLBL.setText(Integer.toString(players.size()) + " players returned.");


    }


    public void getResultsHandler(ActionEvent actionEvent) {

        String q = queryTF.getText();

        ObservableList<BasketballPlayer> players = searchByLayerName(q);

        if(players.size() == 0){

            try {
                int jersey = Integer.parseInt(q);

                BasketballPlayer bp = getPlayerwithJersey(jersey);

                if (bp != null)
                    players.add(bp);
            }catch (NumberFormatException e){
                // ignore
            }
        }

        allTable.setItems(players);



        resultsLBL.setText(Integer.toString(players.size()) + " players returned.");

        queryTF.setText("");

    }

    private ObservableList<BasketballPlayer> searchByLayerName(String partialName) {
        ObservableList<BasketballPlayer> namedPlayers = FXCollections.observableArrayList();

        ObservableList<BasketballPlayer> allPlayers = BasketballPlayer.getAllPlayers();

        for (BasketballPlayer bp : allPlayers) {
            if (bp.getName().contains(partialName)) {
                namedPlayers.add(bp);
            }
        }

        return namedPlayers;
    }

    private BasketballPlayer getPlayerwithJersey (int jersey){


        ObservableList<BasketballPlayer> allPlayers = BasketballPlayer.getAllPlayers();

        for(int i =0; i<allPlayers.size(); i++){
            BasketballPlayer bp = allPlayers.get(i);

            if(bp.getJersey() == jersey){
                return bp;
            }
        }

        return null;
    }

}




