package com.company.pr24;

public interface ChairAbstractFactory {
    public FunctionChair createFunctionChair();
    public MagicChair createMagicChair(String material);
    public VictorianChair createVictorianChair(String owner);

}
