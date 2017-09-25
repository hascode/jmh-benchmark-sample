package com.hascode.tutorial;

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
        .jvmArgs("-Xms2g", "-Xmx2g")
        .shouldDoGC(true)
        .forks(1)
        .build();

    new Runner(opts).run();
  }
}
