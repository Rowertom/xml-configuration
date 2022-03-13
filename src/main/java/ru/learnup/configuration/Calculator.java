package ru.learnup.configuration;

public class Calculator {
    private final DivideProcessor divideProcessor;
    private final SubtractProcessor subtractProcessor;
    private final SumProcessor sumProcessor;
    private final MultiplyProcessor multiplyProcessor;

    public Calculator(DivideProcessor divideProcessor, SubtractProcessor subtractProcessor, SumProcessor sumProcessor, MultiplyProcessor multiplyProcessor) {
        this.divideProcessor = divideProcessor;
        this.subtractProcessor = subtractProcessor;
        this.sumProcessor = sumProcessor;
        this.multiplyProcessor = multiplyProcessor;
    }


    public int sum(int a, int b) {
        return sumProcessor.process(a, b);
    }

    public int substract(int a, int b){
        return subtractProcessor.process(a, b);
    }

    public int multiply(int a, int b){
        return multiplyProcessor.process(a, b);
    }

    public int divide(int a, int b){
        return multiplyProcessor.process(a, b);
    }

}
