import java.awt.BorderLayout;
import java.awt.Color;
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

public class CustomerViewFoodUi extends javax.swing.JFrame {

    static DataBase DataBase = new DataBase();
    private List<Products> productList;

    private JPanel productsPanel;
    private JButton addButton;
    private JTextField inputTextField;

    private JPanel sidePanel;
    private JPanel orderPanel;
    private JButton getPayButton;

    @SuppressWarnings("unchecked")
    private void initComponents() {
        pack();
    }

    public CustomerViewFoodUi() {
    }

    public CustomerViewFoodUi(List<Products> productList) {
        initComponents();
        this.productList = productList;

        productsPanel = new JPanel(new GridLayout(0, 4, 10, 10));
        JScrollPane scrollPane = new JScrollPane(productsPanel);
        scrollPane.setPreferredSize(new Dimension(800, 600));

        sidePanel = new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        sidePanel.setPreferredSize(new Dimension(200, 600));

        getPayButton = new JButton("GetPay");
        getPayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Processing payment...");
                new MakePaymentUi().setVisible(true);
            }
        });

        

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(sidePanel, BorderLayout.EAST);

        if (productList != null) {
            for (Products product : productList) {
                addProductToPanel(product);
            }
        }

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
        addButton = new JButton("Add");
        addButton.setForeground(Color.blue);
        inputTextField = new JTextField(20);

        bottomPanel.add(inputTextField);
        bottomPanel.add(addButton);
        bottomPanel.add(getPayButton); 

        getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputTextField.getText();
                new Thread(() -> {
                    try {
                        AddToCart newCart = new AddToCart();
                        new AddtoCartImp().putproduct(newCart, text);
                        sidePanel.removeAll();
                        List<Products> products = DataBase.getProductscustomercard();
                        for (Products p : products) {
                                addProductToOrderPanel(p);
                            
                        }
                    } catch (FoodNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }).start(); 
            }
        });
        

        setSize(1000, 800);
        setLocationRelativeTo(null);

    }

    void addProductToPanel(Products product) {
        JPanel productPanel = new JPanel();
        productPanel.setLayout(new javax.swing.BoxLayout(productPanel, javax.swing.BoxLayout.Y_AXIS));

        JLabel nameLabel = new JLabel("Name: " + product.getName());
        String ingredientsText = Arrays.toString(product.getIngredients());
        JLabel ingredientsLabel = new JLabel(
                "Ingredients: " + ingredientsText.substring(1, ingredientsText.length() - 1));
        JLabel priceLabel = new JLabel("Price: " + product.getPrice());

        productPanel.add(nameLabel);
        productPanel.add(ingredientsLabel);
        productPanel.add(priceLabel);

        productsPanel.add(productPanel);
    }

    public void addProductToOrderPanel(Products p) {
        JPanel orderItemPanel = new JPanel();
        orderItemPanel.setLayout(new BoxLayout(orderItemPanel, BoxLayout.Y_AXIS));

        JLabel nameLabel = new JLabel("Name_: " + p.getName());
        JLabel priceLabel = new JLabel("Price_: " + p.getPrice());
        JLabel line = new JLabel("========");


        orderItemPanel.add(nameLabel);
        orderItemPanel.add(priceLabel);
        orderItemPanel.add(line);


        sidePanel.add(orderItemPanel);
        sidePanel.revalidate();
        sidePanel.repaint();

        setVisible(true);
    }

}