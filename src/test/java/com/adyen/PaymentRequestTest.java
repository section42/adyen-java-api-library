/**
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2020 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen;

import com.adyen.enums.VatCategory;
import com.adyen.model.checkout.*;
import com.adyen.model.checkout.AfterpayDetails;
import org.junit.Test;

import static com.adyen.Client.LIB_NAME;
import static com.adyen.Client.LIB_VERSION;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PaymentRequestTest extends BaseTest {

    @Test
    public void TestOpenInvoiceRequest() {
        PaymentRequest paymentRequestOpenInvoice = createOpenInvoicePaymentRequest();
        assertEquals("2", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.numberOfLines"));

        assertEquals("EUR", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line1.currencyCode"));
        assertEquals("Test product", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line1.description"));
        assertEquals("9000", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line1.itemAmount"));
        assertEquals("1000", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line1.itemVatAmount"));
        assertEquals("1000", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line1.itemVatPercentage"));
        assertEquals("1", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line1.numberOfItems"));
        assertEquals(VatCategory.NONE.toString(), paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line1.vatCategory"));
        assertEquals("1234", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line1.itemId"));

        assertEquals("EUR", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line2.currencyCode"));
        assertEquals("Test product 2", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line2.description"));
        assertEquals("9000", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line2.itemAmount"));
        assertEquals("1000", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line2.itemVatAmount"));
        assertEquals("1000", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line2.itemVatPercentage"));
        assertEquals("1", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line2.numberOfItems"));
        assertEquals(VatCategory.NONE.toString(), paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line2.vatCategory"));
        assertEquals("4567", paymentRequestOpenInvoice.getAdditionalData().get("openinvoicedata.line2.itemId"));
    }

//    @Test
//    public void TestPaypalEcsRequest() {
//        PaymentRequest paymentRequest = createBasePaymentRequest(new PaymentRequest()).reference("123456").amount(new Amount().currency("EUR").value(2345L)).setPaymentToken("apaymenttoken");
//
//        assertEquals("123456", paymentRequest.getReference());
//        assertEquals(new Long("2345"), paymentRequest.getAmount().getValue());
//        assertEquals("EUR", paymentRequest.getAmount().getCurrency());
//        assertEquals("apaymenttoken", paymentRequest.getAdditionalData().get("payment.token"));
//    }

    @Test
    public void TestDefaultApplicationInfoAdyenLibrary() {
        PaymentRequest paymentRequest = new PaymentRequest();

        assertNotNull(paymentRequest.getApplicationInfo());
        assertNotNull(paymentRequest.getApplicationInfo().getAdyenLibrary());
        assertNotNull(paymentRequest.getApplicationInfo().getAdyenLibrary().getName());
        assertEquals(LIB_NAME, paymentRequest.getApplicationInfo().getAdyenLibrary().getName());
        assertNotNull(paymentRequest.getApplicationInfo().getAdyenLibrary().getVersion());
        assertEquals(LIB_VERSION, paymentRequest.getApplicationInfo().getAdyenLibrary().getVersion());
    }

    @Test
    public void TestCustomApplicationInfoAdyenLibrary() {
        PaymentRequest paymentRequest = new PaymentRequest();
        ExternalPlatform externalPlatform = new ExternalPlatform();
        externalPlatform.setIntegrator("TEST");
        paymentRequest.getApplicationInfo().setExternalPlatform(externalPlatform);

        assertNotNull(paymentRequest.getApplicationInfo());
        assertNotNull(paymentRequest.getApplicationInfo().getAdyenLibrary());
        assertNotNull(paymentRequest.getApplicationInfo().getAdyenLibrary().getName());
        assertEquals(LIB_NAME, paymentRequest.getApplicationInfo().getAdyenLibrary().getName());
        assertNotNull(paymentRequest.getApplicationInfo().getAdyenLibrary().getVersion());
        assertEquals(LIB_VERSION, paymentRequest.getApplicationInfo().getAdyenLibrary().getVersion());
    }

    @Test
    public void TestAfterPayPaymentMethod() {

        PaymentRequest paymentsRequest = createAfterPayPaymentRequest();

        AfterpayDetails paymentMethodDetails =paymentsRequest.getPaymentMethod().getAfterpayDetails();

        assertNotNull(paymentMethodDetails.getPersonalDetails());
        assertEquals(paymentMethodDetails.getPersonalDetails(), "EndToEnd lastName 2000-02-02 +31612345678 SHOPPER@EMAIL_ADDRESS.COM");

        assertNotNull(paymentsRequest.getApplicationInfo());
        assertNotNull(paymentsRequest.getApplicationInfo().getAdyenLibrary());
        assertNotNull(paymentsRequest.getApplicationInfo().getAdyenLibrary().getName());
        assertEquals(LIB_NAME, paymentsRequest.getApplicationInfo().getAdyenLibrary().getName());
        assertNotNull(paymentsRequest.getApplicationInfo().getAdyenLibrary().getVersion());
        assertEquals(LIB_VERSION, paymentsRequest.getApplicationInfo().getAdyenLibrary().getVersion());

    }

    @Test
    public void TestPaymentsRequestForPresenceOfItemURLs() {

        PaymentRequest paymentsRequest = createAfterPayPaymentRequest();

        assertEquals(BaseTest.DUMMY_PROTOCOL_IMAGE_URL, paymentsRequest.getLineItems().get(0).getImageUrl());
        assertEquals(BaseTest.DUMMY_PROTOCOL_PRODUCT_URL, paymentsRequest.getLineItems().get(0).getProductUrl());

    }
}
