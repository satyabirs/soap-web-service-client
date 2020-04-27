package com.personal.soapclient.controller;

import com.personal.soapclient.client.SoapClient;
import com.personal.soapclient.loaneligibility.Acknowledgement;
import com.personal.soapclient.loaneligibility.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private SoapClient client;

    @PostMapping("/getLoanStatus")
    public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request)
    {
        return client.getLoanStatus(request);
    }
}
