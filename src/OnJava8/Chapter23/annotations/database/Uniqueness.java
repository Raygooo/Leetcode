package OnJava8.Chapter23.annotations.database;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
