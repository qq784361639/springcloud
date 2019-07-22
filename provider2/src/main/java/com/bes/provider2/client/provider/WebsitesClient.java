package com.bes.provider2.client.provider;

import com.bes.provider.domain.Websites;
import com.bes.provider.facade.WebsitesFacade;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="provider")
public interface WebsitesClient extends WebsitesFacade{

}
