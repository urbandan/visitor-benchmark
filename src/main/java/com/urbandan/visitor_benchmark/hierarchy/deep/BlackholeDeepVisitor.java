package com.urbandan.visitor_benchmark.hierarchy.deep;

import org.openjdk.jmh.infra.Blackhole;

public class BlackholeDeepVisitor implements DeepVisitor {
    private final Blackhole blackhole;

    public BlackholeDeepVisitor(Blackhole blackhole) {
        this.blackhole = blackhole;
    }

    @Override
    public void visit(DeepVisitable1 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(DeepVisitable2 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(DeepVisitable3 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(DeepVisitable4 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(DeepVisitable5 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(DeepVisitable6 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(DeepVisitable7 visitable) {
        blackhole.consume(visitable);
    }
}
