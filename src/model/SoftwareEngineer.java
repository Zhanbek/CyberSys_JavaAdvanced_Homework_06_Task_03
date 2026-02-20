package model;

import annotations.PermissionAnno;
import annotations.RoleAnno;
import annotations.VersionAnno;

/**
 * Розробник.
 */
@RoleAnno(name = "Coder", level = 3)
@PermissionAnno("WRITE")
@PermissionAnno("COMMIT")
@VersionAnno(number = "1.1")
public class SoftwareEngineer extends Employee {
    /**
     * Конструктор.
     */
    public SoftwareEngineer(String name) {
        super(name);
    }
    /**
     * Пише код
     */
    public void writeCode() {
        System.out.println(fullName + " пише код");
    }
}