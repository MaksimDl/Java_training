package seminar3_homework;

// Ввиду отсутствия созраненного семинара (на самом семинаре не было возможности присутствовать)
//  а также загрузки на основной работе (более 84 часов в неделю)
//  а также, что основным направлением, все же, хочу использовать Python, на который и поступал
// я скопировал работу и построчно разобрался с реализацией, на большее, к сожалению, времени не хватило.
//  приходится расставлять приоритеты 
// надеюсь на понимание =)

public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentGroupService service = new StudentGroupService(repository);
        StudentController controller = new StudentController(service);

        System.out.println("\nСписок без сортировки:");
        controller.addStudent(new Student(4L, "Иван Федоров"));
        controller.addStudent(new Student(6L, "Полина Иванова"));
        controller.addStudent(new Student(2L, "Феофан Сидоров"));
        controller.addStudent(new Student(1L, "Терентий Попов"));
        controller.addStudent(new Student(8L, "Евлампия Субботина"));
        controller.printAll();

        System.out.println("\nСортировка по имени:");
        controller.sortByFirstName();
        controller.printAll();

        System.out.println("\nСортировка по фамилии:");
        controller.sortByLastName();
        controller.printAll();

    }
}
