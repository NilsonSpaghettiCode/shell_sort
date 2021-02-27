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
public class DoubleLinkedList {

    private Nodo start;
    private Nodo end;
    private long n;

    public DoubleLinkedList() {
        start = null;
        end = null;
        n = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void add(Nodo nodo_nuevo) {
        if (isEmpty()) {
            start = nodo_nuevo;
            end = nodo_nuevo;
            

        } else {

            start.setAtras(nodo_nuevo);
            nodo_nuevo.setSiguiente(start);
            start = nodo_nuevo;

            n++;
            
        }

    }
    
    public void AddFirst(Nodo nodo_nuevo) {
        if (isEmpty()) {
            start = nodo_nuevo;
            end = nodo_nuevo; 

        } else {
            
            nodo_nuevo.setSiguiente(end);
            end.setAtras(nodo_nuevo);
            end = nodo_nuevo;
            
            n++;
            
        }

    }
    

    public void verNumeros() {
        Nodo tempo = this.getStart();

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print("[");
                System.out.print(tempo.getNumero()+",");
            }
            else if(i == (n-1))
            {
                System.out.print(tempo.getNumero());
                System.out.print("]"); 
                System.out.println("");
            }else
            {
                System.out.print(tempo.getNumero()+",");
            }
            tempo = tempo.getSiguiente();
        }

    }
    
    public void ViewNumbers()
    {
        Nodo tempo = this.getStart();
        
        for (int i = 0; i <= this.getN(); i++)
        {
            if (i == 0) {
                System.out.print("[");
                System.out.print(tempo.getNumero()+",");
            }
            else if(i == (n))
            {
                System.out.print(tempo.getNumero());
                System.out.print("]"); 
                System.out.println("");
            }else
            {
                System.out.print(tempo.getNumero()+",");
            }
            tempo = tempo.getAtras();
                 
        }
    }

    public long getNumber(long position) {

        Nodo temporal = this.getStart();
        
        for (int i = 0; i <= this.getN(); i++) {
            
            if (i == position) {
                return temporal.getNumero();
            }
            temporal = temporal.getAtras();
        }
        return 0;

     
    }
    
    public void setNumber(long position, long num) {
        
        Nodo temporal = this.getStart();
        
        for (int i = 0; i <= this.getN(); i++) {  
            if (i == position) {
                temporal.setNumero(num);
                return;
                
            }
            temporal = temporal.getAtras();
        }

    }
    
    

    public Nodo getStart() {
        return start;
    }

    public void setStart(Nodo start) {
        this.start = start;
    }

    public Nodo getEnd() {
        return end;
    }

    public void setEnd(Nodo end) {
        this.end = end;
    }

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }



}
