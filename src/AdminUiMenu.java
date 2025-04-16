import java.awt.Color;

import javax.swing.JPanel;

public class AdminUiMenu extends javax.swing.JFrame {
        
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JLabel jLabel1;

        public AdminUiMenu() {
                initComponents();
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                         new ViewFoodMenuUi().setVisible(true);   
                        }
                    });

                    jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                         new AddTheMealUi().setVisible(true);   
                        }
                    });

                    jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                         new DelletProductsUi().setVisible(true);   
                        }
                    });
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jButton4 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jButton6 = new javax.swing.JButton();
                jButton7 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();

                JPanel contentPane = new JPanel();
                contentPane.setBackground(new java.awt.Color(0, 0, 100));
                setContentPane(contentPane);

                jButton4.setBackground(new java.awt.Color(153, 0, 204));
                jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jButton4.setText("AddFood");
                jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton4.setForeground(Color.white);

                jButton5.setBackground(new java.awt.Color(153, 0, 204));
                jButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jButton5.setText("DeletFood");
                jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton5.setForeground(Color.white);

                jButton6.setBackground(new java.awt.Color(153, 0, 204));
                jButton6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jButton6.setText("AddEmployee");
                jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton6.setForeground(Color.white);

                jButton7.setBackground(new java.awt.Color(153, 0, 204));
                jButton7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jButton7.setText("viewfood");
                jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton7.setForeground(Color.white);

                jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
                jLabel1.setText("AdminMenu");
                jLabel1.setForeground(Color.white);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(57, 57, 57)
                                                                .addComponent(jButton7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                126,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(113, 113, 113)
                                                                .addComponent(jButton4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                126,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                143,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                126,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(69, 69, 69)
                                                                .addComponent(jButton6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                126,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(41, 41, 41))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addGap(366, 366, 366)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGap(56, 56, 56)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                199,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jButton5)
                                                                                                                .addComponent(jButton6)
                                                                                                                .addComponent(jButton7))
                                                                                .addComponent(jButton4,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(210, 210, 210)));

                pack();
        }// </editor-fold>

   
}