/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author bachi_000
 */
@Entity
public class Etudiant extends Personne implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

        private int numEtu;

    /**
     * Get the value of numEtu
     *
     * @return the value of numEtu
     */
    public int getNumEtu() {
        return numEtu;
    }

    /**
     * Set the value of numEtu
     *
     * @param numEtu new value of numEtu
     */
    public void setNumEtu(int numEtu) {
        this.numEtu = numEtu;
    }

        private String specialite;

    /**
     * Get the value of specialite
     *
     * @return the value of specialite
     */
    public String getSpecialite() {
        return specialite;
    }

    /**
     * Set the value of specialite
     *
     * @param specialite new value of specialite
     */
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    private String niveau;

    /**
     * Get the value of niveau
     *
     * @return the value of niveau
     */
    public String getNiveau() {
        return niveau;
    }

    /**
     * Set the value of niveau
     *
     * @param niveau new value of niveau
     */
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.Etudiant[ id=" + id + " ]";
    }
    
}
