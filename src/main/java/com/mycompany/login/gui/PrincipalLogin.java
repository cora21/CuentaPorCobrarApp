
package com.mycompany.login.gui;

import java.awt.Color;


public class PrincipalLogin extends javax.swing.JFrame {
    
    
    int xMouse, yMouse;
    public PrincipalLogin() {
        initComponents();
        loginBtn.requestFocus();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        barraSuperior = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        logoNombre = new javax.swing.JLabel();
        cityBg = new javax.swing.JLabel();
        logoSolo = new javax.swing.JLabel();
        iniciarSesion = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        contraseñaLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        campoContraseña = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorLayout.createSequentialGroup()
                .addGap(0, 779, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\login\\src\\main\\java\\com\\mycompany\\login\\imagenes\\logo.png")); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 160, 210));

        logoNombre.setBackground(new java.awt.Color(0, 0, 0));
        logoNombre.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        logoNombre.setForeground(new java.awt.Color(0, 0, 0));
        logoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoNombre.setText("Logo Empresa");
        logoNombre.setToolTipText("");
        background.add(logoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 290, -1));

        cityBg.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\login\\src\\main\\java\\com\\mycompany\\login\\imagenes\\web-app-manifest-512x512.png")); // NOI18N
        cityBg.setText("jLabel1");
        background.add(cityBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 410, 510));

        logoSolo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        logoSolo.setForeground(new java.awt.Color(0, 0, 0));
        logoSolo.setText("Logo");
        background.add(logoSolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 40));

        iniciarSesion.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        iniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        iniciarSesion.setText("INICIAR SESIÓN");
        background.add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 270, 40));

        usuarioLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        usuarioLabel.setText("USUARIO");
        background.add(usuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 90, 30));

        campoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        campoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        campoUsuario.setText("Ingrese su usuario");
        campoUsuario.setBorder(null);
        campoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoUsuarioMousePressed(evt);
            }
        });
        background.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 440, 40));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 440, 40));

        contraseñaLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        contraseñaLabel.setForeground(new java.awt.Color(0, 0, 0));
        contraseñaLabel.setText("CONTRASEÑA");
        background.add(contraseñaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 30));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 440, 40));

        campoContraseña.setBackground(new java.awt.Color(255, 255, 255));
        campoContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoContraseña.setText("********");
        campoContraseña.setBorder(null);
        campoContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoContraseñaMousePressed(evt);
            }
        });
        background.add(campoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 440, 40));

        loginBtn.setBackground(new java.awt.Color(0, 139, 207));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });

        loginBtnTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("ACCEDER");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraSuperiorMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        exitBtn.setBackground(Color.red);
        exitBtn.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        exitBtn.setBackground(Color.white);
        exitBtn.setForeground(Color.black);
    }//GEN-LAST:event_jLabel1MouseExited

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color(0, 139, 207));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginBtn.setBackground(new Color(0, 173, 255));
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseEntered

    private void campoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoUsuarioMousePressed
        if (campoUsuario.getText().trim().equals("Ingrese su usuario")) {
            campoUsuario.setText("");
            campoUsuario.setForeground(Color.black);
        }
        if(String.valueOf(campoContraseña.getPassword()).isEmpty()){
            campoContraseña.setText("********");
            campoContraseña.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_campoUsuarioMousePressed

    private void campoContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoContraseñaMousePressed
        if(String.valueOf(campoContraseña.getPassword()).equals("********")){
           campoContraseña.setText("");
           campoContraseña.setForeground(Color.black);
        }
        if(campoUsuario.getText().isEmpty()){
            campoUsuario.setText("Ingrese su usuario");
            campoUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoContraseñaMousePressed

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        //mo
    }//GEN-LAST:event_loginBtnMouseClicked

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
         javax.swing.JOptionPane.showMessageDialog(this, " El usuario ingresado es: " + campoUsuario.getText() + " La contraseña es "+ String.valueOf(campoContraseña.getPassword()), " LOGIN ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_loginBtnTxtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JPasswordField campoContraseña;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel cityBg;
    private javax.swing.JLabel contraseñaLabel;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel iniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoNombre;
    private javax.swing.JLabel logoSolo;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
