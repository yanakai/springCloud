package com.yk.eurekafeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sysHiFromClientOne(String name) {
        return "sorry "+name+"--断路器开启";
    }
}
