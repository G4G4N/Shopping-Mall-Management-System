import javax.swing.table.*;
import java.sql.*;
import javax.swing.JOptionPane;



public class CustListUI extends javax.swing.JFrame {
Connection con;
    Statement stmt,stmt1,stmt2;
    ResultSet rs,rs1,rs2;
    int load,phn,wno,lr;
    String name,hno,query;
    String N,H,L,P,M;
    /** Creates new form CustListUI */
    public CustListUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
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
        NAMEtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ADDRESStxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CITYtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PHONEtxt = new javax.swing.JTextField();
        UPDATEbtn = new javax.swing.JButton();
        EDITbtn = new javax.swing.JButton();
        DELETEbtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customers list");
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
                "Customer ID", "Name", "Address", "City", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Long.class
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

        jLabel1.setText("Customer ID");

        IDtxt.setToolTipText("First select a record from the table. Then corresponding details will be visible in below tet boxes to edit/update.");

        jLabel2.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("CIty");

        jLabel5.setText("Phone");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDtxt)
                            .addComponent(NAMEtxt)
                            .addComponent(ADDRESStxt)
                            .addComponent(CITYtxt)
                            .addComponent(PHONEtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UPDATEbtn)
                        .addGap(18, 18, 18)
                        .addComponent(EDITbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DELETEbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                    .addComponent(DISPLAYbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DISPLAYbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NAMEtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ADDRESStxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CITYtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(PHONEtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UPDATEbtn)
                            .addComponent(EDITbtn)
                            .addComponent(DELETEbtn))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(771, 324));
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
        String query = "SELECT * FROM Customer";
        try {
            // Connect to MySQL database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/mall","root","gaganak1");
            // Create SQL statement and execute query.
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the result and display on screen
            while (rs.next()) {
                String Sid = rs.getString("Shopper_id");
                String SName = rs.getString("Name");
                String SAddress = rs.getString("Address");
                String SCity = rs.getString("City");
                String SPhone = rs.getString("Phone");
                System.out.println(Sid + "|" + SName + "|" + SAddress + "|" + SCity + "|" + SPhone);
                model.addRow(new Object[] {Sid, SName, SAddress, SCity, SPhone});
            }
            IDtxt.setEditable(false);
            NAMEtxt.setEditable(false);
            ADDRESStxt.setEditable(false);
            PHONEtxt.setEditable(false);
            UPDATEbtn.setEnabled(false);
            CITYtxt.setEditable(false);
//            fetch();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_DISPLAYbtnActionPerformed

    private void TABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLEMouseClicked
        int i=TABLE.getSelectedRow();
        TableModel vl = TABLE.getModel();
        
        IDtxt.setText(vl.getValueAt(i,0).toString());
        NAMEtxt.setText(vl.getValueAt(i,1).toString());
       ADDRESStxt.setText(vl.getValueAt(i,2).toString());
        CITYtxt.setText(vl.getValueAt(i,3).toString());
        PHONEtxt.setText(vl.getValueAt(i,4).toString());
                
        
    }//GEN-LAST:event_TABLEMouseClicked

    private void EDITbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITbtnActionPerformed
        UPDATEbtn.setEnabled(true);
        IDtxt.setEditable(true);
            NAMEtxt.setEditable(true);
            ADDRESStxt.setEditable(true);
            PHONEtxt.setEditable(true);
            
            CITYtxt.setEditable(true);
    }//GEN-LAST:event_EDITbtnActionPerformed

    private void UPDATEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEbtnActionPerformed
        N=IDtxt.getText();
        H=NAMEtxt.getText();
        M=ADDRESStxt.getText();
        L=CITYtxt.getText();
        P=PHONEtxt.getText();
       
        String query2; 
              try
               {
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mall","root","gaganak1");
                   stmt1=con.createStatement();
                 
                      int code=JOptionPane.showConfirmDialog(this,"Are you sure you want to update this information?","Confirm?",JOptionPane.YES_NO_OPTION);
                      if(code==JOptionPane.YES_OPTION)
                       {
query2="UPDATE Customer SET SHOPPER_ID=" + N + ", NAME = '" + H + "',PHONE=" + P + ",CITY='"+ L + "',ADDRESS='"+ M + "' WHERE SHOPPER_ID=" + N +";";
                         int ss=stmt1.executeUpdate(query2);
                         if(ss>0) JOptionPane.showMessageDialog(this,"Updation Successful!!");
                         else JOptionPane.showMessageDialog(this,"Incorect values entered");
                        }
               }
              catch(SQLException e){
                JOptionPane.showMessageDialog(this,e);
               }
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mall","root","gaganak1");
            stmt=con.createStatement();
            String query="SELECT * FROM Customer;";
            rs=stmt.executeQuery(query);
            rs.next();
            
        }
        catch(SQLException ec)
        {
            JOptionPane.showMessageDialog(this, ec);
        }
    }//GEN-LAST:event_UPDATEbtnActionPerformed

    private void DELETEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEbtnActionPerformed
        // TODO add your handling code here:
        M=IDtxt.getText();
     String query;
     Statement st;
     ResultSet r;
        try 
        {
            int code=JOptionPane.showConfirmDialog(this,"Are you sure you want to Delete this record?","Confirm?",JOptionPane.YES_NO_OPTION);
            if(code==JOptionPane.YES_OPTION)
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mall","root","gaganak1");
                query="DELETE FROM Customer WHERE SHOPPER_ID='" + M +"';";
                st=con.createStatement();
                int c1=st.executeUpdate(query);
                if(c1>0) JOptionPane.showMessageDialog(this,"Updation Successful!!");   
            }
        }
        catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex);
        }
        
    }//GEN-LAST:event_DELETEbtnActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        new CustListUI().setVisible(true);
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
                new CustListUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESStxt;
    private javax.swing.JTextField CITYtxt;
    private javax.swing.JButton DELETEbtn;
    private javax.swing.JButton DISPLAYbtn;
    private javax.swing.JButton EDITbtn;
    private javax.swing.JTextField IDtxt;
    private javax.swing.JTextField NAMEtxt;
    private javax.swing.JTextField PHONEtxt;
    private javax.swing.JTable TABLE;
    private javax.swing.JButton UPDATEbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void fetch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
