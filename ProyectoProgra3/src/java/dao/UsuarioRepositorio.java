/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

/**
 *
 * @author Alonso
 */
public class UsuarioRepositorio {
      public static void createPersona(Usuario usuario){
        Session session=null;
        try{
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
//            usuario.setIdpersona((ultimoId()+1));
            session.save(usuario);
            session.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            session.close();
        }
        
    }
    
//    public static int ultimoId(){
//        Session session = null;
//        try {
//            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
//            session=sessionFactory.openSession();
//            session.beginTransaction();
//            Persona ultimo=(Persona)  session.createCriteria(Persona.class)
//                    .addOrder(Order.desc("idpersona")).setMaxResults(1).uniqueResult();
//            session.getTransaction().commit();
//            return ultimo.getIdpersona();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally{
//            session.close();
//        }
//        return -1;
//    }
    
    /**
     *
     * @return
     */
    public static List<Usuario> readPersonas(){
          Session session = null;
        try {
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
            Query query=session.createQuery("from Usuario");
            List<Usuario> list=query.list();
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            session.close();
        }
        return null;
    }

  
    
    public static Usuario readPersona(String correo){
           Session session = null;
        try {
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
            Query query=session.createQuery("From Usuario where correo =:correoP");
            query.setParameter("correoP", correo);
            List<Usuario> list=query.list();
            session.getTransaction().commit();
            if (list.size() > 0) {
                return list.get(0);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            session.close();
        }
        return null;
    }
    
    
       public static void updatePersona(Usuario usuario){
        Session session=null;
        try{
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
            session.update(usuario);
            session.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            session.close();
        }
        
    }
       
         public static  void deletePersona(Usuario usuario){
        Session session=null;
        try{
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
            session.delete(usuario);
            session.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            session.close();
        }
        
    }
         
}
