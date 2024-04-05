/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentabancaria;

import java.util.ArrayList;
/**
 *
 * @author MINEDUCYT
 */

public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    private ArrayList<String> transacciones;
    
    public CuentaBancaria(String numeroCuenta, double saldoInicial){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.transacciones = new ArrayList<>();
    }
    
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double monto)  {
        if (monto > 0){
            saldo += monto;
            transacciones.add("Retiro de $" + monto);
        }
    }
        public void retirar(double monto) {
            if (monto > 0){
            saldo -= monto;
            transacciones.add("Retiro de $" + monto);
        }
    }
        public void mostrarTransacciones() {
            System.out.println("Transacciones de la cuenta" + numeroCuenta + ":");
            for (String transaccion : transacciones){
                System.out.println(transaccion);
            }
        }
        public static void main (String[] args)  {
            CuentaBancaria cuenta= new CuentaBancaria("12345",1000);
            cuenta.depositar(500);
            cuenta.retirar(200);
            cuenta.depositar(1000);
            System.out.println("Saldo actual: $ " + cuenta.getSaldo());
            cuenta.mostrarTransacciones();
        }
    
    


    
}
