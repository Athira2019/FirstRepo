package com.cerner.training.behaviour.state;

public interface PackageState {

    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();
}


