package model;

import annotations.PermissionAnno;
import annotations.RoleAnno;
import annotations.VersionAnno;

/**
 * Базовий клас працівника.
 */
@RoleAnno(name = "", level = 1)
@PermissionAnno("READ")
@VersionAnno(number = "1.0")
public class Employee {
    /**
     * Повно ім'я співробітника.
     */
    protected String fullName;

    /**
     * Конструктор.
     */
    public Employee(String name) {
        fullName = name;
    }

    /**
     * Отримати ім'я.
     */
    public String getName() {
        return fullName;
    }
}
