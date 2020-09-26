package taskParts;

import taskParts.part1.SinusModule;

public class Main {

    public static void main(String[] args) {
        System.out.println(SinusModule.taylorSeriesSin(Math.PI / 2, 2000).toString().substring(0,7));
    }
}
