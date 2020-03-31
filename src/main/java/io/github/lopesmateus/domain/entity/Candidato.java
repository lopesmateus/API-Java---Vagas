package io.github.lopesmateus.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "candidato")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "vaga_id")
    private Vaga vaga;

    @Column (name = "nome")
    private String nome;

    @Column (name = "cpf")
    private String cpf;

    @Column (name = "cargo_atual")
    private String cargoAtual;

    @Column (name = "area_atual")
    private String areaAtual;

    @Column (name = "email")
    private String email;


    public Candidato() {

    }

    public Candidato(Integer id, String nome, String cpf, String cargoAtual, String areaAtual, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargoAtual = cargoAtual;
        this.areaAtual = areaAtual;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargoAtual() {
        return cargoAtual;
    }

    public void setCargoAtual(String cargoAtual) {
        this.cargoAtual = cargoAtual;
    }

    public String getAreaAtual() {
        return areaAtual;
    }

    public void setAreaAtual(String areaAtual) {
        this.areaAtual = areaAtual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "id=" + id +
                ", vaga=" + vaga +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cargoAtual='" + cargoAtual + '\'' +
                ", areaAtual='" + areaAtual + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
