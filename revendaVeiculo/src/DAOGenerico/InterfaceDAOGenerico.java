package DAOGenerico;

import java.util.List;

public interface InterfaceDAOGenerico {
    public void insere();
    public void excluir();
    public void atualiza();
    public List listar(String Listar);
}