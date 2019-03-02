package com.urbandan.visitor_benchmark.hierarchy.shallow;

public class ShallowVisitable1 implements ShallowVisitable {
    @Override
    public void accept(ShallowVisitor visitor) {
        visitor.visit(this);
    }
}
