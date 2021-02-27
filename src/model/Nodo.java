/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nilson Vargas
 */
public class Nodo
{
    private Nodo atras;
    private long numero;
    private Nodo siguiente;
    
    public Nodo(long numero)
    {
        atras = null;
        this.numero = numero;
        siguiente = null;
    }
    
    public Nodo()
    {
        atras = null;
        siguiente = null;
        this.numero = 0;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
