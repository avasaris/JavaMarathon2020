package day11;

/*
 * На складе происходит сборка и упаковка интернет-заказа.
 * Создайте классы:
 *
 * “Склад” (англ. Warehouse).
 *      Поля:
 *      countOrder (количество собранных заказов),
 *      balance (доход от доставленных заказов).
 *      Для получения информации о значениях полей склада переопределите метод toString().
 *
 * “Сборщик” (англ. Picker), с полем salary.
 *
 * “Курьер” (англ. Courier), с полем salary.
 *
 * Каждый класс-сотрудник должен реализовывать интерфейс Worker, в котором необходимо объявить
 * методы doWork() и bonus().
 * Каждый раз когда сотрудник выполняет свою работу (вызов метод doWork()), ему выплачивается
 * заработная плата (сокр. ЗП) (80 - сборщику, 100 - курьеру).
 * При вызове doWork() у Сборщика, происходит увеличение значения поля countOrder в классе Warehouse на 1.
 * При вызове doWork() у Курьера, происходит увеличение значения поля balance в классе Warehouse на 1000.
 *
 * Сотрудникам полагается бонус:
 *      Когда на складе отгружено 1500 заказов, заработанная к тому моменту ЗП сборщика утраивается.
 *      Когда складом заработан 1.000.000, заработанная к тому моменту ЗП курьера удваивается.
 *
 * Для демонстрации и тестирования работы программы создайте склад и по 1 рабочему,
 * вызовите у каждого методы doWork() и bonus(), столько раз, чтобы каждый из сотрудников получил бонус.
 * Выведите в консоль баланс и количество выполненных заказов на складе и ЗП каждого из сотрудников.
 *
 * Рекомендации: для получения данных склада внутри классов сотрудников реализуйте хранение ссылки
 *               на объект Warehouse и передавайте ее с помощью конструктора или сеттера.
 */

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Human courier = new Courier(warehouse);
        Human picker = new Picker(warehouse);

        for (int i = 0; i < 2000; i++) {

            if (i % 100 == 0) {
                System.out.println(warehouse);
                System.out.println(courier.getInfo());
                System.out.println(picker.getInfo());
                System.out.println();
            }

            courier.doWork();
            courier.bonus();
            picker.doWork();
            picker.bonus();

        }

        System.out.println(warehouse);
        System.out.println(courier.getInfo());
        System.out.println(picker.getInfo());

    }

}