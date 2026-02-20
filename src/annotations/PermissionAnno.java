package annotations;

import java.lang.annotation.*;

/**
 * Дозвіл співробітника.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(PermissionsArrayAnno.class)
public @interface PermissionAnno {
    /**
     * Назва дозволу.
     */
    String value();
}
