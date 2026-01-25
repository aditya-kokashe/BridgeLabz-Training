
package com.annotations.roleallowed;

import java.lang.reflect.Method;

public class RoleAllowedMain {

    public static void main(String[] args) throws Exception {

        String currentUserRole = "USER"; // Change to ADMIN to allow access

        AdminService service = new AdminService();
        Method method = service.getClass().getMethod("deleteUser");

        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

            if (currentUserRole.equals(roleAllowed.value())) {
                method.invoke(service);
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}
