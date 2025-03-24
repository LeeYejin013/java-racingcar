package racingcar;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.print("경주할 자동차들의 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분):");
        String names = readLine();
        String[] nameList = names.split(",");
        ArrayList<Car> cars = new ArrayList<>();
        for (String name : nameList) {
            Car car = new Car(name);
            cars.add(car);
        }

        System.out.print("시도할 회수는 몇회인가요?");
        int tryNumber = Integer.parseInt(readLine());

        Race race = new Race();
        race.race(tryNumber, cars);
        race.result(cars);
    }
}
