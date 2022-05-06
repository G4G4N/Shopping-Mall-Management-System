
import javax.swing.JOptionPane;

/**
 *
 * @author gagan
 */
public class MainMenuUI extends javax.swing.JFrame {

    /** Creates new form MainMenuUI */
    public MainMenuUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     */
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCustAdd = new javax.swing.JMenuItem();
        mnuItemAdd = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenuItem();
        mnuEmpAdd = new javax.swing.JMenuItem();
        mnuShopAdd = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ListCust = new javax.swing.JMenuItem();
        ListItem = new javax.swing.JMenuItem();
        ListOrder = new javax.swing.JMenuItem();
        listEmployee = new javax.swing.JMenuItem();
        listShop = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mall Management System");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<HTML> <BODY> WELCOME TO  <FONT COLOR=\"ORANGE\"> MALL</FONT> MANAGEMENT SYSTEM </BODY> </HTML>");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mall-management-3.jpg"))); // NOI18N
        jLabel1.setToolTipText("Mall Logo");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/15.png"))); // NOI18N
        jLabel3.setToolTipText("Exit");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16.png"))); // NOI18N
        jLabel4.setToolTipText("Project Information");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/19.png"))); // NOI18N
        jLabel5.setToolTipText("Refresh");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jMenu1.setForeground(new java.awt.Color(255, 0, 0));
        jMenu1.setText("Entry System");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnuCustAdd.setBackground(new java.awt.Color(255, 0, 51));
        mnuCustAdd.setText("Customer Entry");
        mnuCustAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCustAddActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCustAdd);

        mnuItemAdd.setText("Item Entry");
        mnuItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemAddActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItemAdd);

        mnuOrder.setText("Invoice System");
        mnuOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOrderActionPerformed(evt);
            }
        });
        jMenu1.add(mnuOrder);

        mnuEmpAdd.setText("Employee Entry");
        mnuEmpAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEmpAddActionPerformed(evt);
            }
        });
        jMenu1.add(mnuEmpAdd);

        mnuShopAdd.setText("Shop Entry");
        mnuShopAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuShopAddActionPerformed(evt);
            }
        });
        jMenu1.add(mnuShopAdd);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 0, 255));
        jMenu2.setText("Manage Tables");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        ListCust.setText("Customer Table");
        ListCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListCustActionPerformed(evt);
            }
        });
        jMenu2.add(ListCust);

        ListItem.setText("Item Table");
        ListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListItemActionPerformed(evt);
            }
        });
        jMenu2.add(ListItem);

        ListOrder.setText("Order Table");
        ListOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOrderActionPerformed(evt);
            }
        });
        jMenu2.add(ListOrder);

        listEmployee.setText("Employee Table");
        listEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listEmployeeActionPerformed(evt);
            }
        });
        jMenu2.add(listEmployee);

        listShop.setText("Shop Table");
        listShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listShopActionPerformed(evt);
            }
        });
        jMenu2.add(listShop);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(635, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void mnuCustAddActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new CustINUI().setVisible(true);
}

    private void mnuItemAddActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new ItemINUI().setVisible(true);
}

    private void mnuOrderActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new OrderINUI().setVisible(true);
}

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
}

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {
        
}

    private void ListCustActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new CustListUI().setVisible(true);
    }

    private void ListItemActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new ItemListUI().setVisible(true);

    }

    private void ListOrderActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new OrdListUI().setVisible(true);

    }

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(this,"Developed By: Gagan Y, Gautam Mayya Y, Degala Gagan\n"
                                         + "Semester: 6\n"
                                         + "Subject: OOAD\n"
                                         + "School: PES University");
    }

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
        new MainMenuUI().setVisible(true);
        this.dispose();
    }

    private void listEmployeeActionPerformed(java.awt.event.ActionEvent evt) {
    
        new EmployeeListUI().setVisible(true);
        this.dispose();
    
    }

    private void mnuShopAddActionPerformed(java.awt.event.ActionEvent evt) {
        new ShopINUI().setVisible(true);
        this.dispose();
    }

    private void mnuEmpAddActionPerformed(java.awt.event.ActionEvent evt) {
        new EmployeeINUI().setVisible(true);
        this.dispose();
        
    }

    private void listShopActionPerformed(java.awt.event.ActionEvent evt) {
        new ShopListUI().setVisible(true);
        this.dispose();
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuUI().setVisible(true);
            }
        });
    }

    private javax.swing.JMenuItem ListCust;
    private javax.swing.JMenuItem ListItem;
    private javax.swing.JMenuItem ListOrder;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem listEmployee;
    private javax.swing.JMenuItem listShop;
    private javax.swing.JMenuItem mnuCustAdd;
    private javax.swing.JMenuItem mnuEmpAdd;
    private javax.swing.JMenuItem mnuItemAdd;
    private javax.swing.JMenuItem mnuOrder;
    private javax.swing.JMenuItem mnuShopAdd;
    // End of variables declaration                   

}
