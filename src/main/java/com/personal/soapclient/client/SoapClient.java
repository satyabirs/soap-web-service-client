package com.personal.soapclient.client;

import com.personal.soapclient.loaneligibility.Acknowledgement;
import com.personal.soapclient.loaneligibility.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient {

    @Autowired
    public Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public Acknowledgement getLoanStatus(CustomerRequest request)
    {
        template=new WebServiceTemplate(marshaller);
        Acknowledgement acknowledgement=(Acknowledgement) template.marshalSendAndReceive("http://localhost:8080/ws",request);
        return acknowledgement;
    }
}
