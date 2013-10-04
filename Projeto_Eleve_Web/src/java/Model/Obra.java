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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "obra")
@NamedQueries({
    @NamedQuery(name = "Obra.findAll", query = "SELECT o FROM Obra o")})
public class Obra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Cadastro_obras")
    private Integer idCadastroobras;
    @Basic(optional = false)
    @Column(name = "tipo_obra")
    private String tipoObra;
    @Basic(optional = false)
    @Column(name = "tamanho_metros_quadrados")
    private String tamanhoMetrosQuadrados;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "bairro")
    private String bairro;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;
    @Basic(optional = false)
    @Column(name = "beneficiado")
    private String beneficiado;
    @Column(name = "observacao")
    private String observacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idObraFk")
    private List<MestreObra> mestreObraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idObraFk")
    private List<Imagem> imagemList;

    public Obra() {
    }

    public Obra(Integer idCadastroobras) {
        this.idCadastroobras = idCadastroobras;
    }

    public Obra(Integer idCadastroobras, String tipoObra, String tamanhoMetrosQuadrados, String endereco, String bairro, String cidade, String cep, String beneficiado) {
        this.idCadastroobras = idCadastroobras;
        this.tipoObra = tipoObra;
        this.tamanhoMetrosQuadrados = tamanhoMetrosQuadrados;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.beneficiado = beneficiado;
    }

    public Integer getIdCadastroobras() {
        return idCadastroobras;
    }

    public void setIdCadastroobras(Integer idCadastroobras) {
        this.idCadastroobras = idCadastroobras;
    }

    public String getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    public String getTamanhoMetrosQuadrados() {
        return tamanhoMetrosQuadrados;
    }

    public void setTamanhoMetrosQuadrados(String tamanhoMetrosQuadrados) {
        this.tamanhoMetrosQuadrados = tamanhoMetrosQuadrados;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBeneficiado() {
        return beneficiado;
    }

    public void setBeneficiado(String beneficiado) {
        this.beneficiado = beneficiado;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<MestreObra> getMestreObraList() {
        return mestreObraList;
    }

    public void setMestreObraList(List<MestreObra> mestreObraList) {
        this.mestreObraList = mestreObraList;
    }

    public List<Imagem> getImagemList() {
        return imagemList;
    }

    public void setImagemList(List<Imagem> imagemList) {
        this.imagemList = imagemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCadastroobras != null ? idCadastroobras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Obra)) {
            return false;
        }
        Obra other = (Obra) object;
        if ((this.idCadastroobras == null && other.idCadastroobras != null) || (this.idCadastroobras != null && !this.idCadastroobras.equals(other.idCadastroobras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Obra[ idCadastroobras=" + idCadastroobras + " ]";
    }
    
}
