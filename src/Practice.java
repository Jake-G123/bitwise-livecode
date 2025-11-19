public class Practice {
    public static void main(String[] args) {
        int color = 0xc42f6d;

        int blueMask = 0x0000FF;
        int greenMask = 0x00FF00;
        int redMask = 0xFF0000;

        int blue = color & blueMask;
        int green = (color & greenMask) >> 8;
        int red = (color & redMask) >> 16;

        System.out.println("blue: " + blue);
        System.out.println("green: " + green);
        System.out.println("red: " + red);

        int x = 0b10101; // 21
        int p = 0b11001; //25

        int q = x & p; // 10001

        System.out.println("q: "+Integer.toBinaryString(q));

        int y = 0xcf4e; // 53070
        int z = 94;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("z to binary: " + Integer.toBinaryString(z));
    }
}