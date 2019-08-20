package com.bes.provider;

import com.bes.provider.dao.WebsitesMapper;
import com.bes.provider.domain.Websites;
import com.bes.provider.service.WebSitesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderApplicationTests {

    @Autowired
    WebsitesMapper websitesMapper;

    @Autowired
    private WebSitesService webSitesService;
    @Test
    public void contextLoads() {
        Websites websites = websitesMapper.selectByPrimaryKey(1);
        websites.setId(null);
        Websites websites1 = websitesMapper.selectByPrimaryKey(2);
        websites1.setId(null);
        webSitesService.addWebSitesA(websites,websites1);
    }

    @Test
    public void testGetWebsitesByid() {
        Websites websitesById = webSitesService.getWebsitesById(8);
        System.out.println(websitesById);
    }

    @Test
    public void testDeleteWebsitesByid() {
        int websitesById = webSitesService.deleteWebsitesById(22);
        System.out.println(websitesById);
    }

}
