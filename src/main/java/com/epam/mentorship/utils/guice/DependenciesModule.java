package com.epam.mentorship.utils.guice;

import com.google.common.reflect.ClassPath;
import com.google.inject.AbstractModule;

import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DependenciesModule extends AbstractModule {

    @Override
    protected void configure() {
        getClassesForPackages("com.epam.mentorship.action", "com.epam.mentorship.assertion",
                "com.epam.mentorship.model", "com.epam.mentorship.page")
                .forEach(el -> bind(el.load()));
    }

    private Set<ClassPath.ClassInfo> getClassesForPackages(String... packages) {
        return Stream.of(packages).flatMap(p -> {
            try {
                return ClassPath.from(getClass().getClassLoader()).getTopLevelClassesRecursive(p).stream();
            } catch (IOException e) {
                // TODO add LOG here and throw exception
                e.printStackTrace();
                return null;
            }
        }).collect(Collectors.toSet());
    }
}
