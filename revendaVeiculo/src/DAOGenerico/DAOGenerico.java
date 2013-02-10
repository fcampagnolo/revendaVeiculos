package DAOGenerico;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DAOGenerico<Obj> implements InterfaceDAOGenerico {

    private final Session sessao;
    Transaction transacao = null;
    private Obj obj;

    public DAOGenerico(Obj obj) {
        this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
        this.obj = obj;
    }

    @Override
    public void insere() {
        try { // implementando rollback!
            transacao = sessao.beginTransaction();
            sessao.save(obj);
            transacao.commit();
        } catch (HibernateException erro) {
            JOptionPane.showMessageDialog(null, "Erro inserção: " + erro);
            transacao.rollback();
        }
    }

    @Override
    public void excluir() {
        try {
            transacao = sessao.beginTransaction();
            sessao.delete(obj);
            transacao.commit();
        } catch (HibernateException erro) {
            JOptionPane.showMessageDialog(null, "Erro Excluir DAO: " + erro);
            transacao.rollback();
        }
    }

    @Override
    public void atualiza() {
        try {
            transacao = sessao.beginTransaction();
            sessao.update(obj);
            transacao.commit();
        } catch (HibernateException erro) {
            JOptionPane.showMessageDialog(null, "Erro Atualiza DAO: " + erro);
            transacao.rollback();
        }
    }

    @Override
    public List listar(String listar) {
        transacao = sessao.beginTransaction();
        List lista_clientes = sessao.createQuery(listar).list();
        transacao.commit();
        return lista_clientes;
    }
}
