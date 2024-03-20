package design.patterns.networks;

// the abstract class
public abstract class Network {

    String username;

    String password;

    public Network() {
    }

    // publish the data to whatever network
    public boolean post(String message) {

        // authenticate before posting
        // every network uses a different authentication method.
        if (login(this.username, this.password)) {
            // send the post data
            boolean result = sendData(message.getBytes());
            logout();
            return result;
        }
        return false;
    }

    public abstract boolean login(String username, String password);

    public abstract boolean sendData(byte[] data);

    public abstract void logout();
}
