package annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface VersionAnno {
    /**
     * Версія.
     */
    String number() default "0";
}
