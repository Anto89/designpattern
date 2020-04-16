package facade;

public class AudioConverter {
    public void convert(AudioFile audioFile) {
        System.out.println(String.format("Converting %s ...", audioFile.getName()));
    }
}
