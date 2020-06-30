package OnJava8.Chapter23.annotations;

import java.util.List;

public class PasswordUtils {
    @UseCase(id = 47, description = "password must contain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 18)
    public String encryptPassword(String password) throws NoSuchMethodException {
        System.out.println(getClass().getMethod("encryptPassword", String.class).getAnnotation(UseCase.class).id());

        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "New password can not equal previously used one")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        PasswordUtils passwordUtils = new PasswordUtils();
        System.out.println(passwordUtils.encryptPassword("123123"));
    }
}
