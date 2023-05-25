package chinese.zodiac;

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String chineseZodiac = "";
        System.out.print("Enter the year you were born: ");
        int year = scan.nextInt();
        year %= 12;
        
        switch (year) {
            case 0:
                chineseZodiac = "Monkey";
                break;
            case 1:
                chineseZodiac = "Rooster";
                break;
            case 2:
                chineseZodiac = "Dog";
                break;
            case 3:
                chineseZodiac = "Pig";
                break;
            case 4:
                chineseZodiac = "Mice";
                break;
            case 5:
                chineseZodiac = "Ox";
                break;
            case 6:
                chineseZodiac = "Tiger";
                break;
            case 7:
                chineseZodiac = "Rabbit";
                break;
            case 8:
                chineseZodiac = "Dragon";
                break;
            case 9:
                chineseZodiac = "Snake";
                break;
            case 10:
                chineseZodiac = "Horse";
                break;
            case 11:
                chineseZodiac = "Sheep";
                break;

        }
        
        System.out.printf("Your Chinese Zodiac sign is: %s ",chineseZodiac);
    }

}
