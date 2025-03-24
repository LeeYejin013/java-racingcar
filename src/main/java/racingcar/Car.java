package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    protected String name;
    protected String score;
    public Car(String name){
        if(name.length() > 5){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.score = "";
    }
    void move(){
        int n = Randoms.pickNumberInRange(0,9);
        if (n >= 4){
            score += "-";
        }
    }
}
