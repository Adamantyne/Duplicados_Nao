import java.util.ArrayList;

public class CheckDuplicates {
    private String[] arr1;
    private String[] arr2;

    CheckDuplicates(String[] arr1, String[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public String check() {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < this.arr1.length; i++) {
            for (int j = 0; j < this.arr2.length; j++) {
                if (this.arr1[i].equals(this.arr2[j]) && !result.contains(this.arr1[i])) {
                    result.add(this.arr1[i]);
                }
            }
        }
        return result.toString();
    }
}
