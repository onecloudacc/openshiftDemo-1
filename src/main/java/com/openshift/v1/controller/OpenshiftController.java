package com.openshift.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class OpenshiftController {

    // http://localhost:8080/api/v1/openshift
    @GetMapping("/openshift")
    public String openshiftGetApi() {

        return "openshift api v1";

    }
}
