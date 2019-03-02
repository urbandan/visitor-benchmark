package com.urbandan.visitor_benchmark;

import java.util.Random;
import java.util.stream.IntStream;

import com.urbandan.visitor_benchmark.hierarchy.genmodel.BlackholeGenVisitor;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.GenVisitable;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.InstanceOfBlackholeGenConsumer;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.InstanceOfCustomBlackholeGenConsumer;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable1;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable2;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable3;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable4;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable5;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable6;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.custom.CustGenVisitable7;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class GenBenchmarkPlan {
    public static final int NUMBER_OF_VISITABLES = 1000;
    public BlackholeGenVisitor visitor;
    public InstanceOfBlackholeGenConsumer instanceOfConsumer;
    public InstanceOfCustomBlackholeGenConsumer instanceOfCustomConsumer;
    public GenVisitable[] visitables;
    public int nextVisitable = 0;

    public static GenVisitable createVisitable(int random) {
        switch(random) {
            case 0:
                return new CustGenVisitable1();
            case 1:
                return new CustGenVisitable2();
            case 2:
                return new CustGenVisitable3();
            case 3:
                return new CustGenVisitable4();
            case 4:
                return new CustGenVisitable5();
            case 5:
                return new CustGenVisitable6();
            case 6:
                return new CustGenVisitable7();
            default:
                throw new IllegalArgumentException("Invalid random");
        }
    }

    @Setup(Level.Invocation)
    public void setup(Blackhole blackhole) {
        visitor = new BlackholeGenVisitor(blackhole);
        instanceOfConsumer = new InstanceOfBlackholeGenConsumer(blackhole);
        instanceOfCustomConsumer = new InstanceOfCustomBlackholeGenConsumer(blackhole);

        Random random = new Random(2589756);

        visitables = new GenVisitable[NUMBER_OF_VISITABLES];
        IntStream.range(0, NUMBER_OF_VISITABLES).forEach(i -> visitables[i] = createVisitable(random.nextInt(3)));
    }

    public GenVisitable nextVisitable() {
        return visitables[nextVisitable++ % NUMBER_OF_VISITABLES];
    }
}
