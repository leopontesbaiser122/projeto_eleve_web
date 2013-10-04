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
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")})
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProduto")
    private Integer idProduto;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "estoque_minimo")
    private int estoqueMinimo;
    @Basic(optional = false)
    @Column(name = "qtde_estoque")
    private int qtdeEstoque;
    @Basic(optional = false)
    @Column(name = "preco_custo")
    private double precoCusto;
    @Basic(optional = false)
    @Column(name = "preco_venda")
    private double precoVenda;
    @JoinColumn(name = "idcategoria_fk", referencedColumnName = "idcategoria")
    @ManyToOne(optional = false)
    private Categoria idcategoriaFk;
    @JoinColumn(name = "idmarca_fk", referencedColumnName = "idmarca")
    @ManyToOne(optional = false)
    private Marca idmarcaFk;
    @JoinColumn(name = "idunidade_de_medida_fk", referencedColumnName = "idunidade_de_medida")
    @ManyToOne(optional = false)
    private UnidadeDeMedida idunidadeDeMedidaFk;
    @JoinColumn(name = "idfornecedor_fk", referencedColumnName = "idfornecedor")
    @ManyToOne(optional = false)
    private Fornecedor idfornecedorFk;

    public Produto() {
    }

    public Produto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Produto(Integer idProduto, String descricao, int estoqueMinimo, int qtdeEstoque, double precoCusto, double precoVenda) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.estoqueMinimo = estoqueMinimo;
        this.qtdeEstoque = qtdeEstoque;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Categoria getIdcategoriaFk() {
        return idcategoriaFk;
    }

    public void setIdcategoriaFk(Categoria idcategoriaFk) {
        this.idcategoriaFk = idcategoriaFk;
    }

    public Marca getIdmarcaFk() {
        return idmarcaFk;
    }

    public void setIdmarcaFk(Marca idmarcaFk) {
        this.idmarcaFk = idmarcaFk;
    }

    public UnidadeDeMedida getIdunidadeDeMedidaFk() {
        return idunidadeDeMedidaFk;
    }

    public void setIdunidadeDeMedidaFk(UnidadeDeMedida idunidadeDeMedidaFk) {
        this.idunidadeDeMedidaFk = idunidadeDeMedidaFk;
    }

    public Fornecedor getIdfornecedorFk() {
        return idfornecedorFk;
    }

    public void setIdfornecedorFk(Fornecedor idfornecedorFk) {
        this.idfornecedorFk = idfornecedorFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduto != null ? idProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idProduto == null && other.idProduto != null) || (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Produto[ idProduto=" + idProduto + " ]";
    }
    
}
