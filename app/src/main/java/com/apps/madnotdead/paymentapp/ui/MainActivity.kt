package com.apps.madnotdead.paymentapp.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.apps.madnotdead.paymentapp.R
import com.apps.madnotdead.paymentapp.data.remote.RestApi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var api = RestApi()

        var paymentMethodsList = api.getPaymentMethods("444a9ef5-8a6b-429f-abdf-587639155d88")

    }
}
