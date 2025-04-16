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


public class ViewAllOrderUi extends javax.swing.JFrame{
    
    static DataBase DataBase = new DataBase();

    private JPanel productsPanel;
    JLabel imageLabel;

    @SuppressWarnings("unchecked")
    private void initComponents() {
        pack();
        setSize(800,400);
    }

    public ViewAllOrderUi() {
        initComponents();


    productsPanel = new JPanel();
    getContentPane().add(productsPanel);
    productsPanel.setPreferredSize(new Dimension(800, 600));
    productsPanel = new JPanel(new GridLayout(0, 4, 10, 10));
    getContentPane().add(new JScrollPane(productsPanel));

    List<AddToCart>AllOrder = new DataBase().getOrderList();
    if (AllOrder != null) {
      for (AddToCart order : AllOrder) {
        addProductToPanel(order);
      }
      totalPrice();

    }
    }

    void addProductToPanel(AddToCart product) {

     
        JPanel productPanel = new JPanel();
        productPanel.setLayout(new javax.swing.BoxLayout(productPanel, javax.swing.BoxLayout.Y_AXIS));

        JLabel nameLabel = new JLabel("Name: " + product.getName());
        JLabel Phonenumber = new JLabel("Phone number: " + product.getPhonenumber());        



        productPanel.add(nameLabel);
        productPanel.add(Phonenumber);

        productsPanel.add(productPanel);

    }

    public void totalPrice()
    {
        Double Price =0.0;
        for (AddToCart makePayment : new DataBase().getOrderList()) {
            Price+=makePayment.getPrice();
        }
        JPanel productPane2 = new JPanel();
        productPane2.setLayout(new javax.swing.BoxLayout(productPane2, javax.swing.BoxLayout.Y_AXIS));
        JLabel priceLabe3 = new JLabel("The Total Price: " + Price);
productPane2.add(priceLabe3);
productsPanel.add(priceLabe3);
    }
}
