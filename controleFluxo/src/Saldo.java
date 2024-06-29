public class Saldo {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        if(valorSolicitado<saldo){
            saldo -= valorSolicitado;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);
    }
}
