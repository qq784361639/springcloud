package com.bes.provider2.service.impl;

import com.bes.provider.domain.Websites;
import com.bes.provider2.client.provider.WebsitesClient;
import com.bes.provider2.service.ProviderService;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProviderSerivceImpl implements ProviderService {

    @Autowired
    private WebsitesClient websitesClient;
    @Override
    @Transactional
    @LcnTransaction
    public int getProviderMethod(Websites websites) {
        System.out.println("进入到getProviderMethod方法");
        int i = websitesClient.addWebSites(websites);
        int j = 5/0;
        return i;
    }
}
