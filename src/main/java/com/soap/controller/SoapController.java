package com.soap.controller;

import com.soap.client.SoapClient;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.SubtractResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoapController {

    @Autowired
    private SoapClient soapClient;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestParam int numberA, @RequestParam int numberB) {
        AddResponse addResponse = soapClient.getAddResponse(numberA, numberB);
        return ResponseEntity.ok(addResponse.getAddResult());
    }

    @PostMapping("/subtract")
    public ResponseEntity<?> subtract(@RequestParam int numberA, @RequestParam int numberB) {
        SubtractResponse subtractResponse = soapClient.getSubtractResponse(numberA, numberB);
        return ResponseEntity.ok(subtractResponse.getSubtractResult());
    }

    @PostMapping("/multiply")
    public ResponseEntity<?> multiply(@RequestParam int numberA, @RequestParam int numberB) {
        MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(numberA, numberB);
        return ResponseEntity.ok(multiplyResponse.getMultiplyResult());
    }

    @PostMapping("/divide")
    public ResponseEntity<?> divide(@RequestParam int numberA, @RequestParam int numberB) {
        DivideResponse divideResponse = soapClient.getDivideResponse(numberA, numberB);
        return ResponseEntity.ok(divideResponse.getDivideResult());
    }

}
