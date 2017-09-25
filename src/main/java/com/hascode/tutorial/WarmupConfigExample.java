package com.hascode.tutorial;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.RunnerException;

public class WarmupConfigExample {

  public static void main(String[] args) throws IOException, RunnerException {
    org.openjdk.jmh.Main.main(args);
  }

  @Benchmark
  @Fork(0)
  @Warmup(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
  public void sampleMethod() {

  }
}
