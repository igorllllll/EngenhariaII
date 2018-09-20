    
package engenharia.de.software;

import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        setSize(1000,560);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        txtlogin = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        logo1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        cadastrar = new javax.swing.JButton();
        entrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        txtlogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtlogin.setForeground(new java.awt.Color(255, 255, 255));
        txtlogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtlogin.setText("LOGIN:");
        getContentPane().add(txtlogin);
        txtlogin.setBounds(370, 260, 50, 20);

        login.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(login);
        login.setBounds(420, 260, 230, 21);

        logo1.setBackground(new java.awt.Color(0, 0, 0));
        logo1.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        logo1.setText("ada&alan");
        getContentPane().add(logo1);
        logo1.setBounds(50, 30, 100, 30);

        logo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("softwares");
        getContentPane().add(logo);
        logo.setBounds(70, 50, 60, 16);

        txtSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSenha.setText("SENHA:");
        getContentPane().add(txtSenha);
        txtSenha.setBounds(360, 320, 60, 20);

        senha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha);
        senha.setBounds(420, 320, 230, 21);

        cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        cadastrar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        cadastrar.setText("CADASTRAR");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(550, 360, 100, 24);

        entrar.setBackground(new java.awt.Color(255, 255, 255));
        entrar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        entrar.setText("ENTRAR");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(420, 360, 104, 24);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(340, 230, 340, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(340, 400, 340, 10);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(350, 220, 10, 190);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(670, 220, 20, 190);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 530);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engenharia/de/software/back.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 993, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        
    }//GEN-LAST:event_senhaActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        
        if(login.getText().equals("admin")&&senha.getText().equals("admin")){
            TelaPrincipal tlp = new TelaPrincipal();
            tlp.setVisible(true);
            tlp.setTitle("MENU");
            dispose();
            JOptionPane.showMessageDialog(null, "LOGIN EFETUADO");
        }else{
            JOptionPane.showMessageDialog(null, "LOGIN NÃO EFETUADO");
        }
      
        
    }//GEN-LAST:event_entrarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        
       TelaCadastroCliente tlc = new TelaCadastroCliente();
            tlc.setVisible(true);
            tlc.setTitle("CADASTRO CLIENTE");
            dispose();
        
        
        
    }//GEN-LAST:event_cadastrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField login;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtlogin;
    // End of variables declaration//GEN-END:variables
}
