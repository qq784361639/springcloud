package com.bes.provider.service.impl;

import com.bes.provider.dao.WebsitesMapper;
import com.bes.provider.domain.Websites;
import com.bes.provider.service.WebSitesService;
import com.bes.provider.service.WebSitesServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WebSitesServiceBImpl implements WebSitesServiceB {

    @Autowired
    WebsitesMapper websitesMapper;

    @Override
    public int addWebSitesA(Websites websitesA,Websites websitesB) {
        try {
            int i = websitesMapper.insert(websitesA);
            this.addWebSitesB(websitesB);
            return i;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    @Transactional
    public int addWebSitesB(Websites websites) {
        try {
            System.out.println("WebSitesServiceImpl");
            int i = websitesMapper.insert(websites);
            int j = 5/0;
            return i;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    @Transactional
    public int addWebSitesC(Websites websites) {
        try {
            System.out.println("WebSitesServiceImpl");
            int i = websitesMapper.insert(websites);
            return i;
        } catch (Exception e) {
            throw e;
        }
    }

}
