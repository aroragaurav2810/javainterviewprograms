package programs_restested;

import java.util.Arrays;

public class CheckRotationOfString_ReTest {

    // check if "cdab" is rotation of "abcd"

    static void main() {
        String str = "abcd";
        char arr[] = str.toCharArray();
        String rotated_string = "cdab";
        char rotated_array[] = rotated_string.toCharArray();
        boolean rotated_string_found = false;
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = temp;
            if (Arrays.toString(arr).equals(Arrays.toString(rotated_array))) {
                rotated_string_found = true;
                break;
            }

        }
        if (rotated_string_found) {
            System.out.println("rotated string found");
        } else {
            System.out.println("rotated string not found");
        }
    }
}
