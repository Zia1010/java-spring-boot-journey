public class KeyValuePair {

    public static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V newestValue) {
            this.value = newestValue;
        }
    }

    public static class Stack<T> {
        private Object[] elements;
        private int top;
        private int capacity;

        public Stack(int size) {
            this.capacity = size;
            this.elements = new Object[capacity];
            this.top = -1;
        }

        public void push(T item) {
            if (top == capacity - 1) {
                throw new StackOverflowError("Stack Overflow");
            }
            top++;
            elements[top] = item;
        }

        @SuppressWarnings("unchecked")
        public T pop() {
            if (top == -1) {
                throw new IllegalStateException("Stack Underflow");
            }
            T item = (T) elements[top];
            elements[top] = null;
            top--;
            return item;
        }

        @SuppressWarnings("unchecked")
        public T peek() {
            if (top == -1) {
                throw new IllegalStateException("Stack Empty");
            }
            return (T) elements[top];
        }
    }

    public static void main(String[] args) {
        Pair<String, Integer> score = new Pair<>("Zia", 95);
        System.out.println("Pair Key: " + score.getKey());
        System.out.println("Pair Value: " + score.getValue());

        Stack<Integer> numberStack = new Stack<>(5);
        numberStack.push(10);
        numberStack.push(20);

        System.out.println("Stack Peek: " + numberStack.peek());
        System.out.println("Stack Pop: " + numberStack.pop());
        System.out.println("Stack Peek after pop: " + numberStack.peek());
    }
}
