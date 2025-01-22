/* Załóżmy, że mamy interfejs MusicPlayer z metodami turnOn(), turnOff() i nextTrack(). 
Stwórz klasę Radio, która będzie implementować ten interfejs. W metodzie turnOn() 
powinien zostać wydrukowany komunikat “Radio włączone”, w metodzie turnOff() - “Radio wyłączone”, 
a w nextTrack() - “Zmieniono stację radiową”.
 */

public class Radio implements MusicPlayer{

    @Override
    public void turnOn() {
        System.out.println("Radio włączone");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio wyłączone");
    }

    @Override
    public void nextTrack() {
        System.out.println("Zmieniono stację radiową");
    }
}
