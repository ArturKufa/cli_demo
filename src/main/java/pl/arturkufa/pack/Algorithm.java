package pl.arturkufa.pack;

public enum Algorithm {
    TR("Two rope algorithm"),
    ZIP("Zip algorithm"),
    RAR("Rar algorithm");

    Algorithm(String name) {
        this.name = name;
    }

    private String name;


    public String getName() {
        return name;
    }
}
