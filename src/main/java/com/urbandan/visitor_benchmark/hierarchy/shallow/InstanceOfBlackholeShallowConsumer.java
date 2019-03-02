package com.urbandan.visitor_benchmark.hierarchy.shallow;

import org.openjdk.jmh.infra.Blackhole;

public class InstanceOfBlackholeShallowConsumer {
    private final Blackhole blackhole;

    public InstanceOfBlackholeShallowConsumer(Blackhole blackhole) {
        this.blackhole = blackhole;
    }

    public void consume(ShallowVisitable visitable) {
        if(visitable instanceof ShallowVisitable1) {
            consume((ShallowVisitable1) visitable);
        } else if(visitable instanceof ShallowVisitable2) {
            consume((ShallowVisitable2) visitable);
        } else if(visitable instanceof ShallowVisitable3) {
            consume((ShallowVisitable3) visitable);
        }
    }

    public void consume(ShallowVisitable1 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(ShallowVisitable2 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(ShallowVisitable3 visitable) {
        blackhole.consume(visitable);
    }
}
