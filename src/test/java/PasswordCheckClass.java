import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordCheckClass {


    // https://github.com/nadinefeurhuber/prog2-ss21-exercise1
    @Test
    void PasswordCheckLongerLength() {
        System.out.println("longerLength");
        Boolean actual = PasswordClass.password("sd");
        Assertions.assertFalse(actual);
    }

    @Test
    void PasswordCheckShorterLength() {
        System.out.println("shorterLength");
        Boolean actual = PasswordClass.password("adfijsdfdsjfkjdeiejdfjidjs");
        Assertions.assertFalse(actual);
    }

    @Test
    void PasswordCheckUpperLowerCaseLetters() {
        System.out.println("UpperLowerCaseLetters");
        Boolean actual = PasswordClass.password("djfnWÖfÖWdf");
        Assertions.assertFalse(actual);
    }

    @Test
    void PasswordCheckNumbers() {
        System.out.println("Numbers");
        Boolean actual = PasswordClass.password("3556342");
        Assertions.assertFalse(actual);
    }

    @Test
    void PasswordCheckSpecialCharacters() {
        System.out.println("SpecialCharacters");
        Boolean actual = PasswordClass.password("!/");
        Assertions.assertFalse(actual);
    }

    @Test
    void PasswordCheckNotSpecialCharacter() {
        System.out.println("NotSpecialCharacters");
        Boolean actual = PasswordClass.password("[]{|}.,&:;<=>");
        Assertions.assertFalse(actual);
    }

    @Test
    void PasswordCheckFollowingNumbers() {
        System.out.println("FollowingNumbers");
        Boolean actual = PasswordClass.password("567");
        Assertions.assertFalse(actual);
    }
    @Test
    void PasswordCheckSameNumbers() {
        System.out.println("SameNumbers");
        Boolean actual = PasswordClass.password("1111");
        Assertions.assertFalse(actual);
    }

    @Test
    void PasswordCheckCombination1() {
        System.out.println("Combination1");
        Boolean actual = PasswordClass.password("dfj9jefDF!!");
        Assertions.assertTrue(actual);
    }
    @Test
    void PasswordCheckCombination2() {
        System.out.println("Combination2");
        Boolean actual = PasswordClass.password("dfdf344fdg");
        Assertions.assertFalse(actual);
    }
    @Test
    void PasswordCheckCombination3() {
        System.out.println("Combination3");
        Boolean actual = PasswordClass.password("89djfk3lj");
        Assertions.assertFalse(actual);
    }
    @Test
    void PasswordCheckCombination4() {
        System.out.println("Combination4");
        Boolean actual = PasswordClass.password("34fdsfsddjfkldsjkfjdfsfsksldjfdsfFGjfdsfA");
        Assertions.assertFalse(actual);
    }
    @Test
    void PasswordCheckCombination5() {
        System.out.println("Combination5");
        Boolean actual = PasswordClass.password("999999m");
        Assertions.assertFalse(actual);
    }
}
