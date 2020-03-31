package io.github.lopesmateus.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "vaga")
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "descicao_vaga")
    private String descricaoVaga;

    @Column(name = "locacao")
    private String locacaoVaga;

    @Column(name = "tipo_vaga")
    private String tipoVaga;

    @Column(name = "dt_vencimento_vaga")
    private String dtVencimentoVaga;

    @Column(name = "situacao_vaga")
    private String situacaoVaga;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricaoVaga() {
        return descricaoVaga;
    }

    public void setDescricaoVaga(String descricaoVaga) {
        this.descricaoVaga = descricaoVaga;
    }

    public String getLocacaoVaga() {
        return locacaoVaga;
    }

    public void setLocacaoVaga(String locacaoVaga) {
        this.locacaoVaga = locacaoVaga;
    }

    public String getTipoVaga() {
        return tipoVaga;
    }

    public void setTipoVaga(String tipoVaga) {
        this.tipoVaga = tipoVaga;
    }

    public String getDtVencimentoVaga() {
        return dtVencimentoVaga;
    }

    public void setDtVencimentoVaga(String dtVencimentoVaga) {
        this.dtVencimentoVaga = dtVencimentoVaga;
    }

    public String getSituacaoVaga() {
        return situacaoVaga;
    }

    public void setSituacaoVaga(String situacaoVaga) {
        this.situacaoVaga = situacaoVaga;
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "id=" + id +
                ", cargo='" + cargo + '\'' +
                ", descricaoVaga='" + descricaoVaga + '\'' +
                ", locacaoVaga='" + locacaoVaga + '\'' +
                ", tipoVaga='" + tipoVaga + '\'' +
                ", dtVencimentoVaga='" + dtVencimentoVaga + '\'' +
                ", situacaoVaga='" + situacaoVaga + '\'' +
                '}';
    }
}
