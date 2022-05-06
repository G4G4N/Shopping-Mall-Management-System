
import javax.swing.table.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class ShopListUI extends javax.swing.JFrame {


    /**
     * Creates new form ShopListUI
     */
    public ShopListUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DISPLAYbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        IDtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        floorTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        shopNumTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rentTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bonustxt = new javax.swing.JTextField();
        UPDATEbtn = new javax.swing.JButton();
        EDITbtn = new javax.swing.JButton();
        DELETEbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shops list");
        setUndecorated(true);
        setResizable(false);

        DISPLAYbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DISPLAYbtn.setText("Display Table Data");
        DISPLAYbtn.setToolTipText("Click here to display table data");
        DISPLAYbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISPLAYbtnActionPerformed(evt);
            }
        });

        TABLE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TABLE.setForeground(new java.awt.Color(0, 51, 255));
        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shop ID", "Floor #", "Shop #", "Rent", "Status", "Bonus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TABLE.setToolTipText("Customer table, select a record to edit data.");
        TABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLE);

        jLabel1.setText("Shop ID");

        IDtxt.setToolTipText("First select a record from the table. Then corresponding details will be visible in below tet boxes to edit/update.");

        jLabel2.setText("Floor #");

        jLabel3.setText("Shop #");

        jLabel4.setText("Rent");

        jLabel5.setText("Bonus");

        UPDATEbtn.setText("Update");
        UPDATEbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEbtnActionPerformed(evt);
            }
        });

        EDITbtn.setText("Edit");
        EDITbtn.setToolTipText("Click here to edit table data");
        EDITbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITbtnActionPerformed(evt);
            }
        });

        DELETEbtn.setText("Delete");
        DELETEbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEbtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Status");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Occupied", "Non-Occupied" }));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18.png"))); // NOI18N
        jMenu1.setToolTipText("Back to Main Menu");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/19.png"))); // NOI18N
        jMenu3.setToolTipText("Refresh");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/15.png"))); // NOI18N
        jMenu2.setToolTipText("Exit");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DISPLAYbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bonustxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(IDtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                        .addComponent(floorTxt)
                                        .addComponent(shopNumTxt)
                                        .addComponent(rentTxt)
                                        .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UPDATEbtn)
                        .addGap(18, 18, 18)
                        .addComponent(EDITbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DELETEbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DISPLAYbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(floorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(shopNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rentTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bonustxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UPDATEbtn)
                            .addComponent(EDITbtn)
                            .addComponent(DELETEbtn))))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(771, 359));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DISPLAYbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISPLAYbtnActionPerformed

        DefaultTableModel model = (DefaultTableModel) TABLE.getModel();

        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        // SQL Query
        String query = "SELECT * FROM shop";
        try {
            // Connect to MySQL database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mall", "root", "gaganak1");
            // Create SQL statement and execute query.
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the result and display on screen
            while (rs.next()) {
                int Sid = rs.getInt("shop_id");
                String floorNum = rs.getString("floornum");
                String shopNum = rs.getString("shopnum");
                String rent = rs.getString("Rent");
                String status = rs.getString("status");
                String bonus = rs.getString("bonus");
                System.out.println(Sid + "|" + floorNum + "|" + shopNum + "|" + rent + "|" + status+ "|" + bonus);
                model.addRow(new Object[]{Sid, floorNum, shopNum, rent, status, bonus});
            }
            IDtxt.setEditable(false);
            floorTxt.setEditable(false);
            shopNumTxt.setEditable(false);
            bonustxt.setEditable(false);
            statusComboBox.setEditable(false);
            UPDATEbtn.setEnabled(false);
            rentTxt.setEditable(false);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_DISPLAYbtnActionPerformed

    private void TABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLEMouseClicked
        int i = TABLE.getSelectedRow();
        TableModel vl = TABLE.getModel();

        IDtxt.setText(vl.getValueAt(i, 0).toString());
        floorTxt.setText(vl.getValueAt(i, 1).toString());
        shopNumTxt.setText(vl.getValueAt(i, 2).toString());
        rentTxt.setText(vl.getValueAt(i, 3).toString());
        statusComboBox.setSelectedItem(vl.getValueAt(i, 4));
        bonustxt.setText(vl.getValueAt(i, 5).toString());


    }//GEN-LAST:event_TABLEMouseClicked

    private void EDITbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITbtnActionPerformed
        UPDATEbtn.setEnabled(true);
        IDtxt.setEditable(true);
        floorTxt.setEditable(true);
        shopNumTxt.setEditable(true);
        statusComboBox.setEditable(true);
        bonustxt.setEditable(true);
        rentTxt.setEditable(true);
    }//GEN-LAST:event_EDITbtnActionPerformed

    private void UPDATEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEbtnActionPerformed
        int sId = Integer.parseInt(IDtxt.getText());
        String floorNum = floorTxt.getText();
        String shopNum = shopNumTxt.getText();
        String rent = rentTxt.getText();
        String status = (String) statusComboBox.getSelectedItem();
        String bonus = bonustxt.getText();

        String query2;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mall", "root", "password");
            Statement stmt1 = con.createStatement();

            int code = JOptionPane.showConfirmDialog(this, "Are you sure you want to update this information?", "Confirm?", JOptionPane.YES_NO_OPTION);
            if (code == JOptionPane.YES_OPTION) {
                query2 = "UPDATE shop SET shop_id=" + sId + ", floornum = '" + floorNum + "',shopnum='" + shopNum + "',rent='" + rent + "',status='" + status + "',bonus='" + bonus + "' WHERE shop_id=" + sId + ";";
                int ss = stmt1.executeUpdate(query2);
                if (ss > 0) {
                    JOptionPane.showMessageDialog(this, "Updation Successful!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Incorect values entered");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_UPDATEbtnActionPerformed

    private void DELETEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEbtnActionPerformed
        int sId = Integer.parseInt(IDtxt.getText());
        String query;
        Statement st;
        ResultSet r;
        try {
            int code = JOptionPane.showConfirmDialog(this, "Are you sure you want to Delete this record?", "Confirm?", JOptionPane.YES_NO_OPTION);
            if (code == JOptionPane.YES_OPTION) {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mall", "root", "gaganak1");
                query = "DELETE FROM shop WHERE SHOP_ID=" + sId + ";";
                st = con.createStatement();
                int c1 = st.executeUpdate(query);
                if (c1 > 0) {
                    JOptionPane.showMessageDialog(this, "Updation Successful!!");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }//GEN-LAST:event_DELETEbtnActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        new ShopListUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new MainMenuUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopListUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETEbtn;
    private javax.swing.JButton DISPLAYbtn;
    private javax.swing.JButton EDITbtn;
    private javax.swing.JTextField IDtxt;
    private javax.swing.JTable TABLE;
    private javax.swing.JButton UPDATEbtn;
    private javax.swing.JTextField bonustxt;
    private javax.swing.JTextField floorTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rentTxt;
    private javax.swing.JTextField shopNumTxt;
    private javax.swing.JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables


}
