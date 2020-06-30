package OnJava8.Chapter23.annotations;

import OnJava8.Chapter23.atunit.Test;

public class Testable {
    public void execute() {
        System.out.println("Executing...");
    }
    @Test
    void testExecute() {
        execute();
    }
}
