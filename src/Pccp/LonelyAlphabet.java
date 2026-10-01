package Pccp;

class LonelyAlphabet {
    public String LonelyAlphabet(String input_string) {
        int [] group = new int[26];
        for (int i = 0; i <input_string.length() ; i++) {
            char current = input_string.charAt(i);
            if (i==0 ||current!=input_string.charAt(i-1) ) {
                int index = current - 'a';
                group[index]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < 26 ; index++) {
            char ch = (char) (index + 'a');
            if (group[index] >= 2) {
                sb.append(ch);
            }
        }
        if (sb.length() == 0) {
            return "N";
        }

        return sb.toString();

    }
}
