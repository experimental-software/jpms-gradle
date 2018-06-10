package com.experimental;

import com.experimental.billing.api.BillingService;
import com.experimental.erp.sales.api.SalesService;
import com.experimental.test.SayingHello;
import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

@WicketHomePage
public class HomePage extends WebPage
{
    private static final long serialVersionUID = 1L;

    @SpringBean
    private SayingHello sayingHello;

    @SpringBean
    private SalesService salesService;

    @SpringBean
    private BillingService billingService;

    public HomePage(final PageParameters parameters)
    {
        super(parameters);

        add(new Label("hello", sayingHello.greet("Worlds!!")));
        add(new Label("helloFromSales", String.valueOf(salesService.sellSomething("something"))));
        add(new Label("helloFromBilling", String.valueOf(billingService.generateInvoice())));
    }
}
