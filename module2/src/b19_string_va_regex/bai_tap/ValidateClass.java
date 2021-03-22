package b19_string_va_regex.bai_tap;

public class ValidateClass {
    public static void main(String[] args) {
        String classInput = "C0318G";
        System.out.println(classInput.matches("(C|A|P)\\d{4}(G|H|I|K|L|M)"));
    }
}
