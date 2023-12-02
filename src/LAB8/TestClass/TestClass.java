package LAB8.TestClass;

public class TestClass {
    private final String data;
    public TestClass(String data_)
    {
        data = data_;
    }
    public void print(int r)
    {
        System.out.println("data: " + data);
    }
    public String getData(String g)
    {
        return data;
    }
}
