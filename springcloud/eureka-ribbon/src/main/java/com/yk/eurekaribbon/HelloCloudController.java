package com.yk.eurekaribbon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: springcloud
 * @Package: com.yk.eurekaribbon
 * @ClassName: HelloCloudController
 * @Description: java类作用描述
 * @Author: yanakai@126.com
 * @CreateDate: 2019/9/14 15:50
 * @UpdateUser: yanakai@126.com
 * @UpdateDate: 2019/9/14 15:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
public class HelloCloudController {
    @Resource
    HelloCloudService helloCloudService;

    @RequestMapping("/hello")
    public String hi(@RequestParam String name){
        return helloCloudService.hiService(name);
    }
}
