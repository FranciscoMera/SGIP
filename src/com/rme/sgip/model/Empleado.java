package com.rme.sgip.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author CesarHL
 */
@Entity
@Table(name = "Empleado")
@NamedQueries(value = {
    @NamedQuery(name = "UnidadAcademica.findAll", query = "SELECT t FROM UnidadAcademica t")
    , @NamedQuery(name = ".findById", query = "SELECT t FROM  t WHERE t.id = :id")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Size(min = 3, max = 50)
    @Column(name = "NAME", nullable = false)
    private String nombre;

    private String ap;
    private String am;
    private String mail;
    private String edad;

    public Empleado() {

    }

    public Empleado(Long id, String nombre, String ap, String am, String mail, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.mail = mail;
        this.edad = edad;
    }

    public Empleado(String nombre, String ap, String am, String mail, String edad) {
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.mail = mail;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", ap=" + ap + ", am=" + am + ", mail=" + mail + ", edad=" + edad + '}';
    }

}
