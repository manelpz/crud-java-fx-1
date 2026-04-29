
package com.emma.controllers;

import com.emma.models.Book;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class mainController {



    @FXML 
    private TextField tfId;

    @FXML 
    private TextField tfTitle;

    @FXML 
    private TextField tfAuthor;

    @FXML 
    private TextField tfYear;

    @FXML 
    private TextField tfPages;

    @FXML 
    private TableView<Book> tbBooks;

    @FXML 
    private TableColumn<Book, Integer> colId;

    @FXML 
    private TableColumn<Book, String> colTitle;

    @FXML 
    private TableColumn<Book, String> colAuthor;

    @FXML 
    private TableColumn<Book, Integer> colYear;

    @FXML 
    private TableColumn<Book, Integer> colPages;
    

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

