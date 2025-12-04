package org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<Project> {
    private List<Project> projects = new ArrayList<>();

    public Company(Project... projects) {
        this.projects = Arrays.asList(projects);
    }

    @Override
    public Iterator<Project> iterator() {
        return projects.iterator();
    }
}