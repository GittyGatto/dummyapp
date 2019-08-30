package com.acme.businessService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.UnknownHostException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicServiceTest {

    private BasicService basicService = new BasicService();

    @Test
    @DisplayName("wtf 😱!")
    public void happyPath() throws UnknownHostException {
        String result = basicService.getData();

        String textPart = result.substring(0, 4);
        String datePart = result.substring(5, 34);

        assertEquals(textPart, "hihi", "text part failed");
        assertEquals(datePart, new Date().toString(), "date part failed");
    }
}