public class PrimitivosFloat {

    static float varFlotante;

    public static void main(String[] args) {

        float realFloat = 0.00000000015f; //1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a  = " + Float.BYTES);
        System.out.println("float corresponde en bites a  = " + Float.SIZE);
        System.out.println("valor máximo para flaot = " + Float.MAX_VALUE);
        System.out.println("valor mínimo para flaot = " + Float.MIN_VALUE);
        System.out.println("\n");

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a  = " + Double.BYTES);
        System.out.println("double corresponde en bites a  = " + Double.SIZE);
        System.out.println("valor máximo para double = " + Double.MAX_VALUE);
        System.out.println("valor mínimo para Double = " + Double.MIN_VALUE);
        System.out.println("\n");


        System.out.println("varFlotante = " + varFlotante);

    }
}
