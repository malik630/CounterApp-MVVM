package org.example.viewmodel;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import org.example.model.CounterModel;

public class CounterViewModel {

    private CounterModel model;
    private IntegerProperty counterProperty;

    public CounterViewModel() {
        model = new CounterModel();
        counterProperty = new SimpleIntegerProperty(model.getValue());
    }

    public IntegerProperty counterProperty() {
        return counterProperty;
    }

    public void increment() {
        model.increment();
        counterProperty.set(model.getValue());
    }

    public void decrement() {
        model.decrement();
        counterProperty.set(model.getValue());
    }
}

