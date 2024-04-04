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

import java.util.HashMap;
import java.util.Map;

@RestController
public class SoapController {

    @Autowired
    private SoapClient soapClient;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestParam int numberA, @RequestParam int numberB) {

        Map<String, Integer> response = new HashMap<>();

        AddResponse addResponse = soapClient.getAddResponse(numberA, numberB);

        response.put("addResult", addResponse.getAddResult());
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/subtract")
    public ResponseEntity<?> subtract(@RequestParam int numberA, @RequestParam int numberB) {

        Map<String, Integer> response = new HashMap<>();

        SubtractResponse subtractResponse = soapClient.getSubtractResponse(numberA, numberB);

        response.put("subtractResult", subtractResponse.getSubtractResult());
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/multiply")
    public ResponseEntity<?> multiply(@RequestParam int numberA, @RequestParam int numberB) {

        Map<String, Integer> response = new HashMap<>();

        MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(numberA, numberB);

        response.put("multiplyResult", multiplyResponse.getMultiplyResult());
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/divide")
    public ResponseEntity<?> divide(@RequestParam int numberA, @RequestParam int numberB) {

        Map<String, Integer> response = new HashMap<>();

        DivideResponse divideResponse = soapClient.getDivideResponse(numberA, numberB);

        response.put("divideResult", divideResponse.getDivideResult());
        return ResponseEntity.ok().body(response);
    }

}
