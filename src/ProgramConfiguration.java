/**
 * Created by michelhayman on 7/20/17.
 */
public class ProgramConfiguration {

    public int connectionLimit;
    public int portNumber;
    public String URL;
    public int timeout;

    private static ProgramConfiguration instance = null;

    private ProgramConfiguration () {}

    public static ProgramConfiguration getInstance () {
        if (instance == null) {
            instance = new ProgramConfiguration();
        }
        return instance;
    }

    public int getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(int connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
