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
public class CurrentOrderUi  extends javax.swing.JFrame{
    static DataBase DataBase = new DataBase();
  private List<Products> productList;

  private JPanel productsPanel;
  JLabel imageLabel;

  @SuppressWarnings("unchecked")
  private void initComponents() {
    pack();
  }

  public CurrentOrderUi() {
    initComponents();
setSize(800,400);
    productsPanel = new JPanel();
    getContentPane().add(productsPanel);
    productsPanel.setPreferredSize(new Dimension(800, 600));
    productsPanel = new JPanel(new GridLayout(0, 4, 10, 10));
    getContentPane().add(new JScrollPane(productsPanel));
List<AddToCart> CartList = new DataBase().getCartList();
    if (CartList != null) {
      for (AddToCart product : CartList) {
        addProductToPanel(product);
      }
      totalOrder();
      totalPrice();
    }
  }




  void addProductToPanel(AddToCart product) {
    JPanel productPanel = new JPanel();
    productPanel.setLayout(new javax.swing.BoxLayout(productPanel, javax.swing.BoxLayout.Y_AXIS));

    JLabel nameLabel = new JLabel("Name: " + product.getName());
    JLabel Way = new JLabel("CurrentStatus_:" + product.getOrderWay());
    JLabel Price = new JLabel("Price:" + product.getPrice());



    productPanel.add(nameLabel);
    productPanel.add(Way);
    productPanel.add(Price);




    productsPanel.add(productPanel);
}

public void totalOrder()
{
   
    JPanel productPane2 = new JPanel();
    productPane2.setLayout(new javax.swing.BoxLayout(productPane2, javax.swing.BoxLayout.Y_AXIS));
    JLabel priceLabe3 = new JLabel("The Total Order: " + new DataBase().getCartList().size());
productPane2.add(priceLabe3);
productsPanel.add(priceLabe3);
}

public void totalPrice()
{
    Double Price =0.0;
    for (AddToCart makePayment : new DataBase().getCartList()) {
        Price+=makePayment.getPrice();
    }
    JPanel productPane2 = new JPanel();
    productPane2.setLayout(new javax.swing.BoxLayout(productPane2, javax.swing.BoxLayout.Y_AXIS));
    JLabel priceLabe3 = new JLabel("The Total Price: " + Price);
productPane2.add(priceLabe3);
productsPanel.add(priceLabe3);
}
}
