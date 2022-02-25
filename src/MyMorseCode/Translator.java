package MyMorseCode;

import java.util.*;

public class Translator {
    public static void main(String[] args) {
    }

    public Map MyHashMap() {
        Map<String, String> Morse = new HashMap<>();

        Morse.put("A", "*_");
        Morse.put("*_", "A");

        Morse.put("B", "_***");
        Morse.put("_***", "B");

        Morse.put("C", "_*_*");
        Morse.put("_*_*", "C");

        Morse.put("D", "_**");
        Morse.put("_**", "D");

        Morse.put("E", "*");
        Morse.put("*", "E");

        Morse.put("F", "**_*");
        Morse.put("**_*", "F");

        Morse.put("G", "__*");
        Morse.put("__*", "G");

        Morse.put("H", "****");
        Morse.put("****", "H");

        Morse.put("I", "**");
        Morse.put("**", "I");

        Morse.put("J", "*___");
        Morse.put("*___", "J");

        Morse.put("K", "_*_");
        Morse.put("_*_", "K");

        Morse.put("L", "*_**");
        Morse.put("*_**", "L");

        Morse.put("M", "__");
        Morse.put("__", "M");

        Morse.put("N", "_*");
        Morse.put("_*", "N");

        Morse.put("O", "___");
        Morse.put("___", "O");

        Morse.put("P", "*__*");
        Morse.put("*__*", "P");

        Morse.put("Q", "__*_");
        Morse.put("__*_", "Q");

        Morse.put("R", "*_*");
        Morse.put("*_*", "R");

        Morse.put("S", "***");
        Morse.put("***", "S");

        Morse.put("T", "_");
        Morse.put("_", "T");

        Morse.put("U", "**_");
        Morse.put("**_", "U;");

        Morse.put("V", "***_");
        Morse.put("***_", "V");

        Morse.put("W", "_**_");
        Morse.put("_**_", "W");

        Morse.put("Y", "_*__");
        Morse.put("_*__", "Y");

        Morse.put("Z", "__**");
        Morse.put("__**", "Z");

        Morse.put("1", "*____");
        Morse.put("*____", "1");

        Morse.put("2", "**___");
        Morse.put("**___", "2");

        Morse.put("3", "***__");
        Morse.put("***__", "3");

        Morse.put("4", "****_");
        Morse.put("****_", "4");

        Morse.put("5", "*****");
        Morse.put("*****", "5");

        Morse.put("6", "_****");
        Morse.put("_****", "6");

        Morse.put("7", "__***");
        Morse.put("__***", "7");

        Morse.put("8", "___**");
        Morse.put("___**", "8");

        Morse.put("9", "____*");
        Morse.put("_____*", "9");

        Morse.put("0", "_____");
        Morse.put("_____", "0");

        Morse.put(".", "*_*_*_");
        Morse.put("*_*_*_", ".");

        Morse.put(",", "__**__");
        Morse.put("__**__", ",");

        Morse.put("?", "**__**");
        Morse.put("**__**", "?");

        Morse.put(" ", " ");

        return Morse;
    }

    public String ToMorse(String a) {
        String sum = "";
        String[] result = new String[0];

        if (!a.contains("*") || !(a.contains("_"))) {
            result = a.toUpperCase().split("");
        } else {
            result = a.split(" ");
        }

        for (int i = 0; i < result.length; i++) {
            sum += MyHashMap().get(result[i]);
            sum += " ";
        }
        return sum;
    }
}








