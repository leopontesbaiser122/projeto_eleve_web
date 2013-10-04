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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "mestre_obra")
@NamedQueries({
    @NamedQuery(name = "MestreObra.findAll", query = "SELECT m FROM MestreObra m")})
public class MestreObra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idMestre_obras")
    private Integer idMestreobras;
    @Basic(optional = false)
    @Column(name = "mestre_obras")
    private String mestreObras;
    @Column(name = "cpf")
    private String cpf;
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
    @Column(name = "telefone_fixo")
    private String telefoneFixo;
    @Column(name = "telefone_celular")
    private String telefoneCelular;
    @JoinColumn(name = "uf_estado_fk", referencedColumnName = "uf_estado")
    @ManyToOne(optional = false)
    private EstadoUf ufEstadoFk;
    @JoinColumn(name = "id_obra_fk", referencedColumnName = "id_Cadastro_obras")
    @ManyToOne(optional = false)
    private Obra idObraFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMestreobras")
    private List<FuncionariosMo> funcionariosMoList;

    public MestreObra() {
    }

    public MestreObra(Integer idMestreobras) {
        this.idMestreobras = idMestreobras;
    }

    public MestreObra(Integer idMestreobras, String mestreObras, String endereco, String bairro, String cidade, String cep) {
        this.idMestreobras = idMestreobras;
        this.mestreObras = mestreObras;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public Integer getIdMestreobras() {
        return idMestreobras;
    }

    public void setIdMestreobras(Integer idMestreobras) {
        this.idMestreobras = idMestreobras;
    }

    public String getMestreObras() {
        return mestreObras;
    }

    public void setMestreObras(String mestreObras) {
        this.mestreObras = mestreObras;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public EstadoUf getUfEstadoFk() {
        return ufEstadoFk;
    }

    public void setUfEstadoFk(EstadoUf ufEstadoFk) {
        this.ufEstadoFk = ufEstadoFk;
    }

    public Obra getIdObraFk() {
        return idObraFk;
    }

    public void setIdObraFk(Obra idObraFk) {
        this.idObraFk = idObraFk;
    }

    public List<FuncionariosMo> getFuncionariosMoList() {
        return funcionariosMoList;
    }

    public void setFuncionariosMoList(List<FuncionariosMo> funcionariosMoList) {
        this.funcionariosMoList = funcionariosMoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMestreobras != null ? idMestreobras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MestreObra)) {
            return false;
        }
        MestreObra other = (MestreObra) object;
        if ((this.idMestreobras == null && other.idMestreobras != null) || (this.idMestreobras != null && !this.idMestreobras.equals(other.idMestreobras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.MestreObra[ idMestreobras=" + idMestreobras + " ]";
    }
    
}
