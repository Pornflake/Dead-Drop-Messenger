package sample;

import javafx.beans.InvalidationListener;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.StringPropertyBase;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.bouncycastle.util.encoders.Hex;

public class Model {
    private ObservableList<CharSequence> message = FXCollections.observableArrayList();
    private StringProperty name = new SimpleStringProperty();
    private StringProperty pass = new SimpleStringProperty();



    public final StringProperty nameProperty() {
        return this.name;
    }
    public final String getName() {
        System.out.println("model name value get: " + this.nameProperty().get());
        return this.nameProperty().get();
    }
    public final void setName(String name) {
        System.out.println("model name value set: " + this.nameProperty().get());
        this.nameProperty().set(name);
    }

    public final StringProperty passProperty() {
        return this.pass;
    }
    public final String getPass() {
        return this.passProperty().get();
    }
    public final void setPass(String pass) {
        this.passProperty().set(pass);
    }


    public final ObservableList<CharSequence> getMessage() {
        return this.message;
    }

    public final byte[] getMessageBytes() {
        return String.join("\n", this.getMessage()).getBytes();
    }




}