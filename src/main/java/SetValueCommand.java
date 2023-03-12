public class SetValueCommand {
    final String key;
    final String value;
    final String attachLease;

    public SetValueCommand(String key, String value) {
        this(key, value, "");
    }

    public SetValueCommand(String key, String value, String attachLease) {
        this.key = key;
        this.value = value;
        this.attachLease = attachLease;
    }
}
