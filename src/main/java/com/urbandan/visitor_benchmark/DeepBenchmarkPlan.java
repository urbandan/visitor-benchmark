package com.urbandan.visitor_benchmark;

import java.util.Random;
import java.util.stream.IntStream;

import com.urbandan.visitor_benchmark.hierarchy.deep.*;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class DeepBenchmarkPlan {
    public static final int NUMBER_OF_VISITABLES = 1000;
    public BlackholeDeepVisitor visitor;
    public InstanceOfBlackholeDeepConsumer instanceOfConsumer;
    public DeepVisitable[] visitables;
    public int nextVisitable = 0;

    public static DeepVisitable createVisitable(int random) {
        switch(random) {
            case 0:
                return new DeepVisitable1();
            case 1:
                return new DeepVisitable2();
            case 2:
                return new DeepVisitable3();
            case 3:
                return new DeepVisitable4();
            case 4:
                return new DeepVisitable5();
            case 5:
                return new DeepVisitable6();
            case 6:
                return new DeepVisitable7();
            default:
                throw new IllegalArgumentException("Invalid random");
        }
    }

    @Setup(Level.Invocation)
    public void setup(Blackhole blackhole) {
        visitor = new BlackholeDeepVisitor(blackhole);
        instanceOfConsumer = new InstanceOfBlackholeDeepConsumer(blackhole);

        Random random = new Random(2589756);

        visitables = new DeepVisitable[NUMBER_OF_VISITABLES];
        IntStream.range(0, NUMBER_OF_VISITABLES).forEach(i -> visitables[i] = createVisitable(random.nextInt(3)));
    }

    public DeepVisitable nextVisitable() {
        return visitables[nextVisitable++ % NUMBER_OF_VISITABLES];
    }
}
