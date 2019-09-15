package com.yk.eurekafeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource
    SchedualServiceHi schedualServiceHi;
    @GetMapping("/hi")
    public String sysHi(@RequestParam String name){
        return schedualServiceHi.sysHiFromClientOne(name);
    }
}
