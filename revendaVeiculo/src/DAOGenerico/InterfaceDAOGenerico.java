/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOGenerico;

import DAO.*;
import entidades.Cliente;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface InterfaceDAOGenerico {
    public void insere ();
    public void excluir ();
    public void atualiza ();
    //public List listar (String Listar);
    public List listar ();
}