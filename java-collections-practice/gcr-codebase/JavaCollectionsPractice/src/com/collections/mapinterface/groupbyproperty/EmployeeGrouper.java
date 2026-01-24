package com.collections.mapinterface.groupbyproperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeGrouper {

    public static Map<Department, List<Employee>> groupByDepartment(
            List<Employee> employees) {

        Map<Department, List<Employee>> groupedMap = new HashMap<>();

        for (Employee emp : employees) {
            groupedMap
                    .computeIfAbsent(emp.getDepartment(),
                            k -> new ArrayList<>())
                    .add(emp);
        }

        return groupedMap;
    }
}
