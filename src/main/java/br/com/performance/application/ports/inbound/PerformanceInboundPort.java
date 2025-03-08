package br.com.performance.application.ports.inbound;

import br.com.performance.core.domain.Performance;

public interface PerformanceInboundPort {

    Performance testArray();

    Performance testArrayList();

    Performance testLinkedList();
}
