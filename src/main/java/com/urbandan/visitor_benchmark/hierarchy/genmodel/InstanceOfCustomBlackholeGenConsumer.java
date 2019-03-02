package com.urbandan.visitor_benchmark.hierarchy.genmodel;

import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable1;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable2;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable3;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable4;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable5;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable6;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable7;
import org.openjdk.jmh.infra.Blackhole;

public class InstanceOfCustomBlackholeGenConsumer {
    private final Blackhole blackhole;

    public InstanceOfCustomBlackholeGenConsumer(Blackhole blackhole) {
        this.blackhole = blackhole;
    }

    public void consume(GenVisitable visitable) {
        if(visitable instanceof CustGenVisitable7) {
            consume((CustGenVisitable7) visitable);
        } else if(visitable instanceof CustGenVisitable6) {
            consume((CustGenVisitable6) visitable);
        } else if(visitable instanceof CustGenVisitable5) {
            consume((CustGenVisitable5) visitable);
        } else if(visitable instanceof CustGenVisitable4) {
            consume((CustGenVisitable4) visitable);
        } else if(visitable instanceof CustGenVisitable3) {
            consume((CustGenVisitable3) visitable);
        } else if(visitable instanceof CustGenVisitable2) {
            consume((CustGenVisitable2) visitable);
        } else if(visitable instanceof CustGenVisitable1) {
            consume((CustGenVisitable1) visitable);
        }
    }

    public void consume(CustGenVisitable1 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(CustGenVisitable2 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(CustGenVisitable3 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(CustGenVisitable4 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(CustGenVisitable5 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(CustGenVisitable6 visitable) {
        blackhole.consume(visitable);
    }

    public void consume(CustGenVisitable7 visitable) {
        blackhole.consume(visitable);
    }
}
