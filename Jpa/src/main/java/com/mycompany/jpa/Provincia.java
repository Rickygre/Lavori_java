
package com.mycompany.jpa;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tss
 */



@Entity
@Table(name = "t_province")
public class Provincia implements Serializable {
    
    @Id
    
    @Column(length = 4)
    private String pv;

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.pv);
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
        final Provincia other = (Provincia) obj;
        return Objects.equals(this.pv, other.pv);
    }

    @Override
    public String toString() {
        return "Provincia{" + "pv=" + pv + '}';
    }
    
    
    
    
    
    
}
