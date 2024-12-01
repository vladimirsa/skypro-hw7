public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int monthlySavings = 15000;
        int totalSavings = 0;
        int month = 1;

        while (totalSavings <= 2_459_000 ) {
            totalSavings = totalSavings + monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
            month++;
        }

        System.out.println("Задание 2");

        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int x = 10; x >= 1; x-- ) {
            System.out.print(x + " ");
        }

        System.out.println();

        System.out.println("Задание 3");

        int cityPeopleTotal = 12_000_000;
        int birthRate = (cityPeopleTotal / 1000) * 17;
        int mortalityRate = (cityPeopleTotal / 1000) * 8;

        for (int year = 1; year <= 10; year++) {
            cityPeopleTotal = cityPeopleTotal + birthRate - mortalityRate;
            System.out.println("Год " + year + ", численность населения составляет " + cityPeopleTotal);
        }

        System.out.println("Задание 4");

        totalSavings = 15000;
        int targetAmount = 12_000_000;
        double bankRate = 0.07;
        int months = 0;

        while (totalSavings < targetAmount) {
            totalSavings += totalSavings * bankRate;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        System.out.println("Василию потребуется " + months + " месяцев, чтобы накопить " + targetAmount + " рублей.");

        System.out.println("Задание 5");

        totalSavings = 15000;
        targetAmount = 12_000_000;
        bankRate = 0.07;
        months = 0;

        while (totalSavings < targetAmount) {
            totalSavings += totalSavings * bankRate;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSavings + " рублей");
            }
        }
        System.out.println("Василию потребуется " + months + " месяцев, чтобы накопить " + targetAmount + " рублей.");

        System.out.println("Задание 6");

        totalSavings = 15000;
        bankRate = 0.07;
        months = 0;

        while (months <= 108) {
            totalSavings += totalSavings * bankRate;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSavings + " рублей");
            }
        }

        System.out.println("Задание 7");

        int firstFriday = 3;
        int daysInMonth = 31;

        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задание 8");

        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometPeriod = 79;

        for (int year = startYear; year <= endYear; year++) {
            if (year % cometPeriod == 0) {
                System.out.println(year);
            }
        }
    }
}
