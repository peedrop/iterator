package org;

public class Project {
    private String name;
    private boolean archived;

    public Project(String name, boolean archived) {
        this.name = name;
        this.archived = archived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }
}