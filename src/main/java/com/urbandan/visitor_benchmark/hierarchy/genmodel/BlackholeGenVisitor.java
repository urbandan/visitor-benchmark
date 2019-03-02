package com.urbandan.visitor_benchmark.hierarchy.genmodel;

import org.openjdk.jmh.infra.Blackhole;

public class BlackholeGenVisitor implements GenVisitor {
    private final Blackhole blackhole;

    public BlackholeGenVisitor(Blackhole blackhole) {
        this.blackhole = blackhole;
    }

    @Override
    public void visit(GenVisitable1 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(GenVisitable2 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(GenVisitable3 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(GenVisitable4 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(GenVisitable5 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(GenVisitable6 visitable) {
        blackhole.consume(visitable);
    }

    @Override
    public void visit(GenVisitable7 visitable) {
        blackhole.consume(visitable);
    }
}
