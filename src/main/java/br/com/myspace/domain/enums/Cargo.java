package br.com.myspace.domain.enums;

import java.math.BigDecimal;

public enum Cargo {

    DEV {
        @Override
        public BigDecimal getPorcentagem(BigDecimal salario) {
            if (salario.compareTo(SALARIO_LIMITE) >= 1) {
                return new BigDecimal("0.1");
            }

            return new BigDecimal("0.2");
        }
    },
    TESTER {
        @Override
        public BigDecimal getPorcentagem(BigDecimal salario) {
            if (salario.compareTo(SALARIO_LIMITE) >= 1) {
                return new BigDecimal("0.15");
            }

            return new BigDecimal("0.2");
        }
    },
    DBA {
        @Override
        public BigDecimal getPorcentagem(BigDecimal salario) {
            if (salario.compareTo(SALARIO_LIMITE) >= 1) {
                return new BigDecimal("0.15");
            }

            return new BigDecimal("0.2");
        }
    };


    public abstract BigDecimal getPorcentagem(BigDecimal salario);
    private static final BigDecimal SALARIO_LIMITE = new BigDecimal("3000.0");
}

