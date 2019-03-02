package com.urbandan.visitor_benchmark.hierarchy.shallow;

import org.openjdk.jmh.infra.Blackhole;

public class BlackholeShallowVisitor implements ShallowVisitor {
    private final Blackhole blackhole;

    public BlackholeShallowVisitor(Blackhole blackhole) {
        this.blackhole = blackhole;
    }

    @Override
    public void visit(ShallowVisitable1 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(ShallowVisitable2 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(ShallowVisitable3 visitable) {
        blackhole.consume(visitable);
    }
}
