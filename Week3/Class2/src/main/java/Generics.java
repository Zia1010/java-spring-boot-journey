public class Generics {
    static class Box<T> {
        private T value;

        public Box(T initialValue) {
            this.value = initialValue;
        }

        public T getValue() {
            return this.value;
        }

        public void setValue(T newValue) {
            this.value = newValue;
        }
    }
}

