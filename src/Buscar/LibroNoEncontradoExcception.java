/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buscar;

import java.io.Serializable;

public class LibroNoEncontradoExcception extends Exception implements Serializable {

    public LibroNoEncontradoExcception() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ldc           No hay resultados para la busqueda realizada.
         * 3: invokespecial java/lang/Exception."<init>":(Ljava/lang/String;)V
         * 6: return
         *  */
        // </editor-fold>
    }

    public LibroNoEncontradoExcception(String message) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokespecial java/lang/Exception."<init>":(Ljava/lang/String;)V
         * 5: return
         *  */
        // </editor-fold>
    }
}
