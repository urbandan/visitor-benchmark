package com.urbandan.visitor_benchmark.hierarchy.deep;

public class DeepVisitable4 extends DeepVisitable3 {
    @Override
    public void accept(DeepVisitor visitor) {
        visitor.visit(this);
    }
}
