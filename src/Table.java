public class Table {
    public static void main(String[] args){
        int[] table = new int[10];

        for(int i = 0; i < table.length; i++){
            table[i] = (int)(Math.random() * 100);
        }

        System.out.println("Array before sorting:");
        System.out.println(java.util.Arrays.toString(table));

        for(int i = 0; i < table.length - 1; i++) {
            for(j = 0; j < table.length - i  - 1; j++){
                if(table[i] > table[j + 1]){
                    int temp = table[j];
                    table[j] = table[j + 1]; 
                    table[j + 1] = temp; 
                }
            }
        }

        System.out.println("Array after sorting:");
        System.out.println(java.util.Arrays.toString(table));
    }
}
