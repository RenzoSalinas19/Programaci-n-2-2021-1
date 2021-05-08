package tarea.progra.tarea.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "t_sunat")

public class Product {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private Integer ruc;
    private String razon;
    private String descripcion;
    private String tipo;
    private double monto;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRuc() {
        return this.ruc;
    }

    public void setRuc(Integer ruc) {
        this.ruc = ruc;
    }

    public String getRazon() {
        return this.razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return this.monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }



}
