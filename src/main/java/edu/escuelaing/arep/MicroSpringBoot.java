package edu.escuelaing.arep;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MicroSpringBoot {

    public static void main(String[] args) throws  Exception{
        HttpServer server=new HttpServer();
        server.staticFilesLocation("/static");
        server.start();
        for (Method m : Class.forName(args[0]).getMethods()) {
            if (m.isAnnotationPresent(RequestMapping.class)) {
                RequestMapping annotation=m.getAnnotation(RequestMapping.class);
                String path =annotation.value();
                HttpMethodPublisher.get(path,((request, response) -> {
                    try {
                        return m.invoke(null).toString();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    return "";
                }));

            }
        }

    }
}
