public class Main {
public static void main(String[] args) {
    MusicPlaylist playlist = new MusicPlaylist();

    playlist.addSong("Луна");
    playlist.addSong("Камин");
    playlist.addSong("Ламбада");
    playlist.addSong("Наоборот");
    playlist.addSong("Солнце");

    System.out.println("=== Плейлист после добавления ===");
    playlist.printPlayList();

    //Переместить песню
    System.out.println("\n=== Перемещаем песню 1 на позицию 3 ===");
    playlist.moveSong(1,3);
    playlist.printPlayList();
    //Перемешиваем песню
    System.out.println("\n=== Перемешиваем ===");
    playlist.shuffle();
    playlist.printPlayList();

    //Удалить песню
    System.out.println("\n===Удаляем песню №1===");
    playlist.removeSong(1);
    playlist.printPlayList();

    //Выводим кол-во песен
    System.out.println("\nВсего песен: " + playlist.getSongCount());

        }
    }
