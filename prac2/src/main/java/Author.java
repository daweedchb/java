public class Author {
    private String name;
    private final String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //setters and getters for email and gender are not
    // included cause this data fields cannot be changed

    @Override
    public String toString() {
        return (name + " (" + gender + ") at " + email);
    }
}