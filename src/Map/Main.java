package Map;

public class Main {
    public static void main(String[] args) {

        MyMap<String, Integer> map = new MyMap<>();


        map.put("Claude", 5);
        map.put("Devin", 10);
        map.put("Gemini", 7);


        System.out.println(map.get("Claude"));
        System.out.println(map.get("Devin"));
        System.out.println(map.get("Copilot"));

        Integer removedValue = map.remove("Devin");
        System.out.println("Removed value: " + removedValue);


        Integer nullValue = map.remove("Bard");
        System.out.println("Removed value: " + nullValue);
    }
}
