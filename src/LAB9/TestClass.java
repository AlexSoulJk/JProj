package LAB9;

public class TestClass
{
    private String data;
    public TestClass(String data_)
    {
        System.out.printf("Call constructor with %s argument succeed!\n", data_);
        data=data_;
    }
    public void print()
    {
        System.out.println("Call print succeeded! Data: " + data);
    }
    public void setData(String data_)
    {
        System.out.printf("Call setData with %s argument succeeded!\n", data_);
        data = data_;
    }
}
