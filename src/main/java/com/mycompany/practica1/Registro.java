/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author USUARIO
 */
public class Registro {
    
    private  String nombreApostador;
    private int montoApostar;
    
    private String primera;
    private String segunda;
    private String tercera;
    private String cuarta;
    private String quinta;
    private String sexta;
    private String septima;
    private String octava;
    private String novena;
    private String decima;
    //private static resultado[] posicion = new resultado[10];

    public Registro(){
        nombreApostador ="";
        montoApostar = 0;
        primera = "";
        segunda = "";
        tercera = "";
        cuarta = "";
        quinta = "";
        sexta = "";
        septima = "";
        octava = "";
        novena = "";
        decima = "";
    
    }
    
    public Registro(String nombre, int monto, String primera, String segunda, String tercera, String cuarta, String quinta, String sexta, String septima, String octava, String novena, String decima) {
        this.nombreApostador = nombre;
        this.montoApostar = monto;
        this.primera = primera;
        this.segunda = segunda;
        this.tercera = tercera;
        this.cuarta = cuarta;
        this.quinta = quinta;
        this.sexta = sexta;
        this.septima = septima;
        this.octava = octava;
        this.novena = novena;
        this.decima = decima;
    }

    public String getNombreApostador() {
        return nombreApostador;
    }

    public void setNombreApostador(String nombreApostador) {
        this.nombreApostador = nombreApostador;
    }

    public int getMontoApostar() {
        return montoApostar;
    }

    public void setMontoApostar(int montoApostar) {
        this.montoApostar = montoApostar;
    }

    

    public String getPrimera() {
        return primera;
    }

    public void setPrimera(String primera) {
        this.primera = primera;
    }

    public String getSegunda() {
        return segunda;
    }

    public void setSegunda(String segunda) {
        this.segunda = segunda;
    }

    public String getTercera() {
        return tercera;
    }

    public void setTercera(String tercera) {
        this.tercera = tercera;
    }

    public String getCuarta() {
        return cuarta;
    }

    public void setCuarta(String cuarta) {
        this.cuarta = cuarta;
    }

    public String getQuinta() {
        return quinta;
    }

    public void setQuinta(String quinta) {
        this.quinta = quinta;
    }

    public String getSexta() {
        return sexta;
    }

    public void setSexta(String sexta) {
        this.sexta = sexta;
    }

    public String getSeptima() {
        return septima;
    }

    public void setSeptima(String septima) {
        this.septima = septima;
    }

    public String getOctava() {
        return octava;
    }

    public void setOctava(String octava) {
        this.octava = octava;
    }

    public String getNovena() {
        return novena;
    }

    public void setNovena(String novena) {
        this.novena = novena;
    }

    public String getDecima() {
        return decima;
    }

    public void setDecima(String decima) {
        this.decima = decima;
    }

    



}
