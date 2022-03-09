package com.mycompany.jpa;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tss
 */
@Entity
@Table(name = "t_iscrizioni")
public class Iscrizione implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_iscrizione")
    private Long id;
    @Column(name = "dataiscrizione")
    private LocalDateTime dataiscrizione;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_anagrafica")   //aggancio tabella anagrafica alla tabella iscrizioni
    private Anagrafica anagrafica;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_corso") //aggancio tabella corso alla tabella iscrizioni
    private Corso corso;

    /*
    getter and setter
     */
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataiscrizione() {
        return dataiscrizione;
    }

    public void setDataiscrizione(LocalDateTime dataiscrizione) {
        this.dataiscrizione = dataiscrizione;
    }

    public Anagrafica getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }

    public Corso getCorso() {
        return corso;
    }

    public void setCorso(Corso corso) {
        this.corso = corso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Iscrizione other = (Iscrizione) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Iscrizione{" + "id=" + id + ", dataiscrizione=" + dataiscrizione + ", anagrafica=" + anagrafica + ", corso=" + corso + '}';
    }

}
