/**
 * Created by michelhayman on 7/20/17.
 */
public class TestSingleton {

    public static void main(String[] args) {

        ProgramConfiguration test = ProgramConfiguration.getInstance();

        test.setConnectionLimit(50);
        test.setTimeout(23);
        test.setURL("https://www.hackerrank.com/challenges/java-singleton");
        test.setPortNumber(5);

        System.out.println(test.getConnectionLimit() );

        ProgramConfiguration test2 = ProgramConfiguration.getInstance();

        System.out.println(test2.getConnectionLimit() );


    }
}
