package live;
import music.Playable;
import music.string.veena;
import music.wind.saxophone;
public class Test {
    public static void main(String[] args) {
        veena myVeena = new veena();
        myVeena.play();

        saxophone mySaxophone = new saxophone();
        mySaxophone.play();

        Playable instrument;

        instrument = myVeena;
        instrument.play();

        instrument = mySaxophone;
        instrument.play();
    }
}
