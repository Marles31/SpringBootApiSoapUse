package com.soap.client;

import com.soap.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {

    /**
     * Método que se encarga de sumar dos números
     * @param numberA
     * @param numberB
     * @return AddResponse
     */
    public AddResponse getAddResponse(int numberA, int numberB){

        Add addRequest = new Add();
        addRequest.setIntA(numberA);
        addRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");

        AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", addRequest, soapActionCallback);

        return addResponse;

    }


    /**
     * Método que se encarga de restar dos números
     * @param numberA
     * @param numberB
     * @return SubtractResponse
     */
    public SubtractResponse getSubtractResponse(int numberA, int numberB){
        Subtract subtractRequest = new Subtract();
        subtractRequest.setIntA(numberA);
        subtractRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");

        SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", subtractRequest, soapActionCallback);

        return subtractResponse;
    }


    /**
     * Método que se encarga de multiplicar dos números
     * @param numberA
     * @param numberB
     * @return SubtractResponse
     */
    public MultiplyResponse getMultiplyResponse(int numberA, int numberB){
        Multiply multiplyRequest = new Multiply();
        multiplyRequest.setIntA(numberA);
        multiplyRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");

        MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", multiplyRequest, soapActionCallback);

        return multiplyResponse;
    }


    /**
     * Método que se encarga de dividir dos números
     * @param numberA
     * @param numberB
     * @return DivideResponse
     */
    public DivideResponse getDivideResponse (int numberA, int numberB){
        Divide divideRequest = new Divide();
        divideRequest.setIntA(numberA);
        divideRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");

        DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", divideRequest, soapActionCallback);

        return divideResponse;
    }

}
