/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textpane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import static java.lang.System.out;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.util.Arrays.stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.rtf.RTFEditorKit;
/**
 *
 * @author shenruijin
 */
public class editorFrame extends javax.swing.JFrame {

    /**
     * Creates new form editorFrame
     */
    private Connection myConnection;

    
    public editorFrame() {
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

        B_Bold = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TPane = new javax.swing.JTextPane();
        Italic = new javax.swing.JButton();
        colorButton = new javax.swing.JButton();
        UnderlineBotton = new javax.swing.JButton();
        StrikethroughBotton = new javax.swing.JButton();
        Fsize = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        B_Bold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bold_os.png"))); // NOI18N
        B_Bold.setMargin(new java.awt.Insets(1, 2, 0, 2));
        B_Bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BoldActionPerformed(evt);
            }
        });

        TPane.setContentType("text/rtf"); // NOI18N
        RTFEditorKit rtf = new RTFEditorKit();
        TPane.setEditorKit(rtf);

        jScrollPane2.setViewportView(TPane);

        Italic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Italic_os2.png"))); // NOI18N
        Italic.setMargin(new java.awt.Insets(1, 2, 0, 2));
        Italic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalicActionPerformed(evt);
            }
        });

        colorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Color3.png"))); // NOI18N
        colorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        UnderlineBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Underline_os.png"))); // NOI18N
        UnderlineBotton.setMargin(new java.awt.Insets(1, 2, 0, 2));
        UnderlineBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnderlineBottonActionPerformed(evt);
            }
        });

        StrikethroughBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Strike_os2.png"))); // NOI18N
        StrikethroughBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrikethroughBottonActionPerformed(evt);
            }
        });

        Fsize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Font3.png"))); // NOI18N
        Fsize.setBorderPainted(false);
        Fsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FsizeActionPerformed(evt);
            }
        });

        jButton1.setText("Connect");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Get");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(colorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Bold, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UnderlineBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StrikethroughBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Italic, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fsize, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(UnderlineBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_Bold, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Italic, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(StrikethroughBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fsize, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(colorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BoldAndItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoldAndItalicActionPerformed

    }//GEN-LAST:event_BoldAndItalicActionPerformed

    private void RegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegularActionPerformed

    }//GEN-LAST:event_RegularActionPerformed

    private void FsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FsizeActionPerformed
        Action b = new FontAndSizeAction();
        b.actionPerformed(evt);
    }//GEN-LAST:event_FsizeActionPerformed

    private void StrikethroughBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrikethroughBottonActionPerformed
        Action b = new StrikethroughAction();
        b.actionPerformed(evt);
    }//GEN-LAST:event_StrikethroughBottonActionPerformed

    private void UnderlineBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnderlineBottonActionPerformed
        Action b = new UnderlineAction();
        b.actionPerformed(evt);
    }//GEN-LAST:event_UnderlineBottonActionPerformed

    private void ItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItalicActionPerformed
        Action b = new ItalicAction();
        b.actionPerformed(evt);
    }//GEN-LAST:event_ItalicActionPerformed

    private void B_BoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BoldActionPerformed
        Action b = new BoldAction();
        b.actionPerformed(evt);
    }//GEN-LAST:event_B_BoldActionPerformed

    private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButtonActionPerformed
        Action b = new ForegroundAction();
        b.actionPerformed(evt);
    }//GEN-LAST:event_colorButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
        
        Class.forName("com.mysql.jdbc.Driver");
        myConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/samp_db","root", "secret_root_password"
                );
        System.out.println("connected");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Failed to get connection");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        ByteArrayOutputStream str = new ByteArrayOutputStream();                   
        try {
            TPane.getEditorKit().write(str, TPane.getDocument(), 0, TPane.getDocument().getLength());
        } catch (IOException | BadLocationException ex) {
            Logger.getLogger(editorFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //conver bytearryoutputstream to byte array
        byte[] bkey = str.toByteArray();
        
        //convert byte array to string for checking; it's an alternative way to obtain rtf code.
        String rtfstring = str.toString();
        System.out.println(rtfstring);

        String insertStr="";
        
        try{
            
            insertStr="insert into text (texttext) values(?)";
            PreparedStatement pstmt = myConnection.prepareStatement(insertStr);
            pstmt.setBytes(1, bkey);            
            System.out.println("1 row inserted");
            pstmt.execute();
            //clear the text pane if you want
            TPane.setText("");
        }
        catch(Exception e){
            System.out.println("Error occurred in inserting data");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        //clear the screen firstly.
        TPane.setText("");
        
        RTFEditorKit rtf = new RTFEditorKit();
        TPane.setEditorKit(rtf);
        
        String insertStr2="";
        
        try {
            stmt2 = myConnection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(editorFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            
            insertStr2="select * from text";

            ResultSet done = stmt2.executeQuery(insertStr2);
            
            
            while (done.next()) {
                //Blob bytesout = done.getBlob("");
                byte[] bytesout = done.getBytes("texttext");
                InputStream stream = new ByteArrayInputStream(bytesout);
                TPane.getEditorKit().read(stream, TPane.getDocument(), 0);
            }
            
            
            //byte[] resultSetAsByte = resultSetAsString.getBytes();
            //BufferedReader bytestr2 = new BufferedReader(new InputStreamReader(resultSetAsByte));            
            
        }
        catch(SQLException | IOException | BadLocationException e){
            System.out.println("Error occurred in getting data");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public Connection getMyConnection(){
        return myConnection;
    }
    
    public String quotate(String content){
        
        return "'"+content+"'";
    }
        
    class ItalicAction extends StyledEditorKit.StyledTextAction {

        private static final long serialVersionUID = -1428340091100055456L;

        public ItalicAction() {
            super("font-italic");
        }

        public String toString() {
            return "Italic";
        }

        public void actionPerformed(ActionEvent e) {
            JEditorPane editor = getEditor(e);
            if (editor != null) {
                StyledEditorKit kit = getStyledEditorKit(editor);
                MutableAttributeSet attr = kit.getInputAttributes();
                boolean italic = (StyleConstants.isItalic(attr)) ? false : true;
                SimpleAttributeSet sas = new SimpleAttributeSet();
                StyleConstants.setItalic(sas, italic);
                setCharacterAttributes(editor, sas, false);
            }
        }
    }

    class ForegroundAction extends StyledEditorKit.StyledTextAction {

        private static final long serialVersionUID = 6384632651737400352L;

        JColorChooser colorChooser = new JColorChooser();

        JDialog dialog = new JDialog();

        boolean noChange = false;

        boolean cancelled = false;

        public ForegroundAction() {
            super("foreground");

        }

        public void actionPerformed(ActionEvent e) {
            JTextPane editor = (JTextPane) getEditor(e);

            if (editor == null) {
                JOptionPane.showMessageDialog(null,
                        "You need to select the editor pane before you can change the color.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            int p0 = editor.getSelectionStart();
            StyledDocument doc = getStyledDocument(editor);
            Element paragraph = doc.getCharacterElement(p0);
            AttributeSet as = paragraph.getAttributes();
            fg = StyleConstants.getForeground(as);
            if (fg == null) {
                fg = Color.BLACK;
            }
            colorChooser.setColor(fg);

            JButton accept = new JButton("OK");
            accept.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    fg = colorChooser.getColor();
                    dialog.dispose();
                }
            });

            JButton cancel = new JButton("Cancel");
            cancel.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    cancelled = true;
                    dialog.dispose();
                }
            });

            JButton none = new JButton("None");
            none.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    noChange = true;
                    dialog.dispose();
                }
            });

            JPanel buttons = new JPanel();
            buttons.add(accept);
            buttons.add(none);
            buttons.add(cancel);

            dialog.getContentPane().setLayout(new BorderLayout());
            dialog.getContentPane().add(colorChooser, BorderLayout.CENTER);
            dialog.getContentPane().add(buttons, BorderLayout.SOUTH);
            dialog.setModal(true);
            dialog.pack();
            dialog.setVisible(true);

            if (!cancelled) {

                MutableAttributeSet attr = null;
                if (editor != null) {
                    if (fg != null && !noChange) {
                        attr = new SimpleAttributeSet();
                        StyleConstants.setForeground(attr, fg);
                        setCharacterAttributes(editor, attr, false);
                    }
                }
            }// end if color != null
            noChange = false;
            cancelled = false;
        }

        private Color fg;
    }

    class FontAndSizeAction extends StyledEditorKit.StyledTextAction {

        private static final long serialVersionUID = 584531387732416339L;

        private String family;

        private float fontSize;

        JDialog formatText;

        private boolean accept = false;

        JComboBox fontFamilyChooser;

        JComboBox fontSizeChooser;

        public FontAndSizeAction() {
            super("Font and Size");
        }

        public String toString() {
            return "Font and Size";
        }


         
        public void actionPerformed(ActionEvent e) {
            
            JTextPane editor = (JTextPane) getEditor(e);
            int p0 = editor.getSelectionStart();
            StyledDocument doc = getStyledDocument(editor);
            Element paragraph = doc.getCharacterElement(p0);
            AttributeSet as = paragraph.getAttributes();

            family = StyleConstants.getFontFamily(as);
            fontSize = StyleConstants.getFontSize(as);

            formatText = new JDialog(new JFrame(), "Font and Size", true);
            formatText.getContentPane().setLayout(new BorderLayout());

            JPanel choosers = new JPanel();
            choosers.setLayout(new GridLayout(2, 1));

            JPanel fontFamilyPanel = new JPanel();
            fontFamilyPanel.add(new JLabel("Font"));

            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            String[] fontNames = ge.getAvailableFontFamilyNames();

            fontFamilyChooser = new JComboBox();
            for (int i = 0; i < fontNames.length; i++) {
                fontFamilyChooser.addItem(fontNames[i]);
            }
            fontFamilyChooser.setSelectedItem(family);
            fontFamilyPanel.add(fontFamilyChooser);
            choosers.add(fontFamilyPanel);

            JPanel fontSizePanel = new JPanel();
            fontSizePanel.add(new JLabel("Size"));
            fontSizeChooser = new JComboBox();
            fontSizeChooser.setEditable(true);
            fontSizeChooser.addItem(new Float(4));
            fontSizeChooser.addItem(new Float(8));
            fontSizeChooser.addItem(new Float(12));
            fontSizeChooser.addItem(new Float(16));
            fontSizeChooser.addItem(new Float(20));
            fontSizeChooser.addItem(new Float(24));
            fontSizeChooser.setSelectedItem(new Float(fontSize));
            fontSizePanel.add(fontSizeChooser);
            choosers.add(fontSizePanel);

            JButton ok = new JButton("OK");
            ok.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    accept = true;
                    formatText.dispose();
                    family = (String) fontFamilyChooser.getSelectedItem();
                    fontSize = Float.parseFloat(fontSizeChooser.getSelectedItem().toString());
                }
            });

            JButton cancel = new JButton("Cancel");
            cancel.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    formatText.dispose();
                }
            });

            JPanel buttons = new JPanel();
            buttons.add(ok);
            buttons.add(cancel);
            formatText.getContentPane().add(choosers, BorderLayout.CENTER);
            formatText.getContentPane().add(buttons, BorderLayout.SOUTH);
            formatText.pack();
            formatText.setVisible(true);

            MutableAttributeSet attr = null;
            if (editor != null && accept) {
                attr = new SimpleAttributeSet();
                StyleConstants.setFontFamily(attr, family);
                StyleConstants.setFontSize(attr, (int) fontSize);
                setCharacterAttributes(editor, attr, false);
            }

        }
    }

    class BoldAction extends StyledEditorKit.StyledTextAction {

        private static final long serialVersionUID = 9174670038684056758L;

        public BoldAction() {
            super("font-bold");
        }

        public String toString() {
            return "Bold";
        }

        public void actionPerformed(ActionEvent e) {
            JEditorPane editor = getEditor(e);
            if (editor != null) {
                StyledEditorKit kit = getStyledEditorKit(editor);
                MutableAttributeSet attr = kit.getInputAttributes();
                boolean bold;
                bold = !(StyleConstants.isBold(attr));
                SimpleAttributeSet sas = new SimpleAttributeSet();
                StyleConstants.setBold(sas, bold);
                setCharacterAttributes(editor, sas, false);

            }
        }
    }

    class StrikethroughAction extends StyledEditorKit.StyledTextAction {

        private static final long serialVersionUID = 9174670038684056758L;

        public StrikethroughAction() {
            super("font-bold");
        }

        public String toString() {
            return "Strikethrough";
        }

        public void actionPerformed(ActionEvent e) {
            JEditorPane editor = getEditor(e);
            if (editor != null) {
                StyledEditorKit kit = getStyledEditorKit(editor);
                MutableAttributeSet attr = kit.getInputAttributes();
                boolean bold;
                bold = !(StyleConstants.isStrikeThrough(attr));
                SimpleAttributeSet sas = new SimpleAttributeSet();
                StyleConstants.setStrikeThrough(sas, bold);
                setCharacterAttributes(editor, sas, false);

            }
        }
    }

    class UnderlineAction extends StyledEditorKit.StyledTextAction {

        private static final long serialVersionUID = 9174670038684056758L;

        public UnderlineAction() {
            super("font-bold");
        }

        public String toString() {
            return "Underline";
        }

        public void actionPerformed(ActionEvent e) {
            JEditorPane editor = getEditor(e);
            if (editor != null) {
                StyledEditorKit kit = getStyledEditorKit(editor);
                MutableAttributeSet attr = kit.getInputAttributes();
                boolean bold;
                bold = !(StyleConstants.isUnderline(attr));
                SimpleAttributeSet sas = new SimpleAttributeSet();
                StyleConstants.setUnderline(sas, bold);
                setCharacterAttributes(editor, sas, false);

            }
        }
    }

    
    
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
            java.util.logging.Logger.getLogger(editorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editorFrame().setVisible(true);
            }
        });
    }
    private java.sql.Statement stmt2;
    private java.sql.Statement stmt;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Bold;
    private javax.swing.JButton Fsize;
    private javax.swing.JButton Italic;
    private javax.swing.JButton StrikethroughBotton;
    private javax.swing.JTextPane TPane;
    private javax.swing.JButton UnderlineBotton;
    private javax.swing.JButton colorButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
