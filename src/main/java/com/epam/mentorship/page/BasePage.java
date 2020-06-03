package com.epam.mentorship.page;

import com.epam.mentorship.page.widget.HeaderWidget;
import com.google.inject.Inject;

public class BasePage {

    @Inject
    private HeaderWidget headerWidget;

    public HeaderWidget getHeaderWidget() {
        return headerWidget;
    }
}
