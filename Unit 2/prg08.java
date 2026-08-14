class box{
    
    double width,height,depth;

    box(){
        width = 1.0; height = 1.0; depth = 1.0;
    }

    box(double len){
        width = height = depth = len;
    }

    box(double w, double h, double d) {
        
        width = w; height = h; depth = d;
    }

    void volume(){
        double result = width * height * depth;

        System.err.println(result);
    }
}

public class prg08{

    public static void main(String[] args) {

    box b1 = new box();
    box b2 = new box(5.0);
    box b3 = new box(2.0,3.0,4.0);

    b1.volume();
    b2.volume();
    b3.volume();

    }

}