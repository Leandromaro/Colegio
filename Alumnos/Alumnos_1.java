/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mil.colegio.Alumnos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author leandromaro
 */
@Entity
@Table(name = "Alumnos", catalog = "111mil", schema = "")
@NamedQueries({
    @NamedQuery(name = "Alumnos_1.findAll", query = "SELECT a FROM Alumnos_1 a"),
    @NamedQuery(name = "Alumnos_1.findByIdAlumnos", query = "SELECT a FROM Alumnos_1 a WHERE a.idAlumnos = :idAlumnos"),
    @NamedQuery(name = "Alumnos_1.findByNombre", query = "SELECT a FROM Alumnos_1 a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Alumnos_1.findByApellido", query = "SELECT a FROM Alumnos_1 a WHERE a.apellido = :apellido"),
    @NamedQuery(name = "Alumnos_1.findByDni", query = "SELECT a FROM Alumnos_1 a WHERE a.dni = :dni")})
public class Alumnos_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAlumnos")
    private Integer idAlumnos;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "DNI")
    private Integer dni;

    public Alumnos_1() {
    }

    public Alumnos_1(Integer idAlumnos) {
        this.idAlumnos = idAlumnos;
    }

    public Integer getIdAlumnos() {
        return idAlumnos;
    }

    public void setIdAlumnos(Integer idAlumnos) {
        Integer oldIdAlumnos = this.idAlumnos;
        this.idAlumnos = idAlumnos;
        changeSupport.firePropertyChange("idAlumnos", oldIdAlumnos, idAlumnos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        String oldApellido = this.apellido;
        this.apellido = apellido;
        changeSupport.firePropertyChange("apellido", oldApellido, apellido);
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        Integer oldDni = this.dni;
        this.dni = dni;
        changeSupport.firePropertyChange("dni", oldDni, dni);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumnos != null ? idAlumnos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumnos_1)) {
            return false;
        }
        Alumnos_1 other = (Alumnos_1) object;
        if ((this.idAlumnos == null && other.idAlumnos != null) || (this.idAlumnos != null && !this.idAlumnos.equals(other.idAlumnos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mil.colegio.Alumnos_1[ idAlumnos=" + idAlumnos + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
