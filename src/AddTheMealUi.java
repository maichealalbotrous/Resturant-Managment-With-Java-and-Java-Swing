
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JPanel;

public class AddTheMealUi extends javax.swing.JFrame {

        public AddTheMealUi() {
                initComponents();

                jButton1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Scanner in = new Scanner(System.in);
                                String name = jTextField1.getText();
                                Double price = Double.parseDouble(jTextField3.getText());
                                int numIngredients = Integer.parseInt(jTextField2.getText());
                                String theingredients = jTextField4.getText();
                                String type = jTextField5.getText();

                                String[] ingredients = theingredients.split(",");

                                if (type.equalsIgnoreCase("Drink")) {
                                        new addfood().AddProduct(new DataBase().getDrinksList(), "Drink", name, price,
                                                        numIngredients,
                                                        ingredients);
                                }

                                if (type.equalsIgnoreCase("FastFood")) {
                                        new addfood().AddProduct(new DataBase().getFastFoodList(), "FastFood", name,
                                                        price, numIngredients,
                                                        ingredients);
                                }

                                if (type.equalsIgnoreCase("Appetizers")) {
                                        new addfood().AddProduct(new DataBase().getAppetizersList(), "Appetizers", name,
                                                        price,
                                                        numIngredients,
                                                        ingredients);
                                }

                                if (type.equalsIgnoreCase("Sweet")) {
                                        new addfood().AddProduct(new DataBase().getSweetsList(), "Sweet", name, price,
                                                        numIngredients,
                                                        ingredients);
                                }

                        }
                });

        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jTextField4 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jLabel6 = new javax.swing.JLabel();
                jTextField5 = new javax.swing.JTextField();
                JPanel contentPane = new JPanel();
                contentPane.setBackground(new java.awt.Color(0, 0, 100));
                setContentPane(contentPane);

                jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
                jLabel1.setText("AddMeal");
                jLabel1.setForeground(Color.white);

                jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jLabel2.setText("NameOfMeal_:");
                jLabel2.setForeground(Color.white);

                jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jLabel3.setText("PriceOfMeal_:");
                jLabel3.setForeground(Color.white);

                jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jLabel4.setText("ingredient _:");
                jLabel4.setForeground(Color.white);

                jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jLabel5.setText("number of ingredients_:");
                jLabel5.setForeground(Color.white);

                jButton1.setBackground(new java.awt.Color(153, 0, 153));
                jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                jButton1.setText("AddTheMeal");
                jButton1.setForeground(Color.white);

                jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jLabel6.setText("Type _:");
                jLabel6.setForeground(Color.white);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(216, 216, 216)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                140,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addComponent(jLabel2)
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addComponent(jLabel6))
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(20, 20, 20)
                                                                                                                                .addComponent(jTextField4,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                192,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jTextField3,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                192,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jTextField2,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                192,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jTextField1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                192,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel1)))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(jTextField5,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                192,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addGap(313, 313, 313)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel1)
                                                                .addGap(81, 81, 81)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jTextField1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jTextField3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(38, 38, 38)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jTextField2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(31, 31, 31)
                                                                .addComponent(jButton1)
                                                                .addContainerGap(133, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>

        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        // End of variables declaration
}
