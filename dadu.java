import java.util.Random;
import java.awt.Color;

public final class Dadu {
public static final int DEFAULT_SISI = 6;
private static Random randGenerator = new Random();
private final int jumSisi;
private int hasil;

public Dadu() {
this(DEFAULT_SISI);
}

public Dadu(int numSides) {
this.jumSisi = numSides;
}

public int lempar() {
hasil = randGenerator.nextInt(jumSisi) + 1;
return hasil;
}

public int getJumSisi() {
return jumSisi;
k.setColor(Color.RED);
}

public int getHasil() {
return hasil;
k.setColor(Color.BLUE);
}

@Override
public String toString() {
return "Jumlah sisi dadu: " + getJumSisi() + " hasil: " + getHasil();
k.setColor(Color.GREEN);
}
}
public class main {
public static void main(String []args){
Dadu dadu1 = new Dadu (6);
dadu1.lempar();
System.out.println(dadu1.toString);
}
}