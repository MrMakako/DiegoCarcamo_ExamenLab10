/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab10examen;

import Objetos.Cientifico;
import Objetos.Gaseoso;
import Objetos.Planeta;
import Objetos.Terrestre;
import java.awt.Color;
import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Diego Carcamo
 */
public class Aplicacion extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacion
     */
    Datos dat = new Datos();

    ArrayList<Planeta> PlanetasPublicos;
    
    Planeta Planeta1c;
    Planeta Planeta2c;
    
    
    Cientifico SelectedCTF;
    
    

    public Aplicacion() {
        PlanetasPublicos = new ArrayList<>();

        CrearPublicos();

        initComponents();
        FillComboBox();
        
        PublicBtn.setSelected(true);
        try{
             SelectedCTF=dat.find( CajaCientificos.getItemAt(0).toString());

            CrearArbol(PlanetasPublicos);
        
        
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null,"Agregue un cientifico");
        
        
        }
       
    }
    
    
    public Planeta getPublicPlanet(String nombre){
        for (Planeta p:PlanetasPublicos){
        
            if(p.toString().equals(nombre))
                return p;
            
            
       
            
          
        
        }
        
        
          return null;
    
    
    }

    public void FillComboBox() {

        ArrayList<Cientifico> Lista = dat.getCientificos();
        String Nombres[] = new String[Lista.size()];
        for (int i = 0; i < Lista.size(); i++) {

            Nombres[i] = Lista.get(i).toString();

        }

        CajaCientificos.setModel(new DefaultComboBoxModel<Object>(Lista.toArray()));

    }

    public void CrearPublicos() {

        PlanetasPublicos.add(new Terrestre("Mercurio", 5000, 13000, 400, 300));
        PlanetasPublicos.add(new Terrestre("Venus", 100000, 15000, 640, 260));
        PlanetasPublicos.add(new Terrestre("Tierra", 140000, 17000, 760, 570));

    }

    public void CrearArbol(ArrayList<Planeta> p) {

        DefaultTreeModel model = (DefaultTreeModel) ArbolPlaneta.getModel();

        DefaultMutableTreeNode node = new DefaultMutableTreeNode();

        for (Planeta planet : p) {
            node.add(new DefaultMutableTreeNode(planet.toString()));

        }

        model.setRoot(node);

        model.reload();
        
        
        

    }

    public void fillBox() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPlaneta = new javax.swing.JPopupMenu();
        Planeta1 = new javax.swing.JMenuItem();
        Planeta2 = new javax.swing.JMenuItem();
        ImpactBar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        ArbolPlaneta = new javax.swing.JTree();
        PublicBtn = new javax.swing.JCheckBox();
        CajaCientificos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        NameField = new javax.swing.JTextField();
        SelecteP1 = new javax.swing.JTextField();
        SelectedP2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LabelDist = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ImpactTime = new javax.swing.JLabel();
        FuerzaBar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        Planeta1.setText("Planeta1");
        Planeta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Planeta1MouseClicked(evt);
            }
        });
        Planeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planeta1ActionPerformed(evt);
            }
        });
        MenuPlaneta.add(Planeta1);

        Planeta2.setText("Planeta2");
        Planeta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planeta2ActionPerformed(evt);
            }
        });
        MenuPlaneta.add(Planeta2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ImpactBar.setForeground(new java.awt.Color(51, 255, 102));

        ArbolPlaneta.setForeground(new java.awt.Color(204, 204, 204));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        ArbolPlaneta.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        ArbolPlaneta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArbolPlanetaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ArbolPlaneta);

        PublicBtn.setText("Public");
        PublicBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PublicBtnStateChanged(evt);
            }
        });
        PublicBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PublicBtnMouseClicked(evt);
            }
        });
        PublicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublicBtnActionPerformed(evt);
            }
        });

        CajaCientificos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        CajaCientificos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CajaCientificosItemStateChanged(evt);
            }
        });
        CajaCientificos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CajaCientificosMouseClicked(evt);
            }
        });
        CajaCientificos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaCientificosActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar Cientificos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        SelecteP1.setEditable(false);
        SelecteP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecteP1ActionPerformed(evt);
            }
        });

        SelectedP2.setEditable(false);

        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Distancia");

        jLabel2.setText("Tiempo de impacto:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pngwing.com.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SelecteP1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(SelectedP2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LabelDist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ImpactTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CajaCientificos, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(FuerzaBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                            .addComponent(PublicBtn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImpactBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImpactBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(FuerzaBar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelecteP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(LabelDist, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelectedP2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(ImpactTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(CajaCientificos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addComponent(PublicBtn)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dat.addCientifico(NameField.getText());
        
        FillComboBox();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PublicBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PublicBtnStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_PublicBtnStateChanged

    private void ArbolPlanetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArbolPlanetaMouseClicked
        // TODO add your handling code here:
        if (SwingUtilities.isRightMouseButton(evt)) {
            if (!ArbolPlaneta.isSelectionEmpty()) {

                MenuPlaneta.show(ArbolPlaneta, evt.getX(), evt.getY());
                
                
            }

        }


    }//GEN-LAST:event_ArbolPlanetaMouseClicked

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void CajaCientificosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CajaCientificosItemStateChanged
        // TODO add your handling code here:
        
        CrearArbol(dat.find(CajaCientificos.getSelectedItem().toString()).getDescubrimientos());
        SelectedCTF=dat.find(CajaCientificos.getSelectedItem().toString());
        System.out.println(CajaCientificos.getSelectedItem().toString());
        
        
    }//GEN-LAST:event_CajaCientificosItemStateChanged

    private void PublicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublicBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PublicBtnActionPerformed

    private void Planeta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Planeta1MouseClicked

        
        
    }//GEN-LAST:event_Planeta1MouseClicked

    private void Planeta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Planeta1ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
       SelecteP1.setText( ArbolPlaneta.getSelectionPath().getLastPathComponent().toString());
        System.out.println("Selected P1");
        if(PublicBtn.isSelected()){
            System.out.println("public sleceted");
            
            Planeta1c=getPublicPlanet(SelecteP1.getText());
        
        }else{
              Planeta1c=SelectedCTF.Find(SelecteP1.getText());
            
              System.out.println("priv sleceted");
        }
        
    }//GEN-LAST:event_Planeta1ActionPerformed

    private void Planeta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Planeta2ActionPerformed
        // TODO add your handling code here:
       SelectedP2.setText( ArbolPlaneta.getSelectionPath().getLastPathComponent().toString());
        System.out.println("Selected P2");
         if(PublicBtn.isSelected()){
             
            System.out.println("public sleceted");
            Planeta2c=getPublicPlanet(SelectedP2.getText());
        
        }else{
               System.out.println("priv sleceted");
             Planeta2c=SelectedCTF.Find(SelectedP2.getText());
             
             
         
         
        }
    }//GEN-LAST:event_Planeta2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
       
        
        System.out.println("coliding");
        Colision colide= new Colision();
        colide.start();
        
        
       
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
    
    public void Caclulos(double dist, long time,double masa){
       
        
        
        double velocidad= Math.pow((dist/time),2);
        
        double e= (masa*velocidad)/2;
        
        
        Random r= new Random();
         FuerzaBar.setMaximum((int) (r.nextInt((int) (2*e))+e));
         
         
         
         FuerzaBar.setValue((int) e);
         
         double percent=FuerzaBar.getPercentComplete();
         if(percent>0.0&& percent<=0.5){
             FuerzaBar.setForeground(Color.GREEN);
             
             
         }else if (percent>0.5 && percent<=0.75){
             FuerzaBar.setForeground(Color.YELLOW);
             
             
         
         }else if (percent>0.75&& percent<0.9) {
             FuerzaBar.setForeground(Color.RED);
         }else{
             FuerzaBar.setForeground(Color.BLUE);
         
         }
         
         
         
         
        
        
        
        
        
        
        
    
    
    
    }
    private void CajaCientificosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaCientificosActionPerformed
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_CajaCientificosActionPerformed

    private void PublicBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PublicBtnMouseClicked
        // TODO add your handling code here:
        if(PublicBtn.isSelected()){
            
            
             CrearArbol(PlanetasPublicos);
        
        
        }else{
            
            
            CrearArbol(SelectedCTF.getDescubrimientos());
        
        }
       
        
        

    }//GEN-LAST:event_PublicBtnMouseClicked

    private void CajaCientificosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaCientificosMouseClicked
        // TODO add your handling code here:
        
        PublicBtn.setSelected(false);
        
        SelecteP1.setText("");
        SelectedP2.setText("");
        
    }//GEN-LAST:event_CajaCientificosMouseClicked

    private void SelecteP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecteP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelecteP1ActionPerformed
    
    
    
    public double distancia(double x1,double y1,double x2,double y2){
        System.out.println(x1+" "+y1+" "+x2+" "+ y2);
        
        double a=Math.pow(x2-x1, 2);
        double b= Math.pow(y2-y1, 2);
        
        System.out.println(a+" "+ b);
        
        return Math.sqrt(a+b);
        
    
    
    
    
    }
    
    
    class Colision extends Thread{
        public void run(){
            ImpactTime.setText("0");
            boolean crear=false;
            ImpactBar.setValue(0);
            
            
            int dist= 0;
            
            Cientifico c=dat.find( CajaCientificos.getSelectedItem().toString());
            
              try{  
                  
                   dist=(int) distancia(Planeta1c.getX(),Planeta1c.getY(),Planeta2c.getX(),Planeta2c.getY());
                LabelDist.setText(""+dist);
              
              }catch(Exception e){
                 
                  JOptionPane.showMessageDialog(null,"Elija un planeta porgfavor");
                  
                  stop();
                
             
            
            
            }
           
            
            
            ImpactBar.setMaximum(dist);
            System.out.println(ImpactBar.getMaximum());
            Calendar time=Calendar.getInstance();
            long milis= time.get(Calendar.MILLISECOND) ;
            
            
            while(ImpactBar.getValue()<ImpactBar.getMaximum()){
                  try {
                sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
            }
                ImpactBar.setValue(ImpactBar.getValue()+1);
            
            
            }
            
            time= Calendar.getInstance();
            
            long result=time.get(Calendar.MILLISECOND)-milis;
            ImpactTime.setText(result+"");
            
            
            
            
             Caclulos(dist, result, (Planeta1c.getPeso()+Planeta2c.getPeso()));
            if(Planeta1c.getProbabilidad()){
            
                System.out.println("Se creo un nuevo planeta");
                String nombrePlaneta="";
                
                
                while(!crear){
                    System.out.println("Pidierno nombre");
                    JTextField field= new JTextField();
                    JOptionPane.showConfirmDialog(rootPane, field, nombrePlaneta,JOptionPane.PLAIN_MESSAGE);
                    
                    if((SelectedCTF.Find(field.getText())==null)&&(!field.getText().equals(""))){
                        crear=true;
                        nombrePlaneta=field.getText();
                       
                    
                    }
                    
                
                }
                
               
                
                double x=(Planeta1c.getX()+Planeta2c.getX())/2;
                double y=(Planeta1c.getY()+Planeta2c.getY())/2;
                
                double Peso=(Planeta1c.getPeso()+Planeta2c.getPeso())/2;
                
                double size=(Planeta2c.getSize()+Planeta1c.getSize())/2;
                
                
                
                if(Planeta1c instanceof Terrestre){
                     SelectedCTF.AddPlaneta(new Terrestre(nombrePlaneta, size, Peso, x, y));
                     
                     System.out.println(SelectedCTF.toString());
                     System.out.println(CajaCientificos.getSelectedItem().toString());
                
                
                }else{
                     SelectedCTF.AddPlaneta(new Gaseoso(nombrePlaneta, size, Peso, x, y));
                
                
                }
                
                try {
                    dat.Guardar();
                } catch (IOException ex) {
                    Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
               
                
                
            
            }else{
            
                System.out.println("No se formo un nuevo planeta");
            
            
            }
            
            LabelDist.setText("0");
            
            
            
            
        
            
        
        
        
        
        
        
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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                  try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree ArbolPlaneta;
    private javax.swing.JComboBox<Object> CajaCientificos;
    private javax.swing.JProgressBar FuerzaBar;
    private javax.swing.JProgressBar ImpactBar;
    private javax.swing.JLabel ImpactTime;
    private javax.swing.JLabel LabelDist;
    private javax.swing.JPopupMenu MenuPlaneta;
    private javax.swing.JTextField NameField;
    private javax.swing.JMenuItem Planeta1;
    private javax.swing.JMenuItem Planeta2;
    private javax.swing.JCheckBox PublicBtn;
    private javax.swing.JTextField SelecteP1;
    private javax.swing.JTextField SelectedP2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
