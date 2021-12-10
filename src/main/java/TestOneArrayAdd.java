public class TestOneArrayAdd {
    public static int[] add(int[] array, int value) { // função
        int[] tempArray = new int[array.length + 1]; // crie um tempArray maior que array
        for (int i = 0; i < array.length; i++) { // copie o valor da matriz para tempArray
            tempArray[i] = array[i];
        }
        tempArray[array.length] = value; // insira o valor para o último indice;
        return tempArray;
    }


    public static void main(String[] args) {
        int[] array = {90, 70, 50, 80, 60, 85};
        array = add(array, 75); // anexar 75 à matriz

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

    }
}