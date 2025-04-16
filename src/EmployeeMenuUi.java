import java.awt.Color;

import javax.swing.JPanel;

public class EmployeeMenuUi extends javax.swing.JFrame {
static DataBase DataBase = new DataBase();
        public EmployeeMenuUi() {
                initComponents();
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                new AllPayment().AllpaymentShow(new DataBase().getAllThePayment());
                                ;
                        }
                });
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                new regularcustomer().Menu(new DataBase());

                        }
                });

                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                new DailyPaymentEmployee().setVisible(true);
                                ;

                        }
                });

                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                new CurrentOrderUi().setVisible(true);
                                ;

                        }
                });

                jButton9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

                                new ViewAllOrderUi().setVisible(true);;
                        }
                    });

                    jButton8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                new MostOrderMealUi().setVisible(true);;
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
                jButton4.setText("Currentorder");
                jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton4.setForeground(Color.white);

                jButton5.setBackground(new java.awt.Color(153, 0, 204));
                jButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jButton5.setText("DailyPayment");
                jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton5.setForeground(Color.white);

                jButton6.setBackground(new java.awt.Color(153, 0, 204));
                jButton6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jButton6.setText("regularcustomer");
                jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton6.setForeground(Color.white);

                // إنشاء زر جديد لـ MostOrderProducts
                jButton8 = new javax.swing.JButton(); // زر جديد
                jButton8.setBackground(new java.awt.Color(153, 0, 204));
                jButton8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jButton8.setText("MostOrderProducts");
                jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton8.setForeground(Color.white);
             

                // الاحتفاظ بالزر AllPayment كما هو
                jButton7.setBackground(new java.awt.Color(153, 0, 204));
                jButton7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jButton7.setText("AllPayment");
                jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton7.setForeground(Color.white);
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                new AllPayment().AllpaymentShow(new DataBase().getAllThePayment());
                        }
                });

                jButton9 = new javax.swing.JButton(); // زر جديد
                jButton9.setBackground(new java.awt.Color(153, 0, 204));
                jButton9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jButton9.setText("AllOrder");
                jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton9.setForeground(Color.white);
        

                jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
                jLabel1.setText("EmployeeMenu");
                jLabel1.setForeground(Color.white);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE) // AllOrder
            .addGap(40, 40, 40)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE) // MostOrderProducts
            .addGap(40, 40, 40)
            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE) // AllPayment
            .addGap(40, 40, 40)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40)
            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(41, 41, 41))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(366, 366, 366)));

            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton9) // AllOrder
                                    .addComponent(jButton8) // MostOrderProducts
                                    .addComponent(jButton7) // AllPayment
                                    .addComponent(jButton5)
                                    .addComponent(jButton6))
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(210, 210, 210)));
            
                pack();
        }// </editor-fold>

        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JButton jButton8;
        private javax.swing.JButton jButton9;


        private javax.swing.JLabel jLabel1;
}