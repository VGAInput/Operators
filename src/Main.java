public class Main {

    public static void main(String[] args) {

            //// Домашние задания "Условный оператор ч.1" - от 1 до 6 ////

            homeWork1(9);
            homeWork1(19);
            System.out.println();

            homeWork2(7);
            homeWork2(19);
            homeWork2(25);
            System.out.println();

            homeWork3(162);
            homeWork3(90);
            homeWork3(41);
            System.out.println();

            homeWork4(6);
            homeWork4(10);
            homeWork4(19);
            homeWork4(25);
            System.out.println();

            homeWork5(2, false);
            homeWork5(6, false);
            homeWork5(6, true);
            homeWork5(15, false);
            System.out.println();

            homeWork6(1, 2, 3);
            homeWork6(4, 2, 1);
            homeWork6(5, 6000, 150);
            System.out.println();

        }

        private static void homeWork1 ( int inputUserAge){
            int userAge = inputUserAge;

            if (userAge >= 18) {
                System.out.println("Поздравляем с совершеннолетием!");
            } else System.out.println("Вы ещё не достигли совершеннолетия, надо подождать.");
        }

        private static void homeWork2 ( int inputUserAge){
            int userAge = inputUserAge;

            if (userAge >= 7 && userAge < 18) {
                System.out.println("Пользователь ходит в школу.");
            } else if (userAge >= 18 && userAge < 24) {
                System.out.println("Пользователь закончил школу и идёт в университет.");
            } else if (userAge >= 24) {
                System.out.println("Пользователь закончил университет и ищет первую работу.");
            }

        }

        private static void homeWork3 ( int passengers){

            int trainTotalCapacity = 102;
            int trainSittingPlaces = 60;
            int trainStandingPositions = trainTotalCapacity - trainSittingPlaces;

            if (passengers < trainSittingPlaces) {
                System.out.println("В вагоне есть свободное сиденье.");
            } else if (passengers >= trainSittingPlaces && passengers < trainTotalCapacity) {
                System.out.println("В вагоне нет свободных сидений, но место ещё есть.");
            } else if (passengers >= trainTotalCapacity) {
                System.out.println("В вагоне места не осталось.");
            }
        }

        private static void homeWork4 ( int userAge){

            if (userAge >= 2 && userAge <= 6) {
                System.out.println("Если возраст человека равен " + userAge + ", то ему нужно ходить в детский сад.");
            } else if (userAge >= 7 && userAge <= 18) {
                System.out.println("Если возраст человека равен " + userAge + ", то ему нужно ходить в школу.");
            } else if (userAge >= 18 && userAge < 24) {
                System.out.println("Если возраст человека равен " + userAge + ", то ему нужно идти в университет.");
            } else if (userAge >= 24) {
                System.out.println("Если возраст человека равен " + userAge + ", то ему нужно идти на работу.");
            }

        }

        private static void homeWork5 ( int userAge, boolean withParents){

            if (userAge < 5) {
                System.out.println("Ребёнку кататься нельзя.");
            } else if (userAge >= 5 && userAge <= 14) {
                if (withParents)
                    System.out.println("Ребёнку можно кататься с родителями.");
                else
                    System.out.println("Ребёнку без родителей кататься нельзя.");
            } else if (userAge > 14) {
                System.out.println("Ребёнку можно кататься одному.");
            }

        }

        private static void homeWork6 ( int inputOne, int inputTwo, int inputThree){
            int one = inputOne;
            int two = inputTwo;
            int three = inputThree;

            if (one >= two && one >= three) {
                System.out.println(one + " - самое большое число");
            } else if (two >= one && two >= three) {
                System.out.println(two + " - самое большое число");
            } else if (three >= one && three >= two) {
                System.out.println(three + " - самое большое число");
            }
        }

}