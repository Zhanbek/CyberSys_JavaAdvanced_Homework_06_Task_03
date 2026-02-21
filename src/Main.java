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
        printInfo(designer);
        printInfo(manager);
    }

    /**
     * Виведення інформації через reflection.
     */
    public static void printInfo(Employee emp) {
        Class<?> clazz = emp.getClass();

        System.out.println();
        System.out.println("Клас: " + clazz.getSimpleName());
        System.out.println();

        // RoleAnno (Inherited)
        if (clazz.isAnnotationPresent(RoleAnno.class)) {
            System.out.println("Роль: ");
            System.out.println("--------------");
            RoleAnno role =
                    clazz.getAnnotation(RoleAnno.class);

            System.out.println("Назва: " + role.name());
            System.out.println("Рівень: " + role.level());
            System.out.println("--------------");
        }
        System.out.println();

        // VersionAnno
        if (clazz.isAnnotationPresent(VersionAnno.class)) {

            VersionAnno version =
                    clazz.getAnnotation(VersionAnno.class);

            System.out.println("Версія: " + version.number());
        }
        System.out.println();

        // PermissionsArrayAnno (Repeatable)
        PermissionAnno[] permissions =
                clazz.getAnnotationsByType(PermissionAnno.class);

        System.out.println("Дозвіл: ");
        System.out.println("--------------");
        for (PermissionAnno p : permissions) {
            System.out.println("- " + p.value());
        }
        System.out.println("--------------");
        System.out.println();

    }
}