package com.urbandan.visitor_benchmark.hierarchy.shallow;

public class ShallowVisitable2 implements ShallowVisitable {
    @Override
    public void accept(ShallowVisitor visitor) {
        visitor.visit(this);
    }
}
