/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibang;

//import java.awt.Container;
//import java.awt.FlowLayout;
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.awt.event.*;
/**
 *
 * @author LOVE MI
 */
public class Ticket_4 extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Ticket_4
     */
    String name_F;
    String time_F;
    JButton a_1,b_1,c_1,a_2,b_2,a_3,b_3,c_3;
    Ticket_5 JF5;
    public Ticket_4() {
//        initComponents();
//        setBak(); //調用背景方法
//        Container c = getContentPane(); //獲取JFrame面板
//        JPanel jp = new JPanel(); //創建個JPanel
//        jp.setOpaque(false); //把JPanel設置為透明 這樣就不會遮住後面的背景 這樣你就能在JPanel隨意加元件了
//        c.add(jp);       
//        setSize(618, 765);
//        setVisible(true);
    
    }
     public Ticket_4(String name) {
        initComponents();
        name_F=name;
        setBak(); //調用背景方法
        Container c = getContentPane(); //獲取JFrame面板
        JPanel jp = new JPanel(); //創建個JPanel
        jp.setOpaque(false); //把JPanel設置為透明 這樣就不會遮住後面的背景 這樣你就能在JPanel隨意加元件了
        c.add(jp);       
        setSize(618, 765);
        setVisible(true);
        check_Time(name_F);
    }
    public void setBak(){
            ((JPanel)this.getContentPane()).setOpaque(false);
            ImageIcon img = new ImageIcon("C:\\Users\\delilah\\Desktop\\JAVA期末專題\\ibang\\流程背景.png");
            JLabel background = new JLabel(img);
            this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
            background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        }
    public void check_Time(String name)
    {
        if(name=="R3HAB_live_Asia_tour_2016_台北")
        {
//            JRadioButton a=new JRadioButton("2016/1/1");
//            JRadioButton b=new JRadioButton("2016/1/8");
//            JRadioButton c=new JRadioButton("2016/1/18");
//            ButtonGroup Concert=new ButtonGroup();
              //this.setLayout(new FlowLayout(FlowLayout.CENTER,150,150));
              Icon a1=new ImageIcon("C:\\Users\\delilah\\Desktop\\JAVA期末專題\\ibang\\11.png");
              Icon b1=new ImageIcon("C:\\Users\\delilah\\Desktop\\JAVA期末專題\\ibang\\12.png");
              Icon c1=new ImageIcon("C:\\Users\\delilah\\Desktop\\JAVA期末專題\\ibang\\13.png");
              a_1=new JButton(a1);
              b_1=new JButton(b1);
              c_1=new JButton(c1);
              a_1.setBounds(50, 50, 198, 92);
              b_1.setBounds(50,250,198,92);
              c_1.setBounds(50,450,198,92);
              this.add(a_1);
              this.add(b_1);
              this.add(c_1);
              a_1.addActionListener(this);
              b_1.addActionListener(this);
              c_1.addActionListener(this);
              this.setVisible(true);
        }
        else if(name=="2016懷念金曲演唱會~鑽石亮晶晶林沖演唱會")
        {
             Icon a1=new ImageIcon("C:\\Users\\delilah\\Desktop\\JAVA期末專題\\ibang\\21.png");
             Icon b1=new ImageIcon("C:\\Users\\delilah\\Desktop\\JAVA期末專題\\ibang\\22.png");
             a_2=new JButton(a1);
             b_2=new JButton(b1);
             a_2.setBounds(50,250, 198, 92);
             b_2.setBounds(50,450,198,92);
             this.add(a_2);
             this.add(b_2);
             a_2.addActionListener(this);
             b_2.addActionListener(this);
             this.setVisible(true);
        }
        else if(name=="范瑋琪〔范范的感恩節〕音樂會")
        {
              Icon a1=new ImageIcon("C:\\Users\\delilah\\Desktop\\JAVA期末專題\\ibang\\31.png");
              Icon b1=new ImageIcon("C:\\Users\\delilah\\Desktop\\JAVA期末專題\\ibang\\32.png");
              Icon c1=new ImageIcon("C:\\Users\\delilah\\Desktop\\JAVA期末專題\\ibang\\33.png");
              a_3=new JButton(a1);
              b_3=new JButton(b1);
              c_3=new JButton(c1);
              a_3.setBounds(50, 50, 198, 92);
              b_3.setBounds(50,250,198,92);
              c_3.setBounds(50,450,198,92);
              this.add(a_3);
              this.add(b_3);
              this.add(c_3);
              a_3.addActionListener(this);
              b_3.addActionListener(this);
              c_3.addActionListener(this);
              this.setVisible(true);
        }
    }
       
      public void actionPerformed(ActionEvent e)
      {
        if(e.getSource()==a_1)
        {
            time_F="2016/1/1";
        }
        else if(e.getSource()==b_1)
        {
            time_F="2016/1/8";
        }
        else if(e.getSource()==c_1)
        {
            time_F="2016/1/18";
        }
        else if(e.getSource()==a_2)
        {
            time_F="2016/3/20";
        }
        else if(e.getSource()==b_2)
        {
            time_F="2016/3/29";
        }
        else if(e.getSource()==a_3)
        {
            time_F="2016/2/2";
        }
        else if(e.getSource()==b_3)
        {
            time_F="2016/2/19";
        }
        else if(e.getSource()==c_3)
        {
            time_F="2016/2/24";
        }
      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\delilah\\Desktop\\JAVA期末專題\\圖片\\確認.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(382, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JF5= new Ticket_5(name_F,time_F);//新增視窗
        JF5.setBounds(0, 0,this.getWidth(), this.getHeight());
        this.add(JF5);
        JF5.setVisible(true);//顯現
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ticket_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
