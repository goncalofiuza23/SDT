public class Table {
    public static void main(String[] args){
        int[] table = new int[10];

        for(int i = 0; i < table.length; i++){
            table[i] = (int)(Math.random() * 100);
        }
    }
}
