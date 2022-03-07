/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

public class Lista {

    private int length;
    private String[] lista;
    private final int INCREMENTO = 100;
    
    
    public Lista() {
        this.lista = new String[INCREMENTO];
    }

    public void add(String nuevo) {
        
        if (length>=this.lista.length) {
            this.lista = redimensionar(this.lista);
        } 
        
        this.lista[length] = nuevo;
        this.setLength(this.getLength()+1);
    }

    private String[] redimensionar(String[] arreglo) {

        String[] nuevoArreglo = new String[arreglo.length + INCREMENTO];
        
        for (int i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i];
        }

        return nuevoArreglo;
    }

    public void print() {
        
        for (int i = 0; i < length; i++) {
            System.out.println((i+1) + ". " + this.lista[i]);
            
        }
    }

    public void removeAll() {
        String[] limpiarLista = new String[INCREMENTO];
        this.setLista(limpiarLista);
        this.setLength(0);
    }

    public int getLength() {
        return length;
    }

    private void setLength(int ultimoAdd) {
        this.length = ultimoAdd;
    }

    public String[] getLista() {
        return lista;
    }

    private void setLista(String[] lista) {
        this.lista = lista;
    }

    

}
