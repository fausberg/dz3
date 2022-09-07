import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int n = scanner.nextInt();
        System.out.println("Введите число на чётность нечетность");
        int c = scanner.nextInt();
        System.out.println("Введите t");
        int t = scanner.nextInt();
        System.out.println("Введите номер цвета радуги");
        int k = scanner.nextInt();
        System.out.println("Введите число для 8 задания");
        int chislo = scanner.nextInt();
        System.out.println("Введите сумму вклада");
        float sum = scanner.nextFloat();
        System.out.println("Введите количество месяцев");
        int num = scanner.nextInt();
        Task_1(n);
        Task_2(n);
        Task_3(c);
        Task_4(t);
        Task_5(k);
        Task_6();
        Task_7();
        Task_8(chislo);
        Task_9();
        Task_10();
        Task_11();
        Task_12();
        Task_13(sum, num);
        Task_14();
    }

    public static void Task_1(int n) {
        switch (n) {
            case 1: {
                System.out.println("Фувраль");
                break;
            }
            case 2: {
                System.out.println("Март");
                break;
            }
            case 3: {
                System.out.println("Апрель");
                break;
            }
            case 4: {
                System.out.println("Май");
                break;
            }
            case 5: {
                System.out.println("Июнь");
                break;
            }
            case 6: {
                System.out.println("Июль");
                break;
            }
            case 7: {
                System.out.println("Август");
                break;
            }
            case 8: {
                System.out.println("Сентбрь");
                break;
            }
            case 9: {
                System.out.println("Октябрь");
                break;
            }
            case 10: {
                System.out.println("Ноябрь");
                break;
            }
            case 11: {
                System.out.println("Декабрь");
                break;
            }
            case 12: {
                System.out.println("Январь");
                break;
            }
        }
        System.out.println();
    }

    public static void Task_2(int n) {
        if (n == 1) {
            System.out.println("Февраль");
        } else if (n == 2) {
            System.out.println("Март");
        } else if (n == 3) {
            System.out.println("Апрель");
        } else if (n == 4) {
            System.out.println("Май");
        } else if (n == 5) {
            System.out.println("Июнь");
        } else if (n == 6) {
            System.out.println("Июль");
        } else if (n == 7) {
            System.out.println("Август");
        } else if (n == 8) {
            System.out.println("Сентябрь");
        } else if (n == 9) {
            System.out.println("Октябрь");
        } else if (n == 10) {
            System.out.println("Ноябрь");
        } else if (n == 11) {
            System.out.println("Декабрь");
        } else if (n == 12) {
            System.out.println("Январь");
        }
        System.out.println();
    }

    public static void Task_3(int n) {
        if (n % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
        System.out.println();
    }

    public static void Task_4(int t) {
        if (t > -5) {
            System.out.println("Тепло");
        } else if (-5 >= t && t > -20) {
            System.out.println("Нормально");
        } else if (t < -20) {
            System.out.println("Холодно");
        }
        System.out.println();
    }

    public static void Task_5(int n) {
        switch (n) {
            case 1: {
                System.out.println("Красный");
                break;
            }
            case 2: {
                System.out.println("Оранжевый");
                break;
            }
            case 3: {
                System.out.println("Желтый");
                break;
            }
            case 4: {
                System.out.println("Зелёный");
                break;
            }
            case 5: {
                System.out.println("Синий");
                break;
            }
            case 6: {
                System.out.println("Голубой");
                break;
            }
            case 7: {
                System.out.println("Фиолетовый");
                break;
            }
        }
        System.out.println();
    }

    public static void Task_6() {
        int n = 100;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void Task_7() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void Task_8(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();
    }

    public static void Task_9() {
        int n = 7;
        int rezerve = n;
        int chislo = 1;
        int pum = 0;
        while (pum < 100) {
            pum = rezerve;
            if (pum > 100) {
                break;
            }
            System.out.println(pum);
            rezerve = n * chislo;
            chislo++;
        }
        System.out.println();
    }

    public static void Task_10() {
        int schet = 1;
        int n = 0;
        while (schet < 11) {
            System.out.println(n);
            n -= 5;
            schet++;
        }
        System.out.println();
    }

    public static void Task_11() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i * i);
        }
        System.out.println();
    }

    public static void Task_12() {
        int pum = 1;
        int d = 1;
        int zap = 0;
        for(int i = 1; i <= 11; i++){
            if(i == 1){
                System.out.println(pum);
            }else if(i == 2){
                System.out.println(pum);
            }else{
                zap = pum;
                pum+=d;
                if(pum >= 3){
                    d =zap;
                }
                System.out.println(pum);
            }
        }
        System.out.println();
    }

    public static void Task_13(float sum, int num){
        for(int i = 0; i < num; i++){
            sum = sum + sum/100*7;
        }
        System.out.println(sum);
        System.out.println();
    }

    public static void Task_14(){
        for(int i = 1; i <= 10; i++){
            for(int g = 1; g <= 10; g++){
                System.out.print(i*g + " ");
            }
            System.out.println();
        }
    }
}