public class App {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);
        
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println("Concatenacao: "+concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println("Concatenacao: "+concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println("Concatenacao: "+concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println("Concatenacao: "+concatenacao);
    }
}
