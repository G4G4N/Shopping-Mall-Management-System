
import javax.swing.table.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class ItemListUI extends javax.swing.JFrame {

    Connection con;
    Statement stmt, stmt1, stmt2;
    ResultSet rs, rs1, rs2;
    int load, phn, wno, lr;
    String name, hno, query;
    String N, H, L, P, M;

    /**
     * Creates new form ItemListUI
     */
    public ItemListUI() {
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
        UPDATEbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IDtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NAMEtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DESCtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PRICEtxt = new javax.swing.JTextField();
        DELbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("List of items in shop");
        setUndecorated(true);
        setResizable(false);

        DISPLAYbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DISPLAYbtn.setText("Display Table");
        DISPLAYbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISPLAYbtnActionPerformed(evt);
            }
        });

        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item ID", "Name", "Description", "Price"
            }
        ));
        TABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLE);

        UPDATEbtn.setText("Update Data");
        UPDATEbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Item ID");

        jLabel2.setText("Name");

        NAMEtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEtxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Description");

        jLabel4.setText("Price");

        DELbtn.setText("Delete");
        DELbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELbtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ITEM DATABASE UPDATE/DELETE");

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
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(UPDATEbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DELbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                    .addComponent(DISPLAYbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IDtxt)
                                            .addComponent(NAMEtxt)
                                            .addComponent(DESCtxt)
                                            .addComponent(PRICEtxt))))
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DISPLAYbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NAMEtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(DESCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PRICEtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UPDATEbtn)
                            .addComponent(DELbtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(657, 354));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DISPLAYbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISPLAYbtnActionPerformed
        // Before writting the followng line, you should import the line:
        // import javax.swing.table.*; at the top of your application
        DefaultTableModel model = (DefaultTableModel) TABLE.getModel();
        // Clear the existing table
        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        // SQL Query
        String query = "SELECT * FROM Item";
        try {
            // Connect to MySQL database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mall", "root", "gaganak1");
            // Create SQL statement and execute query.
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the result and display on screen
            while (rs.next()) {
                String ITid = rs.getString("Item_id");
                String IName = rs.getString("Item_Name");
                String IDesc = rs.getString("Description");
                String IPrice = rs.getString("Price");
                System.out.println(ITid + "|" + IName + "|" + IDesc + "|" + IPrice);
                model.addRow(new Object[]{ITid, IName, IDesc, IPrice});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_DISPLAYbtnActionPerformed

    private void NAMEtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEtxtActionPerformed

    private void TABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLEMouseClicked
        // TODO add your handling code here:
        int i = TABLE.getSelectedRow();
        TableModel vl = TABLE.getModel();

        IDtxt.setText(vl.getValueAt(i, 0).toString());
        NAMEtxt.setText(vl.getValueAt(i, 1).toString());
        DESCtxt.setText(vl.getValueAt(i, 2).toString());
        PRICEtxt.setText(vl.getValueAt(i, 3).toString());

    }//GEN-LAST:event_TABLEMouseClicked

    private void UPDATEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEbtnActionPerformed
        // TODO add your handling code here:
        N = IDtxt.getText();
        H = NAMEtxt.getText();
        M = DESCtxt.getText();
        L = PRICEtxt.getText();

        String query2;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mall", "root", "gaganak1");
            stmt1 = con.createStatement();

            int code = JOptionPane.showConfirmDialog(this, "Are you sure you want to update this information?", "Confirm?", JOptionPane.YES_NO_OPTION);
            if (code == JOptionPane.YES_OPTION) {
                query2 = "UPDATE ITEM SET ITEM_ID=" + N + ", ITEM_NAME = '" + H + "',DESCRIPTION='" + M + "',PRICE=" + L + " WHERE ITEM_ID=" + N + ";";
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
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mall", "root", "gaganak1");
            stmt = con.createStatement();
            String query = "SELECT * FROM Customer;";
            rs = stmt.executeQuery(query);
            rs.next();

        } catch (SQLException ec) {
            JOptionPane.showMessageDialog(this, ec);
        }
    }//GEN-LAST:event_UPDATEbtnActionPerformed

    private void DELbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELbtnActionPerformed
        // TODO add your handling code here:
        M = IDtxt.getText();
        String query;
        Statement st;
        //  ResultSet r;
        try {
            int code = JOptionPane.showConfirmDialog(this, "Are you sure you want to Delete this record?", "Confirm?", JOptionPane.YES_NO_OPTION);
            if (code == JOptionPane.YES_OPTION) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mall", "root", "gaganak1");
                query = "DELETE FROM ITEM WHERE ITEM_ID='" + M + "';";
                st = con.createStatement();
                int c1 = st.executeUpdate(query);
                if (c1 > 0) {
                    JOptionPane.showMessageDialog(this, "Updation Successful!!");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_DELbtnActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new MainMenuUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        new ItemListUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemListUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELbtn;
    private javax.swing.JTextField DESCtxt;
    private javax.swing.JButton DISPLAYbtn;
    private javax.swing.JTextField IDtxt;
    private javax.swing.JTextField NAMEtxt;
    private javax.swing.JTextField PRICEtxt;
    private javax.swing.JTable TABLE;
    private javax.swing.JButton UPDATEbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
