package Basic;

import java.util.Arrays;

class RemoveChar {
    public String RemoveChar(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder("apporoograpemmemprs");
        String answer = "";
        Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            sb.deleteCharAt(indices[i]);

        }
        answer+=sb.toString();
        return answer;
    }
}