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

public class DailyPaymentEmployee extends javax.swing.JFrame {
     static DataBase DataBase = new DataBase();
  private List<MakePayment> productList;

  private JPanel productsPanel;
  JLabel imageLabel;

  @SuppressWarnings("unchecked")
  private void initComponents() {
    pack();
  }

  public DailyPaymentEmployee() {
    initComponents();
    // this.productList = productList;
    setSize(800, 400);
    productsPanel = new JPanel();
    getContentPane().add(productsPanel);
    productsPanel.setPreferredSize(new Dimension(800, 600));
    productsPanel = new JPanel(new GridLayout(0, 4, 10, 10));
    getContentPane().add(new JScrollPane(productsPanel));
List <MakePayment>DailyPayment = new DataBase().getDailypayment();
    if (DailyPayment != null) {
      for (MakePayment product : DailyPayment) {
        addProductToPanel(product);
      }
    }
  }




  void addProductToPanel(MakePayment product) {
    JPanel productPanel = new JPanel();
    productPanel.setLayout(new javax.swing.BoxLayout(productPanel, javax.swing.BoxLayout.Y_AXIS));

    JLabel nameLabel = new JLabel("Name: " + product.getname());
    JLabel Code = new JLabel("Code_:"+product.getCode());
    JLabel date = new JLabel("Date_:"+product.getDate());




    productPanel.add(nameLabel);
    productPanel.add(Code);
    productPanel.add(date);





    productsPanel.add(productPanel);
}


}
