public class Animal {
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    protected String sounds()
    {

        return "Barks \n Meows";

    }

    protected String eat()
    {
        return name+ "eats";
    }

}

