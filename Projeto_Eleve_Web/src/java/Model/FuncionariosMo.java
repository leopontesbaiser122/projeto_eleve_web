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
@Table(name = "funcionarios_mo")
@NamedQueries({
    @NamedQuery(name = "FuncionariosMo.findAll", query = "SELECT f FROM FuncionariosMo f")})
public class FuncionariosMo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idfuncionarios")
    private Integer idfuncionarios;
    @Column(name = "nome_funcionario")
    private String nomeFuncionario;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "telefone")
    private String telefone;
    @JoinColumn(name = "idMestre_obras", referencedColumnName = "idMestre_obras")
    @ManyToOne(optional = false)
    private MestreObra idMestreobras;

    public FuncionariosMo() {
    }

    public FuncionariosMo(Integer idfuncionarios) {
        this.idfuncionarios = idfuncionarios;
    }

    public Integer getIdfuncionarios() {
        return idfuncionarios;
    }

    public void setIdfuncionarios(Integer idfuncionarios) {
        this.idfuncionarios = idfuncionarios;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public MestreObra getIdMestreobras() {
        return idMestreobras;
    }

    public void setIdMestreobras(MestreObra idMestreobras) {
        this.idMestreobras = idMestreobras;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfuncionarios != null ? idfuncionarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FuncionariosMo)) {
            return false;
        }
        FuncionariosMo other = (FuncionariosMo) object;
        if ((this.idfuncionarios == null && other.idfuncionarios != null) || (this.idfuncionarios != null && !this.idfuncionarios.equals(other.idfuncionarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.FuncionariosMo[ idfuncionarios=" + idfuncionarios + " ]";
    }
    
}
