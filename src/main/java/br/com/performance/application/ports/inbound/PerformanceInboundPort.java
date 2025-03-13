package br.com.performance.application.ports.inbound;

import br.com.performance.core.domain.Performance;

public interface PerformanceInboundPort {

    Performance insertNumberInMiddleOfArray();
    Performance insertNumberInMiddleOfArrayList();
    Performance insertNumberInMiddleOfLinkedList();
    Performance removeNumberinMiddleOfArray();
    Performance removeNumberInMiddleOfArrayList();
    Performance removeNumberInMiddleOfLinkedList();
    Performance insertNumberInFirstPositionInArray();
    Performance insertNumberInFirstPositionInArrayList();
    Performance insertNumberInFirstPositionInLinkedList();
    Performance removeNumberInFirstPositionInArray();
    Performance removeNumberInFirstPositionInArrayList();
    Performance removeNumberInFirstPositionInLinkedList();
    Performance insertNumberInLastPositionInArray();
    Performance insertNumberInLastPositionInArrayList();
    Performance insertNumberInLastPositionInLinkedList();
    Performance removeNumberInLastPositionInArray();
    Performance removeNumberInLastPositionInArrayList();
    Performance removeNumberInLastPositionInLinkedList();
    Performance accessPositionInArray(int index);
    Performance accessPositionInArrayList(int index);
    Performance accessPositionInLinkedList(int index);
    Performance removeFromMiddleByIndexInArrayList(int index);
    Performance removeFromMiddleByIndexInLinkedList(int index);
    Performance arrayListUntilIndex(int index);
    Performance linkedListUntilIndex(int index);
    Performance traverseArrayList();
    Performance traverseLinkedList();
}
