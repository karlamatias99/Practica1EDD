/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practica1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Inicio extends javax.swing.JFrame {

    //instancio la tabla a mostrar en la inicio
    static DefaultTableModel modelo = new DefaultTableModel();
    //arreglo para guardar los datos en la tabla 
    static String apuesta[] = new String[13];
    //arreglo para guardar los nombres de los apostadores
    static String[] nombres = new String[1];
    //arreglo para guardar el monto a apostar
    static int[] monto = new int[1];
    //arreglo para guardar las posiciones de los caballos 
    static String[] OrdenCaballos = new String[10];

    //instancio la clase de ArrayList creada 
    static ArrayList v = new ArrayList();

    public Inicio() {
        initComponents();
        Object cabecera[] = {"Nombre", "Monto", "1Pos", "2Pos", "3Pos", "4Pos", "5Pos", "6Pos", "7Pos", "8Pos", "9Pos", "10Pos"};
        modelo = new DefaultTableModel(cabecera, 0);
        table.setModel(modelo);

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        primera = new javax.swing.JComboBox<>();
        segunda = new javax.swing.JComboBox<>();
        tercera = new javax.swing.JComboBox<>();
        cuarta = new javax.swing.JComboBox<>();
        quinta = new javax.swing.JComboBox<>();
        septima = new javax.swing.JComboBox<>();
        sexta = new javax.swing.JComboBox<>();
        octava = new javax.swing.JComboBox<>();
        novena = new javax.swing.JComboBox<>();
        decima = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setText("7.ª Posicion");

        jLabel11.setText("8.ª Posicion");

        jLabel12.setText("9.ª Posicion");

        jLabel13.setText("10.ª Posicion");

        jLabel5.setText("2.ª Posicion");

        jLabel6.setText("3.ª Posicion");

        jLabel7.setText("4.ª Posicion");

        jLabel2.setText("Nombre Apostador");

        jLabel3.setText("Monto a Apostar");

        jLabel4.setText("1.ª Posicion");

        jLabel8.setText("5.ª Posicion");

        jLabel9.setText("6ta Posicion");

        btnCargar.setText("Cargar Archivo");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setAutoscrolls(false);
        jScrollPane2.setViewportView(table);

        btnGuardar.setText("Cerrar Apuesta");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAgregar1.setText("Agregar Apuesta");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        primera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        segunda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        tercera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        cuarta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        quinta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        septima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        sexta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        octava.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        novena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        decima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(primera, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tercera, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(segunda, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cuarta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quinta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(decima, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(novena, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(septima, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(octava, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                            .addComponent(txtNombre))
                        .addGap(332, 332, 332)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(primera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(segunda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tercera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sexta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(septima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cuarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(octava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(novena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        JFileChooser selectorArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos CSV", "csv");

        selectorArchivo.setFileFilter(filtro);

        int seleccionar = selectorArchivo.showOpenDialog(this);

        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            File archivo = selectorArchivo.getSelectedFile();
            cargarArchivo(archivo);

        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        txtNombre.setEditable(false);
        txtMonto.setEnabled(false);
        primera.setEnabled(false);
        segunda.setEnabled(false);
        tercera.setEnabled(false);
        cuarta.setEnabled(false);
        quinta.setEnabled(false);
        sexta.setEnabled(false);
        septima.setEnabled(false);
        octava.setEnabled(false);
        novena.setEnabled(false);
        decima.setEnabled(false);

        Resultados resul = new Resultados();
        resul.setVisible(true);
        //  resul.setEnabled(false);


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        LlenarTabla();

    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private static void LlenarTabla() {

        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio

        String nombre = txtNombre.getText();
        String una = primera.getSelectedItem().toString();
        String dos = segunda.getSelectedItem().toString();
        String tres = tercera.getSelectedItem().toString();
        String cuatro = cuarta.getSelectedItem().toString();
        String cinco = quinta.getSelectedItem().toString();
        String seis = sexta.getSelectedItem().toString();
        String siete = septima.getSelectedItem().toString();
        String ocho = octava.getSelectedItem().toString();
        String nueve = novena.getSelectedItem().toString();
        String diez = decima.getSelectedItem().toString();
        String monto = txtMonto.getText();

        apuesta[0] = nombre;
        apuesta[1] = monto;
        apuesta[2] = una;
        apuesta[3] = dos;
        apuesta[4] = tres;
        apuesta[5] = cuatro;
        apuesta[6] = cinco;
        apuesta[7] = seis;
        apuesta[8] = siete;
        apuesta[9] = ocho;
        apuesta[10] = nueve;
        apuesta[11] = diez;
        modelo.addRow(apuesta);

        v.push(Arrays.toString(apuesta));
        v.print();

        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos

    }

    public static String[] AgregarAlArreglo() {
        monto[0] = Integer.parseInt(txtMonto.getText());
        OrdenCaballos[0] = primera.getSelectedItem().toString();
        OrdenCaballos[1] = segunda.getSelectedItem().toString();
        OrdenCaballos[2] = tercera.getSelectedItem().toString();
        OrdenCaballos[3] = cuarta.getSelectedItem().toString();
        OrdenCaballos[4] = quinta.getSelectedItem().toString();
        OrdenCaballos[5] = sexta.getSelectedItem().toString();
        OrdenCaballos[6] = septima.getSelectedItem().toString();
        OrdenCaballos[7] = octava.getSelectedItem().toString();
        OrdenCaballos[8] = novena.getSelectedItem().toString();
        OrdenCaballos[9] = decima.getSelectedItem().toString();

        //imprimo para ver que se guardan en el array 
        for (int i = 0; i < OrdenCaballos.length; i++) {
            System.out.println("Elemento en el índice " + i
                    + " : " + OrdenCaballos[i]);
        }

        return OrdenCaballos;
    }

    public static String[] Nombres() {

        nombres[0] = txtNombre.getText();

        return nombres;

    }

    public void cargarArchivo(File archivo) {

        //metodo para cargar el archivo de entrada, y guardar los datos en un array dinamico.
        //leo y guardo el archivo de entrada
        FileReader reader = null;
        BufferedReader br = null;

        try {
            reader = new FileReader(archivo);
            br = new BufferedReader(reader);

            String linea; // para leer linea por linea del archivo
            while ((linea = br.readLine()) != null) {

                //variable para saber con que viene separado el archivo de entrada, puede ser ; o , en este caso uso ,
                String arreglo[] = linea.split(",");

                //agreo datos a la tabla mostrada en el Incio 
                apuesta[0] = arreglo[0];
                apuesta[1] = arreglo[1];
                apuesta[2] = arreglo[2];
                apuesta[3] = arreglo[3];
                apuesta[4] = arreglo[4];
                apuesta[5] = arreglo[5];
                apuesta[6] = arreglo[6];
                apuesta[7] = arreglo[7];
                apuesta[8] = arreglo[8];
                apuesta[9] = arreglo[9];
                apuesta[10] = arreglo[10];
                apuesta[11] = arreglo[11];
                modelo.addRow(apuesta);

                
                //Realizo un push de datos al arreglo 
                v.push(Arrays.toString(apuesta));
                //imprimo elementos en consula para hacer pruebas
                System.out.println("ArrayList elements: ");
                v.print();
            }
        } catch (Exception ex) {

        }

    }

    //valores repetidos
    public void valoresRepetidos(){
    for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i].equals(apuesta[i + 1])) {
                System.out.println("Elemento Repetido:" + apuesta[i]);
            }
        }
    }
    //metodo para poder pasar la lista de elementos ingresados a Frame de resultados
    public static String[] Lista() {

        return v.getLista();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnGuardar;
    public static javax.swing.JComboBox<String> cuarta;
    public static javax.swing.JComboBox<String> decima;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JComboBox<String> novena;
    public static javax.swing.JComboBox<String> octava;
    public static javax.swing.JComboBox<String> primera;
    public static javax.swing.JComboBox<String> quinta;
    public static javax.swing.JComboBox<String> segunda;
    public static javax.swing.JComboBox<String> septima;
    public static javax.swing.JComboBox<String> sexta;
    private javax.swing.JTable table;
    public static javax.swing.JComboBox<String> tercera;
    public static javax.swing.JTextField txtMonto;
    public static javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
