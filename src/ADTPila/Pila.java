/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADTPila;

/**
 *
 * @author Gonzalo Orellana
 */
public class Pila {

    private Nodo primero;

    class Nodo {

        private char letra;
        private Nodo siguiente;

        Nodo(char letra) {
            this.letra = letra;
            this.siguiente = null;
        }

        public char getLetra() {
            return letra;
        }

        public void setLetra(char letra) {
            this.letra = letra;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

    }

    Pila() {
        this.primero = null;
    }

    public boolean esVacia() {

        if (this.primero == null) {
            return true;
        }

        return false;

    }

    public void push(char letra) {

        Nodo aux = new Nodo(letra);

        aux.setSiguiente(primero);

        primero = aux;

    }

    public char top() throws Exception {

        if (this.esVacia()) {
            throw new Exception();
        }

        return primero.getLetra();

    }

    public void pop() throws Exception {

        Nodo aux;

        if (this.esVacia()) {
            throw new Exception();
        } else {

            aux = primero.getSiguiente();

            primero = aux;

        }

    }

    
    //No pertenece al ADT pero sirve para verificar el correcto funcionamiento de la implementacion
    
    public void mostrar() {
        
        Nodo aux;

        aux = primero;

        while (aux != null) {
            System.out.print(aux.getLetra() + "->");
            aux = aux.getSiguiente();
        }

        System.out.println("null");

    }

}
