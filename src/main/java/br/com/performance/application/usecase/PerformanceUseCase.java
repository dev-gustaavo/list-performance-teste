package br.com.performance.application.usecase;

import br.com.performance.application.ports.inbound.PerformanceInboundPort;
import br.com.performance.core.domain.Performance;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;

@Service
public class PerformanceUseCase implements PerformanceInboundPort {

    @Override
    public Performance insertNumberInMiddleOfArray() {
        var initialTime = System.nanoTime();

        int[] array = new int[10_000_000];

        for (int i = 0; i < 10_000_000; i++) {
            array[i] = i;
        }

        int[] newArray = new int[10_000_001];

        System.arraycopy(array, 0, newArray, 0, 5000);

        newArray[5000] = 5;

        System.arraycopy(array, 1, newArray, 2, 10_000_000 - 5000);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance insertNumberInMiddleOfArrayList() {
        var initialTime = System.nanoTime();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (var i = 0; i < 10_000_000; i++) {
            arrayList.add(i);
        }

        arrayList.add(5000, 5);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance insertNumberInMiddleOfLinkedList() {
        var initialTime = System.nanoTime();

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (var i = 0; i < 10_000_000; i++) {
            linkedList.add(i);
        }

        linkedList.add(5000, 5);

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }
}
