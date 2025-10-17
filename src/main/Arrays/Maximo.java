package Arrays;

public class Maximo {
    public static void main(String[] args) {
        int[] UnArray = {2 , 7 , 20 , 6 , 12 , 29 , 3 , 23 , 49 , 1};



        System.out.println("El máximo de los números es: " + CualEsMaximo(UnArray));
    }
    public static int CualEsMaximo(int[] UnArray){
        int Maximo = UnArray[0];
        for (int i = 0; i < UnArray.length; i++) {
            if (Maximo < UnArray[i]){
                Maximo = UnArray[i];
            }

        }
        return Maximo;
    }
}
