package Pccp;


class VideoPlayer {
    public String VideoPlayer(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int total = toSeconds(pos);
        int start = toSeconds(op_start);
        int end = toSeconds(op_end);

        for (String command : commands) {
            if (command.equals("next")) {
                total += 10;
            } else {
                total -= 10;
            }
            if (total < 0) total = 0;

            // 명령 하나 처리할 때마다 구간에 들어갔는지 확인
            if (total >= start && total <= end) {
                total = command.equals("next") ? end : start;
            }
        }

        int m = total / 60;
        int s = total % 60;
        return String.format("%02d:%02d", m, s);
    }

    private int toSeconds(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}