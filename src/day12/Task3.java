package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте
 * такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
 * список. Создать второй список, в который скопировать группы из первого списка, основанные после 2000 года.
 * Вывести в консоль оба списка.
 */

public class Task3 {

    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();

        bands = Arrays.asList(
                new MusicBand("Slipknot", 1990),
                new MusicBand("Muse", 1995),
                new MusicBand("Goodsmack", 2010),
                new MusicBand("Linkin Park", 2000),
                new MusicBand("Depeche Mode", 1991),
                new MusicBand("Rammstein", 2019),
                new MusicBand("Metallica", 1985),
                new MusicBand("Shinedown", 1977),
                new MusicBand("Radiohead", 2013),
                new MusicBand("Green Day", 2002)
        );

        System.out.println("Source list:   " + bands);

        Collections.shuffle(bands);

        System.out.println("Shuffled list: " + bands);

        List<MusicBand> teenagersBands = new ArrayList<>();

        for (MusicBand mb : bands)
            if (mb.getYear() > 2000) teenagersBands.add(mb);

        System.out.println("Filtered list: " + teenagersBands);

    }


}


