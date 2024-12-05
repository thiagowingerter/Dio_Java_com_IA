public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M" ;

        switch (plano) {
            case "T": {
                System.out.println("5gb Youtube");
            }
            case "M": {
                System.out.println("whats gratis");
            }
            case "B":{
                System.out.println("100 minutos de ligacao");
                break;
            }
            default :{
                System.out.println("Plano nao encontrado");
            }
        }
    }
}
