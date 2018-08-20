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
public class ProductoRepositorio {
      public static void createProducto(Producto producto){
        Session session=null;
        try{
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
            session.save(producto);
            session.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            session.close();
        }
        
    }
    
      
        public static List<Producto> readProducto(){
          Session session = null;
        try {
            SessionFactory sessionFactory= NewHibernateUtil.getSessionFactory();
            session=sessionFactory.openSession();
            session.beginTransaction();
            Query query=session.createQuery("from Producto");
            List<Producto> list=query.list();
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            session.close();
        }
        return null;
    }

  
    
  
    
   
}
