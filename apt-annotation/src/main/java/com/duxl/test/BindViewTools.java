package com.duxl.test;

import java.lang.reflect.Method;

public class BindViewTools {

    public static void bind(Object activity) {
        try {
            Class bindViewClass = Class.forName(activity.getClass().getName() + "_ViewBinding");
            Method method = bindViewClass.getMethod("bind", activity.getClass());
            method.invoke(bindViewClass.newInstance(), activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
