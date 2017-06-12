package com.apps.madnotdead.paymentapp.data.remote

/**
 * Created by madnotdead on 6/11/17.
 */

import com.apps.madnotdead.paymentapp.data.model.CardIssuer
import com.apps.madnotdead.paymentapp.data.model.Installment
import com.apps.madnotdead.paymentapp.data.model.PaymentMethod
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable


interface MercadoPagoApi {

    @GET("payment_methods}")
    fun getPaymentMethods(@Query("public_key") publicKey: String) : Observable<List<PaymentMethod>>

    @GET("payment_methods/card_issuers")
    fun getCarIssuers(@Query("public_key") publicKey: String, @Query("payment_method") paymentMethod: String) : Observable<List<CardIssuer>>

    @GET("payment_methods/installments")
    fun getInstallments(@Query("public_key") publicKey: String, @Query("amount") amount: Double, @Query("payment_method") paymentMethod: String, @Query("issuer.id") issuerId: String) : Observable<List<Installment>>

}