package Six;

public class Plane {
    Wing wing;
    String name;


    public void Planewing(String name, int weightofWing) {
        Wing wing = new Wing(weightofWing);
        this.wing = wing;
        this.name = name;
    }

    class Wing{
        int weight;
        public Wing(int weight) {
            this.weight = weight;
        }
        void printWing(){
            System.out.println(weight);
        }

    }
}
