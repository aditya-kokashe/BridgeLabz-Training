
package com.annotations.suppressunchecked;

import java.util.ArrayList;

public class UncheckedExample {

    @SuppressWarnings("unchecked")
    public ArrayList createList() {

        ArrayList list = new ArrayList(); // Raw type
        list.add("Java");
        list.add(100);
        list.add(true);

        return list;
    }
}
