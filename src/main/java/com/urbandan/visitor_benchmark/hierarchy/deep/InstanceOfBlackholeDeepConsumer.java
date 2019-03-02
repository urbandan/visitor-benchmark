package com.urbandan.visitor_benchmark.hierarchy.deep;

import org.openjdk.jmh.infra.Blackhole;

public class InstanceOfBlackholeDeepConsumer {
    private final Blackhole blackhole;

    public InstanceOfBlackholeDeepConsumer(Blackhole blackhole) {
        this.blackhole = blackhole;
    }

    public void consume(DeepVisitable visitable) {
        if(visitable instanceof DeepVisitable7) {
            consume((DeepVisitable7) visitable);
        } else if(visitable instanceof DeepVisitable6) {
            consume((DeepVisitable6) visitable);
        } else if(visitable instanceof DeepVisitable5) {
            consume((DeepVisitable5) visitable);
        } else if(visitable instanceof DeepVisitable4) {
            consume((DeepVisitable4) visitable);
        } else if(visitable instanceof DeepVisitable3) {
            consume((DeepVisitable3) visitable);
        } else if(visitable instanceof DeepVisitable2) {
            consume((DeepVisitable2) visitable);
        } else if(visitable instanceof DeepVisitable1) {
            consume((DeepVisitable1) visitable);
        }
    }

    public void consume(DeepVisitable1 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(DeepVisitable2 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(DeepVisitable3 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(DeepVisitable4 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(DeepVisitable5 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(DeepVisitable6 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(DeepVisitable7 visitable) {
        blackhole.consume(visitable);
    }
}
