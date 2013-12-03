package com.acknsyn.boothello.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

/**
 *
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/", produces = TEXT_PLAIN_VALUE)
    public String index() {
        return "Hello";
    }
}
