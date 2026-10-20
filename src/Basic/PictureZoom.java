package Basic;

import java.util.Arrays;

class PictureZoom {
    public String[] PictureZoom(String[] picture, int k) {
        int index =0;
        String [] answer = new String[picture.length * k];

        for (int i = 0; i <picture.length  ; i++) {
            String str = "";
            for (int j = 0; j <picture[i].length() ; j++) {
                str+= String.valueOf(picture[i].charAt(j)).repeat(k);
            }

            for (int j = 0; j < k; j++) {

                answer[index++] = str;

            }

        }

        return answer;
    }

}