package com.apps.madnotdead.paymentapp.data.remote

/**
 * Created by madnotdead on 6/11/17.
 */

import com.apps.madnotdead.paymentapp.data.model.CardIssuer
import com.apps.madnotdead.paymentapp.data.model.PaymentMethod
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable


interface MercadoPagoApi {

    @GET("/payment_methods}")
    fun getPaymentMethod(@Query("public_key") publicKey: String) : Observable<PaymentMethod>

    @GET("/payment_methods/card_issuers")
    fun getCarIssuers(@Query("public_key") publicKey: String, @Query("payment_method") paymentMethod: String) : Observable<CardIssuer>

}