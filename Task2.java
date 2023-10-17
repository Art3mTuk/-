package CROC;

import java.util.Scanner;

/**
 * Программа дает на выбор песню, носитель, устройство воспроизведения и затем выводит это.
 * Вариантов на каждый тип всего 3, нужно выбрать 1 из них и ввести в консоль соответсвующую цифру.
 * Автор крайне рекомендует певца тринадцать карат ^-^
 *
 * @author Artem Tukalenko
 */


// Класс песня
class Song {
    private String artist;
    private String title;

    Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    String getArtist() {
        return artist;
    }

    String getTitle() {
        return title;
    }
}

// Класс носитель
class Media {
    private String name;

    Media(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

// Класс устройство воспроизведения
class Device {
    private String name;

    Device(String name) {
        this.name = name;
    }

    void play(Song song, Media media) {
        System.out.println("Устройство воспроизведения " + name + ":");
        System.out.println("Певец: " + song.getArtist());
        System.out.println("Название: " + song.getTitle());
        System.out.println("Носитель: " + media.getName());
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Создаем песни
        Song song1 = new Song("тринадцать карат", "Больше не буду");
        Song song2 = new Song("Три дня дождя", "Перезаряжай");
        Song song3 = new Song("Monrau", "По кругу");

        // Создаем носители
        Media vinyl = new Media("Винил");
        Media cd = new Media("CD");
        Media flashDrive = new Media("Флешка");

        // Создаем звуковоспроизводящие устройства
        Device turntable = new Device("Виниловая вертушка");
        Device cdPlayer = new Device("CD");
        Device universalPlayer = new Device("Универсальный плеер");

        System.out.println("Выберите песню c автором (1 - тринадцать карат 'Больше не буду', 2 - Три дня дождя 'Перезаряжай', 3 - Monrau 'По кругу'):");
        int songChoice = sc.nextInt();
        Song selectedSong;
        switch (songChoice) {
            case 1:
                selectedSong = song1;
                break;
            case 2:
                selectedSong = song2;
                break;
            case 3:
                selectedSong = song3;
                break;
            default:
                System.out.println("Некорректный выбор песни.");
                return;
        }

        System.out.println("Выберите носитель (1 - Винил, 2 - CD, 3 - Флешка):");
        int mediaChoice = sc.nextInt();
        Media selectedMedia;
        switch (mediaChoice) {
            case 1:
                selectedMedia = vinyl;
                break;
            case 2:
                selectedMedia = cd;
                break;
            case 3:
                selectedMedia = flashDrive;
                break;
            default:
                System.out.println("Некорректный выбор носителя.");
                return;
        }

        System.out.println("Выберите устройство воспроизведения (1 - Виниловая вертушка, 2 - CD, 3 - Универсальный плеер):");
        int deviceChoice = sc.nextInt();
        Device selectedDevice;
        switch (deviceChoice) {
            case 1:
                selectedDevice = turntable;
                break;
            case 2:
                selectedDevice = cdPlayer;
                break;
            case 3:
                selectedDevice = universalPlayer;
                break;
            default:
                System.out.println("Некорректный выбор устройства воспроизведения.");
                return;
        }

        // Проигрываем выбранную песню на выбранном устройстве и носителе
        selectedDevice.play(selectedSong, selectedMedia);
    }
}

