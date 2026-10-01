package Pccp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ddd {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String[][] allRunner = {participant, completion};
        Map<String, Integer> count = new HashMap<>();

        for (int i = 0; i < allRunner.length; i++) {
            String[] runner = allRunner[i];

            for (int j = 0; j < runner.length; j++) {
                String[] record = new String[]{runner[j]};
                String cou = record[0];
                String key = cou;
                count.put(key, count.getOrDefault(key, 0) + 1);
            }
        }
           String  answer= "";
            for (String key : count.keySet()) {
                if (count.get(key) > 0) {
                    answer = key;
                    break;
                }
            }

            System.out.println("완주하지 못한 선수: " + answer);
        }
    }
