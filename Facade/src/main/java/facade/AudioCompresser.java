package facade;

public class AudioCompresser {
    public void compress(AudioFile audioFile) {
        System.out.println(String.format("Compressing %s ...", audioFile.getName()));
    }
}
