package com.insp.cloudtest.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MapUtil {


    // 使用  Introspector 内省 进行转换


    /**
     * map 转换为 实体对象
     *
     * @param map
     * @param beanClass
     * @return
     * @throws Exception
     */
    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (map == null) {
            return null;
        }
        Object obj = beanClass.newInstance();
        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor property : propertyDescriptors) {
            Method setter = property.getWriteMethod();
            if (setter != null) {
                setter.invoke(obj, map.get(property.getName()));
            }
        }
        return obj;
    }

    /**
     * 实体类 转化为 map
     *
     * @param obj
     * @return
     * @throws Exception
     */
    public static Map<String, Object> objectToMap(Object obj) throws Exception {
        if (obj == null)
            return null;
        Map<String, Object> map = new HashMap<String, Object>();
        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor property : propertyDescriptors) {
            String key = property.getName();
            if (key.compareToIgnoreCase("class") == 0) {
                continue;
            }
            Method getter = property.getReadMethod();
            Object value = getter != null ? getter.invoke(obj) : null;
            map.put(key, value);
        }

        return map;
    }


    //  使用 reflect 反射 进行转换
//    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
//        if (map == null)
//            return null;
//        Object obj = beanClass.newInstance();
//        Field[] fields = obj.getClass().getDeclaredFields();
//        for (Field field : fields) {
//            int mod = field.getModifiers();
//            if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
//                continue;
//            }
//            field.setAccessible(true);
//            field.set(obj, map.get(field.getName()));
//        }
//        return obj;
//    }
//
//    public static Map<String, Object> objectToMap(Object obj) throws Exception {
//        if (obj == null) {
//            return null;
//        }
//        Map<String, Object> map = new HashMap<String, Object>();
//        Field[] declaredFields = obj.getClass().getDeclaredFields();
//        for (Field field : declaredFields) {
//            field.setAccessible(true);
//            map.put(field.getName(), field.get(obj));
//        }
//
//        return map;
//    }

}
