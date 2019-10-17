package Clases;
// Generated 23/06/2019 11:57:19 AM by Hibernate Tools 4.3.1



/**
 * Estudiante generated by hbm2java
 */
public class Estudiante  implements java.io.Serializable {

     //atributos de la clase
     private int codigo;
     private String nombre;
     private String direccion;
     private String email;
     private String telefono;
     private String estado;
     private String codigoTutor;

     //constructor vacio
    public Estudiante() {
    }



    public Estudiante(int codigo) {
        this.codigo = codigo;
    }
    
    //constructor con los atributos
    public Estudiante(int codigo, String nombre, String direccion, String email, String telefono, String estado, String codigoTutor) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.direccion = direccion;
       this.email = email;
       this.telefono = telefono;
       this.estado = estado;
       this.codigoTutor = codigoTutor;
    }
   
    //metodos set y get
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCodigoTutor() {
        return this.codigoTutor;
    }
    
    public void setCodigoTutor(String codigoTutor) {
        this.codigoTutor = codigoTutor;
    }




}


