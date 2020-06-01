package com.epam.mentorship.page;

import com.epam.mentorship.page.widget.HeaderWidget;

public class BasePage {

    private final HeaderWidget headerWidget = new HeaderWidget();

    public HeaderWidget getHeaderWidget() {
        return headerWidget;
    }
}
