import annotations.PermissionAnno;
import annotations.RoleAnno;
import annotations.VersionAnno;
import model.Designer;
import model.Employee;
import model.Manager;
import model.SoftwareEngineer;

/**
 * Главный класс.
 */
public class Main {

    public static void main(String[] args) {

        SoftwareEngineer engineer = new SoftwareEngineer("Snoop");
        Designer designer = new Designer("George");
        Manager manager = new Manager("Bob");

        printInfo(engineer);
        System.out.println("----------------");
        printInfo(designer);
        System.out.println("----------------");
        printInfo(manager);
    }

    /**
     * Вывод информации через reflection.
     */
    public static void printInfo(Employee emp) {

        Class<?> clazz = emp.getClass();

        System.out.println();
        System.out.println("Class: " + clazz.getSimpleName());

        // RoleAnno (Inherited)
        if (clazz.isAnnotationPresent(RoleAnno.class)) {

            RoleAnno role =
                    clazz.getAnnotation(RoleAnno.class);

            System.out.println("Role: " + role.name());
            System.out.println("Level: " + role.level());
        }

        // Version
        if (clazz.isAnnotationPresent(VersionAnno.class)) {

            VersionAnno version =
                    clazz.getAnnotation(VersionAnno.class);

            System.out.println("Version: " + version.number());
        }

        // Permissions (Repeatable)
        PermissionAnno[] permissions =
                clazz.getAnnotationsByType(PermissionAnno.class);

        System.out.println("Permissions:");

        for (PermissionAnno p : permissions) {
            System.out.println("- " + p.value());
        }
    }
}