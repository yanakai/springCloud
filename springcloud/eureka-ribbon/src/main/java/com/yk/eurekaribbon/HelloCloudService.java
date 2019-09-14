package com.yk.eurekaribbon;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName: springcloud
 * @Package: com.yk.eurekaribbon
 * @ClassName: HelloCloudService
 * @Description: java类作用描述
 * @Author: yanakai@126.com
 * @CreateDate: 2019/9/14 15:47
 * @UpdateUser: yanakai@126.com
 * @UpdateDate: 2019/9/14 15:47
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class HelloCloudService {
    @Resource
    RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+
                .3,String.class);
    }
}
