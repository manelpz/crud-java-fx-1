
package com.emma.controllers;

import javafx.fxml.FXML;

public class mainController {

     @FXML
    private void handleBtnAction(javafx.event.ActionEvent event) {

        Object source = event.getSource();

        if (source.toString().contains("Insertar")) {
            //insertBook();
        } else if (source.toString().contains("Actualizar")) {
            //updateBook();
        } else if (source.toString().contains("Eliminar")) {
            //deleteBook();
        }
    }


}

