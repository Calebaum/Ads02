/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import classesdedados.*;
import java.util.ArrayList;

/**
 *
 * @author calebaum
 */
public interface ICRUD {
    void incluir(Contato objeto) throws Exception;
    public ArrayList<Contato> recuperar() throws Exception;
}
