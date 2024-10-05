/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Exceptions.BadIdRecintoException;
import Modelo.Menu;
import Modelo.Recinto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI
 */
public class GestionRecintos extends javax.swing.JPanel {

    /**
     * Creates new form GestionRecintos
     */
    
    private Recinto currentRecinto = new Recinto();
    private Menu menu;
    private VP currentVP;
    
    public GestionRecintos() {
        initComponents();
        crearRecintoPnl.setVisible(false);
        listarRecintosPnl.setVisible(false);
        modRecintoPnl.setVisible(false);
        datosRecintoPnl.setVisible(false);
        eliminarRecintoPnl.setVisible(false);
    }
    
    public void setCurrentVP(VP vp){
        currentVP = vp;
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
        System.out.println(menu.getMenu());
    }
    
    public DefaultTableModel getRecintosTblLRModel() {
        return (DefaultTableModel) recintosTblLR.getModel();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPnl = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();
        crearRecintoPnl = new javax.swing.JPanel();
        headerLblCR = new javax.swing.JLabel();
        idRecintoLblCR = new javax.swing.JLabel();
        idRecintoFieldCR = new javax.swing.JTextField();
        nombreRecintoLblCR = new javax.swing.JLabel();
        nombreRecintoFieldCR = new javax.swing.JTextField();
        ubicacionLblCR = new javax.swing.JLabel();
        ubicacionFieldCR = new javax.swing.JTextField();
        cuposLblCR = new javax.swing.JLabel();
        cuposFieldCR = new javax.swing.JTextField();
        backBtnCRPnl = new javax.swing.JButton();
        aceptarBtnCR = new javax.swing.JButton();
        listarRecintosPnl = new javax.swing.JPanel();
        headerLblLR = new javax.swing.JLabel();
        idRecintoLblLR = new javax.swing.JLabel();
        idRecintoFieldLR = new javax.swing.JTextField();
        backBtnLRPnl = new javax.swing.JButton();
        recintosTableScrPnlLR = new javax.swing.JScrollPane();
        recintosTblLR = new javax.swing.JTable();
        buscarIdRecintoBtnLR = new javax.swing.JButton();
        modRecintoPnl = new javax.swing.JPanel();
        headerLblMR = new javax.swing.JLabel();
        idRecintoLblMR = new javax.swing.JLabel();
        idRecintoFieldMR = new javax.swing.JTextField();
        backBtnMRPnl = new javax.swing.JButton();
        validarIdRecintoBtnMR = new javax.swing.JButton();
        datosRecintoPnl = new javax.swing.JPanel();
        headerLblDR = new javax.swing.JLabel();
        nombreRecintoLblDR = new javax.swing.JLabel();
        nombreRecintoFieldDR = new javax.swing.JTextField();
        ubicacionLblDR = new javax.swing.JLabel();
        ubicacionFieldDR = new javax.swing.JTextField();
        cuposLblDR = new javax.swing.JLabel();
        cuposFieldDR = new javax.swing.JTextField();
        aceptarBtnDR = new javax.swing.JButton();
        eliminarRecintoPnl = new javax.swing.JPanel();
        headerLblER = new javax.swing.JLabel();
        idRecintoLblER = new javax.swing.JLabel();
        idRecintoFieldER = new javax.swing.JTextField();
        backBtnERPnl = new javax.swing.JButton();
        aceptarBtnER = new javax.swing.JButton();
        crearRecintoBtn = new javax.swing.JButton();
        listarRecintosBtn = new javax.swing.JButton();
        modRecintoBtn = new javax.swing.JButton();
        eliminarRecintoBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPnl.setBackground(new java.awt.Color(255, 228, 209));
        backgroundPnl.setPreferredSize(new java.awt.Dimension(768, 578));
        backgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLbl.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("Seleccione una opcion para Gestionar Recintos");
        backgroundPnl.add(headerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 640, 110));

        crearRecintoPnl.setBackground(new java.awt.Color(255, 255, 255));
        crearRecintoPnl.setPreferredSize(new java.awt.Dimension(710, 440));
        crearRecintoPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLblCR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        headerLblCR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLblCR.setText("Por favor, ingrese los datos del Recinto a crear");
        headerLblCR.setPreferredSize(new java.awt.Dimension(480, 65));
        crearRecintoPnl.add(headerLblCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        idRecintoLblCR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idRecintoLblCR.setText("ID del Recinto");
        crearRecintoPnl.add(idRecintoLblCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        idRecintoFieldCR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idRecintoFieldCR.setPreferredSize(new java.awt.Dimension(91, 22));
        crearRecintoPnl.add(idRecintoFieldCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        nombreRecintoLblCR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreRecintoLblCR.setText("Nombre del Recinto");
        crearRecintoPnl.add(nombreRecintoLblCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        nombreRecintoFieldCR.setPreferredSize(new java.awt.Dimension(91, 22));
        crearRecintoPnl.add(nombreRecintoFieldCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        ubicacionLblCR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ubicacionLblCR.setText("Ubicacion del Recinto");
        crearRecintoPnl.add(ubicacionLblCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        ubicacionFieldCR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ubicacionFieldCR.setPreferredSize(new java.awt.Dimension(91, 22));
        crearRecintoPnl.add(ubicacionFieldCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        cuposLblCR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cuposLblCR.setText("Capacidad Maxima del Recinto");
        crearRecintoPnl.add(cuposLblCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        cuposFieldCR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cuposFieldCR.setPreferredSize(new java.awt.Dimension(91, 22));
        crearRecintoPnl.add(cuposFieldCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        backBtnCRPnl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backBtnCRPnl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recurso/orangeGoBackArrow.png"))); // NOI18N
        backBtnCRPnl.setText("Atras");
        backBtnCRPnl.setPreferredSize(new java.awt.Dimension(128, 30));
        backBtnCRPnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnCRPnlActionPerformed(evt);
            }
        });
        crearRecintoPnl.add(backBtnCRPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        aceptarBtnCR.setText("Aceptar");
        aceptarBtnCR.setPreferredSize(new java.awt.Dimension(128, 30));
        aceptarBtnCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnCRActionPerformed(evt);
            }
        });
        crearRecintoPnl.add(aceptarBtnCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        backgroundPnl.add(crearRecintoPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        listarRecintosPnl.setBackground(new java.awt.Color(255, 255, 255));
        listarRecintosPnl.setPreferredSize(new java.awt.Dimension(710, 440));
        listarRecintosPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLblLR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        headerLblLR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLblLR.setText("Listado de Recintos registrados en el sistema");
        headerLblLR.setPreferredSize(new java.awt.Dimension(480, 65));
        listarRecintosPnl.add(headerLblLR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        idRecintoLblLR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idRecintoLblLR.setText("ID del Recinto");
        listarRecintosPnl.add(idRecintoLblLR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        idRecintoFieldLR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idRecintoFieldLR.setPreferredSize(new java.awt.Dimension(91, 22));
        listarRecintosPnl.add(idRecintoFieldLR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        backBtnLRPnl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backBtnLRPnl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recurso/orangeGoBackArrow.png"))); // NOI18N
        backBtnLRPnl.setText("Atras");
        backBtnLRPnl.setPreferredSize(new java.awt.Dimension(128, 30));
        backBtnLRPnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnLRPnlActionPerformed(evt);
            }
        });
        listarRecintosPnl.add(backBtnLRPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        recintosTableScrPnlLR.setBackground(new java.awt.Color(255, 255, 255));
        recintosTableScrPnlLR.setPreferredSize(new java.awt.Dimension(650, 210));

        recintosTblLR.setBackground(new java.awt.Color(255, 255, 255));
        recintosTblLR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Recinto", "Nombre del Recinto", "Ubicacion", "Capacidad Maxima"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recintosTableScrPnlLR.setViewportView(recintosTblLR);

        listarRecintosPnl.add(recintosTableScrPnlLR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        buscarIdRecintoBtnLR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        buscarIdRecintoBtnLR.setText("Buscar");
        buscarIdRecintoBtnLR.setPreferredSize(new java.awt.Dimension(75, 43));
        buscarIdRecintoBtnLR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIdRecintoBtnLRActionPerformed(evt);
            }
        });
        listarRecintosPnl.add(buscarIdRecintoBtnLR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        backgroundPnl.add(listarRecintosPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        modRecintoPnl.setBackground(new java.awt.Color(255, 255, 255));
        modRecintoPnl.setPreferredSize(new java.awt.Dimension(710, 440));
        modRecintoPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLblMR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        headerLblMR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLblMR.setText("Por Favor, ingrese el ID del Recinto a modificar");
        headerLblMR.setPreferredSize(new java.awt.Dimension(480, 65));
        modRecintoPnl.add(headerLblMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 560, -1));

        idRecintoLblMR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idRecintoLblMR.setText("ID del Recinto");
        modRecintoPnl.add(idRecintoLblMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        idRecintoFieldMR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idRecintoFieldMR.setPreferredSize(new java.awt.Dimension(91, 22));
        modRecintoPnl.add(idRecintoFieldMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        backBtnMRPnl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backBtnMRPnl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recurso/orangeGoBackArrow.png"))); // NOI18N
        backBtnMRPnl.setText("Atras");
        backBtnMRPnl.setPreferredSize(new java.awt.Dimension(128, 30));
        backBtnMRPnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnMRPnlActionPerformed(evt);
            }
        });
        modRecintoPnl.add(backBtnMRPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        validarIdRecintoBtnMR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        validarIdRecintoBtnMR.setText("Validar ID");
        validarIdRecintoBtnMR.setPreferredSize(new java.awt.Dimension(75, 43));
        validarIdRecintoBtnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarIdRecintoBtnMRActionPerformed(evt);
            }
        });
        modRecintoPnl.add(validarIdRecintoBtnMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        backgroundPnl.add(modRecintoPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        datosRecintoPnl.setBackground(new java.awt.Color(255, 255, 255));
        datosRecintoPnl.setPreferredSize(new java.awt.Dimension(710, 440));
        datosRecintoPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLblDR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        headerLblDR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLblDR.setText("Ingrese los nuevos datos para el Recinto");
        headerLblDR.setToolTipText("");
        headerLblDR.setPreferredSize(new java.awt.Dimension(400, 65));
        datosRecintoPnl.add(headerLblDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        nombreRecintoLblDR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreRecintoLblDR.setText("Nombre del Recinto");
        datosRecintoPnl.add(nombreRecintoLblDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        nombreRecintoFieldDR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreRecintoFieldDR.setPreferredSize(new java.awt.Dimension(91, 22));
        datosRecintoPnl.add(nombreRecintoFieldDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        ubicacionLblDR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ubicacionLblDR.setText("Ubicacion del Recinto");
        datosRecintoPnl.add(ubicacionLblDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        ubicacionFieldDR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ubicacionFieldDR.setPreferredSize(new java.awt.Dimension(91, 22));
        datosRecintoPnl.add(ubicacionFieldDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        cuposLblDR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cuposLblDR.setText("Capacidad Maxima del Recinto");
        datosRecintoPnl.add(cuposLblDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        cuposFieldDR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cuposFieldDR.setPreferredSize(new java.awt.Dimension(91, 22));
        datosRecintoPnl.add(cuposFieldDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        aceptarBtnDR.setText("Aceptar");
        aceptarBtnDR.setPreferredSize(new java.awt.Dimension(128, 30));
        aceptarBtnDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnDRActionPerformed(evt);
            }
        });
        datosRecintoPnl.add(aceptarBtnDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        backgroundPnl.add(datosRecintoPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        eliminarRecintoPnl.setBackground(new java.awt.Color(255, 255, 255));
        eliminarRecintoPnl.setPreferredSize(new java.awt.Dimension(710, 440));
        eliminarRecintoPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLblER.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        headerLblER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLblER.setText("Por favor, ingrese el ID del Recinto a eliminar");
        headerLblER.setPreferredSize(new java.awt.Dimension(480, 65));
        eliminarRecintoPnl.add(headerLblER, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 560, -1));

        idRecintoLblER.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idRecintoLblER.setText("ID del Recinto");
        eliminarRecintoPnl.add(idRecintoLblER, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        idRecintoFieldER.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idRecintoFieldER.setPreferredSize(new java.awt.Dimension(91, 22));
        eliminarRecintoPnl.add(idRecintoFieldER, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        backBtnERPnl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backBtnERPnl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recurso/orangeGoBackArrow.png"))); // NOI18N
        backBtnERPnl.setText("Atras");
        backBtnERPnl.setPreferredSize(new java.awt.Dimension(128, 30));
        backBtnERPnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnERPnlActionPerformed(evt);
            }
        });
        eliminarRecintoPnl.add(backBtnERPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        aceptarBtnER.setText("Aceptar");
        aceptarBtnER.setPreferredSize(new java.awt.Dimension(128, 30));
        aceptarBtnER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnERActionPerformed(evt);
            }
        });
        eliminarRecintoPnl.add(aceptarBtnER, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        backgroundPnl.add(eliminarRecintoPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        crearRecintoBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        crearRecintoBtn.setText("Crear un Recinto");
        crearRecintoBtn.setPreferredSize(new java.awt.Dimension(256, 60));
        crearRecintoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearRecintoBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(crearRecintoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        listarRecintosBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listarRecintosBtn.setText("Listado de Recintos");
        listarRecintosBtn.setPreferredSize(new java.awt.Dimension(256, 60));
        listarRecintosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarRecintosBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(listarRecintosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        modRecintoBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modRecintoBtn.setText("Modificar Datos de un Recinto");
        modRecintoBtn.setPreferredSize(new java.awt.Dimension(256, 60));
        modRecintoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modRecintoBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(modRecintoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        eliminarRecintoBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eliminarRecintoBtn.setText("Eliminar un Recinto");
        eliminarRecintoBtn.setPreferredSize(new java.awt.Dimension(256, 60));
        eliminarRecintoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRecintoBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(eliminarRecintoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        add(backgroundPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    //========== BOTONES =======================================================
    
    private void crearRecintoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearRecintoBtnActionPerformed
        crearRecintoPnl.setVisible(true);
        crearRecintoBtn.setVisible(false);
        listarRecintosBtn.setVisible(false);
        modRecintoBtn.setVisible(false);
        eliminarRecintoBtn.setVisible(false);
        currentVP.ventaEntradasBtn.setVisible(false);
        currentVP.eventosBtn.setVisible(false);
        currentVP.recintosBtn.setVisible(false);
        currentVP.exitBtn.setVisible(false);
        currentVP.homeBtn.setVisible(false);
        menu.mostrarRecintos();//consola
    }//GEN-LAST:event_crearRecintoBtnActionPerformed

    private void listarRecintosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarRecintosBtnActionPerformed
        listarRecintosPnl.setVisible(true);
        crearRecintoBtn.setVisible(false);
        listarRecintosBtn.setVisible(false);
        modRecintoBtn.setVisible(false);
        eliminarRecintoBtn.setVisible(false);
        currentVP.ventaEntradasBtn.setVisible(false);
        currentVP.eventosBtn.setVisible(false);
        currentVP.recintosBtn.setVisible(false);
        currentVP.exitBtn.setVisible(false);
        currentVP.homeBtn.setVisible(false);
        
        menu.mostrarRecintos(getRecintosTblLRModel());
    }//GEN-LAST:event_listarRecintosBtnActionPerformed

    private void modRecintoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modRecintoBtnActionPerformed
        modRecintoPnl.setVisible(true);
        crearRecintoBtn.setVisible(false);
        listarRecintosBtn.setVisible(false);
        modRecintoBtn.setVisible(false);
        eliminarRecintoBtn.setVisible(false);
        currentVP.ventaEntradasBtn.setVisible(false);
        currentVP.eventosBtn.setVisible(false);
        currentVP.recintosBtn.setVisible(false);
        currentVP.exitBtn.setVisible(false);
        currentVP.homeBtn.setVisible(false);
        menu.mostrarRecintos();//consola
    }//GEN-LAST:event_modRecintoBtnActionPerformed

    private void eliminarRecintoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRecintoBtnActionPerformed
        eliminarRecintoPnl.setVisible(true);
        crearRecintoBtn.setVisible(false);
        listarRecintosBtn.setVisible(false);
        modRecintoBtn.setVisible(false);
        eliminarRecintoBtn.setVisible(false);
        currentVP.ventaEntradasBtn.setVisible(false);
        currentVP.eventosBtn.setVisible(false);
        currentVP.recintosBtn.setVisible(false);
        currentVP.exitBtn.setVisible(false);
        currentVP.homeBtn.setVisible(false);
        menu.mostrarRecintos();//consola
    }//GEN-LAST:event_eliminarRecintoBtnActionPerformed
    //==========================================================================
    
    
    private void backBtnCRPnlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnCRPnlActionPerformed
        crearRecintoPnl.setVisible(false);
        crearRecintoBtn.setVisible(true);
        listarRecintosBtn.setVisible(true);
        modRecintoBtn.setVisible(true);
        eliminarRecintoBtn.setVisible(true);
        currentVP.ventaEntradasBtn.setVisible(true);
        currentVP.eventosBtn.setVisible(true);
        currentVP.recintosBtn.setVisible(true);
        currentVP.exitBtn.setVisible(true);
        currentVP.homeBtn.setVisible(true);
        clearFieldsCrearRecinto();
    }//GEN-LAST:event_backBtnCRPnlActionPerformed

    private void backBtnLRPnlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnLRPnlActionPerformed
        listarRecintosPnl.setVisible(false);
        crearRecintoBtn.setVisible(true);
        listarRecintosBtn.setVisible(true);
        modRecintoBtn.setVisible(true);
        eliminarRecintoBtn.setVisible(true);
        currentVP.ventaEntradasBtn.setVisible(true);
        currentVP.eventosBtn.setVisible(true);
        currentVP.recintosBtn.setVisible(true);
        currentVP.exitBtn.setVisible(true);
        currentVP.homeBtn.setVisible(true);
    }//GEN-LAST:event_backBtnLRPnlActionPerformed

    private void backBtnMRPnlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnMRPnlActionPerformed
        modRecintoPnl.setVisible(false);
        crearRecintoBtn.setVisible(true);
        listarRecintosBtn.setVisible(true);
        modRecintoBtn.setVisible(true);
        eliminarRecintoBtn.setVisible(true);
        currentVP.ventaEntradasBtn.setVisible(true);
        currentVP.eventosBtn.setVisible(true);
        currentVP.recintosBtn.setVisible(true);
        currentVP.exitBtn.setVisible(true);
        currentVP.homeBtn.setVisible(true);
        clearFieldsModificarRecinto();
    }//GEN-LAST:event_backBtnMRPnlActionPerformed

    private void backBtnERPnlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnERPnlActionPerformed
        eliminarRecintoPnl.setVisible(false);
        crearRecintoBtn.setVisible(true);
        listarRecintosBtn.setVisible(true);
        modRecintoBtn.setVisible(true);
        eliminarRecintoBtn.setVisible(true);
        currentVP.ventaEntradasBtn.setVisible(true);
        currentVP.eventosBtn.setVisible(true);
        currentVP.recintosBtn.setVisible(true);
        currentVP.exitBtn.setVisible(true);
        currentVP.homeBtn.setVisible(true);
        clearFieldsEliminarRecinto();
    }//GEN-LAST:event_backBtnERPnlActionPerformed
    
    private void aceptarBtnCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnCRActionPerformed
        Recinto newRecinto = new Recinto();
        if (!"".equals(idRecintoFieldCR.getText()) &&
            !"".equals(nombreRecintoFieldCR.getText()) &&
            !"".equals(ubicacionFieldCR.getText()) &&
            !"".equals(cuposFieldCR.getText())){
            try{
                newRecinto.setIdRecinto(idRecintoFieldCR.getText());
            }
            catch(BadIdRecintoException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "ID Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (menu.obtenerRecinto(newRecinto.getIdRecinto()) == null){
                newRecinto.setNombreRecinto(nombreRecintoFieldCR.getText());
                newRecinto.setUbicacion(ubicacionFieldCR.getText());
                newRecinto.setCupos(Integer.parseInt(cuposFieldCR.getText()));//VALIDAR
                
                menu.agregarRecinto(newRecinto);
                menu.mostrarRecintos();//consola
                
                crearRecintoPnl.setVisible(false);
                crearRecintoBtn.setVisible(true);
                listarRecintosBtn.setVisible(true);
                modRecintoBtn.setVisible(true);
                eliminarRecintoBtn.setVisible(true);
                currentVP.ventaEntradasBtn.setVisible(true);
                currentVP.eventosBtn.setVisible(true);
                currentVP.recintosBtn.setVisible(true);
                currentVP.exitBtn.setVisible(true);
                currentVP.homeBtn.setVisible(true);
                clearFieldsCrearRecinto();
                
                JOptionPane.showMessageDialog(null, "El recinto fue creado y agregado correctamente al sistema", "System Says",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                 JOptionPane.showMessageDialog(null, "El recinto ingresado ya se encuentra asociado a una ID en el sistema", "Duplicate ID", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Los campos se encuentran vacios", "Field Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarBtnCRActionPerformed

    private void aceptarBtnDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnDRActionPerformed
        if (!"".equals(nombreRecintoFieldDR.getText()) &&
            !"".equals(ubicacionFieldDR.getText()) &&
            !"".equals(cuposFieldDR.getText())){
            
            String nombre = nombreRecintoFieldDR.getText();
            String ubicacion = ubicacionFieldDR.getText();
            int cupos = Integer.parseInt(cuposFieldDR.getText());
            menu.modificarRecinto(currentRecinto, nombre, ubicacion, cupos);//if si o no?
            menu.mostrarRecintos();//consola

            datosRecintoPnl.setVisible(false);
            crearRecintoBtn.setVisible(true);
            listarRecintosBtn.setVisible(true);
            modRecintoBtn.setVisible(true);
            eliminarRecintoBtn.setVisible(true);
            currentVP.ventaEntradasBtn.setVisible(true);
            currentVP.eventosBtn.setVisible(true);
            currentVP.recintosBtn.setVisible(true);
            currentVP.exitBtn.setVisible(true);
            currentVP.homeBtn.setVisible(true);
            clearFieldsDatosRecinto();
            JOptionPane.showMessageDialog(null, "El recinto fue modificado correctamente en el sistema", "System Says",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Los campos se encuentran vacios", "Field Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarBtnDRActionPerformed

    private void validarIdRecintoBtnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarIdRecintoBtnMRActionPerformed
        if (!"".equals(idRecintoFieldMR.getText())){
            if (menu.obtenerRecinto(idRecintoFieldMR.getText()) != null){
                currentRecinto = menu.obtenerRecinto(idRecintoFieldMR.getText());
                modRecintoPnl.setVisible(false);
                datosRecintoPnl.setVisible(true);
                clearFieldsModificarRecinto();
            }
            else{
                 JOptionPane.showMessageDialog(null, "El recinto ingresado no se encuentra asociado a una ID en el sistema", "ID Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Los campos se encuentran vacios", "Field Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_validarIdRecintoBtnMRActionPerformed

    private void aceptarBtnERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnERActionPerformed
        if (!"".equals(idRecintoFieldER.getText())){
            if (menu.obtenerRecinto(idRecintoFieldER.getText()) != null){
                menu.eliminarRecinto(idRecintoFieldER.getText());
                menu.mostrarRecintos();//consola
                
                eliminarRecintoPnl.setVisible(false);
                crearRecintoBtn.setVisible(true);
                listarRecintosBtn.setVisible(true);
                modRecintoBtn.setVisible(true);
                eliminarRecintoBtn.setVisible(true);
                currentVP.ventaEntradasBtn.setVisible(true);
                currentVP.eventosBtn.setVisible(true);
                currentVP.recintosBtn.setVisible(true);
                currentVP.exitBtn.setVisible(true);
                currentVP.homeBtn.setVisible(true);
                clearFieldsEliminarRecinto();
                JOptionPane.showMessageDialog(null, "El recinto fue eliminado correctamente del sistema", "System Says",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                 JOptionPane.showMessageDialog(null, "El recinto ingresado no se encuentra asociado a una ID en el sistema", "ID Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Los campos se encuentran vacios", "Field Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_aceptarBtnERActionPerformed

    private void buscarIdRecintoBtnLRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIdRecintoBtnLRActionPerformed
        
    }//GEN-LAST:event_buscarIdRecintoBtnLRActionPerformed

    //Funciones de limpiado
    public void clearFieldsCrearRecinto() {
        idRecintoFieldCR.setText("");
        nombreRecintoFieldCR.setText("");
        ubicacionFieldCR.setText("");
        cuposFieldCR.setText("");
    }
    
    public void clearFieldsEliminarRecinto(){
        idRecintoFieldER.setText("");
    }
    
    public void clearFieldsModificarRecinto() {
        idRecintoFieldMR.setText("");
    }

    public void clearFieldsDatosRecinto() {
        nombreRecintoFieldDR.setText("");
        ubicacionFieldDR.setText("");
        cuposFieldDR.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBtnCR;
    private javax.swing.JButton aceptarBtnDR;
    private javax.swing.JButton aceptarBtnER;
    private javax.swing.JButton backBtnCRPnl;
    private javax.swing.JButton backBtnERPnl;
    private javax.swing.JButton backBtnLRPnl;
    private javax.swing.JButton backBtnMRPnl;
    private javax.swing.JPanel backgroundPnl;
    private javax.swing.JButton buscarIdRecintoBtnLR;
    private javax.swing.JButton crearRecintoBtn;
    private javax.swing.JPanel crearRecintoPnl;
    private javax.swing.JTextField cuposFieldCR;
    private javax.swing.JTextField cuposFieldDR;
    private javax.swing.JLabel cuposLblCR;
    private javax.swing.JLabel cuposLblDR;
    private javax.swing.JPanel datosRecintoPnl;
    private javax.swing.JButton eliminarRecintoBtn;
    private javax.swing.JPanel eliminarRecintoPnl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel headerLblCR;
    private javax.swing.JLabel headerLblDR;
    private javax.swing.JLabel headerLblER;
    private javax.swing.JLabel headerLblLR;
    private javax.swing.JLabel headerLblMR;
    private javax.swing.JTextField idRecintoFieldCR;
    private javax.swing.JTextField idRecintoFieldER;
    private javax.swing.JTextField idRecintoFieldLR;
    private javax.swing.JTextField idRecintoFieldMR;
    private javax.swing.JLabel idRecintoLblCR;
    private javax.swing.JLabel idRecintoLblER;
    private javax.swing.JLabel idRecintoLblLR;
    private javax.swing.JLabel idRecintoLblMR;
    private javax.swing.JButton listarRecintosBtn;
    private javax.swing.JPanel listarRecintosPnl;
    private javax.swing.JButton modRecintoBtn;
    private javax.swing.JPanel modRecintoPnl;
    private javax.swing.JTextField nombreRecintoFieldCR;
    private javax.swing.JTextField nombreRecintoFieldDR;
    private javax.swing.JLabel nombreRecintoLblCR;
    private javax.swing.JLabel nombreRecintoLblDR;
    private javax.swing.JScrollPane recintosTableScrPnlLR;
    private javax.swing.JTable recintosTblLR;
    private javax.swing.JTextField ubicacionFieldCR;
    private javax.swing.JTextField ubicacionFieldDR;
    private javax.swing.JLabel ubicacionLblCR;
    private javax.swing.JLabel ubicacionLblDR;
    private javax.swing.JButton validarIdRecintoBtnMR;
    // End of variables declaration//GEN-END:variables
}
