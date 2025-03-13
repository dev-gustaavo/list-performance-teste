package br.com.performance.application.usecase;

import br.com.performance.application.config.ListStore;
import br.com.performance.application.ports.inbound.PerformanceInboundPort;
import br.com.performance.core.domain.Performance;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;

@Service
@RequiredArgsConstructor
public class PerformanceUseCase implements PerformanceInboundPort {

    @Autowired
    private final ListStore listStore;

    @Override
    public Performance insertNumberInMiddleOfArray() {
        var initialTime = System.nanoTime();

        int[] array = listStore.getAddMiddlePositionArray();

        int[] newArray = new int[10_000_001];

        System.arraycopy(array, 0, newArray, 0, 5_000);

        newArray[5_000] = 5;

        System.arraycopy(array, 4_999, newArray, 5_001, array.length - 5_000);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance insertNumberInMiddleOfArrayList() {
        var initialTime = System.nanoTime();

        ArrayList<Integer> arrayList = listStore.getAddMiddlePositionArrayList();

        arrayList.add(5000, 5);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance insertNumberInMiddleOfLinkedList() {
        var initialTime = System.nanoTime();

        LinkedList<Integer> linkedList = listStore.getAddMiddlePositionLinkedlist();

        linkedList.add(5000, 5);

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance removeNumberinMiddleOfArray() {
        var initialTime = System.nanoTime();

        int[] array = listStore.getRemoveMiddlePositionArray();

        int[] newArray = new int[9_999_999];

        System.arraycopy(array, 0, newArray, 0, 4_999);

        System.arraycopy(array, 4_999, newArray, 4_999, newArray.length - 4_999);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance removeNumberInMiddleOfArrayList() {
        var initialTime = System.nanoTime();

        ArrayList<Integer> arrayList = listStore.getRemoveMiddlePositionArrayList();

        arrayList.remove(5000);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance removeNumberInMiddleOfLinkedList() {
        var initialTime = System.nanoTime();

        LinkedList<Integer> linkedList = listStore.getRemoveMiddlePositionLinkedlist();

        linkedList.remove(5000);

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance insertNumberInFirstPositionInArray() {
        var initialTime = System.nanoTime();

        int[] array = listStore.getAddFirstPositionArray();

        int[] newArray = new int[10_000_001];

        System.arraycopy(array, 0, newArray, 1, 10_000_000);

        newArray[0] = 5;

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance insertNumberInFirstPositionInArrayList() {
        var initialTime = System.nanoTime();

        ArrayList<Integer> arrayList = listStore.getAddFirstPositionArrayList();

        arrayList.add(0, 5);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance insertNumberInFirstPositionInLinkedList() {
        var initialTime = System.nanoTime();

        LinkedList<Integer> linkedList = listStore.getAddFirstPositionLinkedlist();

        linkedList.addFirst(5);

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance removeNumberInFirstPositionInArray() {
        var initialTime = System.nanoTime();

        int[] array = listStore.getRemoveFirstPositionArray();

        int[] newArray = new int[9_999_999];

        System.arraycopy(array, 1, newArray, 0, 9_999_999);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance removeNumberInFirstPositionInArrayList() {
        var initialTime = System.nanoTime();

        ArrayList<Integer> arrayList = listStore.getRemoveFirstPositionArrayList();

        arrayList.remove(0);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance removeNumberInFirstPositionInLinkedList() {
        var initialTime = System.nanoTime();

        LinkedList<Integer> linkedList = listStore.getRemoveFirstPositionLinkedlist();

        linkedList.removeFirst();

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance insertNumberInLastPositionInArray() {
        var initialTime = System.nanoTime();

        int[] array = listStore.getAddLastPositionArray();

        int[] newArray = new int[10_000_001];

        System.arraycopy(array, 0, newArray, 0, 10_000_000);

        newArray[10_000_000] = 5;

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance insertNumberInLastPositionInArrayList() {
        var initialTime = System.nanoTime();

        ArrayList<Integer> arrayList = listStore.getAddLastPositionArrayList();

        arrayList.add(arrayList.size(), 5);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance insertNumberInLastPositionInLinkedList() {
        var initialTime = System.nanoTime();

        LinkedList<Integer> linkedList = listStore.getAddLastPositionLinkedlist();

        linkedList.addLast(5);

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance removeNumberInLastPositionInArray() {
        var initialTime = System.nanoTime();

        int[] array = listStore.getRemoveLastPositionArray();

        System.arraycopy(array, 0, array, 0, 9_999_999);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance removeNumberInLastPositionInArrayList() {
        var initialTime = System.nanoTime();

        ArrayList<Integer> arrayList = listStore.getRemoveLastPositionArrayList();

        arrayList.remove(arrayList.size() - 1);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance removeNumberInLastPositionInLinkedList() {
        var initialTime = System.nanoTime();

        LinkedList<Integer> linkedList = listStore.getRemoveLastPositionLinkedlist();

        linkedList.removeLast();

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance accessPositionInArray(int index) {
        var initialTime = System.nanoTime();

        int[] array = listStore.getAddFirstPositionArray();

        System.out.println("Array: " + array[index]);

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance accessPositionInArrayList(int index) {
        var initialTime = System.nanoTime();

        ArrayList<Integer> arrayList = listStore.getAddFirstPositionArrayList();

        System.out.println("ArrayList: " + arrayList.get(index));

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance accessPositionInLinkedList(int index) {
        var initialTime = System.nanoTime();

        LinkedList<Integer> linkedList = listStore.getAddFirstPositionLinkedlist();

        System.out.println("LinkedList: " + linkedList.get(index));

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance removeFromMiddleByIndexInArrayList(int index) {
        var initialTime = System.nanoTime();

        ArrayList<Integer> arrayList = listStore.getRemoveMiddlePositionArrayList();

        arrayList.remove(index);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance removeFromMiddleByIndexInLinkedList(int index) {
        var initialTime = System.nanoTime();

        LinkedList<Integer> linkedList = listStore.getRemoveMiddlePositionLinkedlist();

        linkedList.remove(index);

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance arrayListUntilIndex(int index) {
        var initialTime = System.nanoTime();

        ArrayList<Integer> arrayList = listStore.getAddFirstPositionArrayList();

        for (int i = 0; i < index; i++) {
            arrayList.get(i);
        }

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance linkedListUntilIndex(int index) {
        var initialTime = System.nanoTime();

        LinkedList<Integer> linkedList = listStore.getAddFirstPositionLinkedlist();

        for (int i = 0; i < index; i++) {
            linkedList.get(i);
        }

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }

    @Override
    public Performance traverseArrayList() {
        var initialTime = System.nanoTime();

        ArrayList<Integer> arrayList = listStore.getAddFirstPositionArrayList();

        arrayList.forEach(System.out::println);

        var finalTime = System.nanoTime();

        var performance = new Performance();
        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;

    }

    @Override
    public Performance traverseLinkedList() {
        var initialTime = System.nanoTime();

        LinkedList<Integer> linkedList = listStore.getAddFirstPositionLinkedlist();

        linkedList.forEach(System.out::println);

        var finalTime = System.nanoTime();

        var performance = new Performance();

        performance.setMillisecondsExecution((finalTime - initialTime) / 1_000_000.0);

        return performance;
    }
}
