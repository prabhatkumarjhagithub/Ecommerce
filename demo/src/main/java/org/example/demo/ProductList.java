package org.example.demo;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class ProductList {
      private TableView<Product> productTable;

      public  VBox createTable(ObservableList<Product> data){
          TableColumn id=new TableColumn("ID");
          id.setCellValueFactory(new PropertyValueFactory<>("id"));
          TableColumn name=new TableColumn("NAME");
          name.setCellValueFactory(new PropertyValueFactory<>("name"));
          TableColumn price=new TableColumn("price");
          price.setCellValueFactory(new PropertyValueFactory<>("price"));

          productTable=new TableView<>();
          productTable.getColumns().addAll(id,name,price);
          productTable.setItems(data);
          productTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

          VBox vBox=new VBox();
          vBox.setPadding(new Insets(10));
          vBox.getChildren().addAll(productTable);
          return vBox;
    }

          public VBox getALLProducts(){
          ObservableList<Product> data=Product.getALLProducts();
          return createTable(data);
      }
    public Product getSelectedProduct(){
        return productTable.getSelectionModel().getSelectedItem();
    }
    public VBox getProductsInCart(ObservableList<Product>data){
        return createTable(data);
    }
    public VBox getMyOrders(ObservableList<Product> data) {
        return createTable(data);
    }


}
