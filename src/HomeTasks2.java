import java.util.Arrays;

public class HomeTasks2 {
    public static void main(String[] args) {
        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        // double increment = 0.01123;
        // double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        double increment = 0.01123;
        double result = 0;
        int iteration = 0;

        for (int i = 0; ; i++) {
            result = result + increment;
            iteration++;
            if (result > 1_000_000) {
                System.out.println(String.format("Iteration count is: %d", iteration));
                break;
            }

        }

        //---------------------------------------------------------------------------------

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int[] array = {1, 1, 1, 1, 1, 1};
        for (int i = 0 ; i < array.length;i++ ) {

            if (i % 2 == 0) {
                array[i] = 0;
            }
            }
        System.out.println(Arrays.toString(array));

    //--------------------------------------------------------------------------
    // Задание №3:
    // Дано:
    boolean hasFuel = true;
    boolean hasElectricsProblem = false;
    boolean hasMotorProblem = false;
    boolean hasTransmissionProblem = true;
    boolean hasWheelsProblem = true;
    // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
    // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
    // Если у машины проблема с двигателем, то чинят и берут 10 000.
    // Если у машины проблема с электрикой, то чинят и берут 5000.
    // Если у машины проблема с коробкой передач, то чинят и берут 4000.
    // Если у машины проблема с колесами, то чинят и берут 2000.
    // Если две детали сломаны, то на общий счет идет скидка 10%.
    // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
    // Если нет бензина и что-то сломано, то за консультацию денег не берут.
    // Ситуации, что бензин есть и ничего не сломано - быть не может.
    // Ожидаемый результат: выведен на экран счет клиенту.
    double price = 0;
    if ( hasFuel == false & hasElectricsProblem == false & hasMotorProblem == false & hasTransmissionProblem == false & hasWheelsProblem == false) {
        price = price + 1000;
    }
     if (hasMotorProblem == true ) {
        price = price + 10000;
    }
     if (hasElectricsProblem == true) {
        price = price + 5000;
    }
     if (hasTransmissionProblem == true) {
        price = price + 4000;
    }
     if (hasWheelsProblem == true) {
        price = price + 2000;
    }
     if (hasElectricsProblem == true && hasMotorProblem == true ||
            hasElectricsProblem == true &&  hasTransmissionProblem == true ||
            hasElectricsProblem == true && hasTransmissionProblem == true ||
            hasElectricsProblem == true && hasWheelsProblem == true ||
                hasMotorProblem == true && hasTransmissionProblem == true ||
            hasMotorProblem == true &&  hasWheelsProblem ||
            hasTransmissionProblem == true && hasWheelsProblem == true) {
        price = price - price * 0.1;

    }
     if (hasTransmissionProblem == true && hasElectricsProblem == true || hasMotorProblem == true ) {
        price = price - price * 0.2;
    }
    System.out.println(" Total price is : " + (int)price);


        //-----------------------------------------------

        Workers vasya = new Workers ("Vasilii", 18) ;
        Workers anton = new Workers ("Anton", 19);
        Workers anya = new Workers ("Anya", 21);
        anya.goToWork();
        vasya.goToWork();
        anton.goToWork();
        vasya.grabVodka();
        anya.grabVodka();
        anton.grabVodka();
        anton.grabVodka();
        System.out.println(anton.getName()+ " Сколько ты бутылок разбил, а ? " + anton.howManyVodkaisBroken());
        System.out.println(vasya.getName() + " Ты пьян ? " + vasya.getAreYouDrunk());
        System.out.println(Storage.getAmountOfVodka());
    }


    }




