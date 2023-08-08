public class Main {
    public static void main(String[] args) {
        try {
            throw new CustomException("Что-то пошло не так");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}