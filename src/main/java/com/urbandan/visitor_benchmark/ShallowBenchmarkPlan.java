package com.urbandan.visitor_benchmark;

import java.util.Random;
import java.util.stream.IntStream;

import com.urbandan.visitor_benchmark.hierarchy.shallow.BlackholeShallowVisitor;
import com.urbandan.visitor_benchmark.hierarchy.shallow.InstanceOfBlackholeShallowConsumer;
import com.urbandan.visitor_benchmark.hierarchy.shallow.ShallowVisitable;
import com.urbandan.visitor_benchmark.hierarchy.shallow.ShallowVisitable1;
import com.urbandan.visitor_benchmark.hierarchy.shallow.ShallowVisitable2;
import com.urbandan.visitor_benchmark.hierarchy.shallow.ShallowVisitable3;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class ShallowBenchmarkPlan {
    public static final int NUMBER_OF_VISITABLES = 1000;
    public BlackholeShallowVisitor visitor;
    public InstanceOfBlackholeShallowConsumer instanceOfConsumer;
    public ShallowVisitable[] visitables;
    public int nextVisitable = 0;

    public static ShallowVisitable createVisitable(int random) {
        switch(random) {
            case 0:
                return new ShallowVisitable1();
            case 1:
                return new ShallowVisitable2();
            case 2:
                return new ShallowVisitable3();
            default:
                throw new IllegalArgumentException("Invalid random");
        }
    }

    @Setup(Level.Invocation)
    public void setup(Blackhole blackhole) {
        visitor = new BlackholeShallowVisitor(blackhole);
        instanceOfConsumer = new InstanceOfBlackholeShallowConsumer(blackhole);

        Random random = new Random(2589756);

        visitables = new ShallowVisitable[NUMBER_OF_VISITABLES];
        IntStream.range(0, NUMBER_OF_VISITABLES).forEach(i -> visitables[i] = createVisitable(random.nextInt(3)));
    }

    public ShallowVisitable nextVisitable() {
        return visitables[nextVisitable++ % NUMBER_OF_VISITABLES];
    }
}
