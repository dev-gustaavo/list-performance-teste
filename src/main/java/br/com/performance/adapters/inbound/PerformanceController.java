package br.com.performance.adapters.inbound;

import br.com.performance.application.ports.inbound.PerformanceInboundPort;
import br.com.performance.core.domain.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/insert/first/array")
    public ResponseEntity<Performance> insertNumberInFirstPositionInArray() {
        var performance = performanceInboundPort.insertNumberInFirstPositionInArray();

        return ResponseEntity.ok(performance);
    }

    @GetMapping("/insert/middle/array")
    public ResponseEntity<Performance> insertNumberInMiddleOfArray() {
        var performance = performanceInboundPort.insertNumberInMiddleOfArray();

        return ResponseEntity.ok(performance);
    }

    @GetMapping("/insert/last/array")
    public ResponseEntity<Performance> insertNumberInLastPositionInArray() {
        var performance = performanceInboundPort.insertNumberInLastPositionInArray();

        return ResponseEntity.ok(performance);
    }

    @GetMapping("/insert/first/arrayList")
    public ResponseEntity<Performance> insertNumberInFirstPositionInArrayList() {
        var performance = performanceInboundPort.insertNumberInFirstPositionInArrayList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/insert/middle/arrayList")
    public ResponseEntity<Performance> insertNumberInMiddleOfArrayList() {
        var performance = performanceInboundPort.insertNumberInMiddleOfArrayList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/insert/last/arrayList")
    public ResponseEntity<Performance> insertNumberInLastPositionInArrayList() {
        var performance = performanceInboundPort.insertNumberInLastPositionInArrayList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/insert/first/linkedList")
    public ResponseEntity<Performance> insertNumberInFirstPositionInLinkedList() {
        var performance = performanceInboundPort.insertNumberInFirstPositionInLinkedList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/insert/middle/linkedList")
    public ResponseEntity<Performance> insertNumberInMiddleOfLinkedList() {
        var performance = performanceInboundPort.insertNumberInMiddleOfLinkedList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/insert/last/linkedList")
    public ResponseEntity<Performance> insertNumberInLastPositionInLinkedList() {
        var performance = performanceInboundPort.insertNumberInLastPositionInLinkedList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/remove/first/array")
    public ResponseEntity<Performance> removeNumberInFirstPositionInArray() {
        var performance = performanceInboundPort.removeNumberInFirstPositionInArray();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/remove/middle/array")
    public ResponseEntity<Performance> removeNumberInMiddleOfArray() {
        var performance = performanceInboundPort.removeNumberinMiddleOfArray();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/remove/last/array")
    public ResponseEntity<Performance> removeNumberInLastPositionInArray() {
        var performance = performanceInboundPort.removeNumberInLastPositionInArray();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/remove/first/arrayList")
    public ResponseEntity<Performance> removeNumberInFirstPositionInArrayList() {
        var performance = performanceInboundPort.removeNumberInFirstPositionInArrayList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/remove/middle/arrayList")
    public ResponseEntity<Performance> removeNumberInMiddleOfArrayList() {
        var performance = performanceInboundPort.removeNumberInMiddleOfArrayList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/remove/last/arrayList")
    public ResponseEntity<Performance> removeNumberInLastPositionInArrayList() {
        var performance = performanceInboundPort.removeNumberInLastPositionInArrayList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/remove/first/linkedList")
    public ResponseEntity<Performance> removeNumberInFirstPositionInLinkedList() {
        var performance = performanceInboundPort.removeNumberInFirstPositionInLinkedList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/remove/middle/linkedList")
    public ResponseEntity<Performance> removeNumberInMiddleOfLinkedList() {
        var performance = performanceInboundPort.removeNumberInMiddleOfLinkedList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/remove/last/linkedList")
    public ResponseEntity<Performance> removeNumberInLastPositionInLinkedList() {
        var performance = performanceInboundPort.removeNumberInLastPositionInLinkedList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/access/{index}/array")
    public ResponseEntity<Performance> accessPositionInArray(@PathVariable int index) {
        var performance = performanceInboundPort.accessPositionInArray(index);
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/access/{index}/arrayList")
    public ResponseEntity<Performance> accessPositionInArrayList(@PathVariable int index) {
        var performance = performanceInboundPort.accessPositionInArrayList(index);
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/access/{index}/linkedList")
    public ResponseEntity<Performance> accessPositionInLinkedList(@PathVariable int index) {
        var performance = performanceInboundPort.accessPositionInLinkedList(index);
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/remove/middle/{index}/arrayList")
    public ResponseEntity<Performance> removeFromMiddleByIndexInArrayList(@PathVariable int index) {
        var performance = performanceInboundPort.removeFromMiddleByIndexInArrayList(index);
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/remove/middle/{index}/linkedList")
    public ResponseEntity<Performance> removeFromMiddleByIndexInLinkedList(@PathVariable int index) {
        var performance = performanceInboundPort.removeFromMiddleByIndexInLinkedList(index);
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/arrayList/until/{index}")
    public ResponseEntity<Performance> arrayListUntilIndex(@PathVariable int index) {
        var performance = performanceInboundPort.arrayListUntilIndex(index);
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/linkedList/until/{index}")
    public ResponseEntity<Performance> linkedListUntilIndex(@PathVariable int index) {
        var performance = performanceInboundPort.linkedListUntilIndex(index);
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/arrayList/traverse")
    public ResponseEntity<Performance> traverseArrayList() {
        var performance = performanceInboundPort.traverseArrayList();
        return ResponseEntity.ok(performance);
    }

    @GetMapping("/linkedList/traverse")
    public ResponseEntity<Performance> traverseLinkedList() {
        var performance = performanceInboundPort.traverseLinkedList();
        return ResponseEntity.ok(performance);
    }

}
