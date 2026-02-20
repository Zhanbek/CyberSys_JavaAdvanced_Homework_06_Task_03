package model;

import annotations.PermissionAnno;
import annotations.RoleAnno;
import annotations.VersionAnno;

@RoleAnno(name = "Creator", level = 3)
@PermissionAnno("WRITE")
@PermissionAnno("COMMIT")
@VersionAnno(number = "1.1")
public class Designer extends Employee {

    public Designer(String name) {
        super(name);
    }

    /**
     * Проектувати користувальницький інтерфейс
     */
    public void designUI() {
        System.out.println(fullName + " пише код");
    }
}
