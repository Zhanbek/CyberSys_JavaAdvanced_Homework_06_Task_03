package model;

import annotations.PermissionAnno;
import annotations.RoleAnno;
import annotations.VersionAnno;

/**
 * Менеджер.
 */
@RoleAnno(name = "Manager", level = 5)
@PermissionAnno("READ")
@PermissionAnno("WRITE")
@PermissionAnno("HIRE")
@PermissionAnno("FIRE")
@PermissionAnno("SIGN")
@PermissionAnno("MANAGE")
@VersionAnno(number = "2.0")
public class Manager extends Employee {
    /**
     * Конструктор.
     */
    public Manager(String name) {
        super(name);
    }
    /**
     * Керувати командою
     */
    public void manage() {
        System.out.println(fullName + " управляет командой");
    }
}
