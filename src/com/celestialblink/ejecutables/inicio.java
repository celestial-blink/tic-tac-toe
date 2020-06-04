/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestialblink.ejecutables;

import com.celestialblink.ui.m_imagen;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author FKADAGIO
 */
public class inicio extends javax.swing.JFrame {
    
    boolean tur=false;
    private JLabel[] label=new JLabel[9];
    private int[] controlV={0,0,0,0,0,0,0,0,0};
    private int[][] formas_ganado={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}}; 
    private Timer tiempo;
    private int segundo=0;
    private ActionListener accion;
    //empate
    private int empate_k=0;
    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        setTitle("tic tac toe");
        jPanel1.setBackground(new Color(0,102,153,100));
        jPanel3.setBackground(jPanel1.getBackground());
        label[0]=jLabel1;
        label[1]=jLabel2;
        label[2]=jLabel3;
        label[3]=jLabel4;
        label[4]=jLabel5;
        label[5]=jLabel6;
        label[6]=jLabel7;
        label[7]=jLabel8;
        label[8]=jLabel9;
        turno(tur);
        ganador();
        fondo();
        m_turno(jlabel_turno, true);
    }
    
    
    private void fondo(){
        m_imagen imm=new m_imagen();
        this.setLocationRelativeTo(null);
        imm.setSize(this.getSize());
        this.getContentPane().add(imm);

    }
    //true= "X" and false = "0"
    private void turno(boolean turn){
    tur = (turn)?false:true;
    }
    
    private int control(int co,int index){
        controlV[index]+=co;
        return controlV[index];
    }
    
    private void u_color(boolean b, JLabel l){
        if(b){
            l.setForeground(Color.red);
        }else{
            l.setForeground(Color.blue);
        }
    }
    private void m_turno(JLabel l, boolean t){
        if(t){
           l.setText(
            l.getText().replace("O", "X"));
        }
        else{
            l.setText(
            l.getText().replace("X", "O"));
        }
    }
    
    private void ganador(){
        String gano=null;
        for(int [] n:formas_ganado){
                    if(label[0].getText().equalsIgnoreCase("X") &&
                       label[1].getText().equalsIgnoreCase("X") &&
                       label[2].getText().equalsIgnoreCase("X")){
                            label[0].setBackground(new Color(217, 79, 222));
                            label[1].setBackground(new Color(217, 79, 222));
                            label[2].setBackground(new Color(217, 79, 222));
                            gano="X";
                            
                        }else if(
                       label[3].getText().equalsIgnoreCase("X") &&
                       label[4].getText().equalsIgnoreCase("X") &&
                       label[5].getText().equalsIgnoreCase("X") ){
                            label[3].setBackground(new Color(217, 79, 222));
                            label[4].setBackground(new Color(217, 79, 222));
                            label[5].setBackground(new Color(217, 79, 222));
                            gano="X";
                        
                        } else if (
                       label[6].getText().equalsIgnoreCase("X") &&
                       label[7].getText().equalsIgnoreCase("X") &&
                       label[8].getText().equalsIgnoreCase("X") ){
                            label[6].setBackground(new Color(217, 79, 222));
                            label[7].setBackground(new Color(217, 79, 222));
                            label[8].setBackground(new Color(217, 79, 222));
                            gano="X";
                            
                        } else if (
                        label[0].getText().equalsIgnoreCase("X") &&
                        label[3].getText().equalsIgnoreCase("X") &&
                        label[6].getText().equalsIgnoreCase("X")){
                            label[0].setBackground(new Color(217, 79, 222));
                            label[3].setBackground(new Color(217, 79, 222));
                            label[6].setBackground(new Color(217, 79, 222));
                            gano="X";
                            
                        }else if (
                        label[1].getText().equalsIgnoreCase("X") &&
                        label[4].getText().equalsIgnoreCase("X") &&
                        label[7].getText().equalsIgnoreCase("X")){
                            label[1].setBackground(new Color(217, 79, 222));
                            label[4].setBackground(new Color(217, 79, 222));
                            label[7].setBackground(new Color(217, 79, 222));
                            gano="X";
                        
                        }else if (
                        label[2].getText().equalsIgnoreCase("X") &&
                        label[5].getText().equalsIgnoreCase("X") &&
                        label[8].getText().equalsIgnoreCase("X")){
                            label[2].setBackground(new Color(217, 79, 222));
                            label[5].setBackground(new Color(217, 79, 222));
                            label[8].setBackground(new Color(217, 79, 222));
                            gano="X";
                        
                        }else if (
                        label[0].getText().equalsIgnoreCase("X") &&
                        label[4].getText().equalsIgnoreCase("X") &&
                        label[8].getText().equalsIgnoreCase("X")){
                            label[0].setBackground(new Color(217, 79, 222));
                            label[4].setBackground(new Color(217, 79, 222));
                            label[8].setBackground(new Color(217, 79, 222));
                            gano="X";
                        
                        }else if (
                        label[2].getText().equalsIgnoreCase("X") &&
                        label[4].getText().equalsIgnoreCase("X") &&
                        label[6].getText().equalsIgnoreCase("X")){
                            label[2].setBackground(new Color(217, 79, 222));
                            label[4].setBackground(new Color(217, 79, 222));
                            label[6].setBackground(new Color(217, 79, 222));
                            gano="X";
                        
                        }
                        else{
                        if(label[0].getText().equalsIgnoreCase("O") &&
                       label[1].getText().equalsIgnoreCase("O") &&
                       label[2].getText().equalsIgnoreCase("O")){
                            label[0].setBackground(new Color(217, 79, 222));
                            label[1].setBackground(new Color(217, 79, 222));
                            label[2].setBackground(new Color(217, 79, 222));
                            gano="O";
                           
                        }else if(
                       label[3].getText().equalsIgnoreCase("O") &&
                       label[4].getText().equalsIgnoreCase("O") &&
                       label[5].getText().equalsIgnoreCase("O") ){
                            label[3].setBackground(new Color(217, 79, 222));
                            label[4].setBackground(new Color(217, 79, 222));
                            label[5].setBackground(new Color(217, 79, 222));
                            gano="O";
                            
                        
                        } else if (
                       label[6].getText().equalsIgnoreCase("O") &&
                       label[7].getText().equalsIgnoreCase("O") &&
                       label[8].getText().equalsIgnoreCase("O") ){
                            label[6].setBackground(new Color(217, 79, 222));
                            label[7].setBackground(new Color(217, 79, 222));
                            label[8].setBackground(new Color(217, 79, 222));
                            gano="O";
                            
                            
                        
                        } else if (
                        label[0].getText().equalsIgnoreCase("O") &&
                        label[3].getText().equalsIgnoreCase("O") &&
                        label[6].getText().equalsIgnoreCase("O")){
                            label[0].setBackground(new Color(217, 79, 222));
                            label[3].setBackground(new Color(217, 79, 222));
                            label[6].setBackground(new Color(217, 79, 222));
                            gano="O";
                            
                        
                            
                        }else if (
                        label[1].getText().equalsIgnoreCase("O") &&
                        label[4].getText().equalsIgnoreCase("O") &&
                        label[7].getText().equalsIgnoreCase("O")){
                            label[1].setBackground(new Color(217, 79, 222));
                            label[4].setBackground(new Color(217, 79, 222));
                            label[7].setBackground(new Color(217, 79, 222));
                            gano="O";
                            
                        
                        }else if (
                        label[2].getText().equalsIgnoreCase("O") &&
                        label[5].getText().equalsIgnoreCase("O") &&
                        label[8].getText().equalsIgnoreCase("O")){
                            label[2].setBackground(new Color(217, 79, 222));
                            label[5].setBackground(new Color(217, 79, 222));
                            label[8].setBackground(new Color(217, 79, 222));
                            gano="O";
                            
                        
                        }else if (
                        label[0].getText().equalsIgnoreCase("O") &&
                        label[4].getText().equalsIgnoreCase("O") &&
                        label[8].getText().equalsIgnoreCase("O")){
                            label[0].setBackground(new Color(217, 79, 222));
                            label[4].setBackground(new Color(217, 79, 222));
                            label[8].setBackground(new Color(217, 79, 222));
                            gano="O";
                            
                        
                        }else if (
                        label[2].getText().equalsIgnoreCase("O") &&
                        label[4].getText().equalsIgnoreCase("O") &&
                        label[6].getText().equalsIgnoreCase("O")){
                            label[2].setBackground(new Color(217, 79, 222));
                            label[4].setBackground(new Color(217, 79, 222));
                            label[6].setBackground(new Color(217, 79, 222));
                            gano="O";
                           
                        
                        }
                        
                        }
//            System.out.println("-----------");
        }
        if (gano!=null){
            if(gano.equalsIgnoreCase("X")){
                anunciar_ganador(">"+gano+"<");
            }else{
                anunciar_ganador(">"+gano+"<");
            }
        }
        empate(label);
    }

    private void empate(JLabel[] L){
        for (JLabel l:L){
            if (l.getText().trim()!=""){
                empate_k+=1;
                break;
            }
        }
        if(empate_k==9){
            reinicio();
        }
    }
    
    private void reinicio(){
        int k=0;
        for(JLabel o:label){
         o.setText("");
         o.setBackground(Color.WHITE);
         controlV[k]=0;
         k+=1;
        }
        tur=true;
        empate_k=0;
        
    }
    
    private void anunciar_ganador(String s){
        jDialog1.setAlwaysOnTop(true);
        jDialog1.setSize(290, 290);
        m_imagen take=new m_imagen();
        take.setH(jDialog1.getHeight());
        take.setW(jDialog1.getWidth());
        JLabel mio=new JLabel(take.m_icono("/com/celestialblink/imagenes/win.gif")); 
        mio.setSize(jDialog1.getSize());
        
        jDialog1.add(mio,-1);
        jDialog1.setLocationRelativeTo(this);
        
        jLabel12.setText(s);
        
        jDialog1.setResizable(false);
        jDialog1.setAlwaysOnTop(true);
        jDialog1.setModal(true);
        jDialog1.setUndecorated(true);
        quitar(jDialog1);
        jDialog1.show();
        
        
        
    }
    
    private void quitar(JDialog d){
        accion=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (segundo>1){
                   segundo=0;
                   d.dispose();
                   tiempo.stop();
                   reinicio();
               }
               segundo+=1;
            }
        };
        this.tiempo=new Timer(1000, accion);
        tiempo.start();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jlabel_turno = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("GANADOR!!!");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel15.setText("SDKJSD");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel15)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel15)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TIC TAC TOE");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("NUEVO JUEGO");
        jButton1.setBorder(null);
        jButton1.setDefaultCapable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 0, 51));
        jLabel13.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("  X => ");
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(0, 0, 255));
        jLabel14.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("  O => ");
        jLabel14.setOpaque(true);

        jlabel_turno.setBackground(new java.awt.Color(153, 153, 153));
        jlabel_turno.setFont(new java.awt.Font("DotumChe", 1, 18)); // NOI18N
        jlabel_turno.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_turno.setText("Turno => O");
        jlabel_turno.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jlabel_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabel_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (control(evt.getClickCount(),0)==1){
        if (tur){
            jLabel1.setText("X");
        }else{
            jLabel1.setText("O");
        }
        turno(tur);
        ganador();
        u_color(tur, jLabel1);
        m_turno(jlabel_turno, tur);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (control(evt.getClickCount(),1)==1){
        if (tur){
            jLabel2.setText("X");
        }else{
            jLabel2.setText("O");
        }
        turno(tur);
        ganador();
        u_color(tur, jLabel2);
        m_turno(jlabel_turno, tur);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       if (control(evt.getClickCount(),2)==1){
        if (tur){
            jLabel3.setText("X");
        }else{
            jLabel3.setText("O");
        }
        turno(tur);
        ganador();
        u_color(tur, jLabel3);
        m_turno(jlabel_turno, tur);
       }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
     if(control(evt.getClickCount(),3)==1){
        if (tur){
            jLabel4.setText("X");
        }else{
            jLabel4.setText("O");
        }
        turno(tur);
        ganador();
        u_color(tur, jLabel4);
        m_turno(jlabel_turno, tur);
     }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (control(evt.getClickCount(),4)==1){
        if (tur){
            jLabel5.setText("X");
        }else{
            jLabel5.setText("O");
        }
        turno(tur);
        ganador();
        u_color(tur, jLabel5);
        m_turno(jlabel_turno, tur);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
      if(control(evt.getClickCount(),5)==1){
        if (tur){
            jLabel6.setText("X");
        }else{
            jLabel6.setText("O");
        }        
        turno(tur);
        ganador();
        u_color(tur, jLabel6);
        m_turno(jlabel_turno, tur);
      }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    if(control(evt.getClickCount(),6)==1){
        if (tur){
            jLabel7.setText("X");
        }else{
            jLabel7.setText("O");
        }        // TODO add your handling code here:
        turno(tur);
        ganador();
        u_color(tur, jLabel7);
        m_turno(jlabel_turno, tur);
    }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    if (control(evt.getClickCount(),7)==1){
        if (tur){
            jLabel8.setText("X");
        }else{
            jLabel8.setText("O");
        }        // TODO add your handling code here:
        turno(tur);
        ganador();
        u_color(tur, jLabel8);
        m_turno(jlabel_turno, tur);
    }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
    if (control(evt.getClickCount(),8)==1){
        if (tur){
            jLabel9.setText("X");
        }else{
            jLabel9.setText("O");
        }        // TODO add your handling code here:
        turno(tur);
        ganador();
        u_color(tur, jLabel9);
        m_turno(jlabel_turno, tur);
    }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reinicio();
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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlabel_turno;
    // End of variables declaration//GEN-END:variables
}
