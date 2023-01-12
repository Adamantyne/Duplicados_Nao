public class App {
    public static void main(String[] args) throws Exception {
        String[] arr1 = { "1", "1", "2", "2", "3", "4", "8", "9", "10" };
        String[] arr2 = { "1", "3", "5", "5", "6", "8", "8", "9" };

        CheckDuplicates checkDuplicates = new CheckDuplicates(arr1, arr2);
        System.out.println(checkDuplicates.check());
    }
}
