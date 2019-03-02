package com.urbandan.visitor_benchmark.hierarchy.deep;

public class DeepVisitable6 extends DeepVisitable5 {
    @Override
    public void accept(DeepVisitor visitor) {
        visitor.visit(this);
    }
}
