package org.example;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface JSONSerializable {
    String directory() default "src/main/myfiles/myfile.json";
}
