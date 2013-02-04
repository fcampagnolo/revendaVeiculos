package DAOGenerico;

import DAO.*;
import entidades.Cliente;
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void atualiza() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}