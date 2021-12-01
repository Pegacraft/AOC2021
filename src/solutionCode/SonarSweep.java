package solutionCode;

import util.Res;

import java.util.ArrayList;

public class SonarSweep {
    String input;

    public SonarSweep() {
        input = Res.getFileContent("input/1. Day");
        solve2();
    }

    private void solve1() {
        ArrayList<Integer> values = new ArrayList<>();
        String[] valuesStr = input.split("\n");

        for (String s : valuesStr) {
            values.add(Integer.parseInt(s));
        }

        int lastValue = values.get(0);
        int increased = 0;

        for (Integer value : values) {
            if (lastValue < value)
                increased++;
            lastValue = value;
        }

        System.out.println(increased);
    }

    public void solve2() {
        ArrayList<Integer> values = new ArrayList<>();
        String[] valuesStr = input.split("\n");

        for (String s : valuesStr) {
            values.add(Integer.parseInt(s));
        }

        int lastValue = values.get(0) + values.get(1) + values.get(2);
        int increased = 0;
        int value;
        for (int i = 0; i < values.size(); i++) {
            value = 0;
            for (int j = 0; j < 3; j++) {
                if (i + j < values.size())
                    value += values.get(i + j);
            }

            System.out.println(value);
            if (lastValue < value)
                increased++;
            lastValue = value;
        }
        System.out.println(increased);
    }
}
