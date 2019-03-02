package com.urbandan.visitor_benchmark.hierarchy.shallow;

public interface ShallowVisitor {
    void visit(ShallowVisitable1 visitable);

    void visit(ShallowVisitable2 visitable);

    void visit(ShallowVisitable3 visitable);
}
