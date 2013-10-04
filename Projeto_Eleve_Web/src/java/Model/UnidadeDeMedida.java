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
@Table(name = "unidade_de_medida")
@NamedQueries({
    @NamedQuery(name = "UnidadeDeMedida.findAll", query = "SELECT u FROM UnidadeDeMedida u")})
public class UnidadeDeMedida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idunidade_de_medida")
    private String idunidadeDeMedida;
    @Basic(optional = false)
    @Column(name = "nome_unidade_medida")
    private String nomeUnidadeMedida;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idunidadeDeMedidaFk")
    private List<Produto> produtoList;

    public UnidadeDeMedida() {
    }

    public UnidadeDeMedida(String idunidadeDeMedida) {
        this.idunidadeDeMedida = idunidadeDeMedida;
    }

    public UnidadeDeMedida(String idunidadeDeMedida, String nomeUnidadeMedida) {
        this.idunidadeDeMedida = idunidadeDeMedida;
        this.nomeUnidadeMedida = nomeUnidadeMedida;
    }

    public String getIdunidadeDeMedida() {
        return idunidadeDeMedida;
    }

    public void setIdunidadeDeMedida(String idunidadeDeMedida) {
        this.idunidadeDeMedida = idunidadeDeMedida;
    }

    public String getNomeUnidadeMedida() {
        return nomeUnidadeMedida;
    }

    public void setNomeUnidadeMedida(String nomeUnidadeMedida) {
        this.nomeUnidadeMedida = nomeUnidadeMedida;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunidadeDeMedida != null ? idunidadeDeMedida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadeDeMedida)) {
            return false;
        }
        UnidadeDeMedida other = (UnidadeDeMedida) object;
        if ((this.idunidadeDeMedida == null && other.idunidadeDeMedida != null) || (this.idunidadeDeMedida != null && !this.idunidadeDeMedida.equals(other.idunidadeDeMedida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.UnidadeDeMedida[ idunidadeDeMedida=" + idunidadeDeMedida + " ]";
    }
    
}
