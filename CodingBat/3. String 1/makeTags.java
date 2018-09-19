/******************************************************************

The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"

*******************************************************************/

import java.util.Scanner;
public class makeTags {
  public static String makeTags(String tag, String word) {
    return "<" + tag + ">" + word +  "</" + tag + ">";
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("The web is built with HTML strings like '<i>Yay</i>' which draws Yay as italic text. In this example, the 'i' tag makes <i> and </i> which surround the word 'Yay'. Given tag and word strings, create the HTML string with tags around the word, e.g. '<i>Yay</i>'.");
    System.out.println("");
    System.out.println("Enter a tag: ");
    String str1 = input.nextLine();
    System.out.println("Enter a word: ");
    String str2 = input.nextLine();

    System.out.println(makeTags(str1, str2));
  }
}
