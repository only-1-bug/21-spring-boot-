package com.heyu.search.client;

import com.heyu.item.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("item-service")
public interface CategoryClient extends CategoryApi {
}
