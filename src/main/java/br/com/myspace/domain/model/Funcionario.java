package br.com.myspace.domain.model;

import br.com.myspace.domain.enums.Cargo;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Funcionario {

    private String nome;
    private Cargo cargo;
    private BigDecimal salario;

    public Funcionario(String nome, Cargo cargo, BigDecimal salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return this.salario.add(concenderBonus()).setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal concenderBonus() {
        return this.salario.multiply(cargo.getPorcentagem(this.salario));
    }

}
