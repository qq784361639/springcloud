package com.bes.provider2;

import com.bes.provider.domain.Websites;
import com.bes.provider2.service.ProviderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Provider2ApplicationTests {

    @Autowired
    private ProviderService providerService;
    @Test
    public void contextLoads() {
        Websites websites = new Websites();
        websites.setCountry("中国");
        websites.setName("杜尚飞");
        websites.setUrl("1234");
        websites.setAlexa(1);
        int method = providerService.getProviderMethod(websites);
        System.out.println(method);
    }

}
