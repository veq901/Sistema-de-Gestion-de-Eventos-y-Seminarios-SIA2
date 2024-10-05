/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author MSI
 */
import Exceptions.BadIdRecintoException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import Modelo.Menu;

//VP significa Vista Principal
public class VP extends javax.swing.JFrame {

    /**
     * Creates new form VP
     */
    private Menu menu = new Menu();
    
    /*
        FUNCIONES PARA DEPLEGAR LOS PANELES ANEXOS A VP
    */
    private void showHome(Home h){
        h.setSize(768,578);
        h.setLocation(0,0);
        dynamicContentPnl.removeAll();
        dynamicContentPnl.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        dynamicContentPnl.revalidate();
        dynamicContentPnl.repaint();
    }
    
    private void showGestionEntradasEventos(GestionEntradasEventos gee){
        gee.setSize(768,578);
        gee.setLocation(0,0);
        dynamicContentPnl.removeAll();
        dynamicContentPnl.add(gee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        dynamicContentPnl.revalidate();
        dynamicContentPnl.repaint();
    }
    
    private void showGestionEventos(GestionEventos ge){
        ge.setSize(768,578);
        ge.setLocation(0,0);
        dynamicContentPnl.removeAll();
        dynamicContentPnl.add(ge, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        dynamicContentPnl.revalidate();
        dynamicContentPnl.repaint();
    }
    
    private void showGestionRecintos(GestionRecintos gr){
        gr.setSize(768,578);
        gr.setLocation(0,0);
        dynamicContentPnl.removeAll();
        dynamicContentPnl.add(gr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        dynamicContentPnl.revalidate();
        dynamicContentPnl.repaint();
    }
    
    private void showExportarDatos(ExportarDatos ed){
        ed.setSize(768,578);
        ed.setLocation(0,0);
        dynamicContentPnl.removeAll();
        dynamicContentPnl.add(ed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        dynamicContentPnl.revalidate();
        dynamicContentPnl.repaint();
    }
    
    
    //El Constructor de VP (Vista Principal) carga los datos desde los csv, ademas de setear las dimensiones de la ventana e iniciar sus componentes
    public VP() throws BadIdRecintoException {
        initComponents();
        menu.cargarDatosArrayListRecintos();
        menu.cargarDatosMapaEventos();
        Home h = new Home();
        showHome(h);
        
        this.setSize(1024, 768);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add(backgroundPnl, gbc);
        backgroundPnl.setPreferredSize(new java.awt.Dimension(1024, 768));
        pack();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        backgroundPnl = new javax.swing.JPanel();
        bannerPnl = new javax.swing.JPanel();
        headerPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuPnl = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ventaEntradasBtn = new javax.swing.JButton();
        eventosBtn = new javax.swing.JButton();
        recintosBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        exportarDatosBtn = new javax.swing.JButton();
        dynamicContentPnl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPnl.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bannerPnl.setBackground(new java.awt.Color(255, 102, 51));
        bannerPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        backgroundPnl.add(bannerPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 30));

        headerPnl.setBackground(new java.awt.Color(0, 0, 0));
        headerPnl.setPreferredSize(new java.awt.Dimension(512, 100));
        headerPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de Gestion de Eventos");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        headerPnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 490, 100));

        backgroundPnl.add(headerPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        menuPnl.setBackground(new java.awt.Color(204, 204, 204));
        menuPnl.setPreferredSize(new java.awt.Dimension(256, 578));
        menuPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(256, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO!");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuPnl.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ventaEntradasBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ventaEntradasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recurso/ticketIcon.png"))); // NOI18N
        ventaEntradasBtn.setText("Gestion de Entradas a Eventos");
        ventaEntradasBtn.setPreferredSize(new java.awt.Dimension(256, 60));
        ventaEntradasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaEntradasBtnActionPerformed(evt);
            }
        });
        menuPnl.add(ventaEntradasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        eventosBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recurso/newEventIcon2.png"))); // NOI18N
        eventosBtn.setText("Gestion de Eventos");
        eventosBtn.setPreferredSize(new java.awt.Dimension(256, 60));
        eventosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosBtnActionPerformed(evt);
            }
        });
        menuPnl.add(eventosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        recintosBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        recintosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recurso/recintoIcon.png"))); // NOI18N
        recintosBtn.setText("Gestion de Recintos");
        recintosBtn.setPreferredSize(new java.awt.Dimension(256, 60));
        recintosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recintosBtnActionPerformed(evt);
            }
        });
        menuPnl.add(recintosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        homeBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recurso/homeIcon2.png"))); // NOI18N
        homeBtn.setText("Pagina Principal");
        homeBtn.setPreferredSize(new java.awt.Dimension(256, 60));
        homeBtn.setSelected(true);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        menuPnl.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recurso/redcross.png"))); // NOI18N
        exitBtn.setText("Salir");
        exitBtn.setPreferredSize(new java.awt.Dimension(256, 60));
        exitBtn.setRequestFocusEnabled(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        menuPnl.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

        exportarDatosBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exportarDatosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recurso/saveFileIcon.png"))); // NOI18N
        exportarDatosBtn.setText("Guardar Datos");
        exportarDatosBtn.setPreferredSize(new java.awt.Dimension(256, 60));
        exportarDatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarDatosBtnActionPerformed(evt);
            }
        });
        menuPnl.add(exportarDatosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        backgroundPnl.add(menuPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        dynamicContentPnl.setPreferredSize(new java.awt.Dimension(768, 578));

        javax.swing.GroupLayout dynamicContentPnlLayout = new javax.swing.GroupLayout(dynamicContentPnl);
        dynamicContentPnl.setLayout(dynamicContentPnlLayout);
        dynamicContentPnlLayout.setHorizontalGroup(
            dynamicContentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        dynamicContentPnlLayout.setVerticalGroup(
            dynamicContentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        backgroundPnl.add(dynamicContentPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 190, -1, -1));

        getContentPane().add(backgroundPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Esta Funcion ejecuta el codigo asociado al JButton ventaEntradasBtn. Envia las instancias de Menu y VP actuales.
    private void ventaEntradasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaEntradasBtnActionPerformed
        GestionEntradasEventos gee = new GestionEntradasEventos();
        gee.setMenu(menu);
        gee.setCurrentVP(this);
        showGestionEntradasEventos(gee);
    }//GEN-LAST:event_ventaEntradasBtnActionPerformed
    
    //Esta Funcion ejecuta el codigo asociado al JButton eventosBtn. Envia las instancias de Menu y VP actuales.
    private void eventosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosBtnActionPerformed
        GestionEventos ge = new GestionEventos();
        ge.setMenu(menu);
        ge.setCurrentVP(this);
        showGestionEventos(ge);
    }//GEN-LAST:event_eventosBtnActionPerformed
    
    //Esta Funcion ejecuta el codigo asociado al JButton recintosBtn. Envia las instancias de Menu y VP actuales.
    private void recintosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recintosBtnActionPerformed
        GestionRecintos gr = new GestionRecintos();
        gr.setMenu(menu);
        gr.setCurrentVP(this);
        showGestionRecintos(gr);
    }//GEN-LAST:event_recintosBtnActionPerformed
    
    //Esta Funcion ejecuta el codigo asociado al JButton exitBtn. Cierra el Programa y sus Ventanas.
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed
    
    //Esta Funcion ejecuta el codigo asociado al JButton homeBtn. Pagina Principal con propositos decorativos.
    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        Home h = new Home();
        showHome(h);
    }//GEN-LAST:event_homeBtnActionPerformed
    
    //Esta Funcion ejecuta el codigo asociado al JButton exportarDatosBtn. Envia las instancias de Menu y VP actuales.
    private void exportarDatosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarDatosBtnActionPerformed
        ExportarDatos ed = new ExportarDatos();
        ed.setMenu(menu);
        ed.setCurrentVP(this);
        showExportarDatos(ed);
    }//GEN-LAST:event_exportarDatosBtnActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPnl;
    private javax.swing.JPanel bannerPnl;
    private javax.swing.JPanel dynamicContentPnl;
    public javax.swing.JButton eventosBtn;
    public javax.swing.JButton exitBtn;
    public javax.swing.JButton exportarDatosBtn;
    private javax.swing.JPanel headerPnl;
    public javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPanel menuPnl;
    public javax.swing.JButton recintosBtn;
    public javax.swing.JButton ventaEntradasBtn;
    // End of variables declaration//GEN-END:variables
}
