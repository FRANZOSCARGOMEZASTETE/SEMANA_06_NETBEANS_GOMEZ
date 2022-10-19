/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_06_netbeans_gomez;

//Crea un método que dado un número, lo imprima invertido por pantalla
/**
 *
 * @author FRANZGOMEZ
 */
public class EJERCICIO8 {
public static void main(String[] args)
{
 //numero a invertir
 int n = 1234;
 inv(n);
}
//método que dado un número, lo imprime por pantalla invertido
//ejemplo: n = 1234 -> 4321
static void inv(int n)
{
 if(n<10) System.out.print(n);
 else
 {
 System.out.print(n%10);
 inv(n/10);
 
 }
}
}