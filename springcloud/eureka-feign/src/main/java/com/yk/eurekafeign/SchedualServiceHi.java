package com.yk.eurekafeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//通过@ FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了eureka-client服务的“/hi”接口
@FeignClient(value = "eureka-client")
public interface SchedualServiceHi {
    @RequestMapping(value="hi",method = RequestMethod.GET)
    String sysHiFromClientOne(@RequestParam String name);
}
