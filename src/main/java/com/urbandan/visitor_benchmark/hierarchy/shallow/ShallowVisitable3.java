package com.urbandan.visitor_benchmark.hierarchy.shallow;

public class ShallowVisitable3 implements ShallowVisitable {
    @Override
    public void accept(ShallowVisitor visitor) {
        visitor.visit(this);
    }
}
