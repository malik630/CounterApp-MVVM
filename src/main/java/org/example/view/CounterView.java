package org.example.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.example.viewmodel.CounterViewModel;


public class CounterView extends VBox {

    public CounterView(CounterViewModel viewModel) {
        Label counterLabel = new Label();
        Button incrementButton = new Button("+");
        Button decrementButton = new Button("-");

        counterLabel.textProperty().bind(viewModel.counterProperty().asString());
        counterLabel.setStyle("-fx-font-size: 30px; -fx-font-weight: bold;");

        incrementButton.setOnAction(e -> viewModel.increment());
        decrementButton.setOnAction(e -> viewModel.decrement());

        incrementButton.setStyle("-fx-font-size: 20px; -fx-background-color: #4CAF50; -fx-text-fill: white;");
        decrementButton.setStyle("-fx-font-size: 20px; -fx-background-color: #F44336; -fx-text-fill: white;");

        HBox buttons = new HBox(10, incrementButton, decrementButton);
        buttons.setAlignment(Pos.CENTER);

        setSpacing(20);
        setAlignment(Pos.CENTER);
        setStyle("-fx-padding: 20px; -fx-background-color: #f0f0f0; -fx-border-radius: 10px; -fx-background-radius: 10px;");

        getChildren().addAll(counterLabel, buttons);
    }
}
