/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author eriss
 */
public class Nombrevacioexception extends Exception {

    /**
     * Creates a new instance of <code>Nombrevacioexception</code> without
     * detail message.
     */
    public Nombrevacioexception() {
    }

    /**
     * Constructs an instance of <code>Nombrevacioexception</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public Nombrevacioexception(String msg) {
        super(msg);
    }
}
