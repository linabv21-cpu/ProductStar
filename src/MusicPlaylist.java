import java.util.ArrayList;
import java.util.Collections;

public class MusicPlaylist {
    private ArrayList<String> songs;
    //private - Доступно только внутри этого класса (инкапсуляция!)

    //Конструктор
    public MusicPlaylist(){
    songs = new ArrayList<>();

}
//Метод 1 ддобавить песню
    public void addSong(String title) {
        songs.add(title);
    }
    //Метод 2 удалить песню
    public void  removeSong(int index) {
        if(index >= 0 && index < songs.size()) {
            songs.remove(index);
        }else{
            System.out.println("Неверный индекс!");
        }
    }
    //Метод 3 переместить песню
    public void moveSong(int from, int to) {
        if (from >= 0 && from < songs.size()
                && to >= 0 && to < songs.size()) {
            String song = songs.get(from);
            songs.remove(from);
            songs.add(to, song);
        }else {
            System.out.println("Неверные индексы!");
        }
    }
        public void shuffle() {
            Collections.shuffle(songs);
        }
        public void printPlayList() {
            if (songs.isEmpty()) {
                System.out.println("Плейлист пуст" );
                return;
            }
            for(int i = 0; i < songs.size(); i++) {
                System.out.println((i+1) +". " + songs.get(i));
            }

        }

        public int getSongCount() {
            return songs.size();
        }



}
