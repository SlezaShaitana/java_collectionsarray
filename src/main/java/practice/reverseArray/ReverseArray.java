package practice.reverseArray;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        String[] reverseArray = new String[strings.length];
        int index = strings.length -1;
        for (int i = 0; i < strings.length; i++) {
            reverseArray[index] = strings[i];
            index--;
        }
        for (int i = 0; i < reverseArray.length; i++) {
            strings[i] = reverseArray[i];
        }
        return strings;
    }
}