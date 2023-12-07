
import java.util.LinkedList;

public class PlayList {
    public class Songs {
        String title;
        String artist;
        double duration;

        Songs(String title, String artist, double duration) {
            this.title = title;
            this.artist = artist;
            this.duration = duration;
        }
    }

    LinkedList<Songs> song = new LinkedList<Songs>();

    public void addSong(String title, String artist, double duration) {
        Songs newsong = new Songs(title, artist, duration);
        song.add(newsong);
    }

    public void removeSong(String title) {
        for (int i = 0; i < song.size(); i++) {
            if (song.get(i).title.equals(title)) {
                song.remove(i);
                return;
            }
        }
    }
    public double calculateduration(){
        double totalduration=0.0;
        for(int k=0; k< song.size(); k++){
            totalduration+=song.get(k).duration;
        }
        return totalduration;
    }

    public void display() {
        System.out.println("=====Songs List=====");
        for (int j = 0; j < song.size(); j++) {
            System.out.println("Title-> " +  song.get(j).title);
            System.out.println("Artist-> " +  song.get(j).artist);
            System.out.println("Duration-> " + song.get(j).duration);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        PlayList p = new PlayList();
        p.addSong("kamli wale ","Nusrat fateh",15.30);
        p.addSong("dil lagi","NFAK",13.15);
        p.display();
        System.out.println("Total duration= "+p.calculateduration());

        System.out.println("After remove song");
        p.removeSong("dil lagi");
        p.display();


    }

}
