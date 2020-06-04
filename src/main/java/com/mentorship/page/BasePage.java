package com.mentorship.page;

import com.mentorship.page.widget.HeaderWidget;
import com.google.inject.Inject;

public class BasePage {

    @Inject
    private HeaderWidget headerWidget;

    public HeaderWidget getHeaderWidget() {
        return headerWidget;
    }
}
