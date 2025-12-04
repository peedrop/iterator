package org;

import java.util.Iterator;

public class UsageData {


    public static Integer countNonArchivedProjects(Company company) {
        int count = 0;
        for (Project project : company) {
            if (!project.isArchived()) {
                count++;
            }
        }

        return count;
    }

    public static Integer countAllCompanyProjects(Company company) {
        int count = 0;
        for (Iterator c = company.iterator(); c.hasNext();) {
            count++;
            c.next();
        }

        return count;
    }
}