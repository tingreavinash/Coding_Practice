package io.github.tingreavinash.JavaConcepts.Concurrency;

import java.util.concurrent.Executor;

public class Caller implements Executor {


    @Override
    public void execute(Runnable command) {
        command.run();
    }
}
