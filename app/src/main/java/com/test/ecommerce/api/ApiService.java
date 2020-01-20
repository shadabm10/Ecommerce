package com.test.ecommerce.api;

import com.test.ecommerce.model.response.MasterdataDTO;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * API service for api call.
 *
 * @author Shadab Mallick
 */
public interface ApiService
{
    @GET("/json")
	Observable<MasterdataDTO> getCategoryAndProductDetails();
}
