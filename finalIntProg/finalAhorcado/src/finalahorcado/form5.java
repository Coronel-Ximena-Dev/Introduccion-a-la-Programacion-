/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalahorcado;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author coron
 */
public class form5 extends javax.swing.JFrame {

    /**
     * Creates new form form5
     */
    public form5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonD = new javax.swing.JButton();
        letraAst1D = new javax.swing.JLabel();
        letraAst2D = new javax.swing.JLabel();
        letraAst3D = new javax.swing.JLabel();
        letraAst4D = new javax.swing.JLabel();
        letraAst5D = new javax.swing.JLabel();
        letraAst6D = new javax.swing.JLabel();
        letraAst7D = new javax.swing.JLabel();
        letraAst8D = new javax.swing.JLabel();
        imErrorD = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        vida1D = new javax.swing.JLabel();
        vida2D = new javax.swing.JLabel();
        vida3D = new javax.swing.JLabel();
        ingJug = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/botonCorroborar.png"))); // NOI18N
        botonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDActionPerformed(evt);
            }
        });
        getContentPane().add(botonD);
        botonD.setBounds(240, 390, 180, 90);

        letraAst1D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letraAst.png"))); // NOI18N
        getContentPane().add(letraAst1D);
        letraAst1D.setBounds(0, 240, 90, 96);

        letraAst2D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letraAst.png"))); // NOI18N
        getContentPane().add(letraAst2D);
        letraAst2D.setBounds(80, 250, 85, 77);

        letraAst3D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letraAst.png"))); // NOI18N
        getContentPane().add(letraAst3D);
        letraAst3D.setBounds(160, 250, 96, 77);

        letraAst4D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letraAst.png"))); // NOI18N
        getContentPane().add(letraAst4D);
        letraAst4D.setBounds(240, 250, 88, 80);

        letraAst5D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letraAst.png"))); // NOI18N
        getContentPane().add(letraAst5D);
        letraAst5D.setBounds(320, 250, 90, 80);

        letraAst6D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letraAst.png"))); // NOI18N
        getContentPane().add(letraAst6D);
        letraAst6D.setBounds(400, 250, 96, 80);

        letraAst7D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letraAst.png"))); // NOI18N
        getContentPane().add(letraAst7D);
        letraAst7D.setBounds(480, 250, 96, 80);

        letraAst8D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letraAst.png"))); // NOI18N
        getContentPane().add(letraAst8D);
        letraAst8D.setBounds(560, 250, 110, 80);

        imErrorD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/imagenError.png"))); // NOI18N
        getContentPane().add(imErrorD);
        imErrorD.setBounds(80, 110, 100, 100);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/botonApag.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 20, 70, 70);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/botonAtras.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(470, 20, 70, 70);

        vida1D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/vidas.png"))); // NOI18N
        getContentPane().add(vida1D);
        vida1D.setBounds(250, 130, 80, 80);

        vida2D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/vidas.png"))); // NOI18N
        getContentPane().add(vida2D);
        vida2D.setBounds(350, 130, 80, 80);

        vida3D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/vidas.png"))); // NOI18N
        getContentPane().add(vida3D);
        vida3D.setBounds(450, 130, 80, 80);
        getContentPane().add(ingJug);
        ingJug.setBounds(260, 340, 130, 44);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/fondoJuego.jpeg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 660, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        form2 f2 = new form2();
        f2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
Random rnd = new Random();
int errorF=0, error=0,puntos, azar;
String [][] palabraD={{"P","L","A","S","T","I","C","O"},{"C","A","P","I","T","U","L","O"},{"F","L","A","M","E","N","C","O"},{"C","A","N","G","R","E","J","O"}};
    private void botonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDActionPerformed
        letraAst1D.setVisible(true);
        letraAst2D.setVisible(true);
        letraAst3D.setVisible(true);
        letraAst4D.setVisible(true);
        letraAst5D.setVisible(true);
        letraAst6D.setVisible(true);
        letraAst7D.setVisible(true);
        letraAst8D.setVisible(true);
        imErrorD.setVisible(true);
        vida1D.setVisible(true);
        vida2D.setVisible(true);
        vida3D.setVisible(true);
        String letra, letraError;
       from6 f6 = new from6();
        form7 f7 = new form7();
        Icon icono;
        
        azar = rnd.nextInt(4);
        switch(azar){
        case 0:
            letra=ingJug.getText();
            for(int i=0; i < palabraD[0].length; i++){
                if(palabraD[0][i].equalsIgnoreCase(letra)){
                    switch(letra){
                        case "p":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraP.png"));
                            letraAst1D.setIcon(icono);
                            break;
                        case "l":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraL.png"));
                            letraAst2D.setIcon(icono);
                            break;
                            case "a":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraA.png"));
                            letraAst3D.setIcon(icono);
                            break;
                        case "s":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraS.png"));
                            letraAst4D.setIcon(icono);
                            break;
                            case "t":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraT.png"));
                            letraAst5D.setIcon(icono);
                            break;
                        case "i":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraI.png"));
                            letraAst6D.setIcon(icono);
                            break;
                            case "c":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraC.png"));
                            letraAst7D.setIcon(icono);
                            break;
                            case "o":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraO.png"));
                            letraAst8D.setIcon(icono);
                            break;
                        
                    }
                }else{
                    error +=1;
                }
                errorF = error / 8;
                
            }
            if(errorF == 1){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida1D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError1.png"));
               imErrorD.setIcon(icono);
            }else{
                if(errorF == 2){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida2D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError2.png"));
               imErrorD.setIcon(icono);
                }else{
                    if(errorF == 3){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida2D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError3.png"));
               imErrorD.setIcon(icono);
               f6.setVisible(true);
                this.dispose();
                    }else{
                        if(puntos >= 4){
                            
       f7.setVisible(true);
       this.dispose();
                        }
                    }
                }
            }
        break;
        case 1:
            letra=ingJug.getText();
            for(int i=0; i < palabraD[1].length; i++){
                if(palabraD[1][i].equalsIgnoreCase(letra)){
                    switch(letra){
                        case "c":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraC.png"));
                            letraAst1D.setIcon(icono);
                            break;
                        case "a":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraA.png"));
                            letraAst2D.setIcon(icono);
                            break;
                        case "p":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraP.png"));
                            letraAst3D.setIcon(icono);
                            break;
                        case "i":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraI.png"));
                            letraAst4D.setIcon(icono);
                            break;
                            case "t":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraT.png"));
                            letraAst5D.setIcon(icono);
                            break;
                            case "u":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraU.png"));
                            letraAst6D.setIcon(icono);
                            break;
                            case "l":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraL.png"));
                            letraAst7D.setIcon(icono);
                            break;
                            case "0":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraO.png"));
                            letraAst8D.setIcon(icono);
                            break;
                        
                    }
                }else{
                    error +=1;
                }
                errorF = error / 8;
                
            }
            if(errorF == 1){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida1D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError1.png"));
               imErrorD.setIcon(icono);
            }else{
                if(errorF == 2){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida2D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError2.png"));
               imErrorD.setIcon(icono);
                }else{
                    if(errorF == 3){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida2D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError3.png"));
               imErrorD.setIcon(icono);
               f6.setVisible(true);
                this.dispose();
                    }else{
                        if(puntos >= 4){
                            
       f7.setVisible(true);
       this.dispose();
                        }
                    }
                }
            }
        break;
        case 2:
            letra=ingJug.getText();
            for(int i=0; i < palabraD[2].length; i++){
                if(palabraD[2][i].equalsIgnoreCase(letra)){
                    switch(letra){
                        case "f":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraF.png"));
                            letraAst1D.setIcon(icono);
                            break;
                        case "l":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraL.png"));
                            letraAst2D.setIcon(icono);
                            break;
                        case "a":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraA.png"));
                            letraAst3D.setIcon(icono);
                            break;
                        case "m":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraM.png"));
                            letraAst4D.setIcon(icono);
                            break;
                            case "e":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraE.png"));
                            letraAst5D.setIcon(icono);
                            break;
                            case "n":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraN.png"));
                            letraAst6D.setIcon(icono);
                            break;
                            case "c":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraC.png"));
                            letraAst7D.setIcon(icono);
                            break;
                            case "o":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraO.png"));
                            letraAst8D.setIcon(icono);
                            break;
                        
                    }
                }else{
                    error +=1;
                }
                errorF = error / 8;
                
            }
            if(errorF == 1){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida1D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError1.png"));
               imErrorD.setIcon(icono);
            }else{
                if(errorF == 2){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida2D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError2.png"));
               imErrorD.setIcon(icono);
                }else{
                    if(errorF == 3){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida2D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError3.png"));
               imErrorD.setIcon(icono);
               f6.setVisible(true);
                this.dispose();
                    }else{
                        if(puntos >= 4){
                            
       f7.setVisible(true);
       this.dispose();
                        }
                    }
                }
            }
        break;
        case 3:
            letra=ingJug.getText();
            for(int i=0; i < palabraD[3].length; i++){
                if(palabraD[3][i].equalsIgnoreCase(letra)){
                    switch(letra){
                        case "c":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraC.png"));
                            letraAst1D.setIcon(icono);
                            break;
                        case "a":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraA.png"));
                            letraAst2D.setIcon(icono);
                            break;
                        case "n":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraN.png"));
                            letraAst3D.setIcon(icono);
                            break;
                            case "g":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraG.png"));
                            letraAst4D.setIcon(icono);
                            break;
                        case "r":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraR.png"));
                            letraAst5D.setIcon(icono);
                            break;
                            case "e":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraE.png"));
                            letraAst6D.setIcon(icono);
                            break;
                            case "j":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraJ.png"));
                            letraAst7D.setIcon(icono);
                            break;
                            case "o":
                            puntos +=1;
                            error=0;
                            icono = new ImageIcon(getClass().getResource("/imag/letraO.png"));
                            letraAst8D.setIcon(icono);
                            break;
                        
                    }
                }else{
                    error +=1;
                }
                errorF = error / 8;
                
            }
            if(errorF == 1){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida1D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError1.png"));
               imErrorD.setIcon(icono);
            }else{
                if(errorF == 2){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida2D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError2.png"));
               imErrorD.setIcon(icono);
                }else{
                    if(errorF == 3){
                icono = new ImageIcon(getClass().getResource("/imag/vidaPerdida.png"));
               vida2D.setIcon(icono);
               icono = new ImageIcon(getClass().getResource("/imag/imagenError3.png"));
               imErrorD.setIcon(icono);
               f6.setVisible(true);
                this.dispose();
                    }else{
                        if(puntos >= 4){
                            
       f7.setVisible(true);
       this.dispose();
                        }
                    }
                }
            }
        break;
        
    }
    }//GEN-LAST:event_botonDActionPerformed

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
            java.util.logging.Logger.getLogger(form5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonD;
    private javax.swing.JLabel imErrorD;
    private javax.swing.JTextField ingJug;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel letraAst1D;
    private javax.swing.JLabel letraAst2D;
    private javax.swing.JLabel letraAst3D;
    private javax.swing.JLabel letraAst4D;
    private javax.swing.JLabel letraAst5D;
    private javax.swing.JLabel letraAst6D;
    private javax.swing.JLabel letraAst7D;
    private javax.swing.JLabel letraAst8D;
    private javax.swing.JLabel vida1D;
    private javax.swing.JLabel vida2D;
    private javax.swing.JLabel vida3D;
    // End of variables declaration//GEN-END:variables
}
