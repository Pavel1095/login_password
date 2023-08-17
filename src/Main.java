public class Main {
    public static void main(String[] args) {
        try {

            AuthenticationValidator.checkAuthentication("LogIn10_",
                    "passworD10_", "passworD10_");
            System.out.println("Аутентификация пройдена успешно.");

        } catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println(ex.getMessage());
        }

        }
    }
