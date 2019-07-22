package com.bes.provider.facade;

import com.bes.provider.domain.Websites;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface WebsitesFacade {
    @PostMapping("/insertWebsites")
    int addWebSites(@RequestBody  Websites websites);
}
