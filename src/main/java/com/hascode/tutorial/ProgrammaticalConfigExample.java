package com.hascode.tutorial;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class ProgrammaticalConfigExample {

  public static void main(String[] args) throws RunnerException {
    Options opts = new OptionsBuilder()
        .include(".*")
        .warmupIterations(10)
        .measurementIterations(20)
        .jvmArgs("-Xms4g", "-Xmx4g")
        .shouldDoGC(true)
        .forks(1)
        .mode(Mode.AverageTime)
        .build();

    new Runner(opts).run();
  }

  @Benchmark
  public void sample(){

  }
}
