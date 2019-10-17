/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;


import Clases.Tutor;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
 

public class TutorDao {
    private Session session;
    
    //Metodo que abre la sesion de Hibernite
    private void IniciarSesion(){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        session.getTransaction().begin();
    } 
    
    //Metodo que cierra la session de Hibernate
    private void CerrarSesion(){
        session.getTransaction().commit();
        session.close();
    } 
    
    //Metodo que guarda un objeto tutor
    public int Guardar(Tutor tutor){
        int id=0;
        IniciarSesion();
        id = (int)session.save(tutor);
        CerrarSesion();
        return id;
    }
    
    //Metodo que actualiza un objeto tutor
    public void Actualizar(Tutor tutor){
        IniciarSesion();
        session.update(tutor);
        CerrarSesion();
    }
    
    //Metodo que elimina un objeto tutor
    public void Eliminar(Tutor tutor){
        IniciarSesion();
        session.delete(tutor);
        CerrarSesion();
    }
    
    //Metodo para obtener un tutor por el id 
    public Tutor obtenerTutor(int idTutor){
        Tutor tutor = null;
        IniciarSesion();
        tutor = (Tutor) session.get(Tutor.class, idTutor);
        CerrarSesion();
        return tutor;
    }
    
    //Metodo que lista los tutores registrados
    public List<Tutor> ListaTutor(){
        List<Tutor> listaTutor = null;
        IniciarSesion();
        listaTutor = session.createQuery("From Tutor").list();
        CerrarSesion();
        return listaTutor;
    }
}
