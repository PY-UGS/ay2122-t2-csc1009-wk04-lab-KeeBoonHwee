public class StackOfIntegers {
    private int[] elements;
    private int size;
    private int index;

    public StackOfIntegers()
    {
        this.size = 16;
        this.elements = new int[this.size];
        this.index = -1;
    }

    public StackOfIntegers(int capacity)
    {
        this.size = capacity;
        this.elements = new int[this.size];
        this.index = -1;
    }

    public boolean empty()
    {
        return (this.index > -1 ? false: true);
    }

    public int peek()
    {
        if(!this.empty())
        {
            return this.elements[this.index];
        }
        else
        {
            return -1;
        }
    }

    public void push(int value)
    {
        if(this.index + 1 < this.size)
        {
            this.index += 1;
            this.elements[this.index] = value;
        }
    }

    public int pop()
    {
        if(!this.empty())
        {
            int value = this.elements[this.index];
            this.elements[this.index] = 0;
            this.index -= 1;
            return value;
        }
        else
        {
            return -1;
        }
    }

    public int getSize()
    {
        return this.size;
    }
}
