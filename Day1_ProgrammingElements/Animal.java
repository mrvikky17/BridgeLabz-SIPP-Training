public class Animal {
    public static class dog {
        private int age;
        private String breed;
        private String colour;

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getBreed() {
            return breed;
        }
        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getColour() {
            return colour;
        }
        public void setColour(String colour) {
            this.colour = colour;
        }
    }

    public static void main(String[] args) {
        dog d1 = new dog();
        dog d2 = new dog();
        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
    }
}