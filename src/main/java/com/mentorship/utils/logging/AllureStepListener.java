package com.mentorship.utils.logging;

import io.qameta.allure.listener.StepLifecycleListener;
import io.qameta.allure.model.StepResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllureStepListener implements StepLifecycleListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(AllureStepListener.class);

    public void beforeStepStart(StepResult result) {
        LOGGER.info(result.getName());
    }
}
