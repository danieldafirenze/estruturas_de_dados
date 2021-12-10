public class TestOneArrayRemove {
    public static int[] remove(int[] array, int index) {
        int[] tempArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) // copie os dados anteriores a i = index para tempArray
                tempArray[i] = array[i];
            if (i > index) // copie a matriz após i = index para o final de tempArray
                tempArray[i-1] = array [i];
        }
        return tempArray;
    }

    public static void main(String[] args) {
        int[] array = {90, 70, 50, 80, 60, 85};
        array = remove(array,2); // remove o valor da matriz no índice = 2
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
