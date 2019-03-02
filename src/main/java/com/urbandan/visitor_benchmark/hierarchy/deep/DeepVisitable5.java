package com.urbandan.visitor_benchmark.hierarchy.deep;

public class DeepVisitable5 extends DeepVisitable4 {
    @Override
    public void accept(DeepVisitor visitor) {
        visitor.visit(this);
    }
}
