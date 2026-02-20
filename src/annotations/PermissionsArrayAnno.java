package annotations;

import java.lang.annotation.*;

/**
 * Контейнер повноважень
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PermissionsArrayAnno {
    PermissionAnno[] value();
}
