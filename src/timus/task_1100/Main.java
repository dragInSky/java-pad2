package timus.task_1100;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        StreamTokenizer id = new StreamTokenizer(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = nextInt(id);

        int[] teamId = new int[size];
        int[] next = new int[size];
        int[] first = new int[101];
        int[] last = new int[101];

        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < size; i++) {
            int num = nextInt(id);
            int m = nextInt(id);

            teamId[i] = num;
            next[i] = -1;

            if (first[m] == -1) {
                first[m] = i;
            } else {
                next[last[m]] = i;
            }

            last[m] = i;
        }

        for (int m = 100; m >= 0; m--) {
            int cur = first[m];
            while (cur != -1) {
                out.write(teamId[cur] + " " + m);
                out.newLine();
                cur = next[cur];
            }
        }

        out.flush();
    }

    public static int nextInt(StreamTokenizer id) throws IOException {
        id.nextToken();
        return (int) id.nval;
    }
}