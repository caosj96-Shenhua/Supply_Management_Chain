package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shijun
 */
public class Factory_ManageUserAccountJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;

    public Factory_ManageUserAccountJPanel(JPanel userJpanel, Enterprise enterprise, EcoSystem ecoSystem) {
        this.userJpanel = userJpanel;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        initComponents();
        popOrganizationCombo();
        popData();
    }

    public void popOrganizationCombo() {
        orgCombo.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getOrgType() == Type.FactoryAdminOrg) {
                continue;
            }
            orgCombo.addItem(organization);
        }
    }

    public void populateEmployeeCombo(Organization organization) {
        employeeCombo.removeAllItems();
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            employeeCombo.addItem(employee);
        }
    }

    private void populateRoleCombo(Organization organization) {
        roleCombo.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            roleCombo.addItem(role);
        }
    }

    public void popData() {
        DefaultTableModel model = (DefaultTableModel) userJtable.getModel();
        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJtable.getModel()).addRow(row);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orgCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJtable = new javax.swing.JTable();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        titleJlabel = new javax.swing.JLabel();
        psdJlabel = new javax.swing.JLabel();
        orgJlabel = new javax.swing.JLabel();
        employeeJlabel = new javax.swing.JLabel();
        employeeCombo = new javax.swing.JComboBox<>();
        roleJlabel = new javax.swing.JLabel();
        roleCombo = new javax.swing.JComboBox<>();
        usernameJlabel = new javax.swing.JLabel();
        usernameJtext = new javax.swing.JTextField();
        psdField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 238, 236));

        orgCombo.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgCombo.setPreferredSize(new java.awt.Dimension(90, 30));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });

        userJtable.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        userJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userJtable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(userJtable);

        createBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        createBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        createBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        backBtn.setText("< Back");
        backBtn.setMaximumSize(new java.awt.Dimension(120, 30));
        backBtn.setMinimumSize(new java.awt.Dimension(120, 30));
        backBtn.setPreferredSize(new java.awt.Dimension(120, 30));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Manage User");
        titleJlabel.setMaximumSize(new java.awt.Dimension(270, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(270, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(270, 30));

        psdJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        psdJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        psdJlabel.setText("Password:");
        psdJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        psdJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        psdJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        orgJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        orgJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgJlabel.setText("Organization:");
        orgJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        orgJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        orgJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        employeeJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        employeeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeeJlabel.setText("Employee:");
        employeeJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        employeeJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        employeeJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        employeeCombo.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        employeeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeCombo.setPreferredSize(new java.awt.Dimension(90, 30));

        roleJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        roleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roleJlabel.setText("Role:");
        roleJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        roleJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        roleJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        roleCombo.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleCombo.setPreferredSize(new java.awt.Dimension(90, 30));

        usernameJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        usernameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameJlabel.setText("User Name:");
        usernameJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        usernameJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        usernameJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        usernameJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        usernameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        usernameJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        usernameJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        psdField.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        psdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        psdField.setPreferredSize(new java.awt.Dimension(120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(psdJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employeeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(orgCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(employeeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roleCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernameJtext, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(psdField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(573, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(employeeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(psdJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(employeeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(psdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(313, 313, 313))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String userName = usernameJtext.getText();
        String password = psdField.getText();
        if (!ecoSystem.checkIfUserIsUnique(userName)) {
            JOptionPane.showMessageDialog(null, "This name \"" + userName + "\" has been used, please use another name", "UserAccount", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Organization organization = (Organization) orgCombo.getSelectedItem();
        Employee employee = (Employee) employeeCombo.getSelectedItem();
        Role role = (Role) roleCombo.getSelectedItem();
        UserAccount userAccount = organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role, organization);
        popData();
        JOptionPane.showMessageDialog(null, "Create UserAccount OK!", "SUMBIT", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userJpanel.remove(this);
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        Organization organization = (Organization) orgCombo.getSelectedItem();
        if (organization != null) {
            populateEmployeeCombo(organization);
            populateRoleCombo(organization);
        }
    }//GEN-LAST:event_orgComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JComboBox<Object> employeeCombo;
    private javax.swing.JLabel employeeJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Object> orgCombo;
    private javax.swing.JLabel orgJlabel;
    private javax.swing.JPasswordField psdField;
    private javax.swing.JLabel psdJlabel;
    private javax.swing.JComboBox<Object> roleCombo;
    private javax.swing.JLabel roleJlabel;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JTable userJtable;
    private javax.swing.JLabel usernameJlabel;
    private javax.swing.JTextField usernameJtext;
    // End of variables declaration//GEN-END:variables
}
