package annotations;

import java.lang.annotation.*;

/**
 * Анотація ролі співробітника.
 * Успадковується дочірніми класами.
 */
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RoleAnno {
    /**
     * Назва
     */
    String name();

    int level() default 1;
}
