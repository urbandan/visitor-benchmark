package com.urbandan.visitor_benchmark;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.RunnerException;

public class VisitorVsInstanceOfBenchmark {
    public static void main(String[] args) throws IOException, RunnerException {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 2, warmups = 2)
    public void shallowVisitor(ShallowBenchmarkPlan plan) {
        plan.nextVisitable().accept(plan.visitor);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 2, warmups = 2)
    public void shallowInstanceOf(ShallowBenchmarkPlan plan) {
        plan.instanceOfConsumer.consume(plan.nextVisitable());
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 2, warmups = 2)
    public void deepVisitor(DeepBenchmarkPlan plan) {
        plan.nextVisitable().accept(plan.visitor);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 2, warmups = 2)
    public void deepInstanceOf(DeepBenchmarkPlan plan) {
        plan.instanceOfConsumer.consume(plan.nextVisitable());
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 2, warmups = 2)
    public void genVisitor(GenBenchmarkPlan plan) {
        plan.nextVisitable().accept(plan.visitor);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 2, warmups = 2)
    public void genInstanceOf(GenBenchmarkPlan plan) {
        plan.instanceOfConsumer.consume(plan.nextVisitable());
    }
}
