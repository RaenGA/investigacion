/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFAZ;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.rmi.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static tareainvestigacion.mongodb.TareaInvestigacionMONGODB.coleccion;
import static tareainvestigacion.mongodb.TareaInvestigacionMONGODB.db;
import tareainvestigacion.mongodb.TareaInvestigacionMONGODB;
/**
 *
 * @author M Express
 */
public class Registro extends javax.swing.JFrame {
    JFileChooser archivo = new JFileChooser();
    File archi = archivo.getSelectedFile();
    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public boolean validar(){
        boolean val = true;
        if((txtCodigo.getText().isEmpty())&&(val == true)){
            val = false;
        }
        if((txtContraseña.getText().isEmpty())&&(val == true)){
            val = false;
        }
        if((txtCorreo.getText().isEmpty())&&(val == true)){
            val = false;
        }
        if((txtImage.getText().isEmpty())&&(val == true)){
            val = false;
        }
        return val;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtImage = new javax.swing.JTextField();
        btnImage = new javax.swing.JButton();
        chkFoto = new javax.swing.JCheckBox();
        chkCorreo = new javax.swing.JCheckBox();
        labelFoto = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Contraseña");

        jLabel3.setText("Correo");

        jLabel4.setText("Foto");

        txtImage.setEnabled(false);

        btnImage.setText("Seleccionar foto");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        chkFoto.setText("Mostrar Foto");

        chkCorreo.setText("Mostrar Correo");

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel5.setText("Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkCorreo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkFoto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtContraseña)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtImage, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFinalizar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnImage, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnImage)))
                .addGap(18, 18, 18)
                .addComponent(chkFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizar)
                .addGap(10, 10, 10)
                .addComponent(chkCorreo)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        JFileChooser archivo = new JFileChooser();
        int ventana =  archivo.showOpenDialog(null);
        if(ventana == JFileChooser.APPROVE_OPTION)
        {
            /*https://stackoverflow.com/questions/16343098/resize-a-picture-to-fit-a-jlabel*/
            File file = archivo.getSelectedFile();
            txtImage.setText(String.valueOf(file));
            
            BufferedImage img = null;
                try {
                    img = ImageIO.read(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            Image dimg = getToolkit().getImage(txtImage.getText());
            dimg = dimg.getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), Image.SCALE_DEFAULT);
            labelFoto.setIcon(new ImageIcon(dimg));
            
            archi = file;
            /*Imagen Imagen = new Imagen(txtImage.getText());
            jPanel1.add(Imagen);
            jPanel1.repaint();*/
        }
    }//GEN-LAST:event_btnImageActionPerformed
    public void addImage(File image, String imageName) throws UnknownHostException, IOException{
        GridFS gfsImageCollection = new GridFS(coleccion.getDB(), "image");
        GridFSInputFile gfsFile = gfsImageCollection.createFile(image);
        gfsFile.setFilename(imageName);
        gfsFile.save();
    }
    
    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if(validar() == false){
            JOptionPane.showMessageDialog(null, "No pueden existir campos vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(txtCodigo.getText().length() <= 15){
                int foto = 0, correo = 0;
                if(chkFoto.isSelected()){
                    foto = 1;
                }
                if(chkCorreo.isSelected()){
                    correo = 1;
                }
                
                String contrasenaEncriptada = TareaInvestigacionMONGODB.encriptar(txtContraseña.getText());
                coleccion = db.getCollection("aficionados");
                DBCursor cursor = coleccion.find();
                int encontrado = 0;
                while(cursor.hasNext()){
                    DBObject actual = cursor.next();
                    String cAficionado = (String) actual.get("codigoAficionado");
                    if(cAficionado.equals(txtCodigo.getText())){
                        JOptionPane.showMessageDialog(null, "Codigo de Usuario Incorrecto. Ingrese uno diferente.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        encontrado = 1;
                        break;
                    }
                }
                if(encontrado == 0){
                    BasicDBObject document = new BasicDBObject();
                    document.put("codigoAficionado", txtCodigo.getText());
                    document.put("contrasenna", contrasenaEncriptada);
                    document.put("correo", txtCorreo.getText());
                    document.put("imagen", txtImage.getText());
                    document.put("mFoto", foto);
                    document.put("mCorreo", correo);
                    coleccion.insert(document);
                    try {
                        addImage(archi, archi.getName());
                    } catch (IOException ex) {
                        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        // TODO add your handling code here:
                    JOptionPane.showMessageDialog(null, "Se realizo con exito la operacion");
                    Inicio ini = new Inicio(); 
                    ini.setVisible(true);
                    this.setVisible(false);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Codigo de Usuario mayor a 15 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }       
    }//GEN-LAST:event_btnFinalizarActionPerformed

       
    
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnImage;
    private javax.swing.JCheckBox chkCorreo;
    private javax.swing.JCheckBox chkFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtImage;
    // End of variables declaration//GEN-END:variables

}
