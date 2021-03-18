/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buscar;

import ejemplo.libro;
import java.util.List;

public interface Buscar {

    public List<libro> buscar(String[] strings) throws Exception;
}
