package POSSim;

public class AboutPopup extends javax.swing.JPanel {

    public AboutPopup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        messageText = new javax.swing.JTextArea();

        setFont(new java.awt.Font("Courier New", 0, 18));

        messageText.setEditable(false);
        messageText.setColumns(20);
        messageText.setRows(5);
        jScrollPane1.setViewportView(messageText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }


    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea messageText;
}
