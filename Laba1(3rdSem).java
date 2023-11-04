
public class Laba1 {
    public static void var5() { // В русском тексте каждую букву заменить ее номером в алфавите. В одной строке печатать текст с двумя пробелами между буквами, в следующей строке внизу под каждой буквой печатать ее номер.

        StringBuilder text = new StringBuilder("stroka на провerку");
        StringBuilder result = new StringBuilder();
        StringBuilder newText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isLetter(letter) && Character.UnicodeBlock.CYRILLIC.equals(Character.UnicodeBlock.of(letter))) {
                int number = Character.toLowerCase(letter) - 'а' + 1;
                newText.append(letter).append("    ");
                result.append(number).append("   ");
            }
        }
        newText.append("\n").append(result);
        System.out.println(newText.toString());
    }



    public static void main(String[] args) {

        var5();

    }
}