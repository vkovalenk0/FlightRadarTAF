package com.epam.mentorship;

import com.epam.mentorship.utils.guice.DependenciesModule;
import org.testng.annotations.Guice;

@Guice(modules = DependenciesModule.class)
public class BaseTest {
}
