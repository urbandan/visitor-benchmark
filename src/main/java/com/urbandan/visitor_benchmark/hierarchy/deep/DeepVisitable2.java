package com.urbandan.visitor_benchmark.hierarchy.deep;

public class DeepVisitable2 implements DeepVisitable {
    @Override
    public void accept(DeepVisitor visitor) {
        visitor.visit(this);
    }
}
