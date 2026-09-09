package Basic;


import com.sun.source.tree.BreakTree;

class CompareOperationValues {
    public int CompareOperationValues(int a, int b) {
        String str = String.valueOf(a);
        String str1 = String.valueOf(b);

        int answer = Integer.parseInt(str + str1);
        int answer1 = Integer.parseInt(str) * Integer.parseInt(str1) ;
   if (answer>= 2 * answer1) {
       return answer;

   }else
        return answer1 * 2;
    }

}