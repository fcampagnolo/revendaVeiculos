/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Cliente;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface InterfaceALunoDAO {
    public void insereAluno (Cliente cliente);
    public void excluirAluno (Cliente cliente);
    public void atualizaAluno (Cliente cliente);
    public List listarAlunos (String Listar);
}
