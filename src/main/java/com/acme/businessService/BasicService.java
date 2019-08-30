package com.acme.businessService;

import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

@Service
public class BasicService {
    public String getData() throws UnknownHostException {
        return "hihi " + new Date().toString() + ' ' + InetAddress.getLocalHost().getHostAddress();
    }
}
