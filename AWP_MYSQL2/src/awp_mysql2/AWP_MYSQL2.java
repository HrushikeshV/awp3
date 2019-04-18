/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awp_mysql2;

import awp_mysql2.AWP_MYSQL2;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.DataOutputStream;
import java.io.File;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Admin
 */
public class AWP_MYSQL2 extends javax.swing.JFrame {

    /**
     * Creates new form project
     */
    String path ;
    int pos = 0;
    
    public AWP_MYSQL2() {
        initComponents();
        setParam();
    }
    
    public String[] getImages()
    {
        File file = new File(getClass().getResource("/awp_mysql2/photos").getFile()) ;
        String[] Images = file.list();
        return Images ;
    }
    
    public void showImages(int index)
    {
        //System.out.println(path);
        String[] Images = getImages() ;
        String ImageName = Images[index];
        //System.out.println(path);
        ImageIcon icon = new ImageIcon(getClass().getResource("/awp_mysql2/photos"+"/"+ImageName));
        Image image = icon.getImage().getScaledInstance(j1.getWidth(), j1.getHeight(),Image.SCALE_SMOOTH);
        j1.setIcon(new ImageIcon(image)) ;
        String ImageName3;
        int l = Images.length;
        if(index+2<Images.length)
        {
            ImageName3 = Images[(index+2)];
        }
        else
        {
            ImageName3 = Images[(index+2)%l];
        }
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/awp_mysql2/photos"+"/"+ImageName3));
        Image image3 = icon3.getImage().getScaledInstance(j7.getWidth(), j7.getHeight(),Image.SCALE_SMOOTH);
        j7.setIcon(new ImageIcon(image3)) ;
        
        
        String ImageName2;
        if(index+1<Images.length)
        {
            ImageName2 = Images[index+1];
        }
        else
        {
            ImageName2 = Images[(index+1)%l];
        }
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/awp_mysql2/photos"+"/"+ImageName2));
        Image image2 = icon2.getImage().getScaledInstance(j6.getWidth(), j6.getHeight(),Image.SCALE_SMOOTH);
        j6.setIcon(new ImageIcon(image2)) ;
        
        //System.out.println(path);
        
        
        j2.setText(/*"/awp_proj/photos"+"/"+*/ImageName);
    }
    
    public ImageIcon ResizeImage(String Imagepath)
    {
//        ImageIcon myimage = new ImageIcon(Imagepath) ;
//        Image img = myimage.getImage();
//        Image newimg = img.getScaledInstance(j1.getWidth(),j1.getHeight(),Image.SCALE_SMOOTH);
//        ImageIcon image = new ImageIcon(newimg);
//        return image;
          Image img1 = null;
          Toolkit tk = this.getToolkit();
          img1 = tk.getImage(Imagepath);
          Image img2 = img1.getScaledInstance(j1.getWidth(),j1.getHeight(),Image.SCALE_SMOOTH);
          ImageIcon i1 = new ImageIcon(img2);
          return i1;
          
    }
     private void setParam()
     {
         New.setVisible(false) ;
         Next.setVisible(false) ;
         Rename.setVisible(false) ;
         Delete.setVisible(false) ;
          rn.setVisible(false);
        j3.setVisible(false);
        t2.setVisible(false);
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        c1 = new javax.swing.JComboBox<>();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        j3 = new javax.swing.JLabel();
        rn = new javax.swing.JButton();
        j5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        j6 = new javax.swing.JLabel();
        j7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Next = new javax.swing.JMenuItem();
        Rename = new javax.swing.JMenuItem();
        Delete = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        c1.setFont(new java.awt.Font("Tahoma", 2, 22)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New", "Next", "Rename", "Delete" }));
        c1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        j2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        t2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        j3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        j3.setText("Enter New Name :");

        rn.setText("Rename");
        rn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnActionPerformed(evt);
            }
        });

        j5.setText("To load using FileChooser type 0");

        jLabel1.setText("To load from a package type 1");

        jLabel2.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PHOTO CHOOSER");

        File.setText("File");
        File.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        New.setText("NEW");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        File.add(New);

        Next.setText("NEXT");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        File.add(Next);

        Rename.setText("RENAME");
        Rename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenameActionPerformed(evt);
            }
        });
        File.add(Rename);

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        File.add(Delete);

        jMenuBar1.add(File);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 170, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(j6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(j7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(j3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rn)
                                .addGap(80, 80, 80))
                            .addComponent(j5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(j3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(rn)
                                .addGap(33, 33, 33)
                                .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenameActionPerformed
        // TODO add your handling code here:
        String username;
        username = login.user;
        try{
        InetAddress ip = InetAddress.getByName("localhost"); 
        Socket s = new Socket(ip, 5056); 
        DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
        dos.writeUTF(username);
        //dos.flush();
        dos.writeUTF("Rename");
        rn.setVisible(true);
        j3.setVisible(true);
        t2.setVisible(true);
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_RenameActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
        String s ;
        s = (String)c1.getSelectedItem() ;
        int i = c1.getSelectedIndex();
        
        if(s.equals("New"))
        {
            New.setVisible(true) ;
            c1.removeItemAt(i);
        }
        else if(s.equals("Next"))
        {
            Next.setVisible(true) ;
            c1.removeItemAt(i);
        }
        else if(s.equals("Rename"))
        {
            Rename.setVisible(true) ;
            c1.removeItemAt(i);
        }
       else if(s.equals("Delete"))
        {
            Delete.setVisible(true) ;
            c1.removeItemAt(i);
        }

       if(c1.getItemCount() == 0)
       {
           c1.setVisible(false);
       }
    }//GEN-LAST:event_c1ActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        // TODO add your handling code here:
        String username;
        username = login.user;
        System.out.println(username);
        try{
        InetAddress ip = InetAddress.getByName("localhost"); 
        Socket s = new Socket(ip, 5056); 
        DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
        dos.writeUTF(username);
        dos.writeUTF("New");
        JFileChooser chooser = new JFileChooser();
       
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        String option = t3.getText();
        
        if(option.equals("0"))
        {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif"," png");
            chooser.addChoosableFileFilter(filter);
            int result = chooser.showSaveDialog(null);
            if(result==JFileChooser.APPROVE_OPTION)
            {
                File selectedfile = chooser.getSelectedFile();
                String  path = selectedfile.getAbsolutePath();
                //System.out.println(path);
                j1.setIcon(ResizeImage(path));
                j2.setText(path);
            }
        }
        else
        {
            /*chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnVal = chooser.showOpenDialog(null);
            if(returnVal == JFileChooser.APPROVE_OPTION) 
            {
                   path = chooser.getSelectedFile().getAbsolutePath();
            }*/
            showImages(pos) ;
        }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_NewActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
         String username;
        username = login.user;
         try{
        InetAddress ip = InetAddress.getByName("localhost"); 
        Socket s = new Socket(ip, 5056); 
        DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
        dos.writeUTF(username);
        dos.writeUTF("Next");
        pos = pos + 1 ;
        if(pos>=getImages().length)
        {
            pos = 0 ;
        }
        showImages(pos) ;
        }
        catch(Exception e){}
    }//GEN-LAST:event_NextActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String username;
        username = login.user;
        System.out.println(username);
        try{
        InetAddress ip = InetAddress.getByName("localhost"); 
        Socket s = new Socket(ip, 5056); 
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF(username);
        dos.writeUTF("Delete");
        }
        catch(Exception e)
        {
        }
        j1.setIcon(null);
        j6.setIcon(null);
        j7.setIcon(null);
        rn.setVisible(false);
        j3.setVisible(false);
        t2.setVisible(false);
        j2.setText("");
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void rnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnActionPerformed
        // TODO add your handling code here:
        j2.setText(t2.getText());
    }//GEN-LAST:event_rnActionPerformed

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
            java.util.logging.Logger.getLogger(AWP_MYSQL2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AWP_MYSQL2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AWP_MYSQL2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AWP_MYSQL2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AWP_MYSQL2().setVisible(true);
            }
        });
    }

    public javax.swing.JLabel userlogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Delete;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem Next;
    private javax.swing.JMenuItem Rename;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel j6;
    private javax.swing.JLabel j7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton rn;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
