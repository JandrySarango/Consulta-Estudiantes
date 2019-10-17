/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Clases.Estudiante;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class EstudianteDao {
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
    
    //Metodo que guarda un objeto estudiante
    public int Guardar(Estudiante estudiante){
        int id=0;
        IniciarSesion();
        id = (int)session.save(estudiante);
        CerrarSesion();
        return id;
    }
    
    //Metodo que actualiza un objeto estudiante
    public void Actualizar(Estudiante estudiante){
        IniciarSesion();
        session.update(estudiante);
        CerrarSesion();
    }
    
    //Metodo que elimina un objeto estudiante
    public void Eliminar(Estudiante estudiante){
        IniciarSesion();
        session.delete(estudiante);
        CerrarSesion();
    }
    
    //Metodo para obtener un estudiante por el id 
    public Estudiante obtenerEstudiante(int idEstudiante){
        Estudiante estudiante = null;
        IniciarSesion();
        estudiante = (Estudiante) session.get(Estudiante.class, idEstudiante);
        CerrarSesion();
        return estudiante;
    }
    
    //Metodo que lista los estudiantes registrados
    public List<Estudiante> ListaEstudiante(){
        List<Estudiante> listaEstudiante = null;
        IniciarSesion();
        listaEstudiante = session.createQuery("From Estudiante").list();
        CerrarSesion();
        return listaEstudiante;
    }
}
