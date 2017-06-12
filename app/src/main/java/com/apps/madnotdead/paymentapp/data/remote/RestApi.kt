package com.apps.madnotdead.paymentapp.data.remote

import com.apps.madnotdead.paymentapp.data.model.PaymentMethod
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.*

/**
 * Created by madnotdead on 6/11/17.
 */
class RestApi {

    private val mercadoPagoApi: MercadoPagoApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.mercadopago.com/v1/")
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()

        mercadoPagoApi = retrofit.create(MercadoPagoApi::class.java)
    }


    fun getPaymentMethods(publicKey: String) = mercadoPagoApi.getPaymentMethods(publicKey)

    fun getCarIssuers(publicKey: String,  paymentMethod: String) = mercadoPagoApi.getCarIssuers(publicKey, paymentMethod)

    fun getInstallments(publicKey: String, amount: Double,paymentMethod: String,issuerId: String) = mercadoPagoApi.getInstallments(publicKey, amount, paymentMethod, issuerId)

}