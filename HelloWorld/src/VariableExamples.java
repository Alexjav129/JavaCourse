public class VariableExamples {
    public static void main(String[] args) {

        String saludar = "Hi there!";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        // Primitivos
        int numero = 10;

        boolean valor = true;
        int numero2 = 5;
        if (valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);
        var numero3 = 15;
    }
}
