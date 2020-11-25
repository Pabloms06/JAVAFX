package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {


    @FXML
    private Label contraseñavisor;

    @FXML
    private TextField nombretexto;

    @FXML
    private PasswordField textocontraseña;

    @FXML
    private RadioButton h;

    @FXML
    private RadioButton m;


    @FXML
    private void MostrarContraseña(){
       String contraseña = textocontraseña.getText();
        contraseñavisor.setText(contraseña);
    }

    @FXML
    private void MostrarContraseñaNo(){
        contraseñavisor.setText("");
    }

    @FXML
    private void Registrado(){
        String nombre = nombretexto.getText();
        System.out.println("Has sido registrado correctamente, bienvenido "+ nombre + "!!");
    }

    @FXML
    private void SeleccionadoH(){
        if (h.isPressed()){
            m.isDisable();
        }
    }

    @FXML
    private void SeleccionadoM(){
        if (m.isPressed()){
            h.isDisable();
        }
    }
}
