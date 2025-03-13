package br.com.performance.application.config;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;

@Component
@Getter
public class ListStore {

    private int[] addFirstPositionArray;
    private ArrayList<Integer> addFirstPositionArrayList = new ArrayList<>();
    private LinkedList<Integer> addFirstPositionLinkedlist = new LinkedList<>();

    private int[] addMiddlePositionArray;
    private ArrayList<Integer> addMiddlePositionArrayList = new ArrayList<>();
    private LinkedList<Integer> addMiddlePositionLinkedlist = new LinkedList<>();

    private int[] addLastPositionArray;
    private ArrayList<Integer> addLastPositionArrayList = new ArrayList<>();
    private LinkedList<Integer> addLastPositionLinkedlist = new LinkedList<>();


    private int[] removeFirstPositionArray;
    private ArrayList<Integer> removeFirstPositionArrayList = new ArrayList<>();
    private LinkedList<Integer> removeFirstPositionLinkedlist = new LinkedList<>();

    private int[] removeMiddlePositionArray;
    private ArrayList<Integer> removeMiddlePositionArrayList = new ArrayList<>();
    private LinkedList<Integer> removeMiddlePositionLinkedlist = new LinkedList<>();

    private int[] removeLastPositionArray;
    private ArrayList<Integer> removeLastPositionArrayList = new ArrayList<>();
    private LinkedList<Integer> removeLastPositionLinkedlist = new LinkedList<>();

    @PostConstruct
    public void init() {
        int size = 10_000_000;

        addFirstPositionArray = new int[size];

        for (int i = 0; i < size; i++) {
            addFirstPositionArray[i] = i;
            addFirstPositionArrayList.add(i);
            addFirstPositionLinkedlist.add(i);
        }

        addMiddlePositionArray = addFirstPositionArray;
        addMiddlePositionArrayList = addFirstPositionArrayList;
        addMiddlePositionLinkedlist = addFirstPositionLinkedlist;

        addLastPositionArray = addFirstPositionArray;
        addLastPositionArrayList = addFirstPositionArrayList;
        addLastPositionLinkedlist = addFirstPositionLinkedlist;

        removeFirstPositionArray = addFirstPositionArray;
        removeFirstPositionArrayList = addFirstPositionArrayList;
        removeFirstPositionLinkedlist = addFirstPositionLinkedlist;

        removeMiddlePositionArray = addFirstPositionArray;
        removeMiddlePositionArrayList = addFirstPositionArrayList;
        removeMiddlePositionLinkedlist = addFirstPositionLinkedlist;

        removeLastPositionArray = addFirstPositionArray;
        removeLastPositionArrayList = addFirstPositionArrayList;
        removeLastPositionLinkedlist = addFirstPositionLinkedlist;
    }
}
