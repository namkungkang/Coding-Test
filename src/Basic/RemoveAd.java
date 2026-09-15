package Basic;


import java.util.ArrayList;
import java.util.Arrays;

class RemoveAd {
    public ArrayList<String> RemoveAd(String[] strArr) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                list.remove(strArr[i]);
            }
        }
        return list;
    }

}
