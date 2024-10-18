package j17.pattern_matching_for_switch_preview;

public class Main {
    public static void main(String[] args) {
//        System.out.println(formatter(5));
        improvedSwitch("A");
    }

//    public static String formatter(Object o) {
//        return switch (o) {
//            case  Integer i -> String.format("int %d", i);
//            case Long l -> String.format("long %d", l);
//            case Double d -> String.format("double %f", d);
//            case String s -> String.format("String %s", s);
//            default -> o.toString();
//        };
//    }

    private static void improvedSwitch(String fruit) {
        String text = switch (fruit) {
            case "A", "B" -> {
                System.out.println("the given fruit was: " + fruit);
                yield "Common fruit";
            }
            case "C" -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
    }
}