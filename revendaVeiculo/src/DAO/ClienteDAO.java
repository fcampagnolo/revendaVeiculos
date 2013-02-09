package DAO;

import org.hibernate.Session;
import entidades.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class ClienteDAO implements InterfaceALunoDAO {

    private final Session sessao;
    Transaction tx_aluno = null;

    public ClienteDAO() {
        this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    @Override
    public void insereAluno(Cliente cliente) {
        try { // implementando rollback!
            tx_aluno = sessao.beginTransaction();
            sessao.save(cliente);
            tx_aluno.commit();
        } catch (HibernateException erro) {
            JOptionPane.showMessageDialog(null, "Erro inserção: " + erro);
            tx_aluno.rollback();
        }

    }

    @Override
    public void excluirAluno(Cliente cliente) {
        try {
            tx_aluno = sessao.beginTransaction();
            sessao.delete(cliente);
            tx_aluno.commit();
        } catch (HibernateException erro) {
            JOptionPane.showMessageDialog(null, "Erro exclusão: " + erro);
            tx_aluno.rollback();
        }
    }

    @Override
    public void atualizaAluno(Cliente cliente) {
        try {
            tx_aluno = sessao.beginTransaction();
            sessao.update(cliente);
            tx_aluno.commit();
        } catch (HibernateException erro) {
            JOptionPane.showMessageDialog(null, "Erro alteração: " + erro);
            tx_aluno.rollback();
        }
    }

    @Override
    public List listarAlunos(String Listar) {
        tx_aluno = sessao.beginTransaction();
        List lista_clientes = sessao.createQuery(Listar).list();
        return lista_clientes;
    }
}
