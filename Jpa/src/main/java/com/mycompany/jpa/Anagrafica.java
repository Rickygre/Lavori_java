
package com.mycompany.jpa;

import java.io.Serializable;
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
@Table(name= "t_anagrafiche")
public class Anagrafica implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_anagrafica")
    private Long id;
    private String cognome;
    private String nome;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "provincia") //aggancio tabella provincia alla tabella anagrafica
    private Provincia pv;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Anagrafica other = (Anagrafica) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Anagrafica{" + "id=" + id + ", cognome=" + cognome + ", nome=" + nome + ", pv=" + pv + '}';
    }


    
    
    
    
    
    
    
    
    
    
}
