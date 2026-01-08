package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.view.CounterView;
import org.example.viewmodel.CounterViewModel;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        CounterViewModel viewModel = new CounterViewModel();
        CounterView view = new CounterView(viewModel);

        Scene scene = new Scene(view, 200, 200);
        stage.setTitle("MVVM Counter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
