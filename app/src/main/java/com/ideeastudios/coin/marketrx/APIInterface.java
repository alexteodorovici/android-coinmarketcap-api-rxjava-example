package com.ideeastudios.coin.marketrx;

import com.ideeastudios.coin.marketrx.retrofit.info.Info;
import com.ideeastudios.coin.marketrx.retrofit.listings.CryptoList;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface APIInterface {

    //https://pro.coinmarketcap.com/api/v1#section/Quick-Start-Guide
    //@Headers("X-CMC_PRO_API_KEY: 3069b872-06b0-40f1-bf44-5a3f7f73d796")

    @GET("/v1/cryptocurrency/listings/latest?")
    Single<CryptoList> getMarketPairsLatest(@Query("limit") String limit);

    @GET("/v1/cryptocurrency/info")
    Single<Info> getCryptocurrencyInfo(@Query("symbol") String symbol);

}
