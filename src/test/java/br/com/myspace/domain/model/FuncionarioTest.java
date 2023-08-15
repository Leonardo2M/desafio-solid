package br.com.myspace.domain.model;

import br.com.myspace.domain.enums.Cargo;
import jdk.jfr.Name;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class FuncionarioTest {

    private Funcionario funcionarioComMaisDe3000;
    private Funcionario funcionarioComMenosDe3000;

    @Before
    public void instanciarFuncionario() {
        this.funcionarioComMaisDe3000 = new Funcionario("funcionarioComMaisDe3000", null, new BigDecimal("4000.0"));
        this.funcionarioComMenosDe3000 = new Funcionario("funcionarioComMaisDe3000",  null, new BigDecimal("2000.0"));
    }

    @Test
    @Name("Deveria conceder um bonus de 10% para desenvolvedores com salario acima de 3000.0")
    public void testDevComSalarioAcimaDe3000() {
        funcionarioComMaisDe3000.setCargo(Cargo.DEV);

        Assert.assertEquals(new BigDecimal("4400.00"), funcionarioComMaisDe3000.getSalario());
    }

    @Test
    @Name("Deveria conceder um bonus de 20% para desenvolvedores com salario acima de 3000.0")
    public void testDevComSalarioAbaixoDe3000() {
        funcionarioComMenosDe3000.setCargo(Cargo.DEV);

        Assert.assertEquals(new BigDecimal("2400.00"), funcionarioComMenosDe3000.getSalario());
    }

    @Test
    @Name("Deveria conceder um bonus de 15% para desenvolvedores com salario acima de 3000.0")
    public void testDbaComSalarioAcimaDe3000() {
        funcionarioComMaisDe3000.setCargo(Cargo.DBA);

        Assert.assertEquals(new BigDecimal("4600.00"), funcionarioComMaisDe3000.getSalario());
    }

    @Test
    @Name("Deveria conceder um bonus de 20% para desenvolvedores com salario acima de 3000.0")
    public void testDbaComSalarioAbaixoDe3000() {
        funcionarioComMenosDe3000.setCargo(Cargo.DBA);

        Assert.assertEquals(new BigDecimal("2400.00"), funcionarioComMenosDe3000.getSalario());
    }

    @Test
    @Name("Deveria conceder um bonus de 15% para desenvolvedores com salario acima de 3000.0")
    public void testTesterComSalarioAcimaDe3000() {
        funcionarioComMaisDe3000.setCargo(Cargo.TESTER);

        Assert.assertEquals(new BigDecimal("4600.00"), funcionarioComMaisDe3000.getSalario());
    }

    @Test
    @Name("Deveria conceder um bonus de 20% para desenvolvedores com salario acima de 3000.0")
    public void testTesterComSalarioAbaixoDe3000() {
        funcionarioComMenosDe3000.setCargo(Cargo.TESTER);

        Assert.assertEquals(new BigDecimal("2400.00"), funcionarioComMenosDe3000.getSalario());
    }

}