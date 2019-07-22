package com.bes.provider.service.impl;

import com.bes.provider.dao.WebsitesMapper;
import com.bes.provider.domain.Websites;
import com.bes.provider.service.WebSitesService;
import com.bes.provider.service.WebSitesServiceB;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WebSitesServiceImpl implements WebSitesService {

    @Autowired
    WebsitesMapper websitesMapper;

    @Autowired
    private WebSitesServiceB webSitesServiceB;

    @Override
    @Transactional
    public int addWebSitesA(Websites websitesA,Websites websitesB) {
        try {
            int i = websitesMapper.insert(websitesA);
            webSitesServiceB.addWebSitesB(websitesB);
            int j = 5/0;
            return i;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    @Transactional
    @LcnTransaction
    public int addWebSitesB(Websites websites) {
        try {
            System.out.println("WebSitesServiceImpl");
            int i = websitesMapper.insert(websites);
            return i;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
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
