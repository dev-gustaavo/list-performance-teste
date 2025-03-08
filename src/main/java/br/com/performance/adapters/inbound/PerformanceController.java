package br.com.performance.adapters.inbound;

import br.com.performance.application.ports.inbound.PerformanceInboundPort;
import br.com.performance.core.domain.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/performance")
public class PerformanceController {

    @Autowired
    private final PerformanceInboundPort performanceInboundPort;

    public PerformanceController(PerformanceInboundPort performanceInboundPort) {
        this.performanceInboundPort = performanceInboundPort;
    }

    @GetMapping("/array")
    public ResponseEntity<Performance> testArray() {
        var performance = performanceInboundPort.testArray();

        return ResponseEntity.ok(performance);
    }

    @GetMapping("/arrayList")
    public ResponseEntity<Performance> testArrayList() {
        var performance = performanceInboundPort.testArrayList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/linkedList")
    public ResponseEntity<Performance> testLinkedList() {
        var performance = performanceInboundPort.testLinkedList();
        return ResponseEntity.ok(performance);
    }
}
