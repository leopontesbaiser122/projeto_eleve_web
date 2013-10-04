/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "arquivo")
@NamedQueries({
    @NamedQuery(name = "Arquivo.findAll", query = "SELECT a FROM Arquivo a")})
public class Arquivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idarquivo")
    private Integer idarquivo;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "url_documento")
    private String urlDocumento;
    @Basic(optional = false)
    @Column(name = "nome_arquivo")
    private String nomeArquivo;
    @Column(name = "tipo")
    private String tipo;

    public Arquivo() {
    }

    public Arquivo(Integer idarquivo) {
        this.idarquivo = idarquivo;
    }

    public Arquivo(Integer idarquivo, String descricao, String urlDocumento, String nomeArquivo) {
        this.idarquivo = idarquivo;
        this.descricao = descricao;
        this.urlDocumento = urlDocumento;
        this.nomeArquivo = nomeArquivo;
    }

    public Integer getIdarquivo() {
        return idarquivo;
    }

    public void setIdarquivo(Integer idarquivo) {
        this.idarquivo = idarquivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrlDocumento() {
        return urlDocumento;
    }

    public void setUrlDocumento(String urlDocumento) {
        this.urlDocumento = urlDocumento;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idarquivo != null ? idarquivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arquivo)) {
            return false;
        }
        Arquivo other = (Arquivo) object;
        if ((this.idarquivo == null && other.idarquivo != null) || (this.idarquivo != null && !this.idarquivo.equals(other.idarquivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Arquivo[ idarquivo=" + idarquivo + " ]";
    }
    
}
