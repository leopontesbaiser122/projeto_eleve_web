/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "imagem")
@NamedQueries({
    @NamedQuery(name = "Imagem.findAll", query = "SELECT i FROM Imagem i")})
public class Imagem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idimagens")
    private Integer idimagens;
    @Basic(optional = false)
    @Column(name = "url_imagem")
    private String urlImagem;
    @Basic(optional = false)
    @Column(name = "nome_imagem")
    private String nomeImagem;
    @JoinColumn(name = "id_obra_fk", referencedColumnName = "id_Cadastro_obras")
    @ManyToOne(optional = false)
    private Obra idObraFk;

    public Imagem() {
    }

    public Imagem(Integer idimagens) {
        this.idimagens = idimagens;
    }

    public Imagem(Integer idimagens, String urlImagem, String nomeImagem) {
        this.idimagens = idimagens;
        this.urlImagem = urlImagem;
        this.nomeImagem = nomeImagem;
    }

    public Integer getIdimagens() {
        return idimagens;
    }

    public void setIdimagens(Integer idimagens) {
        this.idimagens = idimagens;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getNomeImagem() {
        return nomeImagem;
    }

    public void setNomeImagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }

    public Obra getIdObraFk() {
        return idObraFk;
    }

    public void setIdObraFk(Obra idObraFk) {
        this.idObraFk = idObraFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idimagens != null ? idimagens.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imagem)) {
            return false;
        }
        Imagem other = (Imagem) object;
        if ((this.idimagens == null && other.idimagens != null) || (this.idimagens != null && !this.idimagens.equals(other.idimagens))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Imagem[ idimagens=" + idimagens + " ]";
    }
    
}
