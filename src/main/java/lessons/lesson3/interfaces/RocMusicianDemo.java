package lessons.lesson3.interfaces;

public class RocMusicianDemo {
    public static void main(String[] args) {
        Musician musician = new RockMusician();
        Singer singer = new RockMusician();
        Dancer dancer = new RockMusician();

        musician.dance();
        musician.sing();
        singer.sing();

//        Singer[] singers = {
//                new PopMusician(),
//                new RockMusician()
//        };
//        singers[0].sing();
//        singers[1].sing();

        Singer[] rockMusicians = {
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
        };

        Dancer[] dancers = {
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
        };

        RockMusicianService service = new RockMusicianService();
        service.singAll(rockMusicians);
        service.danceAll(dancers);
    }
}
