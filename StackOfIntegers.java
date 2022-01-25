public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers()
    {
        this.size = -1;
        this.elements = new int[16];  // default capacity of 16
    }

    public StackOfIntegers(int capacity)
    {
        this.size = -1;
        this.elements = new int[capacity];
    }

    public boolean empty()
    {
        return (this.size > -1 ? false: true);
    }

    public int peek() throws ArrayIndexOutOfBoundsException
    {
        if(!this.empty())
        {
            return this.elements[this.size];
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("Stack is empty, nothing to see here...");
        }
    }

    public void push(int value) throws ArrayIndexOutOfBoundsException
    {
        if(this.size + 1 < this.elements.length)
        {
            this.size += 1;
            this.elements[this.size] = value;
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("Stack has reached maximum capacity, you are unable to add further...");
        }
    }

    public int pop() throws ArrayIndexOutOfBoundsException
    {
        if(!this.empty())
        {
            int value = this.elements[this.size];
            this.elements[this.size] = 0;
            this.size -= 1;
            return value;
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("Stack is empty, nothing to pop!");
        }
    }

    public int getSize()
    {
        return this.size;
    }
}
