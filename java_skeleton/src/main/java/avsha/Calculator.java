package avsha;

import lombok.Getter;

public class Calculator {
    @Getter
    int lastResult;

    public int add(int a, int b){
        lastResult = a + b;
        return lastResult;
    }
}
