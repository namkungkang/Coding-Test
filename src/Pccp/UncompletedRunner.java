package Pccp;

import java.util.HashMap;
import java.util.Map;

class UncompletedRunner {
    public String UncompletedRunner(String[] participant, String[] completion) {
        String answer = "";

        String[][] allRunner = {participant, completion};
        Map<String, Integer> count = new HashMap<>();

        for (int i = 0; i < allRunner.length; i++) {
            String[] runner = allRunner[i];

            for (int j = 0; j < runner.length; j++) {        // 기록을 번호로
                String[] record = new String[]{runner[j]};
                String cou = record[0];
                String key = cou;
                count.put(key, count.getOrDefault(key, 0) + 1);
            }

            int eventCount = 0;
            for (int value : count.values()) {
                if (value >= 2) eventCount++;
            }
            System.out.println("겹친 자리 수: " + eventCount);

        }
        return answer;
    }
}