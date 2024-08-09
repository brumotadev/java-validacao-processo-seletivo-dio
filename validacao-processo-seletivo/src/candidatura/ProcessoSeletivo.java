package candidatura;

import java.util.concurrent.ThreadLocalRandom;

/*
 *  Em um processo seletivo existe o valor base salarial de R$ 2.000,00 e o salario pretendido pelo candidato.
 *   - Se o valor salario base for maior que valor salario pretendido, imprimir: LIGAR PARA O CANDIDATO
 *   - Se não, se o valor salario base for igual ao valor salario pretendido, imprimir: LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA
 *   - Se não, imprimir: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS
 * 
 *  Solicitado que no sistema seja selecionado apenas no máximo 5 candidatos para entrevista onde o salário pretendido seja menor ou igual ao salário base
 */

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String [] candidatos = { "BRUNO", "JESSICA", "ROSANGELA", "IRENE", "MARIA", "BRUNA", "ANTONIO", "ALBERT", "DEJAIR", "JOÃO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        // seleciona 5 candidatos. Mas so seleciona se tiver pessoas na lista.
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    } 
}
