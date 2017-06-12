package com.apps.madnotdead.paymentapp.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.apps.madnotdead.paymentapp.R
import com.apps.madnotdead.paymentapp.data.model.PaymentMethod
import com.apps.madnotdead.paymentapp.data.remote.RestApi
import rx.Observable
import rx.Scheduler
import rx.android.schedulers.AndroidSchedulers
import rx.functions.Action1
import rx.schedulers.Schedulers
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var api = RestApi()

        var paymentMethodsList = api.getPaymentMethods("444a9ef5-8a6b-429f-abdf-587639155d88")



        api.getPaymentMethods("444a9ef5-8a6b-429f-abdf-587639155d88")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(onNext {

                })


    }
}
