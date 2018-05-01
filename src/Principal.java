
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daalb
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        CargarLista();
        this.setLocationRelativeTo(null);
        resetColor(ingresar);
        resetColor(registrar);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icons8_Coins_96px_1.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        registrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user_login = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pass_login = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ingresar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(233, 247, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(164, 207, 190));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        cerrar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        cerrar.setForeground(new java.awt.Color(108, 110, 88));
        cerrar.setText("X");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrarMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(108, 110, 88));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sistema de valoración de inventario");

        Titulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(108, 110, 88));
        Titulo.setText("E&D SYSTEMS");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Coins_96px_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cerrar)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(207, 207, 207))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 150));

        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(108, 110, 88));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrarse");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Registration_30px.png"))); // NOI18N

        javax.swing.GroupLayout registrarLayout = new javax.swing.GroupLayout(registrar);
        registrar.setLayout(registrarLayout);
        registrarLayout.setHorizontalGroup(
            registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(registrarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registrarLayout.setVerticalGroup(
            registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );

        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 90, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_User_100px_1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 120));

        user_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_loginActionPerformed(evt);
            }
        });
        jPanel1.add(user_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 190, 30));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 110, 88));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 110, 30));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(108, 110, 88));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 120, 30));

        pass_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_loginActionPerformed(evt);
            }
        });
        jPanel1.add(pass_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 190, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Password_20px_1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 30, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_User_20px_2.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 30, 30));

        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(108, 110, 88));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ingresar");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Enter_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout ingresarLayout = new javax.swing.GroupLayout(ingresar);
        ingresar.setLayout(ingresarLayout);
        ingresarLayout.setHorizontalGroup(
            ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ingresarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        ingresarLayout.setVerticalGroup(
            ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(43, 43, 43))
        );

        jPanel1.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 90, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(240, 240, 240));
    }
    private void cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMousePressed
        System.exit(0);
    }//GEN-LAST:event_cerrarMousePressed
    int xx, xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);     }//GEN-LAST:event_jPanel2MouseDragged

    private void user_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_loginActionPerformed

    private void pass_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_loginActionPerformed

    private void registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseExited
        resetColor(registrar);
    }//GEN-LAST:event_registrarMouseExited

    private void registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseEntered
        setColor(registrar);
    }//GEN-LAST:event_registrarMouseEntered

    private void ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseEntered
        setColor(ingresar);
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarMouseEntered

    private void ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseExited
        resetColor(ingresar);
    }//GEN-LAST:event_ingresarMouseExited

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
        Registro rg = new Registro();
        rg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrarMouseClicked

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        Nodo_Usuario p = ptrU;
        while(p != null){
            if (pass_login.getText().equals(p.getPass())&&user_login.getText().toUpperCase().equals(p.getUser())){
                System.out.println("BIENVENIDO");
            }else{
                System.out.println("NO");
            }
            System.out.println(p.getPass() + p.getUser());
            p = p.getLink();
        }
                
        
    }//GEN-LAST:event_ingresarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel cerrar;
    private javax.swing.JPanel ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pass_login;
    private javax.swing.JPanel registrar;
    private javax.swing.JTextField user_login;
    // End of variables declaration//GEN-END:variables

    Nodo_Usuario ptrU = null;

    public void CargarLista() {
        Nodo_Usuario p;
        p = ptrU;
        String ruta = "usuarios.txt";
        File archivo_productos = new File(ruta);
        if (archivo_productos.exists()) {
            ptrU = null;
            String nombre = "", apellido = "", cedula = "", pass = "", user = "", tipo = "";
            File archivo;
            FileReader fr = null;
            BufferedReader br = null;
            try {
                archivo = new File("usuarios.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    int punt = 0;
                    int cont = 0;
                    for (int i = 0; i < linea.length(); i++) {
                        if (linea.substring(i, i + 1).equals(";")) {
                            if (punt == 0) {
                                user = linea.substring(cont, i);
                            }
                            if (punt == 1) {
                                pass = linea.substring(cont, i);
                            }
                            if (punt == 2) {
                                tipo = linea.substring(cont, i);
                            }
                            if (punt == 3) {
                                cedula = linea.substring(cont, i);
                            }
                            if (punt == 4) {
                                nombre = linea.substring(cont, i);
                            }
                            if (punt == 5) {
                                apellido = linea.substring(cont, i);
                            }
                            punt++;
                            cont = i + 1;
                        }
                    }
                    if (ptrU == null) {
                        ptrU = new Nodo_Usuario(nombre, apellido, cedula, pass, tipo, user, null);
                        ptrU.setLink(null);
                        p = ptrU;
                    } else {
                        Nodo_Usuario q = new Nodo_Usuario(nombre, apellido, cedula, pass, tipo, user, null);
                        p.setLink(q);
                        p = q;
                    }
                }
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            System.out.println("No hay archivo");
        }

    }
}
