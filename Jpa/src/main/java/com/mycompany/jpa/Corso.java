package com.mycompany.jpa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tss
 */
@Entity
@Table(name = "t_corsi")

public class Corso implements Serializable{
    // @ = annotazione    //mapping= relazione tra java e tabelle mysql
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_corso")
    private Long id;

    @Column(name = "titolo_corso")
    private String titolo;

    @Column(name = "descrizione_corso")
    private String descrizione;

    @Column(name = "datainizio")
    private LocalDate datainizio;

    @Column(name = "durata_corso")
    private Integer duratacorso;

    @Column(name = "costo_corso",precision=2,scale=6)
    private BigDecimal costocorso;

    @Column(name = "datacreazione")
    private LocalDateTime datacreazione;

    /*
    getter and setter
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public LocalDate getDatainizio() {
        return datainizio;
    }

    public void setDatainizio(LocalDate datainizio) {
        this.datainizio = datainizio;
    }

    public Integer getDuratacorso() {
        return duratacorso;
    }

    public void setDuratacorso(Integer duratacorso) {
        this.duratacorso = duratacorso;
    }

    public BigDecimal getCostocorso() {
        return costocorso;
    }

    public void setCostocorso(BigDecimal costocorso) {
        this.costocorso = costocorso;
    }

    public LocalDateTime getDatacreazione() {
        return datacreazione;
    }

    public void setDatacreazione(LocalDateTime datacreazione) {
        this.datacreazione = datacreazione;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Corso other = (Corso) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Corso{" + "id=" + id + ", titolo=" + titolo + ", descrizione=" + descrizione + ", datainizio=" + datainizio + ", duratacorso=" + duratacorso + ", costocorso=" + costocorso + ", datacreazione=" + datacreazione + '}';
    }

}
