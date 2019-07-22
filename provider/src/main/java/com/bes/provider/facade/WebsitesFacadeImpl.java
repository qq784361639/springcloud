package com.bes.provider.facade;

import com.bes.provider.domain.Websites;
import com.bes.provider.service.WebSitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework. web.bind.annotation.RestController;

@RestController
public class WebsitesFacadeImpl implements WebsitesFacade {
    @Autowired
    private WebSitesService webSitesService;

    @Override
    public int addWebSites(Websites websites) {
        System.out.println("进入到WebsitesFacadeImpl方法" + websites.toString());
        int i = webSitesService.addWebSitesB(websites);
        return i;
    }
}
