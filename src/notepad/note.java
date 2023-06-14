/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.event.TextEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author NCCS
 */
public class note extends javax.swing.JFrame {
    
    String programName = "Notepad Pro";
    String filename = "";
    String holdText;
    String fn;
    String dir;
    boolean textChanged =false;
    String fileName;
    Clipboard clip = getToolkit().getSystemClipboard();

    /**
     * Creates new form note
     */
    public note() {
        initComponents();
        ImageIcon img = new ImageIcon("C:\\Notepad Pro\\ima.png");
        this.setIconImage(img.getImage());
    }

      public void checkFile()
      {
      
      BufferedReader read;
      StringBuffer sb = new StringBuffer();
      
      try{
          read = new BufferedReader(new FileReader(fileName));
          String line;
          while ((line = read.readLine()) !=null){
              sb.append(line + "\n");
          }
          textarea.setText(sb.toString());
          read.close();
      }
      
      catch (FileNotFoundException e){
          System.out.println("File not found");
      }      
      
      catch (IOException ioe) {
          
      }      
      }
      
      
      
      
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogColor = new javax.swing.JDialog();
        colorChooser = new javax.swing.JColorChooser();
        textarea = new java.awt.TextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        openMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        saveMenu = new javax.swing.JMenuItem();
        saveasMenu = new javax.swing.JMenuItem();
        colorMenu = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        moreinfoMenu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout dialogColorLayout = new javax.swing.GroupLayout(dialogColor.getContentPane());
        dialogColor.getContentPane().setLayout(dialogColorLayout);
        dialogColorLayout.setHorizontalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        dialogColorLayout.setVerticalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogColorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Notepad Pro Text Editor");
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        textarea.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textarea.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textareaTextValueChanged(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        newMenu.setText("New");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        jMenu1.add(newMenu);

        openMenu.setText("Open");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        jMenu1.add(openMenu);

        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenu);
        jMenu1.add(jSeparator1);

        jMenuItem4.setText("Home");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Save");

        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jMenu2.add(saveMenu);

        saveasMenu.setText("Save As");
        saveasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasMenuActionPerformed(evt);
            }
        });
        jMenu2.add(saveasMenu);

        jMenuBar1.add(jMenu2);

        colorMenu.setText("Edit");
        colorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorMenuActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Text Colour");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        colorMenu.add(jMenuItem6);

        jMenuItem3.setText("Text Editor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        colorMenu.add(jMenuItem3);

        jMenuItem2.setText("Screenshot");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        colorMenu.add(jMenuItem2);

        jMenuBar1.add(colorMenu);

        jMenu3.setText("Help");

        moreinfoMenu.setText("View Help");
        moreinfoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreinfoMenuActionPerformed(evt);
            }
        });
        jMenu3.add(moreinfoMenu);

        jMenuItem1.setText("Aboout Notepad Pro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textarea, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textarea, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        if(filename.equals(""))
            saveAs();
        else
            save(filename);
    }//GEN-LAST:event_jMenu1ActionPerformed
    
    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
       newFile();
    }//GEN-LAST:event_newMenuActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed
        if(textarea.getText().length() < 1){
            FileDialog fd = new FileDialog(this, "Choose File - NotepadPro", FileDialog.LOAD);
            fd.show();
            if(fd.getFile() !=null){
                fileName = fd.getDirectory() + fd.getFile();
                setTitle(fileName);
                checkFile();
            }
            textarea.requestFocus();
        }
        
        else if(!textChanged){
            save(filename);
            FileDialog fd = new FileDialog(this, "Choose File", FileDialog.LOAD);
            fd.show();
            if(fd.getFile() !=null){
                fileName = fd.getDirectory() + fd.getFile();
                setTitle(fileName);
                checkFile();
            }
            textarea.requestFocus();
            
        }
        else{
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save the current file?");
            if (confirm==JOptionPane.YES_OPTION)
            {
                if("".equals(filename)){
                    saveAs();
                }
                else{
                    save(filename);
                }
                FileDialog fd = new FileDialog(this, "Choose File - Notepad Pro", FileDialog.LOAD);
                fd.show();
                if(fd.getFile() !=null){
                    fileName = fd.getDirectory() + fd.getFile();
                    setTitle(fileName);
                    checkFile();
                    
                }
                textarea.requestFocus();
            }
            else if(confirm == JOptionPane.NO_OPTION){
                save(filename);
                FileDialog fd = new FileDialog(this, "Choose File", FileDialog.LOAD);
                fd.show();
                if(fd.getFile() !=null){
                    fileName = fd.getDirectory() + fd.getFile();
                    setTitle(fileName);
                    checkFile();
            }
                else{
                    fileName = fd.getDirectory() + fd.getFile();
                    setTitle(fileName);
                    checkFile();
                }
            }
        }
    }//GEN-LAST:event_openMenuActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        if("".equals(textarea.getText())){
            this.dispose();
        }
        else if(!textChanged){
             this.dispose();
        }
        else{
            int confirm = JOptionPane.showConfirmDialog(this, "Do you want to save this document before exit?");
            if (confirm==JOptionPane.YES_OPTION){
                if(filename.equals(""))
                    saveAs();
                else
                    save(filename);
                    this.dispose();
            }
            if (confirm==JOptionPane.NO_OPTION){
                this.dispose();
            }
        }
    }//GEN-LAST:event_exitMenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if("".equals(textarea.getText())){
            this.dispose();
        }
        else if(!textChanged){
            this.dispose();
        }
        else{
            int confirm = JOptionPane.showConfirmDialog(this, "Do you want to save this document before exit?");
            if (confirm==JOptionPane.YES_OPTION){
                if(filename.equals(""))
                    saveAs();
                else
                    save(filename);
                    this.dispose();
            }
            if (confirm==JOptionPane.NO_OPTION){
                this.dispose();
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        if(filename.equals(""))
            saveAs();
        else
            save(filename);
    }//GEN-LAST:event_saveMenuActionPerformed

    private void colorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorMenuActionPerformed
         
    }//GEN-LAST:event_colorMenuActionPerformed

    private void saveasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasMenuActionPerformed
        saveAs();
    }//GEN-LAST:event_saveasMenuActionPerformed

    private void textareaTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textareaTextValueChanged
        if(TextEvent.TEXT_VALUE_CHANGED!=0)
       {
           if(!textChanged)
               setTitle("Notepad Pro - "+getTitle());
           textChanged=true;
           saveMenu.setEnabled(true);
       }
    }//GEN-LAST:event_textareaTextValueChanged

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        edit x = new edit();
        x.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void moreinfoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreinfoMenuActionPerformed
        if(filename.equals(""))
        {saveAs();}
        else
        {save(filename);}
        
        help x = new help();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_moreinfoMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        if(filename.equals(""))
        {saveAs();}
        else
        {save(filename);}
        
        about x = new about();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(filename.equals(""))
        {saveAs();}
        else
        { save(filename);}
        screen x = new screen();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(filename.equals(""))
        {saveAs();}
        else
        { save(filename);}
        Entry x = new Entry();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new note().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JMenu colorMenu;
    private javax.swing.JDialog dialogColor;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem moreinfoMenu;
    private javax.swing.JMenuItem newMenu;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JMenuItem saveasMenu;
    public static java.awt.TextArea textarea;
    // End of variables declaration//GEN-END:variables

    private void saveAs() {
        
        FileDialog fd = new FileDialog(note.this, "Save",FileDialog.SAVE);
        fd.show();
        if (fd.getFile() != null) {
            
            fn=fd.getFile();
            dir=fd.getDirectory();
            filename = dir + fn +"";
            
            setTitle(filename);
            
            try
            {
                DataOutputStream d = new DataOutputStream(new FileOutputStream(filename));
                holdText = textarea.getText();
                BufferedReader br = new BufferedReader(new StringReader(holdText));
                while ((holdText = br.readLine()) != null){
                    d.writeBytes(holdText + "\r\n");
                    d.close();
                }
            }
            catch (Exception e){
                System.out.println("File not found");
            }
            textarea.requestFocus();
            save(filename);            
        }
        
        
        
        
        
            }

    private void save(String filename) {
        setTitle(programName+" "+filename);
        try
        {
            FileWriter out;
            out = new FileWriter(fn);
            out.write(textarea.getText());
            out.close();
        }
        catch(Exception err)
        {
            System.out.println("Error: " + err);
        }
        
        textChanged=false;
        saveMenu.setEnabled(true);
    }

    private void newFile() {
        if(textarea.getText().length() < 1){
            setTitle("Untitled-"+programName);
            textarea.setText("");
            textChanged=false;
        }
        else if(!textChanged){
            save(filename);
            setTitle("Untitled-"+programName);
            textarea.setText("");
            textChanged=false;
        }        
        
        else{
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save this file?");
            if (confirm==JOptionPane.YES_OPTION){
                if("".equals(filename)){
                    if("".equals(filename)){
                        saveAs();
                    }
                    else{
                        save(filename);
                    
                    setTitle("Untitled"+programName);
                    filename="";
                    textarea.setText("");
                    textChanged=false;
                    }
                    setTitle("Untitled-"+programName);
                    filename="";
                    textarea.setText("");
                    textChanged=false;
                }
                
                    
                
            
                
                   else{
                    save(filename);
                    setTitle("Untitled-"+programName);
                    filename="";
                    textarea.setText("");
                    textChanged=false;
                }
            }
            
            else if(confirm == JOptionPane.NO_OPTION){
            setTitle("Untitled-"+programName);
            textarea.setText("");
            textChanged=false;
            }
                
                   else{
                    
                }
        }
    }

    
  }
    

