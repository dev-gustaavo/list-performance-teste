package br.com.performance.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Performance {

    @JsonProperty("millisecondsExecution")
    private double millisecondsExecution;

    public void setMillisecondsExecution(double millisecondsExecution) {
        this.millisecondsExecution = millisecondsExecution;
    }
}
