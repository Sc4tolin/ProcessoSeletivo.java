import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
// Seleciona candiatos
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA","JULIA","MIRELA","DANIELA"};

       // System.out.println("Processo Seletivo");
        //imprimirSelecionados();

        for (String candidato: candidatos){
            entrandoEmContato(candidato);


        }




        

    }

    static void entrandoEmContato (String candidato){

        int tentativas = 1 ;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){

                tentativas++;


            } else 
            System.out.println("CONTATO REALIZADO COM SUCESSO ");

            //elas precisarão sofrer alterações , se não ficará em um loop infitido 
        } while (continuarTentando && tentativas<3);

        if (atendeu){
            System.out.println("Consegumios contato com  "+ candidato + " Na "+ tentativas + " Tentativas ");
        } else 
        System.out.println("Não consegumios contato com  "+ candidato + ", Numero maximo de tentativas  "+ tentativas + " Tentativas");
        
    }
    static boolean atender(){
        // metodo auxiliar 
        return new Random().nextInt(3)==1;

    }


    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA","JULIA","MIRELA","DANIELA"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento" );

        for  (int indice =0; indice < candidatos.length; indice++){
            System.out.println("O candidato de numero  " + (indice+1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada do for ");

       
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA","JULIA","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length ) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou esse valor de salario " + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("o candidato " + candidato + " foi selecionado para a vaga ");
                candidatosSelecionados++;

            }
            candidatoAtual++;


            
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }

    // Analisa candidatos

    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
        System.out.println("LIGAR PARA O CANDIDATO");


   
    } else if (salarioBase == salarioPretendido)
    System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
    

    else {
        System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
    }


}
    
}
