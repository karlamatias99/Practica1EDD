/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author USUARIO
 */
public class ArrayList {

    //arreglo que almacena los elementos del ArrayList
    private String arr[];

    //almacenamiento total del ArrayList
    private int capacity;

    //elementos actualmente en la ArrayList
    private int actual;

    //constructor por defecto, inicialmente tiene la capacidad de un elemento
    public ArrayList() {
        arr = new String[1];
        capacity = 1;
        actual = 0;
    }
    
    //funcion para agregar elemento al final
     public void push(String data)
    {
  
    /* si el numero de elementos es igual a la capacidad, entonces necesitamos duplicar la capacidad  */
        
        if (actual == capacity) {
            String temp[] = new String[2 * capacity];
  
            // copying old array elements
            // to new array
          //  for (int i = 0; i < capacity; i++)
               // temp[i] = arr[i];
  
            capacity *= 2;
            arr = temp;
        }
  
        // Inserting data
        arr[actual] = data;
        actual++;
    }
     
     
    /*Funcion para extraer la capacidad del arreglo*/
    int getcapacity()
    {
        return capacity;
    }
    
    // funcion para imprimir el arreglo en consola y hacer pruebas
    void print()
    {
        for (int i = 0; i < actual; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    
    public String[] getLista() {
        return arr;
    }

    private void setLista(String[] arr) {
        this.arr = arr;
    }
}
