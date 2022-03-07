/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practica1;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Resultados extends javax.swing.JFrame {

    //arreglo para introducior los datos de resultados finales
    String[] resultados = new String[10];
    static DefaultTableModel modelo = new DefaultTableModel();

    //instancio los array que vienen desde la clase Incio 
    static String[] array;
    static String[] nombre;
    static resultado[] archivo;
    //array para guardar los resultados 
    static Object apuesta[] = new Object[13];
    ArrayList v = new ArrayList();
    static String[] list;

    public Resultados() {
        initComponents();
        Object cabecera[] = {"Nombre","1Pos", "2Pos", "3Pos", "4Pos", "5Pos", "6Pos", "7Pos", "8Pos", "9Pos", "10Pos", "Puntaje"};
        modelo = new DefaultTableModel(cabecera, 0);
        table.setModel(modelo);

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnResultados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        quinta = new javax.swing.JComboBox<>();
        cuarta = new javax.swing.JComboBox<>();
        tercera = new javax.swing.JComboBox<>();
        segunda = new javax.swing.JComboBox<>();
        primera = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        decima = new javax.swing.JComboBox<>();
        novena = new javax.swing.JComboBox<>();
        octava = new javax.swing.JComboBox<>();
        septima = new javax.swing.JComboBox<>();
        sexta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese los resultados de la carrera ");

        btnResultados.setText("Agregar Resultados");
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
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
        jScrollPane1.setViewportView(table);

        btnGuardar.setText("Calcular resultados");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setText("1.ª Posicion");

        jLabel5.setText("2.ª Posicion");

        jLabel6.setText("3.ª Posicion");

        jLabel7.setText("4.ª Posicion");

        jLabel8.setText("5.ª Posicion");

        quinta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        cuarta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        tercera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        segunda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        primera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        jLabel9.setText("6ta Posicion");

        jLabel10.setText("7.ª Posicion");

        jLabel11.setText("8.ª Posicion");

        jLabel12.setText("9.ª Posicion");

        jLabel13.setText("10.ª Posicion");

        decima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " ", " " }));

        novena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        octava.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        septima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        sexta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1 ", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9 ", "C10", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
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
                                .addComponent(octava, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnResultados)
                        .addGap(295, 295, 295)
                        .addComponent(btnGuardar)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
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
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(octava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(novena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnResultados))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
        IngresoResultados();
    }//GEN-LAST:event_btnResultadosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ComprobarResultados();

    }//GEN-LAST:event_btnGuardarActionPerformed

    //ingreso de resultados a un array
    private void IngresoResultados() {

        resultados[0] = primera.getSelectedItem().toString();
        resultados[1] = segunda.getSelectedItem().toString();
        resultados[2] = tercera.getSelectedItem().toString();
        resultados[3] = cuarta.getSelectedItem().toString();
        resultados[4] = quinta.getSelectedItem().toString();
        resultados[5] = sexta.getSelectedItem().toString();
        resultados[6] = septima.getSelectedItem().toString();
        resultados[7] = octava.getSelectedItem().toString();
        resultados[8] = novena.getSelectedItem().toString();
        resultados[9] = decima.getSelectedItem().toString();

        for (int i = 0; i < resultados.length; i++) {
            System.out.println("La Posicion de los resultados " + i
                    + " : " + resultados[i]);
        }

    }

    //comparo resultados de array de apuestas y array de resultados
    public void ComprobarResultados() {
        int i = 0;
        //variable para contar los puntos que se ganan
        int cont = 0;
        //variable para guardar la comparacion de resultados
        String resul = null;
        //array para traer de la pagina de Inicio los datos ingresados
        array = Inicio.AgregarAlArreglo();
        //array para traer de la pagina de Inicio los nombres de los apostadores
        nombre = Inicio.Nombres();
        String nombres = null;

        //for para imprimir en consola el array de apuesta
        for (i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

        //for para imprimir en consola el arry de resultados
        for (i = 0; i < 10; i++) {
            System.out.println(resultados[i]);
        }
        for (i = 0; i < nombre.length; i++) {
            nombres = nombre[i];
            System.out.println(nombre[i]);
        }
        //comprobar posiciones
        //utilice un operador ternario para calcular el valor del tamaño del arreglo y así evitar codificar una estructura if.
        int tamaño = (array.length < resultados.length) ? array.length : resultados.length;

        //recorro el arreglo desde cero hasta el tamaño de la variable ternaria
        for (int x = 0; x < tamaño; x++) {
            if (array[x].equals(resultados[x])) {

                //contador para ver cuantas veces acerto el apostador
                cont++;
                resul = array[x];
                System.out.println(resul);
                System.out.println("El número " + array[x] + " en la posición " + x);

            }
        }
        apuesta[0] = nombres;
        apuesta[1] = resul;
        apuesta[2] = resul;
        apuesta[3] = resul;
        apuesta[4] = resul;
        apuesta[5] = resul;
        apuesta[6] = resul;
        apuesta[7] = resul;
        apuesta[8] = resul;
        apuesta[9] = resul;
        apuesta[10] = resul;
        apuesta[11] = cont + "Puntos";
        modelo.addRow(apuesta);

    }


    public static void Llenar() {

        list = Inicio.Lista();

    }

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
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnResultados;
    public static javax.swing.JComboBox<String> cuarta;
    public static javax.swing.JComboBox<String> decima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JComboBox<String> novena;
    public static javax.swing.JComboBox<String> octava;
    public static javax.swing.JComboBox<String> primera;
    public static javax.swing.JComboBox<String> quinta;
    public static javax.swing.JComboBox<String> segunda;
    public static javax.swing.JComboBox<String> septima;
    public static javax.swing.JComboBox<String> sexta;
    private javax.swing.JTable table;
    public static javax.swing.JComboBox<String> tercera;
    // End of variables declaration//GEN-END:variables
}
