package candidatura;

/*
 *  Em um processo seletivo existe o valor base salarial de R$ 2.000,00 e o salario pretendido pelo candidato.
 *   - Se o valor salario base for maior que valor salario pretendido, imprimir: LIGAR PARA O CANDIDATO
 *   - Se não, se o valor salario base for igual ao valor salario pretendido, imprimir: LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA
 *   - Se não, imprimir: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS
 */

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
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
