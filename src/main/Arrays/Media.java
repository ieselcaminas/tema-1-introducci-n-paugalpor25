package Arrays;

public class Media {
    public static void main(String[] args) {
        int[] UnArray = {1 , 2, 75, 9, 10};

        System.out.println("La media es " + Media(UnArray));
    }
    public static float Media(int [] UnArray){
        int suma = 0;
        for (int i = 0; i < UnArray.length; i++) {
            suma += UnArray[i];
        }
        float Media = suma / UnArray.length;

        return Media;
    }
}
