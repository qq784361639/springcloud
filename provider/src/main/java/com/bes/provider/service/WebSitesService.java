package com.bes.provider.service;

import com.bes.provider.domain.Websites;
import org.springframework.cache.annotation.CacheEvict;

public interface WebSitesService {

    int addWebSitesA(Websites websitesA,Websites websitesB);

    int addWebSitesB(Websites websites);

    int addWebSitesC(Websites websites);

    Websites getWebsitesById(Integer id);

    int deleteWebsitesById(Integer id);
}
