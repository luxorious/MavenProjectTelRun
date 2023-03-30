package lessons.lesson3.interfaces;

public class RockMusicianService {
    public void singAll(Singer[] rockMusicians){
        for (int i = 0; i < rockMusicians.length; i++) {
            rockMusicians[i].sing();
        }
    }

    public void danceAll(Dancer[] dancers){
        for (int i = 0; i < dancers.length; i++) {
            dancers[i].dance();
        }
    }
}
