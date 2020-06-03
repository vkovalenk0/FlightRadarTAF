package com.epam.mentorship.utils.guice;

import com.google.common.reflect.ClassPath;
import com.google.inject.AbstractModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DependenciesModule extends AbstractModule {

    private static final Logger LOG = LoggerFactory.getLogger(DependenciesModule.class);

    @Override
    protected void configure() {
        getClassesForPackages("com.epam.mentorship.action", "com.epam.mentorship.assertion",
                "com.epam.mentorship.page")
                .forEach(el -> bind(el.load()));
    }

    private Set<ClassPath.ClassInfo> getClassesForPackages(String... packages) {
        return Stream.of(packages).flatMap(p -> {
            try {
                return ClassPath.from(getClass().getClassLoader()).getTopLevelClassesRecursive(p).stream();
            } catch (IOException e) {
                LOG.error("Error occurred while processing classes", e);
                throw new IllegalStateException("Unable to load classes");
            }
        }).collect(Collectors.toSet());
    }
}
