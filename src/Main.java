public class Main {
public static void main(String[] args) {
    MusicPlaylist playlist = new MusicPlaylist();
//Добавляем песни
    playlist.addSong("Луна");
    playlist.addSong("Камин");
    playlist.addSong("Ламбада");
    playlist.addSong("Наоборот");
    playlist.addSong("Солнце");
//Выводим эти добавленые песни в том порядке в котором записали
    System.out.println("=== Плейлист после добавления ===");
    playlist.printPlayList();

    //Переместить песню
    System.out.println("\n=== Перемещаем песню 1 на позицию 3 ===");
    playlist.moveSong(1,3); //from 1(1 - это 2 элемент, не забывать про индексы) to 3(4)
    playlist.printPlayList(); // и выводим списком уже
    //Перемешиваем песню рандомный порядок получается
    System.out.println("\n=== Перемешиваем ===");
    playlist.shuffle();
    playlist.printPlayList();//выводим перемешанные

    //Удалить песню
    System.out.println("\n===Удаляем песню №1===");
    playlist.removeSong(1);
    playlist.printPlayList(); //выводим без удаленной песни

    //Выводим кол-во песен
    System.out.println("\nВсего песен: " + playlist.getSongCount());

        }
    }
