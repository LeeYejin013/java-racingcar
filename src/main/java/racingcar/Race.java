package racingcar;

import java.util.ArrayList;

public class Race {
    void race(int tryNumber, ArrayList<Car> cars) {
        int n = cars.size();
        for (int i = 0; i < tryNumber; i++) {
            for (Car car : cars){
                car.move();
                System.out.println(car.name+" : "+car.score);
            }
            System.out.println("\n");
        }
    }

    void result(ArrayList<Car> cars){
        ArrayList<String> winners = new ArrayList<>();
        int n  = cars.size();
        int maxScore = 0;
        for (Car car : cars){
            if (car.score.length() > maxScore){
                maxScore = car.score.length();
                winners.add(car.name);
            }
        }
        System.out.println("최종 우승자 : "+String.join(",",winners));
    }
}
