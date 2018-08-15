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

/**
 *
 * @author Alonso
 */
public class CompraRepositorio {
      public static void createCompra(Compra compra){
        Session session=null;
        try{
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
//            usuario.setIdpersona((ultimoId()+1));
            session.save(compra);
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
    public static List<Compra> readCompra(){
          Session session = null;
        try {
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
            Query query=session.createQuery("from Compra");
            List<Compra> list=query.list();
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            session.close();
        }
        return null;
    }

  
    
    public static Usuario readCompra(String idProd){
           Session session = null;
        try {
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
            Query query=session.createQuery("From Compra where idProd =:idProdP");
            query.setParameter("idProdP", idProd);
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
    
    
       public static void updateCompra(Compra compra){
        Session session=null;
        try{
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
            session.update(compra);
            session.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            session.close();
        }
        
    }
       
         public static  void deleteCompra(Compra compra){
        Session session=null;
        try{
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
            session.delete(compra);
            session.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            session.close();
        }
        
    }
}
