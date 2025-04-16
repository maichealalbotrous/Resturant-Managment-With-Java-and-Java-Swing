    import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RegularCustomerUi  extends javax.swing.JFrame{

    static DataBase DataBase = new DataBase();
    private List<MakePayment> productList;

    private JPanel productsPanel;
    JLabel imageLabel;

    @SuppressWarnings("unchecked")
    private void initComponents() {
        pack();
        setSize(800,400);
    }

    public RegularCustomerUi(List<MakePayment> productList) {
        initComponents();

    this.productList = productList;

    productsPanel = new JPanel();
    getContentPane().add(productsPanel);
    productsPanel.setPreferredSize(new Dimension(800, 600));
    productsPanel = new JPanel(new GridLayout(0, 4, 10, 10));
    getContentPane().add(new JScrollPane(productsPanel));

    if (productList != null) {
      
   
        HashMap<String, Integer> namecount = new HashMap<>();

        for (MakePayment p : productList) {
            if (namecount.containsKey(p.getname())) {
                namecount.put(p.getname(), namecount.get(p.getname()) + 1);
            } else {
                namecount.put(p.getname(), 1);
            }
        }
        for (Map.Entry<String, Integer> name : namecount.entrySet()) {
            if (name.getValue() > 3) {
                System.out.println("Name:" + name.getKey() + "\\t" + "Number of visite_:[" + name.getValue()+"]");
                addProductToPanel(name.getKey(),name.getValue());
                
            }
        }

    }
    }

    void addProductToPanel(String name,int NumberOfVisits) {
    
         
            JPanel productPanel = new JPanel();
            productPanel.setLayout(new javax.swing.BoxLayout(productPanel, javax.swing.BoxLayout.Y_AXIS));
    
            JLabel nameLabel = new JLabel("Name_: [" + name+"]");        
            JLabel priceLabel = new JLabel("NumberOfVisits _:["+ NumberOfVisits+"]");


        productPanel.add(nameLabel);
        productPanel.add(priceLabel);

        imageLabel = new JLabel();
        productPanel.add(imageLabel);

        productsPanel.add(productPanel);
    }

 
}
