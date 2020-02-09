package ie.gmit;

public class Calculator {

    private int value1;
    private int value2;
    private int result;

    public Calculator() {
        this.value1 = 0;
        this.value2 = 0;
        this.result = 0;
    }

    public Calculator(int value1, int value2, int result) {
        this.value1 = value1;
        this.value2 = value2;
        this.result = result;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    // this method will add two numbers
    public int add(int num1, int num2) {
       return num1 + num2;
    }


}
