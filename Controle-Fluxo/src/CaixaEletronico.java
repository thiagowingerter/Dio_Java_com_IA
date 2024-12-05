public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 35.0;

        String resultado = saldo >= valorSolicitado ? "Sacando, aguarde..." : "Sem saldo disponivel, cancelando..."; 
        System.out.println(resultado);

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
        }
        System.out.println("saldo restante: " + saldo);
    }
}
