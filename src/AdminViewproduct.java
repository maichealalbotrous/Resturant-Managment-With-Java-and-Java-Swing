import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AdminViewproduct extends javax.swing.JFrame {
  static DataBase DataBase = new DataBase();
  private List<Products> productList;

  private JPanel productsPanel;
  JLabel imageLabel;

  @SuppressWarnings("unchecked")
  private void initComponents() {
    pack();
  }

  public AdminViewproduct(List<Products> productList) {
    initComponents();
    this.productList = productList;

    productsPanel = new JPanel();
    getContentPane().add(productsPanel);
    productsPanel.setPreferredSize(new Dimension(800, 600));
    productsPanel = new JPanel(new GridLayout(0, 4, 10, 10));
    getContentPane().add(new JScrollPane(productsPanel));

    if (productList != null) {
      for (Products product : productList) {
        addProductToPanel(product);
      }
    }
  }




  void addProductToPanel(Products product) {
    JPanel productPanel = new JPanel();
    productPanel.setLayout(new javax.swing.BoxLayout(productPanel, javax.swing.BoxLayout.Y_AXIS));

    JLabel nameLabel = new JLabel("Name: " + product.getName());
    String ingredientsText = Arrays.toString(product.getIngredients());
    JLabel ingredientsLabel = new JLabel("Ingredients: " + ingredientsText.substring(1, ingredientsText.length() - 1));
    JLabel priceLabel = new JLabel("Price: " + product.getPrice());

    productPanel.add(nameLabel);
    productPanel.add(ingredientsLabel);
    productPanel.add(priceLabel);

    imageLabel = new JLabel(); 
    productPanel.add(imageLabel);


    productsPanel.add(productPanel);
}
}
