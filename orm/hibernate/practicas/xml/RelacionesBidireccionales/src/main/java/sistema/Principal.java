/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import beans.Rol;
import beans.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateHook;
import util.HibernateUtil;

/**
 *
 * @author Chema
 */
public class Principal {

    SessionFactory sessionFactory;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal p = new Principal();
        p.inicializarHibernate();
    }
    
    private void inicializarHibernate() {
        Runtime.getRuntime().addShutdownHook(new HibernateHook());
        sessionFactory = HibernateUtil.getSessionFactory();
    }
}
