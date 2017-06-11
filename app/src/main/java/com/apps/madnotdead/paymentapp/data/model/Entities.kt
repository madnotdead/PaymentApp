package com.apps.madnotdead.paymentapp.data.model

/**
 * Created by madnotdead on 6/11/17.
 */
data class PaymentMethod(val id: String, val name: String, val thumbnailUrl:String)

data class CardIssuer(val id: Int, val name: String, val secureThumbnailUrl: String, val thumbnailUrl: String, val processMode: String, val mercantAccountId: String)

data class PayerCost(val installments: Int, val instalmentRate: Int, val discountRate: Int, val labels: Array<String>, val installmentRateCollector: Array<String>,
                val minAllowedAmount: Int, val maxAllowedAmount: Int, val recommendedMessage: String, val installmentAmount: Int, val totalAmount: Int)

data class Installment(val paymentMethodId: String, val paymentMethodType: String, val issuer:CardIssuer, val processingMode: String,val merchantAccountId: String, val payerCost: List<PayerCost>)
