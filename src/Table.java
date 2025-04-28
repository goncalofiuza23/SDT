public class Table {
    public static void main(String[] args){
        int[] table = new int[10];

        for(int i = 0; i < table.length; i++){
            table[i] = (int)(Math.random() * 100);
        }

        System.out.println("Array before sorting:");
        System.out.println(java.util.Arrays.toString(table));

        java.util.Arrays.sort(table);

        System.out.println("Array after sorting:");
        System.out.println(java.util.Arrays.toString(table));
    }
}
