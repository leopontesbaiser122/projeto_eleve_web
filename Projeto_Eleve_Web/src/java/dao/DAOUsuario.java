/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import Model.Usuario;

/**
 *
 * @author a1136704
 */
public class DAOUsuario extends DAOGenerico<Usuario> {

    public DAOUsuario() {
        super(Usuario.class);
    }

    public Usuario logar(String login, String senha) {
        Query q = em.createQuery("SELECT e FROM usuario e WHERE e.login = :login AND e.senha = :senha");
        q.setParameter("login", login);
        q.setParameter("senha", senha);
         Usuario u = null;
        try {

            u = (Usuario) q.getSingleResult();
            return u;

        } catch (Exception ex) {
            return null;
        }
    }
    
    public List<Usuario> buscarNome(String nome){
        Query q = em.createQuery("SELECT e FROM usuario e WHERE e.nome LIKE :nome").setParameter("nome", "%"+nome +"%");
        List<Usuario> usuarios = null;
        try {

            usuarios = (ArrayList) q.getSingleResult();
            return usuarios;

        } catch (Exception ex) {
            return null;
        }
    }
}
