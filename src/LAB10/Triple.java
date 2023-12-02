package LAB10;

enum Place{
    first,
    second,
    third,
}

public class Triple<T>
{
    private T first;
    private T second;
    private T third;

    public Triple(T first_, T second_, T third_)
    {
        first = first_;
        second = second_;
        third = third_;
    }

    public T get(Place place)
    {
        switch (place){
            case first:
                return this.first;
            case second:
                return this.second;
            case third:
                return this.third;
            default: break;
        }
        throw new RuntimeException("Input place not found");
    }
    public void setFirst(T first)
    {
        this.first = first;
    }

    public void setSecond(T second)
    {
        this.second = second;
    }

    public void setThird(T third)
    {
        this.third = third;
    }
    private boolean isSomeOneNull(){
        return first==null || second==null || third ==null;
    }
    public T min()
    {
        if (isSomeOneNull()){
            throw new RuntimeException("Impossible to find min, because triple has null value object");
        }
        if (first instanceof Comparable)
        {
            T min = first;
            if (((Comparable)second).compareTo(min) < 0)
                min = second;
            if (((Comparable) third).compareTo(min) < 0)
                min = third;
            return min;
        }
        else
            throw new RuntimeException("Impossible to find min");

    }
    public T max()
    {
        if (isSomeOneNull()){
            throw new RuntimeException("Impossible to find min, because triple has null value object");
        }
        if (first instanceof Comparable)
        {
            T max = first;
            if (((Comparable)second).compareTo(max) > 0)
                max = second;
            if (((Comparable)third).compareTo(max) > 0)
                max = third;
            return max;
        }
        else
            throw new RuntimeException("Impossible to find max");

    }

    private double summa(){
        return ((Number) first).doubleValue() + ((Number)second).doubleValue() + ((Number)(third)).doubleValue();
    }

    public double mean()
    {
        if (first instanceof Number)
        {
            return summa()/3;
        }
        else
            throw new RuntimeException("Impossible to find mean");

    }

}
