package com.urbandan.visitor_benchmark.hierarchy.genmodel;

import org.openjdk.jmh.infra.Blackhole;

public class InstanceOfBlackholeGenConsumer {
    private final Blackhole blackhole;

    public InstanceOfBlackholeGenConsumer(Blackhole blackhole) {
        this.blackhole = blackhole;
    }

    public void consume(GenVisitable visitable) {
        if(visitable instanceof GenVisitable7) {
            consume((GenVisitable7) visitable);
        } else if(visitable instanceof GenVisitable6) {
            consume((GenVisitable6) visitable);
        } else if(visitable instanceof GenVisitable5) {
            consume((GenVisitable5) visitable);
        } else if(visitable instanceof GenVisitable4) {
            consume((GenVisitable4) visitable);
        } else if(visitable instanceof GenVisitable3) {
            consume((GenVisitable3) visitable);
        } else if(visitable instanceof GenVisitable2) {
            consume((GenVisitable2) visitable);
        } else if(visitable instanceof GenVisitable1) {
            consume((GenVisitable1) visitable);
        }
    }

    public void consume(GenVisitable1 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(GenVisitable2 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(GenVisitable3 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(GenVisitable4 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(GenVisitable5 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(GenVisitable6 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(GenVisitable7 visitable) {
        blackhole.consume(visitable);
    }
}
