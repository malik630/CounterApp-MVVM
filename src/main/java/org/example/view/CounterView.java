package org.example.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.example.viewmodel.CounterViewModel;


public class CounterView extends VBox {

    public CounterView(CounterViewModel viewModel) {

        Label counterLabel = new Label();
        Button incrementButton = new Button("+");
        Button decrementButton = new Button("-");

        // Data Binding
        counterLabel.textProperty().bind(
                viewModel.counterProperty().asString()
        );

        incrementButton.setOnAction(e -> viewModel.increment());
        decrementButton.setOnAction(e -> viewModel.decrement());

        setSpacing(10);
        getChildren().addAll(counterLabel, incrementButton, decrementButton);
    }
}
