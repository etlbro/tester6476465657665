// 207837824 Itiel Brody
/**
 * @author itiel brody
 * @version 1.0
 * @since 02/01/2024
 * TEEEEEEEEEEEEESSSSSSSSSSSSSSTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
 */

public class Factorial {

    /**
     * A program that calculates the factorial of a given number with two different methods and shows their results.
     *
     * @param args from command line, this is the number who's factorial we will find.
     */

        public static void main(String[] args) {
            // convert the string to int
            int number = Integer.parseInt(args[0]);
            System.out.println("recursive: " + recursiveFactorialFinder(number));
            System.out.println("iterative: " + factorialIter(number));
        }

    /**
     * a methode to calculate the factorial with some good old fashion recursion.
     *
     * @param userNum the number we are calculating.
     * @return the final factorial result.
     */
        private static long recursiveFactorialFinder(int userNum) {
            if (userNum == 0 || userNum == 1) {
                return 1;
            }
            return recursiveFactorialFinder(userNum - 1) * userNum;
        }

    /**
     * a methode to calculate the factorial using a regular loop.
     *
     * @param userNum the number we are calculating.
     * @return the final factorial result.
     */
        private static long factorialIter(int userNum) {
            int finalSum = 1, iterator = 1;
            if (userNum == 0) {
                return userNum;
            }
            while (iterator <= userNum) {
                finalSum *= iterator;
                iterator++;
            }
            return finalSum;
        }

    }

