package b19_string_va_regex.bai_tap;

public class ValidatePhone {
    public static void main(String[] args) {
        String classInput = "(84)-(0978489648)";
        System.out.println(classInput.matches("[(][\\d]{2}[)]-[(](0)\\d{9}[)]"));
    }
}
