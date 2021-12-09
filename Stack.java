public class Stack {

    double[] tab;
    int firstFree;

    public Stack(int MaxSize) {
        tab = new double[MaxSize];
        firstFree = 0;
    }


    void Push(double E) throws ArrayIndexOutOfBoundsException {
        if (firstFree < tab.length) {
            tab[firstFree] = E;
            firstFree++;

        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Stack is full");
        }
    }

    double Pop() throws IndexOutOfBoundsException {
        if (firstFree <= 0) {
            throw new IndexOutOfBoundsException(
                    "Stack is empty");
        }

        double temp = tab[firstFree - 1];
        firstFree--;
        return temp;
    }
}