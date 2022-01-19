import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CoordinateAlignment {

    public static class Coord implements Comparable<Coord> {

        public int x, y;

        Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Coord coord) {
            if (this.x == coord.x) {
                // 오름 차순으로 정렬 하고 싶으면 음수가 return 되어야 하고
                // 내림 차순으로 정렬 하고 싶으면 양수가 return 되어야 한다.
                return this.y - coord.y;
            }
            return this.x - coord.x;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Coord> coords = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            coords.add(new Coord(x, y));
        }

        // Collection sort 의 정렬 기준은 compareTo 인데 우리가 Overriding 한 method 로 바꿔 실행 시켜줌
        Collections.sort(coords);

        for (Coord coord : coords) {
            System.out.printf("%d %d\n", coord.x, coord.y);
        }
    }
}
