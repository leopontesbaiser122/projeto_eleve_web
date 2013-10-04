/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "estado_uf")
@NamedQueries({
    @NamedQuery(name = "EstadoUf.findAll", query = "SELECT e FROM EstadoUf e")})
public class EstadoUf implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "uf_estado")
    private String ufEstado;
    @Column(name = "nome_estado")
    private String nomeEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ufEstadoFk")
    private List<Fornecedor> fornecedorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ufEstadoFk")
    private List<MestreObra> mestreObraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ufEstadoFk")
    private List<Usuario> usuarioList;

    public EstadoUf() {
    }

    public EstadoUf(String ufEstado) {
        this.ufEstado = ufEstado;
    }

    public String getUfEstado() {
        return ufEstado;
    }

    public void setUfEstado(String ufEstado) {
        this.ufEstado = ufEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public List<Fornecedor> getFornecedorList() {
        return fornecedorList;
    }

    public void setFornecedorList(List<Fornecedor> fornecedorList) {
        this.fornecedorList = fornecedorList;
    }

    public List<MestreObra> getMestreObraList() {
        return mestreObraList;
    }

    public void setMestreObraList(List<MestreObra> mestreObraList) {
        this.mestreObraList = mestreObraList;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ufEstado != null ? ufEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoUf)) {
            return false;
        }
        EstadoUf other = (EstadoUf) object;
        if ((this.ufEstado == null && other.ufEstado != null) || (this.ufEstado != null && !this.ufEstado.equals(other.ufEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.EstadoUf[ ufEstado=" + ufEstado + " ]";
    }
    
}
