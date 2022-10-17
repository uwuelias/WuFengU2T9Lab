public class LuckyNumbers
{
    public LuckyNumbers() {
    }
    public int randomIntegerBetween(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public String getLuckyNumbers() {
        int ball1 = randomIntegerBetween(1, 65);
        int ball2 = randomIntegerBetween(1, 65);
        int ball3 = randomIntegerBetween(1, 65);
        int ball4 = randomIntegerBetween(1, 65);
        int ball5 = randomIntegerBetween(1, 65);
        int superball = randomIntegerBetween(1, 30);
        return "Your lucky numbers are: " + ball1 + " " + ball2 + " " + ball3+ " " + ball4 + " " + ball5 + "\nThe super ball is: " + superball;
    }
}
